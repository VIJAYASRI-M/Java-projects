<%@page language="java" %>
<html>
    <body>
        <h2>Student Details for ${course}</h2>
        <form action="addStudent">
            <label>Enter a Id</label>
            <input name="id" id="id"/>
            <label>Enter a Name</label>
            <input name="name" id="name"/>
            <button type="submit">submit</button>
        </form>
    </body>
</html>