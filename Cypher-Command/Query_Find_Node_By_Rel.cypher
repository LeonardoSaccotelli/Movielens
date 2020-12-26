#Ritorna tutti i nodi b che sono in relazione con a (dopo aver
#applicato la condizione sul nodo)
MATCH (a: TypeNode{Cond_on_Node})-[:TYPE_REL]->(b) RETURN b;