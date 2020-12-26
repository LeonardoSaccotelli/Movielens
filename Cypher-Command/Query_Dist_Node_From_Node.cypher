#Con n,m distanza in termini di link da a,
#Quindi ritorno tutti i nodi che distano da a
#un numero di link compreso tra n e m
MATCH (a: TypeNode {Cond_On_Node})-[*n..m]-(node)
RETURN a, node ;