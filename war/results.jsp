<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="com.achieve.mbti.util.Results" %>
<title>Achieve - Results</title>

<html>
  	<head>
    	<link type="text/css" rel="stylesheet" href="/stylesheets/results.css" >
  	</head>

	<body>
		
		<%!
			public boolean validate(){
				return true;
			}
			

			//checks whether a number is between 0 to 100 (inclusive)
			public boolean isIntPercent(int num){	
				return (num >= 0 && num <= 100);
			}
		%>
		
		<%
			if(!request.getMethod().equals("POST")){
				//this page was accessed with a method other than HTTP POST
		 		%>
		 		<p>This page can only be accessed via POST request</p>
		 		<p>Please go to <a href="/index.html">this page</a> to access this page properly</p>
		 		<%
		 	} else {
		 		//the array storing options values from the dropdown list
		 		String[] selections = new String[4];
		 		//the array storing the bias percentage values
		 		String[] bias       = new String[4];
		 		
		 		//populate selections
		 		selections[0] = request.getParameter("EorI");
		 		selections[1] = request.getParameter("SorN");
		 		selections[2] = request.getParameter("TorF");
		 		selections[3] = request.getParameter("JorP");
		 		
		 		//populate bias
		 		bias[0] = request.getParameter("EorIPercent");
		 		bias[1] = request.getParameter("SorNPercent");
		 		bias[2] = request.getParameter("TorFPercent");
		 		bias[3] = request.getParameter("JorPPercent");		 		
		 		
		 		if (!validate()){
			 		%>
			 		<%-- ERROR HANDLING HERE --%>
			 		<%
			 	} else {
		 			//POST method is used and all fields are validated
			 		%>		 		
			
					<p>Your personality type is:</p>
					<%-- print personality types and percentages here --%>
					<%
					for(int i = 0; i < 4; i++){
						%>
						<p><%= selections[i] %> (<%= bias[i] %> percent) </p>
						<%
					}
					%>
				
			
					<%
						//personality string (a concatenation of the four personality dimensions)
						String personality = "";
						for(int i = 0; i < 4; i++){
							personality += selections[i];
						}
						
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
									<%-- index is odd, choose dark style... --%>
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
						
						<ul>
						<% 
							for(int i = 0; i < factsList.size(); i++){
								if(i % 2 == 0){ 
									%>
									<%-- index is even, choose light style... --%>
									<li class="light"> <%= factsList.get(i) %> </li>
									
									<%
								} else {
									%>
									<%-- index is odd, choose dark style... --%>
									<li class="dark"> <%= factsList.get(i) %> </li>
									
									<%
								}
							}
						%>
						</ul>
					</div>
					
					<div id="nextsteps" class="container">
						<h2 id="nextstepsheader" class="header">Nexts step to choosing your major: </h2>
							<div id="nextstepsline" class="line"></div>
								<p>
									Hopefully the above reccomendations give you some potential majors to consider.
									Here are some additional ideas to further expand your search for the perfect major.
								</p>
								<p>
									<span>Talk to your counselor or advisor.</span>
									They're experts at this.
									They know what it takes to do certain majors.
									So, schedule a meeting with your counselor or advisor.
									Tell them your strengths and weaknesses as well as your interests.
									Be specific and honest.
									They'll be able to recommend specific courses or majors that excite you.
								</p>
								<p>
									If you disagree with your personality questionnaire results, don't fret!
									It's <em>just</em> a questionnaire.
									Moreover, if some of your percentages were low, then the questionnaire didn't notice a strong preference for one personality sub-type over the other.
									This is perfectly normal.
									It just means you your results were on the border between different personality types.
									Here's a few other personality types that closely match your current results:
									<ul>
									</ul>
								<p>
									
								</p>							
					</div>
					<%
				}
		 	}
		%>
		
	</body>
</html>