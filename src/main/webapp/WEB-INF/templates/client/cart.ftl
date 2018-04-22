<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
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
<#else >
</#list>
</ul>
    <a href="/orderPizza">Заказать</a>
</body>
</html>