<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="com.achieve.mbti.util.Results" %>
<title>Achieve - Results</title>

<html>
  	<head>
    	<link type="text/css" rel="stylesheet" href="/stylesheets/results.css" >
  	</head>

	<body>
		
		<p>Your personality type is:</p>
		<p>${param.EorI}
			(<%= request.getParameter("EorIPercent") %> percent) </p>
		<p>${param.SorN}
			(<%= request.getParameter("SorNPercent") %> percent) </p>
		<p>${param.TorF}
			(<%= request.getParameter("TorFPercent") %> percent) </p>
		<p>${param.JorP}
			(<%= request.getParameter("JorPPercent") %> percent) </p>
	

		<%
			//personality string
			String personality = request.getParameter("EorI") +
								request.getParameter("SorN") +
								request.getParameter("TorF") +
								request.getParameter("JorP");
								
			//array storing evaluation objects for this type of personality
			//use MAJORS_INDEX and FACTS_INDEX (class constants in Results)
			//to access the majors list and the facts list
			//Results.PersonalityInfo[] evalArray = Results.getPrimaryEval(personality);
		%>
		
		<%= personality %>
		<p>We recommend these majors for you: </p>
		
		<%
			//the list of recommended majors for this personality
			List<String> majorsList = evalArray[Results.MAJORS_INDEX].info;
		%>
		
		<ul>		
		<%
			for(String major : majorsList){ 
				%>
				
				<li> <%= major %> </li>
				
				<%
			}
		%>
		</ul>

		<p>Here are some facts related to your personality: </p>
		
		<%
			//the list of facts related to this personality
			List<String> factsList = evalArray[Results.FACTS_INDEX].info;
		%>
		
		<ul>
		<%
			for(String fact : factsList){ 
				%>
				
				<li> <%= fact %> </li>
				
				<%
			}
		%>
		</ul>
		
	</body>
</html>