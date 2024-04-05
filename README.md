# spring-boot-security-jwt-auth-mongodb

# Spring Boot, Spring Security, MongoDB - JWT Authentication & Authorization example

- Appropriate Flow for User Signup & User Login with JWT Authentication
- Spring Boot Application Architecture with Spring Security
- How to configure Spring Security to work with JWT
- How to define Data Models and association for Authentication and Authorization
- Way to use Spring Data MongoDB to interact with MongoDB Database

## User Registration, Login and Authorization process.

![Auth Flow](img/flow.png "Auth Flow")

## Spring Boot Rest API Architecture with Spring Security

You can have an overview of our Spring Boot Server with the diagram below:

![Architecture](img/architecture.png "Architecture")

## Run Spring Boot application

```
mvn clean spring-boot:run
```

### Image Screenshot

Auth Flow
![Auth Flow](img/flow.png "Auth Flow")

Architecture
![Architecture](img/architecture.png "Architecture")

### There are 4 APIs:

* /api/test/all for public access
* /api/test/user for users has ROLE_USER or ROLE_MODERATOR or ROLE_ADMIN
* /api/test/mod for users has ROLE_MODERATOR

### Register some users with /signup API:

* admin with `ROLE_ADMIN`
* moderator with `ROLE_MODERATOR` and `ROLE_USER`
* nanami with `ROLE_USER`

Sample Shell Scripts

```shell
ocker exec -it mongodb mongosh
use admin
db.auth( 'mongoadmin', 'secret' )
use users


db.roles.insertMany([
   { name: "ROLE_USER" },
   { name: "ROLE_MODERATOR" },
   { name: "ROLE_ADMIN" },
])

{
  "username": "naruto",
  "email": "naruto@yopmail.com",
  "roles": [
    "user", "mod"
  ],
  "password": "Naruto2024!"
}


curl -X 'POST' \
  'http://localhost:8080/api/auth/signup' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "username": "naruto",
  "email": "naruto@yopmail.com",
  "roles": [
    "user", "mod"
  ],
  "password": "Naruto2024!"
}'
```
