<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.text.*,java.util.*" session="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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

<jsp:include page="includes/header.jsp"/>

<div class="container">
    <table class="table table-condensed" id="myTable">
        <thead>
        <tr>
            <th>Number</th>
            <th>Label</th>
            <th>Date</th>
        </tr>
        </thead>
        <tbody id="tbo">
        </tbody>
    </table>

    <button type="button" class="btn btn-primary" onclick="location.href='/new_text'">Add text</button>
</div>

<script>
    $(document).ready(function () {
        var table = $('#tbo');
        $.getJSON('/get_text', function (data) {
            for (var i = 0; i < data.result.length; i++) {
                table.append(
                    '<tr>' +
                    '<td>' + data.result[i].id + '</td>' +
                    '<td>' + data.result[i].label + '</td>' +
                    '<td>' + data.result[i].date + '</td>' +
                    '</tr>');
            }
        });
    });
</script>

</body>
</html>
