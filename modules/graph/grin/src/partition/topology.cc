/** Copyright 2020 Alibaba Group Holding Limited.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

#include "graph/grin/src/predefine.h"
#include "graph/grin/include/partition/topology.h"

#ifdef GRIN_ENABLE_GRAPH_PARTITION
size_t grin_get_total_vertex_num(GRIN_PARTITIONED_GRAPH pg) {
    auto _pg = static_cast<GRIN_PARTITIONED_GRAPH_T*>(pg);
    if (_pg->lgs.size() == 0) return 0;
    return _pg->lgs[0]->GetTotalVerticesNum();
}

size_t grin_get_total_edge_num(GRIN_PARTITIONED_GRAPH pg) {
    auto _pg = static_cast<GRIN_PARTITIONED_GRAPH_T*>(pg);
    return _pg->pg->total_edge_num();
}
#endif

#if defined(GRIN_WITH_VERTEX_DATA) && \
    !defined(GRIN_ASSUME_ALL_VERTEX_DATA_LOCAL_COMPLETE) && \
    !defined(GRIN_ASSUME_MASTER_VERTEX_DATA_LOCAL_COMPLETE) && \
    !defined(GRIN_ASSUME_BY_TYPE_ALL_VERTEX_DATA_LOCAL_COMPLETE) && \
    !defined(GRIN_ASSUME_BY_TYPE_MASTER_VERTEX_DATA_LOCAL_COMPLETE)
bool grin_is_vertex_data_local_complete(GRIN_GRAPH, GRIN_VERTEX);

GRIN_PARTITION_LIST grin_vertex_data_complete_partitions(GRIN_GRAPH, GRIN_VERTEX);
#endif

#if defined(GRIN_WITH_EDGE_DATA) && \
    !defined(GRIN_ASSUME_ALL_EDGE_DATA_LOCAL_COMPLETE) && \
    !defined(GRIN_ASSUME_MASTER_EDGE_DATA_LOCAL_COMPLETE) && \
    !defined(GRIN_ASSUME_BY_TYPE_ALL_EDGE_DATA_LOCAL_COMPLETE) && \
    !defined(GRIN_ASSUME_BY_TYPE_MASTER_EDGE_DATA_LOCAL_COMPLETE) 
bool grin_is_edge_data_local_complete(GRIN_GRAPH, GRIN_EDGE);

GRIN_PARTITION_LIST grin_edge_data_complete_partitions(GRIN_GRAPH, GRIN_EDGE);
#endif


#ifdef GRIN_TRAIT_SELECT_MASTER_FOR_VERTEX_LIST
GRIN_VERTEX_LIST grin_select_master_for_vertex_list(GRIN_GRAPH g, GRIN_VERTEX_LIST vl) {
    auto _g = static_cast<GRIN_GRAPH_T*>(g);
    auto _vl = static_cast<GRIN_VERTEX_LIST_T*>(vl);
    if (_vl->all_master_mirror > 0) return GRIN_NULL_LIST;

    auto fvl = new GRIN_VERTEX_LIST_T();
    fvl->type_begin = _vl->type_begin;
    fvl->type_end = _vl->type_end;
    fvl->all_master_mirror = 1;
    __grin_init_vertex_list(_g, fvl);
    return fvl;
}

GRIN_VERTEX_LIST grin_select_mirror_for_vertex_list(GRIN_GRAPH g, GRIN_VERTEX_LIST vl) {
    auto _g = static_cast<GRIN_GRAPH_T*>(g);
    auto _vl = static_cast<GRIN_VERTEX_LIST_T*>(vl);
    if (_vl->all_master_mirror > 0) return GRIN_NULL_LIST;

    auto fvl = new GRIN_VERTEX_LIST_T();
    fvl->type_begin = _vl->type_begin;
    fvl->type_end = _vl->type_end;
    fvl->all_master_mirror = 2;
    __grin_init_vertex_list(_g, fvl);
    return fvl;
}
#endif


#ifdef GRIN_TRAIT_SELECT_PARTITION_FOR_VERTEX_LIST
GRIN_VERTEX_LIST grin_select_partition_for_vertex_list(GRIN_GRAPH, GRIN_PARTITION, GRIN_VERTEX_LIST);
#endif



#ifdef GRIN_TRAIT_SELECT_MASTER_FOR_EDGE_LIST
GRIN_EDGE_LIST grin_select_master_for_edge_list(GRIN_GRAPH, GRIN_EDGE_LIST);

GRIN_EDGE_LIST grin_select_mirror_for_edge_list(GRIN_GRAPH, GRIN_EDGE_LIST);
#endif


#ifdef GRIN_TRAIT_SELECT_PARTITION_FOR_EDGE_LIST
GRIN_EDGE_LIST grin_select_partition_for_edge_list(GRIN_GRAPH, GRIN_PARTITION, GRIN_EDGE_LIST);
#endif


#if defined(GRIN_ENABLE_ADJACENT_LIST) && \
    !defined(GRIN_ASSUME_ALL_VERTEX_NEIGHBOR_LOCAL_COMPLETE) && \
    !defined(GRIN_ASSUME_MASTER_VERTEX_NEIGHBOR_LOCAL_COMPLETE) && \
    !defined(GRIN_ASSUME_BY_TYPE_ALL_VERTEX_NEIGHBOR_LOCAL_COMPLETE) && \
    !defined(GRIN_ASSUME_BY_TYPE_MASTER_VERTEX_NEIGHBOR_LOCAL_COMPLETE) 
// The concept of local_complete refers to whether we can get complete data or properties
// locally in the partition. It is orthogonal to the concept of master/mirror which
// is mainly designed for data aggregation. In some extremely cases, master vertices
// may NOT contain all the data or properties locally.
bool grin_is_vertex_neighbor_local_complete(GRIN_GRAPH, GRIN_VERTEX);

/**
 * @brief get the partitions whose combination can provide the complete
 * neighbors of a vertex.
 * @param GRIN_GRAPH the graph
 * @param GRIN_VERTEX the vertex
 */
GRIN_PARTITION_LIST grin_vertex_neighbor_complete_partitions(GRIN_GRAPH, GRIN_VERTEX);
#endif


#ifdef GRIN_TRAIT_SELECT_MASTER_NEIGHBOR_FOR_ADJACENT_LIST
GRIN_ADJACENT_LIST grin_select_master_neighbor_for_adjacent_list(GRIN_GRAPH, GRIN_ADJACENT_LIST);

GRIN_ADJACENT_LIST grin_select_mirror_neighbor_for_adjacent_list(GRIN_GRAPH, GRIN_ADJACENT_LIST);
#endif

#ifdef GRIN_TRAIT_SELECT_NEIGHBOR_PARTITION_FOR_ADJACENT_LIST
GRIN_ADJACENT_LIST grin_select_neighbor_partition_for_adjacent_list(GRIN_GRAPH, GRIN_ADJACENT_LIST);
#endif
