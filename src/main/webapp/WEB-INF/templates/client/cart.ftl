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

<ul>
<#list carts as cart >

    <li>${cart.pizza.imageUrl}</li>
    <li>${cart.pizza.pizzaName}</li>
    <li>${cart.pizza.description}</li>
    <li>${cart.pizza.price}</li>
    <li>${cart.count}</li>
    <form name="deletePizza" action="/deleteFromCart" method="post">
        <input type="hidden" name="cartId" value="${cart.id}">
        <input type="submit" value="Удалить">
    </form>

</#list>
</ul>
    <form name="orderPizza" action="/deleteFromCart" method="post">
        <input type="hidden" name="cartId" value="${cart.id}">
        <input type="submit" value="Удалить">
    </form>

</body>
</html>