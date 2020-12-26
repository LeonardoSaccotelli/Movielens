MATCH (:Movie) -[belongsGenre:BELONGS_TO_GENRE]->(genre:Genre)
WITH genre.name as Genre, belongsGenre 
RETURN Genre, COUNT(belongsGenre) AS Number_Of_Movies
ORDER BY Genre


