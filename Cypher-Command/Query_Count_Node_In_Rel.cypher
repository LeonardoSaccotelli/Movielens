#Conta il numero di nodi in una specifica relazione con un dato nodo
MATCH (a: TypeNode {Cond_On_Node}) 
WITH a 
MATCH(a)-[:TYPE_REL]->(b:TypeNode2) 
RETURN a.prop AS ColumnNameRename(senza apici), COUNT(b) AS ColumnNameRename(senza apici);
########
RETURN a AS ColumnNameRename(senza apici), COUNT(b) AS ColumnNameRename(senza apici);