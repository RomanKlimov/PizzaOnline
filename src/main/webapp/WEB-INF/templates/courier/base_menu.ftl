<#macro leftSideBar>
<aside id="leftsidebar" class="sidebar">
    <!-- User Info -->
    <div class="user-info">
        <div class="image">
            <img src="/resources/images/user.png" width="48" height="48" alt="User" />
        </div>
        <div class="info-container">
            <div class="name" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">John Doe</div>
            <div class="email">john.doe@example.com</div>

        </div>
    </div>
    <!-- #User Info -->
    <!-- Menu -->
    <div class="menu">
        <ul class="list">
            <li>
                <a href="/courier/profile">
                    <i class="material-icons">home</i>
                    <span>Профиль</span>
                </a>
            </li>
            <li>
                <a href="/courier/orders">
                    <i class="material-icons">view_module</i>
                    <span>Активные заказы</span>
                </a>
            </li>
            <li>
                <a href="/courier/myClients">
                    <i class="material-icons">watch_later</i>
                    <span>Ожидающие заказы</span>
                </a>
            </li>
            <li>
                <a href="/courier/completedOrders">
                    <i class="material-icons">done</i>
                    <span>Завершенные заказы</span>
                </a>
            </li>
            <li>
                <a href="/courier/completedOrders">
                    <i class="material-icons">exit_to_app</i>
                    <span>Выход</span>
                </a>
            </li>
            <#--<li class="header">LABELS</li>-->
        </ul>
    </div>

</aside>
</#macro>