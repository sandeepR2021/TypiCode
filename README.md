# TypiCode
jsonplaceholdertypicode mock tests

- The project API_Test_TypiCode has tests making api calls against the endpoint: "https://jsonplaceholder.typicode.com/users"
- The first test "Get_Single_User" will retrieve the user using combination of Name and Website value pair. 
  The name and website values can be modified to fetch another user details.
- The second test "Get_Ten_Users" will retrieve information of all available users from the api.
- The final test "Post_New_User" will add a new user on the Api using name value as "Test" in the payload. This value can be modified to add new and different user,
- The tests have been built using Jenkins plugin, which enables the execution results/reports to be readable in Jenkins file format.
- io.restassured libraries used for the tests implementation can be configured using Maven project.
