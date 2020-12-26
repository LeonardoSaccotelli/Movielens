MATCH (toystory:Movie {name:'Toy Story (1995)'}) 
WITH toystory 
MATCH(toystory)-[toystory_rating:RATED_BY]->() 
WITH ROUND(toystory_rating.rating) AS ratingRange
RETURN COUNT(ratingRange) AS Number_Of_ratings, ratingRange AS Rating_Range
ORDER BY ratingRange DESC;
