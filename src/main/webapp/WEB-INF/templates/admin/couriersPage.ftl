

<html class="chrome">

<head>
    <meta charset="UTF-8">
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <title>Basic Card | Bootstrap Based Admin Template - Material Design</title>
    <!-- Favicon-->
    <link rel="icon" href="/resources/favicon.ico" type="image/x-icon">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Roboto:400,700&amp;subset=latin,cyrillic-ext" rel="stylesheet" type="text/css">
    <link href="/resources/css/icon.css" rel="stylesheet" type="text/css">

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


<section class="content" style="
    margin: 100px 15px 0 0;
">
    <div class="container-fluid">

        <!-- Basic Examples -->
        <div class="row clearfix">
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <div class="card">
                    <div class="header">

                        <ul class="header-dropdown m-r--5">

                        </ul>
                    </div>
                    <div class="body">
                        <div class="table-responsive">
                            <div id="DataTables_Table_0_wrapper" class="dataTables_wrapper form-inline dt-bootstrap"><div class="row"><div class="col-sm-6"><div class="dataTables_length" id="DataTables_Table_0_length"><label>Show <select name="DataTables_Table_0_length" aria-controls="DataTables_Table_0" class="form-control input-sm"><option value="10">10</option><option value="25">25</option><option value="50">50</option><option value="100">100</option></select> entries</label></div></div><div class="col-sm-6"><div id="DataTables_Table_0_filter" class="dataTables_filter"><label>Search:<input type="search" class="form-control input-sm" placeholder="" aria-controls="DataTables_Table_0"></label></div></div></div><div class="row"><div class="col-sm-12"><table class="table table-bordered table-striped table-hover js-basic-example dataTable" id="DataTables_Table_0" role="grid" aria-describedby="DataTables_Table_0_info">
                                <thead>
                                <tr role="row">
                                    <th class="sorting_asc" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Name: activate to sort column descending" style="width: 152px;">
                                        Id
                                    </th>
                                    <th class="sorting" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1" colspan="1" aria-label="Position: activate to sort column ascending" style="width: 171px;">
                                        Имя
                                    </th>
                                    <th class="sorting" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1" colspan="1" aria-label="Age: activate to sort column ascending" style="width: 69px;">
                                        Почта
                                    </th>
                                    <th class="sorting" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1" colspan="1" aria-label="Start date: activate to sort column ascending" style="width: 133px;">
                                        Телефон
                                    </th>
                                </tr>
                                </thead>
                                <tbody>
                                <#list users as user>
                                <tr role="row" class="odd">
                                    <td class="sorting_1">${user.id}</td>
                                    <td >${user.name}</td>
                                    <td>${user.email}</td>
                                    <td>${user.phoneNumber}</td>
                                </tr>
                                <#else >
                                </#list>
                                <form action="/admin/addUser" method="post">
                                    <tr role="row" class="even">
                                        <td class="sorting_1">id</td>
                                        <td><input class="form-control" name="name"  type="text"></td>
                                        <td><input class="form-control" name="email" type="text"></td>
                                        <td><input class="form-control" name="phoneNumber" type="text"></td>
                                    </tr>
                                    <tr role="row" class="even">
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td><input type="submit" class="btn btn-success" value="Добавить"></td>
                                    </tr>
                                </form>
                                </tbody>
                            </table></div></div><div class="row"><div class="col-sm-5"><div class="dataTables_info" id="DataTables_Table_0_info" role="status" aria-live="polite">Showing 1 to 2 of 2 entries</div></div><div class="col-sm-7"><div class="dataTables_paginate paging_simple_numbers" id="DataTables_Table_0_paginate"><ul class="pagination"><li class="paginate_button previous disabled" id="DataTables_Table_0_previous"><a href="#" aria-controls="DataTables_Table_0" data-dt-idx="0" tabindex="0">Previous</a></li><li class="paginate_button active"><a href="#" aria-controls="DataTables_Table_0" data-dt-idx="1" tabindex="0">1</a></li><li class="paginate_button next disabled" id="DataTables_Table_0_next"><a href="#" aria-controls="DataTables_Table_0" data-dt-idx="2" tabindex="0">Next</a></li></ul></div></div></div></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- #END# Basic Examples -->
        <!-- Exportable Table -->

        <!-- #END# Exportable Table -->
    </div>
</section>

<!-- Jquery Core Js -->
<script async="" src="https://www.google-analytics.com/analytics.js"></script><script src="/resources/plugins/jquery/jquery.min.js"></script>

<!-- Bootstrap Core Js -->
<script src="/resources/plugins/bootstrap/js/bootstrap.js"></script>

<!-- Select Plugin Js -->
<script src="/resources/plugins/bootstrap-select/js/bootstrap-select.js"></script>

<!-- Slimscroll Plugin Js -->
<script src="/resources/plugins/jquery-slimscroll/jquery.slimscroll.js"></script>

<!-- Waves Effect Plugin Js -->
<script src="/resources/plugins/node-waves/waves.js"></script>

<!-- Jquery DataTable Plugin Js -->
<script src="/resources/plugins/jquery-datatable/jquery.dataTables.js"></script>
<script src="/resources/plugins/jquery-datatable/skin/bootstrap/js/dataTables.bootstrap.js"></script>
<script src="/resources/plugins/jquery-datatable/extensions/export/dataTables.buttons.min.js"></script>
<script src="/resources/plugins/jquery-datatable/extensions/export/buttons.flash.min.js"></script>
<script src="/resources/plugins/jquery-datatable/extensions/export/jszip.min.js"></script>
<script src="/resources/plugins/jquery-datatable/extensions/export/pdfmake.min.js"></script>
<script src="/resources/plugins/jquery-datatable/extensions/export/vfs_fonts.js"></script>
<script src="/resources/plugins/jquery-datatable/extensions/export/buttons.html5.min.js"></script>
<script src="/resources/plugins/jquery-datatable/extensions/export/buttons.print.min.js"></script>

<!-- Custom Js -->
<script src="/resources/js/admin.js"></script>
<script src="/resources/js/pages/tables/jquery-datatable.js"></script>

<!-- Demo Js -->
<script src="/resources/js/demo.js"></script>


</body>
<!-- #Top Bar -->
</html>