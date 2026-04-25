## API Contracts
## Create Space
Método: POST
Endpoint: /api/v1/reservations
Request Body (JSON)
{
  “space_id”: “WK-005”,
  “user_id”: “3”,
  “date”:  “27-04-2026” ,
  “duration_hours”: 2
}
Response created: 201
{
  “reservation_id”: “RES-120”,
  “status”: “confirmed”,
  “total_price”: 30.00
}









## Updated Space

Método: PUT
Endpoint: /api/v1/spaces/{id}/availability
Request Body (JSON):
{
  “is_available”: false,
  “reason”: “Reserved”,
  “next_available_date”: “27-05-2026”
}

Response: 200 OK
{
  "space_id": “WK-005” ,
  “status”: “updated”,
  “current_availability”: false
}
