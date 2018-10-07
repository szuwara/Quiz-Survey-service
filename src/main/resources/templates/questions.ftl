<html>
<head>
    <title>Index</title>
</head>
<body>
    <ul>
        <#list questions as question>
            <li>${question.description}</li>
            <ul>
                <#list question.answers as answer>
                    <li>${answer.userAnswer}</li>
                </#list>
            </ul>
        </#list>
    <#--<ol>
        <#list answers as answer>
            <li>${answer.userAnswer}</li>
        </#list>
    </ol>-->
    </ul>
</body>
</html>