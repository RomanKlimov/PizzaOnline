<#import "auth.ftl" as dec >
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script
            src="https://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>

<#if Session.isLogin??>
<a href="/user/profile" class="nav-link" id="btn-order">Личный кабинет</a>
</li>
<li>
    <a href="/logout" class="nav-link" id="btn-order">Выйти с аккаунта</a>

<#else>
    <a href="#myModal" class="nav-link" data-toggle="modal" id="btn-order">Личный кабинет</a>
</#if>


<#list model.list as pizza >
    <div id="cartContentShow">
        <div  class="showProducts"><br>
            <input id="${pizza.id}" type="text" placeholder="enter count">
            <input type="button"  onclick="addPizza('${pizza.id}' , $('#'+${pizza.id}).val())">
        </div>
    </div>
</#list>
<@dec.loginModal />
<script>
    function addPizza(id, count) {
        $.ajax({
            url:'/toCart',
            method:'post',
            dataType:'json',
            data: {'pizzaId':id, 'count': count},
            success: function () {
                console.log("success add to cart");
                alert("success");
            }
        });
    }
</script>
</body>
</html>