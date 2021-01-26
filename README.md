# Movielens - Neo4j
In this project we test the use of Neo4j, a graph database, using the Movielens dataset. With Neo4j Desktop we perfom different query that you can find in the followinf folder. 
Two approaches have been proposed to analyze the data. The first approach is to run queries directly from the Neo4j Desktop. In the second approach we have developed a Spring Boot Application that accesses the database and returns the desired information.


## Prerequisites
By default, requirement for compilation are:
* JDK 11+
* Maven

Requirement for running application is:
* Neo4j Desktop 4+

## Using from Neo4j Desktop
You can download the dataset from [here](https://grouplens.org/datasets/movielens/).
We use the largest dataset with more than 20 milion ratings. Because of the size of the dataset we use the bulk import to load the data.
More details [here](https://neo4j.com/developer/guide-import-csv/).
Now we can use some example query you can find in the folder.
## Built with Maven
To create a jar file with dependencies including resource files:
````
$ mvn install
````

## Using from Spring Boot
Application can be run from root folder by typing into terminal:
````
$ mvn spring-boot:run
````
Now from your browser you can typing (the params are simple example of data stored in Neo4j):
````
localhost:8080/titlesByNameContains/Toy Story (1995)
localhost:8080/allMovies
localhost:8080/allGenres
localhost:8080/allUser
localhost:8080/findUserById/3
````

## License
This software is released under the MIT License. See the [LICENSE](LICENSE) file for details.
