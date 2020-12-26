MATCH (jumanji:Movie {name:'Jumanji (1995)'}) 
WITH jumanji 
MATCH(jumanji)-[jumanji_rate:RATED_BY]->(user:User) 
RETURN jumanji.name AS Title, AVG(toFloat(jumanji_rate.rating)) AS Average_Rate;