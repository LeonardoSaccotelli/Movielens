MATCH (starwars:Movie {name:'Star Wars: Episode IV - A New Hope (1977)'}) 
WITH starwars 
MATCH (starwars)-[starwars_tag:TAG_BY]->() 
RETURN COUNT(starwars_tag.tag) AS Frequency_Tag , starwars_tag.tag AS Tag
ORDER BY Frequency_Tag DESC
LIMIT 10;