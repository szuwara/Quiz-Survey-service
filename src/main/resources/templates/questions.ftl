<#import "spring.ftl" as spring/>
<#import "macros.ftl" as utils/>
<html>
<head>
    <title>Questions List</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script    src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script    src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="static/css/style.css" />
</head>
<body>
<@utils.topMenu/>
        <div class="container-fluid">
            <table class="table table-striped">
                <thead>
                <th>ID</th>
                <th>Questions</th>
                <th>Anwsers</th>
                </thead>
                <tbody>
            <#list questions as question>
            <tr>
                <td>${question.id}</td>
                <td>${question.description}</td>
                <td><#list question.answers as answer>
                    <li>${answer.userAnswer}</li>
                </#list></td>
                <td>
                    <a href="/update/${question.id}">Update</a>
                </td>
                <td>
                    <a href="/delete/${question.id}" onclick="return confirm ('Are you sure, you want to delete it?')">Delete</a>
                </td>
            </tr>
            </#list>
                </tbody>
            </table>
        </div>
    </ul>
</body>
</html>