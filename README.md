# CRUD Service for Customer Objects

To start the application open a Terminal window in the `Spring` directory and run `docker-compose up`.

## Get all customers
In order to get all customer information execute a GET method on `http://localhost:8080/customers`.
![alt text](https://github.com/LuisJ3/Spring/blob/master/Screenshots/Screenshot%202019-10-23%20at%2009.13.01.png)

## Get Customer by ID
If you wish to get a specific user you can search by ID by executing a GET method on `http://localhost:8080/customers/{id}` replacing `{id}` with the ID of the user you wish to search for.
![alt text](https://github.com/LuisJ3/Spring/blob/master/Screenshots/Screenshot%202019-10-23%20at%2009.13.25.png)

## Delete Customer
To delete a customer execute a DELETE method on `http://localhost:8080/customers/{id}` replacing `{id}` with the ID of the user you wish to delete.
![alt text](https://github.com/LuisJ3/Spring/blob/master/Screenshots/Screenshot%202019-10-23%20at%2009.12.36.png)

## Add new Customer
To add a new customer execute POST method on `http://localhost:8080/customers` with some JSON contining the details of the new customer.
![alt text](https://github.com/LuisJ3/Spring/blob/master/Screenshots/Screenshot%202019-10-23%20at%2009.03.34.png)

## Update Customer
To update an existing customer execute PUT method on `http://localhost:8080/customers/{id}` replacing `{id}` with the ID of the user you wish to delete and some JSON contining the updated customer details.
![alt text](https://github.com/LuisJ3/Spring/blob/master/Screenshots/Screenshot%202019-10-23%20at%2009.14.58.png)
