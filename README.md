# CMS Shopping Cart

A personal CMS project to practice and showcase my knowledge in Spring Boot. 


## Requirements

For building and running the application you need:

- [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17)
- [Maven 3](https://maven.apache.org)

- [MySQL](https://dev.mysql.com/downloads/workbench/)

Or

- [HeidiSQL](https://www.heidisql.com/download.php)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.rafael.cmsshoppingcart.CmsShoppingCartApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
After that, you'll need to open your browser and head to http://localhost:8080/

*For demonstration purposes, all registred users have admin rights. After creating your account, head to http://localhost:8080/admin/pages to access the admin view.

## Tech Stack

**Client:** Javascript, jQuery, jQuery UI, Bootstrap, CKEditor

**Server:** Java, Spring Boot, Thymeleaf, Maven, Lombok, MySQL

## Features

- Add, remove, sort and edit pages, products and categories (Admin section) 
- Shopping Cart
- Integration with PayPal API
- User registration and authentication 

## Screenshots

![App Screenshot](/assets/admin_add_product.png)
![App Screenshot](/assets/admin_products.png)
![App Screenshot](/assets/cart1.png)
![App Screenshot](/assets/cart2.png)
![App Screenshot](/assets/user_all_products.png)




