# CRUD Service for Customer Objects

To start the application run the `App.java` file present in the `SpringApp` folder.

## Get all customers
In order to get all customer information execute a GET method on `http://localhost:8080/customers`

## Get Customer by ID
If you wish to get a specific user you can search by ID by executing a GET method on `http://localhost:8080/customers/{id}` replacing `{id}` with the ID of the user you wish to search for.

## Delete Customer
To delete a customer execute a DELETE method on `http://localhost:8080/customers/{id}` replacing `{id}` with the ID of the user you wish to delete.

## Add new Customer
To add a new customer execute  POST method on `http://localhost:8080/customers` with some JSON contining the details of the new customer.

## Update Customer
