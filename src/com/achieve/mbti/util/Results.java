package com.achieve.mbti.util;
import java.util.*;
public final class Results{
	
	 //map from personality types to evaluations
	 private static HashMap<String, PersonalityInfo[]> personalityToEval;
	 //this map is initialized in a static initializer at the end of this file
	 
	 public enum EvalType {
		 MAJORS,
		 FACTS
	 }
	 
	 public static final class PersonalityInfo {
		 public final List<String> info;
		 
		 public final EvalType feedbackType;
		 
		 public PersonalityInfo(List<String> info, EvalType evalType) {
			 this.info = info;
			 this.feedbackType = evalType;
		 }
	 }
	 
	 /**
	  * Consumes a personality type string and
	  * returns a string containing the standard evaluation for
	  * that type of personality
	  *  
	  *  @param personality A 4-character string describing a personality type
	  *  @returns a string containing the evaluation for the personality
	  */
	 public static PersonalityInfo[] getPrimaryEvalString(String personality){
		 return personalityToEval.get(personality);
	 }
	 
	 // PersonalityInfo pi = get it somehow.
	 //	if (pi.evalType == EvalType.MAJORS) {
	 //		process the list as if it is a list of majors
	 //	} else 
	 //
	 public static final Results.PersonalityInfo[] ISTJ = new Results.PersonalityInfo[]{
		 new Results.PersonalityInfo(Arrays.asList(new String[] {
		    "Accounting",
		 	"Biology",
		 	"Criminal Justice",
		 	"Finance",
		 	"Exercise Science",
		 	"Geology",
		 	"Medical Technology",
		 	"Civil engineering"}),
		 	Results.EvalType.MAJORS),
		 	 
		 new Results.PersonalityInfo(Arrays.asList( new String[] {
		 	"Among the four highest personality types in college GPA.",
		 	"Overrepresented among bank officers and financial managers.",
		 	"One of the top 2 types among industrial/technical teachers.",
		 	"Higher on deductive reasoning than dominant Thinking or Feeling types, with other dominant Sensing types.",
		 	"Academic subjects preferred: math, practical skills.",
		 	"More frequent among African Americans.",
		 	"In national sample, highest of all types in liking work environments where “Everything is done by the book”, and one of 3 highest types in liking “Toeing the line”;",
		 	"Lowest of all types in liking work environments with “People of different backgrounds.”",
		 	"In national sample, dissatisfied with “Promotions” in their jobs.",
		 	"Overrepresented among both male and female small business owners compared with national sample.",
		 	"With ISFJs, far outnumber dominant extraverted Sensing types among chronic pain patients.",
		 	"Overrepresented among men with chronic pain - accounted for 38% of sample studied.",
		 	"Overrepresented among men at risk for heart attack - more than 3.5 times the proportion in Myers’ high school sample.",
		 	"One of two most overrepresented female types in a substance abuse program."}),
		 	Results.EvalType.FACTS)};

	 public static final PersonalityInfo[] ISFJ =  new PersonalityInfo[]{
		 new PersonalityInfo(Arrays.asList(new String[] {
			 "Criminal Justice",
		 	 "Psychology",
		 	 "Finance",
		 	 "History",
		 	 "Medical Technology",
		 	 "Religious Studies",
		 	 "Social Work"}),
		 	 EvalType.MAJORS),
	 	 
	 	 new PersonalityInfo(Arrays.asList(new String[] {
			 "Most important feature of an ideal job: stable and secure future.",
		 	 "In national sample, among 3 types with lowest income.",
		 	 "In national sample “Leisure Activities,” overrepresented in “Watching TV 3 or more hours per day”",
		 	 "Underrepresented in “Playing with computer/video games,” “Watching sporting events,” “Appreciating art,” and “Playing sports.”",
		 	 "Academic subjects preferred: practical skills.",
		 	 "Rated by psychologists as 1 of 2 types least likely to have trouble in school.",
		 	 "Second most frequent type among education majors.",
		 	 "In national sample, highest of all types in liking work environment characteristic “Employee loyalty & job security”;",
		 	 "One of the 3 highest in national sample liking work environment characteristics “Clear structures” and “No expectation for working extra hours”",
		 	 "Lowest of all types in liking work environments with “International opportunities”",
		 	 "In national sample, dissatisfied with “Promotions,” “Stress,” and “Salary” in their jobs.",
		 	 "Overrepresented among male small business owners compared with national sample.",
		 	 "With ISTJs, far outnumber dominant extraverted Sensing types among chronic pain patients.",
		 	 "One of 4 types in college reporting the lowest level of assertiveness.",
		 	 "Overrepresented among female coronary heart disease patients and second most frequent type.",
		 	 "Among substance abusers, are attracted to heroin."}),
		 	 EvalType.FACTS)};

	 public static final PersonalityInfo[] INFJ =  new PersonalityInfo[]{
		 new PersonalityInfo(Arrays.asList(new String[] {
			 "Art",
		 	 "Communication",
		 	 "Psychology",
		 	 "Latin American",
		 	 "Studies",
		 	 "Marketing",
		 	 "Nursing",
		 	 "Physical Education",
		 	 "Sociology",
		 	 "Urban Studies"}),
		 	 EvalType.MAJORS),
	 	 
	 	 new PersonalityInfo(Arrays.asList(new String[] {
			 "Most important feature of an ideal job: “Use of my special abilities.”",
		 	 "In national sample, highest in reporting stress associated with “Work, “Intimate relationship,” “School,” and “Other.”",
		 	 "In national sample, highest in coping with stress by “Talking to a professional.”",
		 	 "In national sample, ranked highest in being dissatisfied with “Marriage/intimate relationship”",
		 	 "In national sample “Leisure Activities,” overrepresented in “Writing” and “Appreciating art”; underrepresented in “Watching sporting events.”",
		 	 "Academic subjects preferred: art, English, music.",
		 	 "Among highest college persisters.",
		 	 "3 top work characteristics favored in national sample: “Variety of tasks,” “Clear structure,” and “Independence & achievement”",
		 	 "Lowest of all types in liking work environments with “Opportunities for advancement & high pay but not job security.”",
		 	 "In national sample, dissatisfied with “Promotions” and “Salary” in their jobs.",
		 	 "With ISTPs, ranked first among all the types in using spiritual/philosophical coping resources.",
		 	 "Among the 3 male types most “oblivious” to partner’s dissatisfaction with the relationship."}),
		 	 EvalType.FACTS)};

	 public static final PersonalityInfo[] INTJ =  new PersonalityInfo[]{
		 new PersonalityInfo(Arrays.asList(new String[] {
			 "Biochemistry",
		 	 "Psychology",
		 	 "Finance",
		 	 "Mathematics",
		 	 "Sociology",
		 	 "Urban Studies",
		 	 "Environmental Sciences",
		 	 "Business Management",
		 	 "Technology"}),
		 	 EvalType.MAJORS),
	 	 
	 	 new PersonalityInfo(Arrays.asList(new String[] {
 			 "Most important feature of an ideal job: creativity and originality.",
		 	 "In national sample, lowest in reporting stress associated with “School” and “Caring for aging parents.”",
		 	 "In national sample, lowest in coping with stress by “Watching TV.”",
		 	 "In national sample, ranked highest in saying “No” to belief in a higher spiritual power.",
		 	 "In national sample “Leisure Activities,” overrepresented in “Taking classes, going to school,” “Appreciating art,” “Playing with computers or video games,” and “Working out/exercising”",
		 	 "Underrepresented in “Watching TV 3 or more hours per day.”",
		 	 "Academic subjects preferred: science.",
		 	 "Highest GPA among college persisters.",
		 	 "1 of 3 highest types in liking work environment characteristic “Variety of tasks” as well as highly favoring “Clear structure” and “Independence & achievement”",
		 	 "Lowest of all types in liking work environments characterized by “Making the job as simple as possible.”",
		 	 "In national sample, among types with highest income; dissatisfied with “Future work opportunities,” “Promotions,” and “Job security” in their jobs.",
		 	 "Highest rank on coping resources used was spiritual/philosophical - ranked 3rd out of the 16 types.",
		 	 "Among the 3 male types overrepresented among substance abusers.\n"}),
		 	 EvalType.FACTS)};

	 public static final PersonalityInfo[] ISTP =  new PersonalityInfo[]{
		 new PersonalityInfo(Arrays.asList(new String[] {
			 "Biology",
		 	 "Finance",
		 	 "Law and Social",
		 	 "Thought",
		 	 "Geology",
		 	 "Economics",
		 	 "Theatre",
		 	 "Mathematics"}),
		 	 EvalType.MAJORS),
	 	 
	 	 new PersonalityInfo(Arrays.asList(new String[] {
			 "Highly represented among male college scholarship athletes.",
		 	 "In national sample “Leisure Activities,” overrepresented in “Playing with computers or video games”",
		 	 "Underrepresented in “Listening to music” and “Writing.”",
		 	 "Academic subjects preferred: math, practical skills.",
		 	 "Highest of all types in national sample liking work environments with “Independence & achievement”",
		 	 "Include among top 3 desirable work characteristics “Clear structure” and “Variety of tasks.”",
		 	 "Most important feature of an ideal job: “A stable and secure future.”",
		 	 "In national sample, dissatisfied with “Promotions” in their work.",
		 	 "In national sample, among top 4 types valuing “Autonomy.”",
		 	 "With INFJs, ranked first among all the types in using spiritual/philosophical coping resources.",
		 	 "In national sample, ranked lowest in reporting stress associated with “Balancing home and work.”",
		 	 "In national sample, highest in coping with stress by “Getting upset or angry and not showing it.”"}),
		 	 EvalType.FACTS)};

	 public static final PersonalityInfo[] ISFP =  new PersonalityInfo[]{
		 new PersonalityInfo(Arrays.asList(new String[] {
			 "Art",
		 	 "Psychology",
		 	 "Exercise Science",
		 	 "Law and Social",
		 	 "Thought",
		 	 "Foreign Languages",
		 	 "Nursing"}),
		 	 EvalType.MAJORS),
	 	 
	 	 new PersonalityInfo(Arrays.asList(new String[] {
			 "Among the highest persisters in college.",
		 	 "In national sample “Leisure Activities,” overrepresented in “Watching TV 3 or more hours per day” and “Watching TV for leisure”",
		 	 "Underrepresented in “Reading,” “Working out/exercising,” “Writing,” “Appreciating art,” and “Taking classes, going to school.”",
		 	 "Academic subject preferred: practical skills.",
		 	 "Lowest of all types in national sample liking work environments with “Variety of tasks”",
		 	 "1 of 3 highest types in favoring “Loyalty & security,” “Making the job as simple as possible,” and “No expectation of extra hours”",
		 	 "Include among top 3 desirable work characteristics “Clear structure” and “Independence & achievement.”",
		 	 "In national sample, greatest dissatisfiers in the work environment were “Promotions,” “Job security,” and “Salary.”",
		 	 "In national sample, among those with lowest income and unlikely to leave job.",
		 	 "Ranked 15th of 16 types in using emotional coping resources and 16th using physical coping resources; ranked 15th in total resources.",
		 	 "In national sample, ranked highest in “Ever had heart disease/hypertension.”",
		 	 "In national sample, highest in coping with stress by “Trying to avoid stressful situations,” “Getting upset or angry and not showing it,” “Sleeping,” and “Watching TV.”"}),
		 	 EvalType.FACTS)};

	 public static final PersonalityInfo[] INFP =  new PersonalityInfo[]{
		 new PersonalityInfo(Arrays.asList(new String[] {
			 "Management",
		 	 "History",
		 	 "Medical Technology",
		 	 "Foreign Languages",
		 	 "Music",
		 	 "Psychology",
		 	 "Religious Studies",
		 	 "Social Work"}),
		 	 EvalType.MAJORS),
	 	 
	 	 new PersonalityInfo(Arrays.asList(new String[] {
			 "Most important feature of an ideal job: creativity and originality.",
		 	 "Have a general advantage in foreign language learning.",
		 	 "Most likely of all the types to report suicidal thoughts in college.",
		 	 "In national sample “Leisure Activities,” overrepresented in “Writing,” “Appreciating art,” “Reading,” and “Listening to music.”",
		 	 "Academic subjects preferred: art, English, music.",
		 	 "Among 3 highest types favoring work environments with “Independence & achievement,” and include among top 3 desirable characteristics “Variety of tasks” and “Clear structure.”",
		 	 "In national sample, greatest dissatisfiers in the work environment were “Promotions,” “Amount of stress,” and “Opportunities for accomplishment.”",
		 	 "In national sample, with INTPs, most dissatisfied with the work they do, where they work, and future work opportunities, and likely to leave job.",
		 	 "Underrepresented among men with chronic pain.",
		 	 "Showed the highest level of depression of the 16 types with chronic pain.",
		 	 "Overrepresented among a sample of male therapists."}),
		 	 EvalType.FACTS)};

	 public static final PersonalityInfo[] INTP =  new PersonalityInfo[]{
		 new PersonalityInfo(Arrays.asList(new String[] {
			 "Chemistry",
		 	 "Information Systems",
		 	 "Criminal Justice",
		 	 "Economics",
		 	 "Finance",
		 	 "History",
		 	 "Legal Secretarial",
		 	 "Technology",
		 	 "Physics"}),
		 	 EvalType.MAJORS),
	 	 
	 	 new PersonalityInfo(Arrays.asList(new String[] {
 			 "Most important feature of an ideal job: creativity and originality; earning a lot of money.",
		 	 "Males were highest on “obliviousness index” (relatively unaware of spouse’s dissatisfaction with the relationship).",
		 	 "Highly represented among college students taking foreign languages.",
		 	 "In national sample, ranked 3rd highest in saying “No” and 2nd highest in “Not sure” to belief in a higher spiritual power.",
		 	 "In national sample “Leisure Activities,” overrepresented in “Appreciating art,” “Writing,” “Taking classes, going to school,” and “Playing with computers or video games.”",
		 	 "Academic subjects preferred: art, science.",
		 	 "Lowest of all types in liking work environments with “Clear structures & responsibilities,” “Employee loyalty & job security,” and “Working as part of a team”",
		 	 "1 of 3 highest types liking work environments with “International opportunities” and “Advancement/pay but not job security”",
		 	 "Include in top 3 desirable work environment characteristics “Variety of tasks,” “Independence & achievement,” and “Clear structures.”",
		 	 "In national sample, dissatisfied with “Salary,” “Promotions,” and “Job security,” “Predictability,” and “Working conditions” in their jobs.",
		 	 "With INFPs, most dissatisfied with the work they do, where they work, and future work opportunities, and likely to leave job.",
		 	 "With ISTPs, had the lowest mean level of coping resources; ranked 16th out of 16 types on total resources.",
		 	 "Most frequent among college students referred for drug and alcohol violations."}),
		 	 EvalType.FACTS)};

	 public static final PersonalityInfo[] ESTP =  new PersonalityInfo[]{
		 new PersonalityInfo(Arrays.asList(new String[] {
			 "Art",
		 	 "Biology",
		 	 "Information Systems",
		 	 "Medical Technology",
		 	 "Environmental Studies",
		 	 "Theatre"}),
		 	 EvalType.MAJORS),
	 	 
	 	 new PersonalityInfo(Arrays.asList(new String[] {
			 "Among the highest in college retention.",
		 	 "In national sample “Leisure Activities,” overrepresented in “Playing sports.”",
		 	 "Academic subjects preferred: history, math, practical skills.",
		 	 "3 top desirable work characteristics favored in national sample: “Variety of tasks,” “Independence & achievement,” and “Clear structure.”",
		 	 "In national sample, dissatisfied with “Promotions,” “Opportunity to contribute to society,” and “Amount of stress” in their work.",
		 	 "In national sample, among top 4 types valuing “Prestige.”",
		 	 "Ranked 15th out of 16 types on using spiritual/philosophical coping resources and 16th out of 16 types on using cognitive coping resources.",
		 	 "Ranked highest in “positive affectivity.”",
		 	 "In national sample, ranked 4th highest in satisfaction with “Marriage/intimate relationship.”"}),
		 	 EvalType.FACTS)};

	 public static final PersonalityInfo[] ESFP =  new PersonalityInfo[]{
		 new PersonalityInfo(Arrays.asList(new String[] {
			 "Psychology",
		 	 "Exercise Science",
		 	 "Geology",
		 	 "Nursing",
		 	 "Speech Language",
		 	 "Pathology",
		 	 "Social Work"}),
		 	 EvalType.MAJORS),
	 	 
	 	 new PersonalityInfo(Arrays.asList(new String[] {
			 "Among the highest in college retention.",
		 	 "In national sample “Leisure Activities,” overrepresented in “Watching TV 3 or more hours per day”",
		 	 "Underrepresented in “Reading” and “Working out/exercising.”",
		 	 "Academic subject preferred: history.",
		 	 "Highest of all types in national sample in liking work environment characteristics “Making the job as simple as possible” and “No expectation for working extra hours.”",
		 	 "Most important feature on an ideal job: “A stable and secure future.”",
		 	 "In national sample, dissatisfied with “Promotions,” “Job security,” “Stress,” “Salary,” and “Accomplishment”",
		 	 "Satisfied with “People I work with” in their jobs.",
		 	 "In national sample, among types with the lowest income and likely to leave job.",
		 	 "Ranked 15th out of 16 types on using physical coping resources and 16th out of 16 types on using spiritual/philosophical coping resources.",
		 	 "In national sample, ranked 2nd highest in satisfaction with “Marriage/intimate relationship.”"}),
		 	 EvalType.FACTS)};

	 public static final PersonalityInfo[] ENFP =  new PersonalityInfo[]{
		 new PersonalityInfo(Arrays.asList(new String[] {
			 "Anthropology",
		 	 "Art",
		 	 "Chemistry",
		 	 "Early Childhood",
		 	 "Education",
		 	 "Marketing",
		 	 "Foreign Languages",
		 	 "Sociology",
		 	 "Communication"}),
		 	 EvalType.MAJORS),
	 	 
	 	 new PersonalityInfo(Arrays.asList(new String[] {
			 "3rd most frequent among education majors in college.",
		 	 "In national sample “Leisure Activities,” overrepresented in “Writing,” “Appreciating art,” “Playing musical instrument,” “Listening to music,” “Reading”",
		 	 "Underrepresented in “Watching TV for leisure” and “Watching TV 3 or more hours per day.”",
		 	 "Academic subjects preferred: art, English, music.",
		 	 "In national sample, lowest of all types in liking work environments where “Everything is done by the book”",
		 	 "1 of 3 highest types in liking “Independence & achievement,” “Teamwork,” and “People from different backgrounds.”",
		 	 "Most important feature on an ideal job: creativity and originality.",
		 	 "In national sample, dissatisfied with “Promotions” and “Salary”; satisfied with “People I work with” in their jobs.",
		 	 "With ESTJs, had highest total coping resources of all the types.",
		 	 "Ranked 1st of all 16 types in using social and emotional coping resources and 2nd in using cognitive resources.",
		 	 "In national sample, ranked lowest in coping with stress by “Developing physical symptoms.”"}),
		 	 EvalType.FACTS)};

	 public static final PersonalityInfo[] ENTP =  new PersonalityInfo[]{
		 new PersonalityInfo(Arrays.asList(new String[] {
			 "Information Technology",
		 	 "Communication",
		 	 "Criminal Justice",
		 	 "Finance",
		 	 "Mechanical Engineering",
		 	 "Technology",
		 	 "Marketing",
		 	 "History"}),
		 	 EvalType.MAJORS),
	 	 
	 	 new PersonalityInfo(Arrays.asList(new String[] {
			 "In national sample “Leisure Activities,” overrepresented in “Taking classes, going to school,” “Writing,” “Playing sports,” “Playing with computers or video games”",
		 	 "Underrepresented in “Watching TV 3 or more hours per day.”",
		 	 "Academic subjects preferred: art, science.",
		 	 "1 of 2 types most frequent among college alcohol policy violators.",
		 	 "In national sample, highest of all types in liking work environment characteristics “Independence & achievement” and “Opportunities for advancement & high pay, but not job security” and including “Variety of tasks” and “Clear structure” among top 3 characteristics",
		 	 "1 of top 3 types liking “International opportunities” as a characteristic.",
		 	 "Most important feature on an ideal job: creativity and originality.",
		 	 "In national sample, dissatisfied with “Promotions,” “Opportunities to use talents,” and “Salary” in their work.",
		 	 "In national sample, among those types most dissatisfied with their work and among those with the highest income.",
		 	 "With ENFPs, had highest mean level of coping resources.",
		 	 "Overrepresented among those having Type A behavior.",
		 	 "In national sample, highest in coping with stress by “Confronting the problem.”",
		 	 "In national sample, ranked lowest in “Ever had heart disease/hypertension.”"}),
		 	 EvalType.FACTS)};

	 public static final PersonalityInfo[] ESTJ =  new PersonalityInfo[]{
		 new PersonalityInfo(Arrays.asList(new String[] {
			 "Mechanical",
		 	 "Engineering",
		 	 "Public Relations",
		 	 "Music",
		 	 "Accounting",
		 	 "Finance",
		 	 "Political Science"}),
		 	 EvalType.MAJORS),
	 	 
	 	 new PersonalityInfo(Arrays.asList(new String[] {
 			 "Most frequent type among school administrators.",
		 	 "In national sample “Leisure Activities,” overrepresented in “Playing sports” and “Watching sporting events.”",
		 	 "Underrepresented in “Listening to music.”",
		 	 "Academic subjects preferred: math, practical skills.",
		 	 "Highest of all types in national sample liking work environments with “Clear structures & responsibilities” and “Working as part of a team”",
		 	 "1 of 3 highest types favoring “Toeing the line” and “Going by the book” and include “Variety of tasks” among top 3 desirable characteristics.",
		 	 "Most important feature of an ideal job: “A stable and secure future.”",
		 	 "In national sample, were among those most satisfied with their work and working conditions.",
		 	 "In national sample, dissatisfied with “Promotions” in their work.",
		 	 "Overrepresented among both male and female small business owners compared with national sample.",
		 	 "With ENFPs, had highest total coping resources of all the types.",
		 	 "Ranked 1st of all 16 types in using cognitive coping resources and 2nd in using emotional and social coping resources.",
		 	 "Overrepresented among those having Type A behavior.",
		 	 "In national sample, ranked 3rd highest in satisfaction with “Marriage/intimate relationship.”"}),
		 	 EvalType.FACTS)};

	 public static final PersonalityInfo[] ESFJ =  new PersonalityInfo[]{
		 new PersonalityInfo(Arrays.asList(new String[] {
			"Psychology",
		 	"Marketing",
		 	"Nursing",
		 	"Physical Education",
		 	"Religious Studies",
		 	"Social Work",
		 	"Speech Language",
		 	"Pathology"}),
		 	EvalType.MAJORS),
	 	 
	 	 new PersonalityInfo(Arrays.asList(new String[] {
	 		"Most frequent type among education majors.",
		 	"mong highest in college retention.",
		 	"In national sample “Leisure Activities,” underrepresented in “Writing.”",
		 	"Highest of all types in national sample liking work environments with “Toe the line expectations.”",
		 	"Among 3 highest types favoring “Clear structure,” “Loyalty and security,” and “Making the job as simple as possible.”",
		 	"Most important feature of an ideal job: service to others.",
		 	"In national sample, were among those most satisfied with their work and where they work, and unlikely to leave job.",
		 	"In national sample, greatest work environment satisfiers are “People I work with,” “Amount of responsibility,” and “Opportunity for societal contribution.”",
		 	"Most frequent type among women with coronary heart disease.",
		 	"In national sample, highest in coping with stress by “Talking to someone close” and “Relying on religious beliefs.”",
		 	"In national sample, ranked 2nd highest in “Belief in a higher spiritual power.”",
		 	"In national sample, ranked highest in satisfaction with “Marriage/intimate relationship.”"}),
		 	EvalType.FACTS)};

	 public static final PersonalityInfo[] ENFJ =  new PersonalityInfo[]{
		 new PersonalityInfo(Arrays.asList(new String[] {
			"Communication",
			"Psychology",
			"Management",
			"Marketing",
			"Public Relations",
			"Urban Studies",
			"Foreign Languages"}),
			EvalType.MAJORS),
	 	 
		 new PersonalityInfo(Arrays.asList(new String[] {
			"Rated by psychologists among 2 types least likely to have trouble in school.",
		 	"In national sample “Leisure Activities,” overrepresented in “Appreciating art,” “Writing,” “Listening to music,” and “Reading”",
		 	"Underrepresented in “Watching TV 3 or more hours per day.”",
		 	"Academic subjects preferred: art, English, music.",
		 	"Among 3 highest types in national sample liking work environments with “Variety of tasks,” “Teamwork,” and “People from a variety of backgrounds.”",
		 	"Include in 3 most desirable characteristics “Independence and achievement.”",
		 	"Most important feature of an ideal job: “Use of my special abilities.”",
		 	"In national sample, were among those most satisfied with their work, where they work, but likely to leave job.",
		 	"In national sample, greatest work environment satisfiers are “People I work with,” “Opportunities to use talents,” “Opportunity to learn,” “Job security,” “Amount of responsibility,” and “Opportunity for societal contribution.”",
		 	"Greatest dissatisfiers were “Promotions” and “Salary.”",
		 	"Highest ranks on coping resources used were social and cognitive (ranked 3rd on both among the 16 types); ranked 3rd in total resources of the 16 types.",
		 	"In national sample, highest in coping with stress by “Exercising.”",
		 	"In national sample, ranked highest in “Belief in a higher spiritual power.”"}),
		 	EvalType.FACTS)};

	 public static final PersonalityInfo[] ENTJ =  new PersonalityInfo[]{
		 new PersonalityInfo(Arrays.asList(new String[] {
			"Economics",
		 	"Secondary Education (AYA)",
		 	"Management",
		 	"International Business",
		 	"Political Science",
		 	"Sociology",
		 	"Anthropology"}),
		 	EvalType.MAJORS),
	 	 
	 	 new PersonalityInfo(Arrays.asList(new String[] {
	 		"Among top 4 types in college GPA.",
		 	"In national sample “Leisure Activities,” overrepresented in “Working out/exercising.”",
		 	"Academic subjects preferred: English, science.",
		 	"In national sample, highest of all types in liking work environments with “Variety of tasks,” “People from a variety of backgrounds,” and “International opportunities”",
		 	"Lowest of all types in liking work environments with “No expectation of extra hours” and “Toeing the line.”",
		 	"Include “Independence and achievement” and “Clear structure” among top 3 desirable characteristics.",
		 	"Greatest work environment satisfiers are opportunities to use talents and contribute to society, job security, opportunities for learning and for accomplishment.",
		 	"In national sample, 1 of 2 types most satisfied with their work, where they work, and future work opportunities, unlikely to leave job, and among those with the highest income.",
		 	"With ESTJs, had the 2nd highest mean level of coping resources.",
		 	"Ranked 1st of all 16 types in using physical coping resources.",
		 	"In national sample, highest in coping with stress by “Trying to think of options.”",
		 	"In national sample, ranked 2nd highest in “No” and 4th highest in “Not sure” re: “Belief in higher spiritual power.”"}),
		 	EvalType.FACTS)};
	 
	//static initializer
		 static{
			 personalityToEval = new HashMap<String, PersonalityInfo[]>();
			 //maps personality strings to their corresponding evaluation strings
			 personalityToEval.put("ISTJ", ISTJ);
			 personalityToEval.put("ISFJ", ISFJ);
			 personalityToEval.put("INFJ", INFJ);
			 personalityToEval.put("INTJ", INTJ);
			 personalityToEval.put("ISTP", ISTP);
			 personalityToEval.put("ISFP", ISFP);
			 personalityToEval.put("INFP", INFP);
			 personalityToEval.put("INTP", INTP);
			 personalityToEval.put("ESTP", ESTP);
			 personalityToEval.put("ESFP", ESFP);
			 personalityToEval.put("ENFP", ENFP);
			 personalityToEval.put("ENTP", ENTP);
			 personalityToEval.put("ESTJ", ESTJ);
			 personalityToEval.put("ESFJ", ESFJ);
			 personalityToEval.put("ENFJ", ENFJ);
			 personalityToEval.put("ENTJ", ENTJ);
		 }
}
