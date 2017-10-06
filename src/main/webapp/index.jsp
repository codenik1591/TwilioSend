<html>

<body onload="nikHtmlFun()">
	<form id="demo" action="TwilioSend" method="post"></form>
	<h2>Welcome to Nikhil's Twilio SMS service</h2>
	<%
		System.out.println("In index.jsp");
	%>
</body>
<script>
	function nikHtmlFun() {
		var nikHtmlform = document.getElementById("demo");
		nikHtmlform.submit();
		alert('Message sent');
	}
</script>
</html>