demo-point-spring-boot

endpoint create with method POST
 http://localhost:8080/pointservice/point
   {
    "userId": 5,
    "point": 1
  }

 
endpoint update add or deduct point with method PUT 
http://localhost:8080/pointservice/update
  {
    "userId": 5,
    "point": -1
  }

