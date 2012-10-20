<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="com.achieve.mbti.util.Results" %>
<title>Achieve - Results</title>

<html>
  	<head>
    	<link type="text/css" rel="stylesheet" href="/stylesheets/results.css" >
  	</head>

	<body>
		
		<%
			if(!request.getMethod().equals("POST")){
				//this page was accessed with a method other than HTTP POST
		 		%>
		 		<p>This page can only be accessed via POST request</p>
		 		<p>Please go to <a href="/index.html">this page</a> to access this page properly</p>
		 		<%
		 	} else { //POST method is used and all fields are validated
		 		%>
		
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
					Results.PersonalityInfo[] evalArray = Results.getPrimaryEval(personality);
				%>
				
				<div id="majors" class="container">
					<h2 id="majorsheader" class="header">We recommend these majors for you: </h2>
					<div id="majorsline" class="line"></div>
					
					<%
						//the list of recommended majors for this personality
						List<String> majorsList = evalArray[Results.MAJORS_INDEX].info;
					%>
					
					<ul>		
					<% 
						for(int i = 0; i < majorsList.size(); i++){
							if(i % 2 == 0){ 
								%>
								<%-- index is even, choose light style... --%>
								<li class="light"> <%= majorsList.get(i) %> </li>
								
								<%
							} else {
								%>
								<%-- index is odd, choos dark style... --%>
								<li class="dark"> <%= majorsList.get(i) %> </li>
								
								<%
							}
						}
					%>
					</ul>
				</div>
				
				<div id="facts" class="container">
					<h2 id="factsheader" class="header">Here are some facts related to your personality: </h2>
					<div id="factsline" class="line"></div>
					<%
						//the list of facts related to this personality
						List<String> factsList = evalArray[Results.FACTS_INDEX].info;
					%>
					
					<% 
						for(int i = 0; i < factsList.size(); i++){
							if(i % 2 == 0){ 
								%>
								<%-- index is even, choose light style... --%>
								<li class="light"> <%= factsList.get(i) %> </li>
								
								<%
							} else {
								%>
								<%-- index is odd, choos dark style... --%>
								<li class="dark"> <%= factsList.get(i) %> </li>
								
								<%
							}
						}
					%>
				</div>
				<%
			}
		%>
		
	</body>
</html>