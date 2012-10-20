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
			public boolean validateSelections(String[] selections) {
  			if (!selections[0].equals("E") && !selections[0].equals("I")) {
          return false;
        }
  			if (!selections[1].equals("S") && !selections[1].equals("N")) {
          return false;
        }
  			if (!selections[2].equals("T") && !selections[2].equals("F")) {
          return false;
        }
  			return !(!selections[3].equals("J") && !selections[3].equals("P"));
			}
    
			
		  public boolean validateBias(int[] bias) {
        return isIntPercent(bias[0]) && isIntPercent(bias[1]) && isIntPercent(bias[2]) && isIntPercent(bias[3]);
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
		 		<p>This page can only be accessed via a POST request.</p>
        <p>Please use <a href="/index.html">this page</a> to access the page properly.</p>
        <%
        response.sendError(405);
		 	} else {
		 		//the array storing options values from the dropdown list
		 		String[] selections = new String[4];
		 		
		 		//populate selections
		 		selections[0] = request.getParameter("EorI");
		 		selections[1] = request.getParameter("SorN");
		 		selections[2] = request.getParameter("TorF");
		 		selections[3] = request.getParameter("JorP");

		 		if (!validateSelections(selections)){
			 		%>
			 		<%-- ERROR HANDLING HERE --%>
			 		<%
          response.sendError(400);
			 	} else {
		 			//POST method is used and all fields are validated
			 		%>
					<div id="personalitytype" class="container">	
						<h1>Your Personality Report</h1>
						<%
							//personality string (a concatenation of the four personality dimensions)
							String personality = "";
							for (int i = 0; i < 4; i++){
								personality += selections[i];
							}
						%>
						<h1 id="personality"><%= personality %><h1>
						<div id="topline" class="line"></div>
					</div>
					<%
						//array storing evaluation objects for this type of personality
						//use MAJORS_INDEX and FACTS_INDEX (class constants in Results)
						//to access the majors list and the facts list
						Results.PersonalityInfo[] evalArray = Results.getPrimaryEval(personality);
					%>
					
					<div id="majors" class="container">
						<a id="printbutton" href="javascript:window.print()" >
							<img src="images/printbutton.gif" alt="Print">
						</a>
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
  					<h2 id="nextstepsheader" class="header">Next Steps to Choosing a Major: </h2>
  					<div id="nextstepsline" class="line"></div>
    					<div id="nextstepstext">
  						<p class="light">
  							Hopefully the above recommendations give you some potential majors to consider.
  							Here are some additional ideas to further expand your search for the perfect major:
  						</p>
  						<p class="dark">
  							<span>Talk to your counselor or advisor.</span>
  							They're experts at this.
  							They know what it takes to do certain majors.
  							So, schedule a meeting with your counselor or advisor.
  							Tell them your strengths and weaknesses as well as your interests.
  							Be specific and honest.
  							They'll be able to recommend specific courses or majors that excite you.
  						</p>
  						<p class="light">
  							<span>Ask current college students.</span>
  							They are the real experts, especially the upperclassman.
  							Best of all, they're all choosing (or have already chosen) their majors, too.
  							So, they can share the questions they considered during their decision-making process, and how they eventually made their decision.
  							If you don't know any college students, consider searching online for students posting their opinions/experiences.
  						</p>
  						<p class="dark">
  							<span>Talk to professionals.</span>
  							Ask them exactly what their jobs entail and how their majors relate to their careers.
  							You may be surprised to learn that some of them didn't even major in anything related to their current profession.
  							Learning about the paths others took to get to where they are can be very valuable.
  						</p>
  						<p class="light">
  							<span>Relax.</span>
  							College can (and probably will) be very stressful at times.
  							Choosing your major is often the first exposure high school students get to such levels of stress.
  							Remember, at the end of the day, your major is not you.
  							It does not determine your life.
  							Choose a subject that interests you and relates to your long-term career goals.
  							You can always change majors, change careers, or go back to school and study another subject.
  						</p>
              <%
              //the array storing the bias percentage values
              int[] bias       = new int[4];
              boolean valid = true;
              
              //populate bias
              try {
            	  bias[0] = Integer.parseInt(request.getParameter("EorIPercent"));
                bias[1] = Integer.parseInt(request.getParameter("SorNPercent"));
                bias[2] = Integer.parseInt(request.getParameter("TorFPercent"));
                bias[3] = Integer.parseInt(request.getParameter("JorPPercent"));
              } catch(NumberFormatException e) {
                valid = false;
              }
              
              if (valid && validateBias(bias)) {
              %>
  						<p class="dark">
  							<span>Disagree with you results?</span>
  							If you disagree with your personality questionnaire results, don't fret!
  							It's <em>just</em> a questionnaire.
  							Moreover, if some of your percentages were low, then the questionnaire didn't notice a strong preference for one personality sub-type over the other.
  							This is perfectly normal.
  							It just means you your results were on the border between different personality types.
  							Here's a few other personality types that closely match your current results:
              </p>
            <%
              String allowedChars = personality;
              final int lowBound = 15;
              if (bias[0] < lowBound) {
                allowedChars += personality.charAt(0) == 'E' ? 'I' : 'E';
              }
              if (bias[1] < lowBound) {
                allowedChars += personality.charAt(1) == 'N' ? 'S' : 'N';
              }
              if (bias[2] < lowBound) {
                allowedChars += personality.charAt(2) == 'T' ? 'F' : 'T';
              }
              if (bias[3] < lowBound) {
                allowedChars += personality.charAt(3) == 'J' ? 'P' : 'J';
              }
              
              List<String> perms = new ArrayList<String>(Arrays.asList(new String[] {
            		  "ENTJ", "ENTP", "ENFJ", "ENFP", "ESTJ", "ESTP", "ESFJ", "ESFP",
            		  "INTJ", "INTP", "INFJ", "INFP", "ISTJ", "ISTP", "ISFJ", "ISFP"
              }));
              
              Iterator<String> itr = perms.iterator();
              while(itr.hasNext()) {
                String perm = itr.next();
                if (perm.equals(personality)) {
                  itr.remove();
                  continue;
                }
                for (int i = 0; i < perm.length(); i++) {
                  if (allowedChars.indexOf(perm.charAt(i)) == -1) {
                    itr.remove();
                    break;
                  }
                }
              }
            %>
            <ul class="dark similarlist">
            <%
              for (int i = 0; i < perms.size(); i++) {
                String perm = perms.get(i);
            %>
							
                <li>
                  <form action="results.jsp" method="POST">
                    <input name="EorI" hidden="hidden" value="<%= perm.charAt(0) %>" />
                    <input name="SorN" hidden="hidden" value="<%= perm.charAt(1) %>" />
                    <input name="TorF" hidden="hidden" value="<%= perm.charAt(2) %>" />
                    <input name="JorP" hidden="hidden" value="<%= perm.charAt(3) %>" />
                    <input type="submit" class="similarsubmit" value="<%= perm %>" />
                  </form>
                </li>
            <% } %>
            </ul>
  					</div>
  				</div>
  					<%
          }
				}
		 	}
		%>
		
	</body>
</html>