<#import "spring.ftl" as spring/>
<#import "macros.ftl" as utils/>

<html>
<head>
    <title>Updating Question</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script    src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script    src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../static/css/style.css" />
</head>
<body>
<@utils.topMenu/>
<h2>Update question: ${question.id}</h2>
<form class="form-horizontal" action="/update/${question.id}" method="post">
    <div class="form-group">
        <label for="questionId" class="col-sm-2 control-label">ID:</label>
        <div class="col-sm-2">
                    <@spring.formInput "question.id" "class='form-control' id='questionId' placeholder='Edit ID'" "text"/>
        </div>
    </div>
    <div class="form-group">
        <label for="question" class="col-sm-2 control-label">Question:</label>
        <div class="col-sm-2">
                    <@spring.formInput "question.description" "class='form-control' id='question' placeholder='Edit Question'" "text"/>
        </div>
    </div>
    <div class="form-group">
        <label for="answer1" class="col-sm-2 control-label">Answer 1:</label>
        <div class="col-sm-2">
                    <@spring.formInput "question.answers[0].userAnswer" "class='form-control' id='answer1' placeholder='Edit Answer 1'" "text"/>
        </div>
    </div>
    <div class="form-group">
        <label for="answer2" class="col-sm-2 control-label">Answer 2:</label>
        <div class="col-sm-2">
                    <@spring.formInput "question.answers[1].userAnswer" "class='form-control' id='answer2' placeholder='Edit Answer 2'" "text"/>
        </div>
    </div>
    <div class="form-group">
        <label for="answer3" class="col-sm-2 control-label">Answer 3:</label>
        <div class="col-sm-2">
                    <@spring.formInput "question.answers[2].userAnswer" "class='form-control' id='answer3' placeholder='Edit Answer 3'" "text"/>
        </div>
    </div>
    <div class="form-group">
        <label for="answer4" class="col-sm-2 control-label">Answer 4:</label>
        <div class="col-sm-2">
                    <@spring.formInput "question.answers[3].userAnswer" "class='form-control' id='answer4' placeholder='Edit Answer 4'" "text"/>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-2">
            <button type="submit" class="btn btn-default">Update</button>
            <a href="/questions" class="btn btn-default" role="button">Return</a>
        </div>
    </div>
</form>
</body>
</html>