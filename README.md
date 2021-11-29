Problem statement:
We in Bootcamp organisation need to model how our institution 
is structured so we can learn/teach awesome stuff.

We have a Admin(only one) and several instructors, 
each one with its own subordinate as well. This looks like classic tree structure.

We need two HTTP APIs that will serve the two basic operations as below:
* Get all subordinate of a given instructor.
* add subordinate to given instructor.
----------------------------------------
----------------------------------------
  Each Instructor must have below information
- name of Instructor
- Who is admin


#Db settings for H2 DB are in application.properties file

#Testing - 

Enter following -> body in postman
POST request   http://localhost:8082/bootcamp/instructor
#JSOn format
{
"id": 1,
"instructorName": Admin,
"name": "Instructor1"
}

To view - GET request
http://localhost:8082/bootcamp/instructor