<%@ include file="/common/taglib.jsp" %>
<head>
    <title>Login</title>
</head>
<body>
<div class="container">
    <div class="login-form">
        <div class="main-div">

            <form action="<c:url value='/login'/>" id="formLogin" method="post">
                <div class="form-group">
                    <label for="userName">Username</label>
                    <input type="text" class="form-control col-md-6" id="userName" name="userName" placeholder="Username">
                </div>

                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" class="form-control col-md-6" id="password" name="password" placeholder="Password">
                </div>
                <input type="hidden" value="login" name="action"/>
                <button type="submit" class="btn btn-primary">Login</button>
            </form>
        </div>
    </div>
</div>
</body>
