MATCH (movie:Movie)-[tagUsed:TAG_BY]->() 
RETURN COUNT(tagUsed.tag) AS Frequency_Tag , tagUsed.tag AS Tag
ORDER BY Frequency_Tag DESC
LIMIT 10;