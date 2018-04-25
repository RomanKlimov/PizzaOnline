<html class="chrome">

<head>
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

    <link href="/resources/plugins/dropzone/dropzone.css" rel="stylesheet">
    <!--WaitMe Css-->
    <link href="/resources/plugins/waitme/waitMe.css" rel="stylesheet">

    <!-- Sweet Alert Css -->
    <link href="/resources/plugins/sweetalert/sweetalert.css" rel="stylesheet" />

    <!-- Animation Css -->
    <link href="/resources/plugins/animate-css/animate.css" rel="stylesheet">

    <!-- Custom Css -->
    <link href="/resources/css/style.css" rel="stylesheet">

    <!-- AdminBSB Themes. You can choose a theme from css/themes instead of get all themes -->
    <link href="/resources/css/themes/all-themes.css" rel="stylesheet">
</head>

<body class="theme-red">
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
<!-- #END# Page Loader -->
<!-- Overlay For Sidebars -->
<div class="overlay"></div>
<!-- #END# Overlay For Sidebars -->
<!-- Search Bar -->

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
                    <a href="/admin/pizzas" class="">Добавить пиццу</a>
                </li>
                <li style="text-align:  center;">
                    <a href="/home" class="">Пиццы</a></li>
                <li style="text-align:  center;">
                    <a href="/admin/clients" class="">Клиенты</a>
                </li>
                <li style="text-align:  center;">
                    <a href="/admin/couriers" class="">Курьеры</a>
                </li>
            <li style="text-align:  center;">
            <#if Session.user??>
                <a href="/logout" >Выйти</a>
            <#else >
                <a href="/login" class="">Войти</a>
            </#if>
            </li>
            </ul>
        </div></div>
</nav>
<!-- #Top Bar -->


<section class="content" style="    margin: 100px 15px 0 0;">
    <div class="container-fluid">
        <div class="block-header">
        </div>
        <!-- Basic Card -->
        <div class="row clearfix">
            <div class="col-lg-12 col-md-4 col-sm-6 col-xs-12">
                <div class="card">
                    <div class="header">
                        <h2>
                            Добавить новую пиццу
                        </h2>
                        <ul class="header-dropdown m-r--5">
                            <li class="dropdown">
                                <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                    <i class="material-icons">more_vert</i>
                                </a>
                                <ul class="dropdown-menu pull-right">
                                    <li><a href="javascript:void(0);" class=" waves-effect waves-block">Action</a></li>
                                    <li><a href="javascript:void(0);" class=" waves-effect waves-block">Another action</a></li>
                                    <li><a href="javascript:void(0);" class=" waves-effect waves-block">Something else here</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                    <div class="body">

                        <div class="row">
                            <form id="form_validation" enctype="multipart/form-data" action="/admin/addPizza" method="POST" novalidate="novalidate">
                                <div class="col-lg-6">
                                        <div class="dz-message">
                                            <div class="drag-icon-cph">
                                                <i class="material-icons">touch_app</i>
                                            </div>
                                            <h3>Загрузить картинку..</h3>
                                        </div>
                                    <input type="file" name="file" class="dropify" data-max-file-size="2mb" data-default-file=""/>
                                </div>
                                <div class="col-lg-6">
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                            <input type="text" class="form-control" placeholder="Название пиццы" name="pizzaName" required="" aria-required="true">

                                        </div>
                                    </div>
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                            <input type="text" class="form-control" placeholder="Цена" name="price" required="" aria-required="true">
                                        </div>
                                    </div>
                                    <div class="form-group form-float">
                                        <div class="form-line">
                                            <input type="text" class="form-control" placeholder="Количество доступных пицц" name="available" required="" aria-required="true">
                                        </div>
                                    </div>


                                    <div class="form-group form-float">
                                        <div class="form-line">
                                            <textarea name="description" placeholder="Описание" cols="30" rows="5" class="form-control no-resize" required="" aria-required="true"></textarea>
                                        </div>
                                    </div>


                                    <button class="btn btn-primary waves-effect" type="submit">Добавить пиццу</button>
                                </div>
                            </form>

                        </div>
                    </div>
                </div>
            </div>



        </div>





    </div>
</section>

<!-- Jquery Core Js -->
<script async="" src="https://www.google-analytics.com/analytics.js"></script>
<script src="/resources/plugins/jquery/jquery.min.js"></script>

<!-- Bootstrap Core Js -->
<script src="/resources/plugins/bootstrap/js/bootstrap.js"></script>

<!-- Select Plugin Js -->
<script src="/resources/plugins/bootstrap-select/js/bootstrap-select.js"></script>

<!-- Slimscroll Plugin Js -->
<script src="/resources/plugins/jquery-slimscroll/jquery.slimscroll.js"></script>

<!-- Jquery Validation Plugin Css -->
<script src="/resources/plugins/jquery-validation/jquery.validate.js"></script>

<!-- JQuery Steps Plugin Js -->
<script src="/resources/plugins/jquery-steps/jquery.steps.js"></script>

<script src="/resources/plugins/sweetalert/sweetalert.min.js"></script>
<!-- Waves Effect Plugin Js -->
<script src="/resources/plugins/node-waves/waves.js"></script>

<!-- Wait Me Plugin Js -->
<script src="/resources/plugins/waitme/waitMe.js"></script>
<script src="/resources/plugins/dropzone/dropzone.js"></script>

<!-- Custom Js -->
<script src="/resources/js/admin.js"></script>
<script src="/resources/js/pages/cards/basic.js"></script>
<script src="/resources/js/pages/forms/form-validation.js"></script>
<script src="/resources/js/pages/forms/advanced-form-elements.js"></script>
<!-- Demo Js -->
<script src="/resources/js/demo.js"></script>

</body></html>