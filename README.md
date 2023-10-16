# Read Me 
This is a CAR Leasing platform API

# Car API

This is a RESTful API for managing car data. It allows you to create, read, update, and delete car records.

## Table of Contents

- [API Endpoints](#api-endpoints)
- [API Usage](#api-usage)
- [POSTMAN JSON Example](#postman-json-example)

## API Endpoints

- `GET /cars`: Retrieve a list of all cars.
- `GET /cars/{id}`: Retrieve a specific car by ID.
- `POST /cars`: Create a new car record.
- `PUT /cars/{id}`: Update an existing car record.
- `DELETE /cars/{id}`: Delete a car record.

## API Usage

### Create a New Car

To create a new car, make a POST request to ` http://localhost:3002/cars` with the following JSON request body:

```json
{
  "carId" : "100",
  "make" : "Toyoto",
  "model" : "Innova",
  "version" : "v1",
  "numberOfDoors" : "5",
  "co2Emission" : "50.1",
  "grossPrice" : "29930.75",
  "nettPrice" : "35000.00"
}
```
# Customer API

This is a RESTful API for managing customer data. It allows you to create, read, update, and delete customer records.

## Table of Contents

- [API Endpoints](#api-endpoints)
- [API Usage](#api-usage)
- [POSTMAN JSON Example](#postman-json-example)

## API Endpoints

- `GET /customers`: Retrieve a list of all customers.
- `GET /customers/{id}`: Retrieve a specific customers by ID.
- `POST /customers`: Create a new customers record.
- `PUT /customers/{id}`: Update an existing customers record.
- `DELETE /customers/{id}`: Delete a customers record.

## API Usage

### Create a New customers

To create a new customers, make a POST request to ` http://localhost:3003/customers` with the following JSON request body:

```json
{
  "customerId" : "001",
  "customerName" : "Paul",
  "street" : "Main Street",
  "houseNumber" : "12B",
  "zipCode" : "VG 5222",
  "place" : "Rotterdam",
  "emailId" : "paul@gmail.com",
  "phnNum" : "1234567890"
}
```
# Broker API

This is a RESTful API for managing broker data. It allows you to create, read, update, and delete broker records.

## Table of Contents

- [API Endpoints](#api-endpoints)
- [API Usage](#api-usage)
- [POSTMAN JSON Example](#postman-json-example)

## API Endpoints

- `GET /brokers`: Retrieve a list of all brokers.
- `GET /brokers/{id}`: Retrieve a specific brokers by ID.
- `POST /brokers`: Create a new brokers record.
- `PUT /brokers/{id}`: Update an existing brokers record.
- `DELETE /brokers/{id}`: Delete a brokers record.

## API Usage

### Create a New brokers

To create a new brokers, make a POST request to ` http://localhost:3001/brokers` with the following JSON request body:

```json
{
  "brokerId" : "001",
  "brokerName" : "Paul",
  "brokerPlace" : "Amsterdam"
}
```
# Employee API

This is a RESTful API for managing Employee data. It allows you to create, read, update, and delete Employee records.

## Table of Contents

- [API Endpoints](#api-endpoints)
- [API Usage](#api-usage)
- [POSTMAN JSON Example](#postman-json-example)

## API Endpoints

- `GET /employees`: Retrieve a list of all employees.
- `GET /employees/{id}`: Retrieve a specific employees by ID.
- `POST /employees`: Create a new employees record.
- `PUT /employees/{id}`: Update an existing employees record.
- `DELETE /employees/{id}`: Delete a employees record.

## API Usage

### Create a New employees

To create a new employees, make a POST request to ` http://localhost:3004/employees` with the following JSON request body:

```json
{
  "empId" : "039",
  "empName" : "Misha",
  "empPlace" : "Harleem"
}
```
# Leasing API

This is a RESTful API is a service that calculates lease rates for cars. This API allows you to provide relevant parameters and obtain an estimated lease rate.

## Table of Contents

- [API Endpoints](#api-endpoints)
- [API Usage](#api-usage)
- [POSTMAN JSON Example](#postman-json-example)

## API Endpoints

- `GET /`: Retrieve a list of all leasing data.
- `GET /rate`: Calculate the lease rate based on request parameters.

## API Usage
The Leasing API is a simple and easy-to-use service that calculates lease rates. You can use it in your application by making a GET request to the `/rate` endpoint with the appropriate request parameters.

### Request Parameters

The API requires the following request parameters to calculate the lease rate:

- `mileage` (Double): The amount of kilometers on annual base (e.g., 22000, 1200).
- `duration` (Double): The number of months in the contract (e.g., 24, 36, 48).
- `interestRate` (Double):  The annual interest rate as a percentage (e.g., 5.5 for 5.5%).
- `nettPrice` (Double): The nett Price (e.g.,63000).

### Calculate a lease rate

Example Request:
```http

 http://localhost:3005/rate?mileage=45000&duration=60&interestRate=4.5&nettPrice=63000