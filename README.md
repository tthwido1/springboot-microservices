# Simple Spring Boot Application

----
## Microservices

> Customer, Plan, Friend Microservices


----
## Working
1. CustomerMS is used to add, get customer profile
2. FriendMS is used to add, get friends belonging to a particular user.
3. PlanMS is used to get, check plans.

----
## usage
* http://localhost:8200/getcustomer/1234567890
* http://localhost:8200/addcustomer
     ```
        {
        	"phoneNumber":2234567890,
        	"name":"Jordan",
        	"password":"pswd",
        	"planId":1,
        	"friends":[
        		{"friendNumber":5223456789},
        		{"friendNumber":5234567890}
        	]
        } 
    ``` 

* http://localhost:8300/checkplan/2
* http://localhost:8300/getplans
* http://localhost:8400/getfriends/2234567890
* http://localhost:8400/addfriends/2234567890
    ```
        [
        	{
        	 "friendNumber": 6567890123
        	},
        	{
        	 "friendNumber": 6567890123
        	}
        ]
    ```