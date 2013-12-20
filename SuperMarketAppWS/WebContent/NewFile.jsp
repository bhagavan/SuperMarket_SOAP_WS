<!DOCTYPE html>  
<html><head>  
    <meta http-equiv='X-UA-Compatible' content='IE=edge' />  
    <title>Hello World</title>  
  
    <script id='sap-ui-bootstrap' 
        src='file:///E:/SAP/UI5/openui5-runtime-1.16.8-SNAPSHOT/resources/sap-ui-core.js'  
        data-sap-ui-theme='sap_goldreflection'  
        data-sap-ui-libs='sap.ui.commons'></script>   
  
<script>  
    var btn = new sap.ui.commons.Button({  
        text:'Hello World',  
        press:function(){alert('Hello!')}  
    });  
    btn.placeAt('content');  
</script>

</head>
<body class='sapUiBody'>
    <div id='content'>
    This is Sample SAP UI5 web Application
    <form action="Button()" onsubmit="return Button()">
    <input type="button" >
    </form>
    </div>
</body>
</html>