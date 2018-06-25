# Spring_Training
Testing spring features

Sketch project which uses spring security/jpa/mvc + hibernate + mysql and jsp.

Provide such features as user registration with subsequent store in database (/registration),
authorization (/login), both features with form validation (hibernate-validator).

All users separete by roles (ROLE_USER, ROLE_ADMIN).

In addition we have /admin page which contains table of registred users,
this page required authentication with ROLE_ADMIN for access and permissions to perform operations with users.

You can use script which contains in [database.sql file](src/main/resources/database.sql) for creating db.
