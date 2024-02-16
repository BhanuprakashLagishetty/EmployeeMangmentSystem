
<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    </body>
        <h2>Alien Details</h2>

         <form action="GenerateEmployee">
            <label for="eid">Enter Employee ID :</label>
                <input type="text" id="eid" name="eid"><br>

                <label for="ename">Enter EmployeeName :</label>
                <input type="text" id="ename" name="ename"><br>
                 <label for="edesignation">Enter Employee Designation :</label>
                 <input type="text" id="edesignation" name="edesignation"><br>
                <label for="esalary">Enter Employee Salary :</label>
                <input type="text" id="esalary" name="esalary"><br>

                <input type="submit" value="Submit">

            </form>

    </body>
</html>