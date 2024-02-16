<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    </body>





       <!--  using jstl tags -->
       <h1>Wellcome</h1>
       <p>Id of the Employee     : ${employee.getEid()}</p>
       <p>Name of the Employee   : ${employee.getEname()}</p>
       <p>Designation of Employee: ${employee.getEdesignation()}</p>
       <p>Salary of Employee     : ${employee.getEsalary()}</p>
        <a href="Singleemployee">
        <input type="submit" value="searchEmployee">
        </a>

   <ul>
         <c:forEach var="item" items="${allEmployee}">
             <li>${item}</li>
         </c:forEach>
     </ul>




    </body>
</html>