
<#import "spring.ftl" as spring/>
<html>
<head>
    <title>New Question</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script    src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script    src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="static/css/style.css" />
</head>
<body>
<h2>Create New Question</h2>
<form class="form-horizontal" action="/newquestion" method="post">
    <div class="form-group">
        <label for="question" class="col-sm-2 control-label">Question</label>
        <div class="col-sm-2">
                    <@spring.formInput "question.description" "class='form-control' id='question' placeholder='Type your question'" "text"/>
        </div>
    </div>
   <div class="form-group">
        <label for="answer1" class="col-sm-2 control-label">Answer 1</label>
        <div class="col-sm-2">
            <#--<input type="hidden" id="answer1" name="answer1" value="${}"/>-->
                    <@spring.formInput "question.answers.add('id')" "class='form-control' id='answer1' placeholder='Type your first answer'" "text"/>
        </div>
    </div>
<#--
<div class="form-group">
    <label for="answer2" class="col-sm-2 control-label">Answer 2</label>
    <div class="col-sm-2">
                <@spring.formInput "answer.userAnswer" "class='form-control' id='answer2' placeholder='Type your second answer'" "text"/>
    </div>
</div>
<div class="form-group">
    <label for="answer3" class="col-sm-2 control-label">Answer 3</label>
    <div class="col-sm-2">
                <@spring.formInput "answer.userAnswer" "class='form-control' id='answer3' placeholder='Type your third answer'" "text"/>
    </div>
</div>
<div class="form-group">
    <label for="answer4" class="col-sm-2 control-label">Answer 4</label>
    <div class="col-sm-2">
                <@spring.formInput "answer.userAnswer" "class='form-control' id='answer4' placeholder='Type your fourth answer'" "text"/>
    </div>
</div>-->
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-2">
            <button type="submit" class="btn btn-default">Add</button>
            <a href="/" class="btn btn-default" role="button">Return</a>
        </div>
    </div>
</form>




</body>
</html>