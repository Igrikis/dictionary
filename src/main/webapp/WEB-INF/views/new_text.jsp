<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add text</title>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
</head>
<body>
<div class="form-group">
    <label for="english">English</label>
    <textarea style="resize: none" class="form-control" rows="10" cols="100" id="english"></textarea>
</div>
<div class="form-group">
    <label for="russia">Russia</label>
    <textarea style="resize: none; margin-left: 6px" class="form-control" rows="10" cols="100" id="russia"></textarea>
</div>

<button class="btn btn-primary" type="button" onclick="send()">Add</button>

<script>
    function send() {
        console.log("start");
        var passingObject = {
            ID : '123456',
            userEmail : 'a.a@a',
            ApproverFlag : 'true'
        }
        console.log(passingObject);
        $.ajax({
            url: '/save_text',
            type: 'POST',
            dataType: 'json',
            data: passingObject,
            success: function(result) {
                alert('SUCCESS');
            }
        });
    }
</script>

</body>
</html>
