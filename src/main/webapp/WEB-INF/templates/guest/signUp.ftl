<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <title>Sign Up | Bootstrap Based Admin Template - Material Design</title>
    <!-- Favicon-->
    <link rel="icon" href="/resources/favicon.ico" type="image/x-icon">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Roboto:400,700&subset=latin,cyrillic-ext" rel="stylesheet" type="text/css">
    <link href="/resources/css/icon.css" rel="stylesheet" type="text/css">

    <!-- Bootstrap Core Css -->
    <link href="/resources/plugins/bootstrap/css/bootstrap.css" rel="stylesheet">

    <!-- Waves Effect Css -->
    <link href="/resources/plugins/node-waves/waves.css" rel="stylesheet" />

    <!-- Animation Css -->
    <link href="/resources/plugins/animate-css/animate.css" rel="stylesheet" />

    <!-- Custom Css -->
    <link href="/resources/css/style.css" rel="stylesheet">
</head>

<body class="signup-page ls-closed">
<div class="signup-box">
    <div class="logo">
        <a href="javascript:void(0);">ITIS<b> PIZZA</b></a>

    </div>
    <div class="card">
        <div class="body">
            <form id="sign_up" action="/signUp" method="POST" novalidate="novalidate">

                <div class="input-group">
                        <span class="input-group-addon">
                            <i class="material-icons">person</i>
                        </span>
                    <div class="form-line">
                        <input type="text" class="form-control" name="name" placeholder="Имя " required="" autofocus="" aria-required="true">
                    </div>
                </div>
                <div class="input-group">
                        <span class="input-group-addon">
                            <i class="material-icons">email</i>
                        </span>
                    <div class="form-line">
                        <input type="email" class="form-control" name="email" placeholder="e-mail" required="" aria-required="true">
                    </div>
                </div>
                <div class="input-group">
                        <span class="input-group-addon">
                            <i class="material-icons">phone</i>
                        </span>
                    <div class="form-line">
                        <input type="text" class="form-control" name="phoneNumber" placeholder="Телефон номер" required="" aria-required="true">
                    </div>
                </div>
                <div class="input-group">
                        <span class="input-group-addon">
                            <i class="material-icons">lock</i>
                        </span>
                    <div class="form-line">
                        <input type="password" class="form-control validate-equalTo-blur" name="password" minlength="6" placeholder="Пароль" required="" aria-required="true" aria-invalid="false">
                    </div>
                </div>
                <div class="input-group">
                        <span class="input-group-addon">
                            <i class="material-icons">lock</i>
                        </span>
                    <div class="form-line">
                        <input type="password" class="form-control" name="confirm" minlength="6" placeholder="Введите еще раз пароль" required="" aria-required="true" aria-invalid="true">
                    </div>
                </div>
                <button class="btn btn-block btn-lg bg-pink waves-effect" type="submit">Зарегистрироваться</button>

                <div class="m-t-25 m-b--5 align-center">
                    <a href="/login">Уже зарегистрированы?</a>
                </div>
            </form>
        </div>
    </div>
</div>

<!-- Jquery Core Js -->
<script src="/resources/plugins/jquery/jquery.min.js"></script>

<!-- Bootstrap Core Js -->
<script src="/resources/plugins/bootstrap/js/bootstrap.js"></script>

<!-- Waves Effect Plugin Js -->
<script src="/resources/plugins/node-waves/waves.js"></script>

<!-- Validation Plugin Js -->
<script src="/resources/plugins/jquery-validation/jquery.validate.js"></script>

<!-- Custom Js -->
<script src="/resources/js/admin.js"></script>
<script src="/resources/js/pages/examples/sign-up.js"></script>


</body>
</html>