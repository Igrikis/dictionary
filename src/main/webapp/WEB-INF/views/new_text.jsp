<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add text</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="/static/css/new.text.style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<jsp:include page="includes/header.jsp"/>

<label class="center-label" for="label">Label</label>

<div>
    <input class="center-input border-input" type="text" id="label">
</div>

<div class="center-area-text">
    <label for="english">English</label>
    <textarea class="area-text" rows="10" id="english"></textarea>
    <label for="russian">Russia</label>
    <textarea class="area-text" rows="10" id="russian"></textarea>
</div>

<button class="btn btn-primary center-button" type="button" onclick="send()">Add</button>

<script>
    function send() {
        $.ajax({
            url: "/save_text",
            type: 'GET',
            data: {
                'id' : '',
                'date': '',
                'label': document.getElementById("label").value,
                'englishText': document.getElementById("english").value,
                'russianText': document.getElementById("russian").value
            },
            dataType: 'json',
            headers: {'Content-Type': 'application/json'}
        });
        eraseText();
    }

    function eraseText() {
        document.getElementById("label").value = "";
        document.getElementById("english").value = "";
        document.getElementById("russian").value = "";
    }
</script>

</body>
</html>
