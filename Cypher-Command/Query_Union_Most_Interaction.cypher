CALL{MATCH(user:User)<-[ratingMovie:RATED_BY]-(:Movie)
	WITH COUNT(ratingMovie) AS Interaction, user
	RETURN user.name AS User_ID, Interaction
	UNION
	MATCH(user:User)<-[tagMovie:TAG_BY]-(:Movie)
	WITH COUNT(tagMovie) AS Interaction, user
	RETURN user.name AS User_ID, Interaction
}
RETURN User_ID, Interaction
ORDER BY Interaction DESC
LIMIT 10
