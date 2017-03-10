<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add text</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="includes/header.jsp"/>
<div class="form-group">
    <label for="english">English</label>
    <textarea style="resize: none" class="form-control" rows="10" cols="10" id="english"></textarea>
</div>
<div class="form-group">
    <label for="russia">Russia</label>
    <textarea style="resize: none; margin-left: 6px" class="form-control" rows="10" cols="10" id="russia"></textarea>
</div>

<button class="btn btn-primary" type="button" onclick="send()">Add</button>

<script>
    function send() {
        /*$.get('/save_text', [text = {
            ID: '123456',
            userEmail: 'a.a@a',
            ApproverFlag: 'true'
        }]).done(function (data) {
            alert(data);
        });*/

        $.ajax({
            url: "/save_text",
            type: 'GET',
            data: {
//                'text': {
                    'user': 'username',
                    'pass': 'password',
                    'sendImmediately': false
//                }
            },
            dataType: 'json',
            headers: {'Content-Type': 'application/json'},
        success: function(response) {
            alert("Save success").success();
        },
        error: function(xhr) {
            //Do Something to handle error
        }
    });
    }
</script>

</body>
</html>
