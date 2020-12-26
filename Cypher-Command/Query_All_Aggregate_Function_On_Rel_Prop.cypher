MATCH (jumanji:Movie {name:'Jumanji (1995)'}) 
WITH jumanji 
MATCH(jumanji)-[jumanji_rating:RATED_BY]->() 
RETURN jumanji.name AS Title, ROUND(AVG(jumanji_rating.rating)) AS Average_Rate, COUNT(jumanji_rating.rating) AS Number_Of_Ratings, MIN(jumanji_rating.rating) AS Min_Rating, MAX(jumanji_rating.rating) AS Max_Rating;