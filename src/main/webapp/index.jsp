<html>
  
<body onload = "nikHtmlFun()">
  <form id="demo" action="TwilioSend" method="post">
  </form>
  <h2>Welcome to Nikhil's SMS service</h2>
  <% System.out.println( "In Index.sp" ); %>
</body>
<script>
      function nikHtmlFun(){
    	  var nikHtmlform=document.getElementById("demo");
    	  nikHtmlform.submit();
    	  alert('Message sent');
      }
  </script>
</html>