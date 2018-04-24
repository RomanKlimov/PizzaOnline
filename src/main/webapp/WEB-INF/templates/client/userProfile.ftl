<#ftl encoding="utf-8">
<html class="chrome"><head>
    <meta charset="UTF-8">
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <title>Basic Card | Bootstrap Based Admin Template - Material Design</title>
    <!-- Favicon-->
    <link rel="icon" href="/resources/favicon.ico" type="image/x-icon">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Roboto:400,700&amp;subset=latin,cyrillic-ext" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" type="text/css">

    <!-- Bootstrap Core Css -->
    <link href="/resources/plugins/bootstrap/css/bootstrap.css" rel="stylesheet">

    <!-- Waves Effect Css -->
    <link href="/resources/plugins/node-waves/waves.css" rel="stylesheet">

    <!--WaitMe Css-->
    <link href="/resources/plugins/waitme/waitMe.css" rel="stylesheet">

    <!-- Animation Css -->
    <link href="/resources/plugins/animate-css/animate.css" rel="stylesheet">

    <!-- Custom Css -->
    <link href="/resources/css/style.css" rel="stylesheet">

    <!-- AdminBSB Themes. You can choose a theme from css/themes instead of get all themes -->
    <link href="/resources/css/themes/all-themes.css" rel="stylesheet">
</head>

<body class="theme-green" data-gr-c-s-loaded="true">
<!-- Page Loader -->
<div class="page-loader-wrapper" style="display: none;">
    <div class="loader">
        <div class="preloader">
            <div class="spinner-layer pl-red">
                <div class="circle-clipper left">
                    <div class="circle"></div>
                </div>
                <div class="circle-clipper right">
                    <div class="circle"></div>
                </div>
            </div>
        </div>
        <p>Please wait...</p>
    </div>
</div>
<div class="overlay" style="display: none;"></div>

<!-- #END# Search Bar -->
<!-- Top Bar -->
<nav class="navbar" style="background-color: #00BCD4;">
    <div class="container-fluid">
        <div class="navbar-header">
            <a href="javascript:void(0);" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse" aria-expanded="false"></a>
            <a href="javascript:void(0);" class="bars" style="display: none;"></a>
            <a class="navbar-brand" href="/home">ITIS PIZZA</a>
        </div>
        <div class="navbar-header" id="navbar-collapse" style="float:  right;">
            <ul class="nav navbar-nav navbar-center" style="">
                <li style=" text-align:  center; margin-bottom: 2px;">
                    <a href="javascript:void(0);" class="js-search" data-close="true" style="margin: 5px;">
                        <i class="material-icons">search</i></a>
                </li>
            </ul>
        </div>
        <div class="collapse navbar-collapse" id="navbar-collapse" style="
            margin:  0 auto;
            width: 687px;">
            <ul class="nav navbar-nav navbar-center" style="margin-left: 27%;">
                <li style="text-align:  center;">
                    <a href="/home" class="">Пиццы</a>
                </li>
                <li style="text-align:  center;">
                    <a href="#" class="">О нас</a></li>
                <li style="text-align:  center;">
                    <a href="#" class="">Акции</a>
                </li>
                <li style="text-align:  center;">
                    <a href="/cart" class="">Корзина</a>
                </li>
                <li style="text-align:  center;">
                    <a href="/user/profile">Личный кабинет</a>
                </li>
                <li style="text-align: center">
                    <a href="/logout">Выйти</a>
                </li>
            </ul>
        </div></div>
</nav>
<div class="col-6 content">


    <div class="card card-info  border-secondary ">
        <div class="card-header bg-dark border-secondary ">
            <h3 class="card-title text-white">Профиль, Roman</h3>
        </div>
        <div class="card-body">
            <div class="row" style="
    margin-top:  50px;
">
                <div class="col-md-3 col-lg-3 " align="center">
                    <div class="dz-message">
                        <div class="drag-icon-cph">
                            <i class="material-icons">touch_app</i>
                        </div>
                        <h3>Загрузить картинку..</h3>
                    </div>
                    <input type="file" name="file" class="dropify" data-max-file-size="2mb" data-default-file="">
                </div>


                <div class=" col-md-9 col-lg-9 ">
                    <table class="table table-user-information">
                        <tbody>
                        <tr>
                            <td>Имя</td>
                            <td>${user.name}</td>
                        </tr>
                        <tr>
                            <td>Email</td>
                            <td>${user.email}</td>
                        </tr>
                        <tr><td>Номер телефона</td>
                            <td>${user.phoneNumber}</td>
                        </tr>
                        <tr>
                            <td>Обновить пароль</td>
                            <td><input type="password" class="btn border-info" value="" placeholder="старый пароль"></td>
                            <td><input type="password" class="btn border-info" value="" placeholder="новый пароль"></td>
                        </tr>
                        </tbody>
                    </table>

                    <a href="#" class="btn btn-primary" style="float: right;">Сохранить</a>
                </div>
            </div>
        </div>
        <div class="card-footer bg-dark border-secondary ">
            <span class="pull-right">
              <a href="edit.html" data-original-title="Edit this user" data-toggle="tooltip" type="button" class="btn btn-sm btn-warning"><a href="#" class="btn btn-primary" style="float: right;">Удалить аккаунт</a></a>
            </span>
        </div>

    </div>
</div>





</body>
</html>
