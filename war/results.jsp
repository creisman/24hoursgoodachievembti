<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.achieve.mbti.util.Results" %>
<title>Achieve - Results</title>

<html>
	<body>
		<p>Your personality type is:</p>
		<p>${param.EorI}
			(<%= request.getParameter("EorIPercent") %> percent) </p>
		<p>${param.SorN}
			(<%= request.getParameter("SorNPercent") %> percent) </p>
		<p><%= request.getParameter("TorF") %>
			(<%= request.getParameter("TorFPercent") %> percent) </p>
		<p><%= request.getParameter("JorP") %>
			(<%= request.getParameter("JorPPercent") %> percent) </p>
		<p><%= Results.getPrimaryEvalString("ENTP") %></p>
	</body>
</html>