# sqlrestapi
 
 Work in Progress!!
 
 A REST API attached to a PostgresSQL database, made with Spring Boot. Made to be integrated with my other project "What is on your mind?"
 
This intends to create a backend server for the application that could replace the Google Cloud database. This would allow more control over the database, permit complex queries and host my own backend server instead of relying on 3rd party.

This application implements a simple HTTP API, using the GET, POST, PUT, DELETE in ThoughtController.java, methods to manipulate the underlaying database. These HTTP messages would be sent by https://what-is-on-your-mind.vercel.app/. ThoughtRepository.java is an interface that allows for complex queries and manipulation of the database. We could, for example, find all thoughts that are upvoted more than x times, or thoughts whose text contains a certain term, to show what is of interest to the user. The possibilities are exciting and endless!
