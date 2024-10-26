<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Course List</title>
</head>
<body>
    <h2>Courses for ${name}</h2>
    <table border="1">
        <tr>
            <th>Course ID</th>
            <th>Course Name</th>
            <th>Instructor</th>
            <th>Description</th>
            <th>Rating</th>
        </tr>
        <c:forEach var="course" items="${courses}">
            <tr>
                <td>${course.courseId}</td>
                <td>${course.courseName}</td>
                <td>${course.instructor}</td>
                <td>${course.description}</td>
                <td>${course.courseRating}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
