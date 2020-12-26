MATCH p=shortestPath(
  (a:TypeNode {Cond_On_Node})-[*]-(b {Cond_On_Node})
)
RETURN p ;