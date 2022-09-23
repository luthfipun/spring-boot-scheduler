# Documentation

Spring boot scheduler application, this sample will be added new data to the database on every 5 seconds, and will be cleared on every new time in minutes

### See updated data

See on the console debug for scheduler running and repeat refresh the api endpoint below

- Request
  - Method : GET 
  - Endpoint : ``http://localhost:8080/``
  - Header
    - accept: application/json

- Response
  - Body
    ```json
        {
          "code": "number",
          "message": "string",
          "data": [
              {
                "id": "number",
                "name": "string",
                "created_at": "string"
              }  
          ]
        }
    ```
