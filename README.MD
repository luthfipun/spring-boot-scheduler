# Documentation

Spring boot application with scheduler asynchronous, this sample scheduler features for sent notification event

## APIs

---
### Sent notification without asynchronous

#### Request
- Method : GET
- Endpoint : ``/api/notification/basic``
- Header
  - accept : application/json

#### Response
- Body :
    ```json
      {
        "status" : "boolean",
        "code" : "number",
        "message" : "string"
      }
    ```

### Sent notification async (Fixed Delay)

#### Request
- Method : GET
- Endpoint : ``/api/notification/delay``
- Header
    - accept : application/json

#### Response
- Body :
    ```json
      {
        "status" : "boolean",
        "code" : "number",
        "message" : "string"
      }
    ```

### Sent notification async (Fixed Rate)

#### Request
- Method : GET
- Endpoint : ``/api/notification/rate``
- Header
    - accept : application/json

#### Response
- Body :
    ```json
      {
        "status" : "boolean",
        "code" : "number",
        "message" : "string"
      }
    ```

### Sent notification async (Cron)

#### Request
- Method : GET
- Endpoint : ``/api/notification/cron``
- Header
    - accept : application/json

#### Response
- Body :
    ```json
      {
        "status" : "boolean",
        "code" : "number",
        "message" : "string"
      }
    ```

### Sent notification async with handling exception

#### Request
- Method : GET
- Endpoint : ``/api/notification/exception``
- Header
    - accept : application/json

#### Response
- Body :
    ```json
      {
        "status" : "boolean",
        "code" : "number",
        "message" : "string"
      }
    ```

