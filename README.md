# API Documentation for CRUD Operations

This API provides a set of endpoints for performing Create, Read, Update and Delete operations on resources.

## Overview

The CRUD API allows users to manage resources through a simple and intuitive interface. The API iis designed to support the following operations.

- **Create**: Add new user.
- **Read**: Retrieve existing users.
- **Update**: Modify existing users.
- **Delete**: Remove users.

## Base URL

https://api-crud.up.railway.app/swagger-ui/index.html

## Endpoints
### 1. Get a user by ID

- **Endpoint**: `/users/{id}`
- **Method**: `GET`
- **Description**: Retrieve a specific user based in its ID.
- **Path Parameters**: `id` - Unique identifier of the user.
- **Response**: JSON object with user details.

### 2. Update a User

- **Endpoint**: `/users/{id}`
- **Method**: `PUT`
- **Description**: Update the data of an existing user based in its ID.
- **Path Parameters**: `id` - Unique identifier of the user.
- **Request Body**: JSON object with updated resource details.
- **Response**: Confirmation of the update with updated resource details.

### 3. Delete a User

- **Endpoint**: `/users/{id}`
- **Method**: `DELETE`
- **Description**: Remove a specific user.
- **Path Parameters**: `id` - Unique identifier of the resource.
- **Response**: Confirmation of deletion.

### 4. Create a new user 

- **Endpoint**: `/users`
- **Method**: `POST`
- **Description**: Create a new user.
- **Request Body**: JSON object with resource details.
- **Response**: Confirmation of creation with user ID.

### 5. Get all users

- **Endpoint**: `/users`
- **Method**: `GET`
- **Description**: Retrieve details of all the users.
- **Response**: JSON object with all user details.

## Authentication

Currently, the API does not require authentication.

### Future Authentication Plans

To improve security, we plan to implement one or more of the following authentication methods:

- **API Keys**: Secure access using unique keys provided to authorized users.
- **OAuth**: Support for third-party access and user authorization.
- **JWT (JSON Web Tokens)**: Use tokens for user authentication and authorization.

Please refer to future updates for details on how to authenticate with the API.

## Error Handling

The API uses the standard HTTP Status codes to indicate success or failure of a request.

- 200 OK: The request was successful.
- 201 Created: A resource was successfully created.
- 400 Bad Request: The request was invalid or cannot be processed.
- 404 Not Found: The specified resource could not be found.
- 500 Internal Server Error: An error occurred on the server side.

## Contributing

We welcome contributions to improve this API. Here's how you can get involved:

### How to Contribute

1. Fork the Repository: Click the "Fork" button at the top of this repository to create a copy under your Github account.

2. Clone Your Fork: Clone the forked repository to your local machine.
```bash
git clone https://github.com/Math23Kskb/API-CRUD.git
```
3. Create a Branch: Create a new branch for your changes
```bash
git checkout -b feature-branch
```
4. Make Changes: Implement your changes.
5. Commit Your Changes: Commit your changes with descriptive message.
```bash
git add .
git commit -m "Describe your changes"
```
6. Push Your Changes: Push your changes to your forked repository.
```bash
git push origin feature-branch
```
7. Create a Pull Request: Navigate to the original repository and open a pull request from your feature branch.

### Reporting Issues

If you encounter any issues or have suggestions for improvements, please open an issue on the Github Issue page.
