CALL{
	MATCH(movie:Movie)-[]->(:User{name:'User 55023'}) 
	WITH DISTINCT movie AS movieOfUserX
	RETURN movieOfUserX
}
WITH movieOfUserX
MATCH(movieOfUserX)-[]->(:User{name:'User 12854'}) RETURN movieOfUserX.name AS Title
ORDER BY Title 

