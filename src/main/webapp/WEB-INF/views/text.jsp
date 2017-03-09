<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Тексты</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <table class="table table-condensed" id="myTable">
        <thead>
        <tr>
            <th>Login</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
        </tr>
        </thead>
        <tbody id = "tbo">
        </tbody>
    </table>
</div>

<script>
    $(document).ready(function() {
        var table = $('#tbo');
        $.getJSON('/tests', function (data) {
            for (var i = 0; i < data.result.length; i++) {
                table.append(
                    '<tr>' +
                    '<td>' + data.result[i].login + '</td>' +
                    '<td>' + data.result[i].firstName + '</td>' +
                    '<td>' + data.result[i].lastName + '</td>' +
                    '<td>' + data.result[i].email + '</td>' +
                    '</tr>');
            }});
    });
</script>

</body>
</html>
