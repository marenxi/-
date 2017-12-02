<html>
<head>
    <title>我们的第一个fm</title>
    <meta charset="UTF-8"/>
</head>


<body>
欢迎放点数据:${data1} and  ${data2} and  ${data3}
<#macro m1>
<h1  style="color: red"> <#nested></h1>
</#macro>
<@m1>动态传入的内容</@m1>



<#macro m2 a b c>
${a}---${b}---${c}
<h1  style="color: red"></h1>
</#macro>
<@m2 a="" b="" c=""></@m2>
</body>
</html>