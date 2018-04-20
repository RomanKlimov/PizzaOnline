<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Invite courier</title>
</head>
<body>

<ul>
<#list inviteCodes as inviteCode>
    <li><a href="http://localhost:8080/register?code=${inviteCode.code}">${inviteCode.code} -> ${inviteCode.forName}</a></li>
<#else >
<h2>Create invitation url!</h2>
</#list>
</ul>
</body>
</html>