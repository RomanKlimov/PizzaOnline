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

<body class="theme-green">
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
<nav class="navbar">
    <div class="container-fluid">
        <div class="navbar-header">
            <a href="javascript:void(0);" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse" aria-expanded="false"></a>
            <a href="javascript:void(0);" class="bars" style="display: none;"></a>
            <a class="navbar-brand" href="/resources/index.html">ITIS PIZZA</a>
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
                <#if Session.user??>
                    <a href="/user/profile" >Личный кабинет</a>
                </li>
                <li style="text-align: center">
                    <a href="/logout" >Выйти</a>
                    <#else >
                    <a href="/login" class="">Войти</a>
                </#if>
                </li>
            </ul>
        </div></div>
</nav>
<!-- #Top Bar -->
<section>
    <!-- Left Sidebar -->

    <!-- #END# Left Sidebar -->
    <!-- Right Sidebar -->
    <aside id="rightsidebar" class="right-sidebar">
        <ul class="nav nav-tabs tab-nav-right" role="tablist">
            <li role="presentation" class="active"><a href="#skins" data-toggle="tab">SKINS</a></li>
            <li role="presentation"><a href="#settings" data-toggle="tab">SETTINGS</a></li>
        </ul>
        <div class="tab-content">
            <div role="tabpanel" class="tab-pane fade in active in active" id="skins">
                <div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto; height: 197px;"><ul class="demo-choose-skin" style="overflow: hidden; width: auto; height: 197px;">
                    <li data-theme="red" class="">
                        <div class="red"></div>
                        <span>Red</span>
                    </li>
                    <li data-theme="pink" class="">
                        <div class="pink"></div>
                        <span>Pink</span>
                    </li>
                    <li data-theme="purple">
                        <div class="purple"></div>
                        <span>Purple</span>
                    </li>
                    <li data-theme="deep-purple" class="">
                        <div class="deep-purple"></div>
                        <span>Deep Purple</span>
                    </li>
                    <li data-theme="indigo" class="">
                        <div class="indigo"></div>
                        <span>Indigo</span>
                    </li>
                    <li data-theme="blue">
                        <div class="blue"></div>
                        <span>Blue</span>
                    </li>
                    <li data-theme="light-blue">
                        <div class="light-blue"></div>
                        <span>Light Blue</span>
                    </li>
                    <li data-theme="cyan">
                        <div class="cyan"></div>
                        <span>Cyan</span>
                    </li>
                    <li data-theme="teal">
                        <div class="teal"></div>
                        <span>Teal</span>
                    </li>
                    <li data-theme="green" class="active">
                        <div class="green"></div>
                        <span>Green</span>
                    </li>
                    <li data-theme="light-green" class="">
                        <div class="light-green"></div>
                        <span>Light Green</span>
                    </li>
                    <li data-theme="lime" class="">
                        <div class="lime"></div>
                        <span>Lime</span>
                    </li>
                    <li data-theme="yellow" class="">
                        <div class="yellow"></div>
                        <span>Yellow</span>
                    </li>
                    <li data-theme="amber">
                        <div class="amber"></div>
                        <span>Amber</span>
                    </li>
                    <li data-theme="orange">
                        <div class="orange"></div>
                        <span>Orange</span>
                    </li>
                    <li data-theme="deep-orange">
                        <div class="deep-orange"></div>
                        <span>Deep Orange</span>
                    </li>
                    <li data-theme="brown">
                        <div class="brown"></div>
                        <span>Brown</span>
                    </li>
                    <li data-theme="grey">
                        <div class="grey"></div>
                        <span>Grey</span>
                    </li>
                    <li data-theme="blue-grey">
                        <div class="blue-grey"></div>
                        <span>Blue Grey</span>
                    </li>
                    <li data-theme="black">
                        <div class="black"></div>
                        <span>Black</span>
                    </li>
                </ul><div class="slimScrollBar" style="background: rgba(0, 0, 0, 0.5); width: 6px; position: absolute; top: 74px; opacity: 0.4; display: none; border-radius: 0px; z-index: 99; right: 1px; height: 43.1211px;"></div><div class="slimScrollRail" style="width: 6px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 0px; background: rgb(51, 51, 51); opacity: 0.2; z-index: 90; right: 1px;"></div></div>
            </div>
            <div role="tabpanel" class="tab-pane fade" id="settings">
                <div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto; height: 197px;"><div class="demo-settings" style="overflow: hidden; width: auto; height: 197px;">
                    <p>GENERAL SETTINGS</p>
                    <ul class="setting-list">
                        <li>
                            <span>Report Panel Usage</span>
                            <div class="switch">
                                <label><input type="checkbox" checked=""><span class="lever"></span></label>
                            </div>
                        </li>
                        <li>
                            <span>Email Redirect</span>
                            <div class="switch">
                                <label><input type="checkbox"><span class="lever"></span></label>
                            </div>
                        </li>
                    </ul>
                    <p>SYSTEM SETTINGS</p>
                    <ul class="setting-list">
                        <li>
                            <span>Notifications</span>
                            <div class="switch">
                                <label><input type="checkbox" checked=""><span class="lever"></span></label>
                            </div>
                        </li>
                        <li>
                            <span>Auto Updates</span>
                            <div class="switch">
                                <label><input type="checkbox" checked=""><span class="lever"></span></label>
                            </div>
                        </li>
                    </ul>
                    <p>ACCOUNT SETTINGS</p>
                    <ul class="setting-list">
                        <li>
                            <span>Offline</span>
                            <div class="switch">
                                <label><input type="checkbox"><span class="lever"></span></label>
                            </div>
                        </li>
                        <li>
                            <span>Location Permission</span>
                            <div class="switch">
                                <label><input type="checkbox" checked=""><span class="lever"></span></label>
                            </div>
                        </li>
                    </ul>
                </div><div class="slimScrollBar" style="background: rgba(0, 0, 0, 0.5); width: 6px; position: absolute; top: 0px; opacity: 0.4; display: block; border-radius: 0px; z-index: 99; right: 1px;"></div><div class="slimScrollRail" style="width: 6px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 0px; background: rgb(51, 51, 51); opacity: 0.2; z-index: 90; right: 1px;"></div></div>
            </div>
        </div>
    </aside>
    <!-- #END# Right Sidebar -->
</section>

<section class="content" style="margin-top: 8%;">
    <div class="container-fluid">
        <div class="block-header"></div>
        <div class="row clearfix" style="margin-left: 8%; margin-right: 8%;">
<#list model.list as pizza >
    <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                <div class="card" style="text-align:  center;">
                    <img class="card-img-top" src="/pic/${pizza.imageUrl}" alt="Card image cap" style="
                        max-width:  300px;
                        max-height:  300px;
                        min-width:  300px;
                        min-height:  300px;
                        width: 61px;">
                    <div class="header">
                        <h2>
                            ${pizza.pizzaName}
                        </h2>
                        <h2 class="" style="margin-top: 10px;">${pizza.price} руб</h2>
                    </div>
                    <div class="body">
                        <input class="form-control form-control-sm " id="${pizza.id}" type="text" placeholder="введите количество пицц" style="margin-bottom: 3%;">
                        <button class="btn btn-primary"  onclick="addPizza('${pizza.id}' , $('#'+${pizza.id}).val())" style="width: 100%;">
                            Добавить в корзину
                        </button>
                    </div>
                </div>
            </div>
<#else >
    <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
        <div class="card" style="text-align:  center;">
            <img class="card-img-top" src="http://storage.googleapis.com/bro-cdn1/zgrid/themes/10307/images/home/pizza.png" alt="Card image cap" style="
                        max-width:  300px;
                        max-height:  300px;
                        min-width:  300px;
                        min-height:  300px;
                        width: 61px;">
            <div class="header">
                <h2>
                    Default Pizza
                </h2>
                <h2 class="" style="margin-top: 10px;">450руб</h2>
            </div>
            <div class="body">
                <input class="form-control form-control-sm " id="1" type="text" placeholder="введите количество пицц" style="margin-bottom: 3%;">
                <button class="btn btn-primary"  onclick="addPizza('1' , $('#1').val())" style="width: 100%;">
                    Добавить в корзину
                </button>
            </div>
        </div>
    </div>

</#list>
            </div>
        </div>

</section>
<script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script async="" src="https://www.google-analytics.com/analytics.js"></script>
<script src="/resources/plugins/bootstrap/js/bootstrap.js"></script>
<script src="/resources/plugins/bootstrap-select/js/bootstrap-select.js"></script>
<script src="/resources/plugins/jquery-slimscroll/jquery.slimscroll.js"></script>
<script src="/resources/plugins/node-waves/waves.js"></script>
<script src="/resources/plugins/waitme/waitMe.js"></script>
<script src="/resources/js/admin.js"></script>
<script src="/resources/js/pages/cards/basic.js"></script>
<script src="/resources/js/demo.js"></script>
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