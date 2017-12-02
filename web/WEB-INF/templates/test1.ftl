<html>
<head>
    <title>我们的第一个fm</title>
    <meta charset="UTF-8"/>

</head>


<body>
基本数据类型
字符串 ：${data1} <br>
数值：${data2}<br>
布尔：${data3}<br>
集合元素：${data4[0]}<br>
集合：
<br>
${data4?size}
<#list data4 as i>

${i_index} 遍历动作：${i}<br>
</#list>
map对象

测试遍历map集合
<#list data5?keys as key>
${key}
${data5[key]}
</#list>
<br>
时间${data6?string("yyyy-MM-dd HH:mm:ss")}<br>
javaBean:
用户名：${user['uname']}
密码：${user["upwd"]}
字符串拼接：
${"hello,${user.uname}"}
hello,${user.uname}
字符串截取：
${data1[0..3]} <#-- 输出子串“0123” -->
${data1?lower_case}
${data2?int}
<br>
${htm2?html}
<#--${css}-->
${css!}
${css!"abc"}

</body>
<#if user1??><h1>Welcome${user1}</h1>
</#if>

<br>
${"It's \"quoted\""}
<br>
<#--使用<#assign nums=[1,2,3,4,5,77,8,99]/>-->
使用list指令将序列输出，
<#list nums as num>
${num}
</#list>
<#if score1 gt 80 >
    <h1>优秀</h1>
<#elseif score1 gte 60>
    及格了
<#else >
<h1>不及格</h1>
</#if>
<#--<#include  "test2.ftl"/>-->

<#macro  m2 a b c>
${a}---${b}---${c}
</#macro>
<@m2 a="xx1" b="xx2" c="xx3"/>
测试宏指令并传入标签内容
<#macro  m2 a b c>
${a}---${b}---${c}
<h1  style="color: red"> <#nested ></h1>
</#macro>

<@m2 a="xx1" b="xx2" c="xx3">动态传入的内容${data1}</@m2>
<#import  "test2.ftl" as test2>
<@test2.m1>
lalla
</@test2.m1>
调用方法
<#assign name="user.getUname(key)">${name}
<#assign  a=14>
<#assign  b=14>
<br>
输出a: ${a}

<#if a=b>
 ${data1}
</#if>


</html>