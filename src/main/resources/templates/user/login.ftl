<!DOCTYPE html>
<html lang="zh-cn">
    <head>
        <meta charset="utf-8">
        <title>登录</title>
        <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, userPojo-scalable=no" name="viewport" />
        <link   rel="icon" href="/favicon.ico" type="image/x-icon" />
		<link   rel="shortcut icon" href="/favicon.ico" />
        <!-- CSS -->
        <link rel="stylesheet" href="/css/style.css" type="text/css" />
        <link rel="stylesheet" href="/css/top.css" type="text/css" />
        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
            <script src="/static/js/common/html5shiv.js"></script>
        <![endif]-->
        <style>

            .mainDiv {
                background-color:#CFE8E9;
                height: 100%;
            }

            .formDiv {
                font-size: 20px;
                margin-bottom: 20px;
            }

            .formDiv input {
                width: 200px;
                height: 30px;
            }

            .textDiv {
                margin-top: 30px;
            }

            .textDiv input {
                width: 200px;
                height: 30px;
            }

            .buttonDiv {
                margin-top: 30px;
            }

            .buttonDiv input {
                width: 80px;
                height: 40px;
                margin-left: 40px;
            }

        </style>
    </head>

    <body id="body">
    <div class="mainDiv">
        <div style="margin-top: 90px; ">
            <div style="height: 40px;"></div>
            <div style="height: 40px; margin-top: 100px;">
                <h1 style="font-size:30px; margin-top: 100px;"><strong>欢迎使用</strong></h1>
            </div>

            <div class="formDiv">
                <span style="color:red; height: 30px;"></span>
                <form method="post" action="/login/test">
                    <div class="textDiv">
                        <span style="width: 300px; margin-right: 20px;">用户名: </span>
                        <input type="text" name="name"/>

                    </div>
                    <div class="textDiv">
                        <span style="width: 300px; margin-right: 40px;">密码:</span>
                        <input type="password" name="passwd"/>
                    </div>
                    <input type="hidden" name="flag" value="0"/>
                    <div class="buttonDiv">
                        <input type="submit" value="确定"/>
                        <input type="button" value="取消"/>
                    </div>
                </form>
            </div>
        </div>

    </div>
    </body>

</html>

