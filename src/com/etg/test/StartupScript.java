package com.etg.test;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.openqa.selenium.WebDriver;

public class StartupScript {
	
	public final static String AUTOMATION_STATUS 	= "YES";
	public final static String BANNEREVENT = "BANNEREVENT";
	public final static String CATEGORYEVENT = "CATEGORYEVENT";	
	public final static String EVENTSNOWLOGIN = "EVENTSNOWLOGIN";	
	public final static String EVENTSNOWREGISTRATIONPAGE = "EVENTSNOWREGISTRATIONPAGE";	
	public final static String FORGOTPASSWORD = "FORGOTPASSWORD";	
	public final static String MYFAVOURITES = "MYFAVOURITES";	
	public final static String MYTICKETS = "MYTICKETS";	
	public final static String REMEMBERME = "REMEMBERME";	
	public final static String SEARCH = "SEARCH";	
	public final static String USERPROFILEUPDATE = "USERPROFILEUPDATE";	
	public final static String PRINTTICKET = "PRINTTICKET";		
	public final static String CALLOGIN = "CALLOGIN";
	public final static String SEARCHEVENTS = "SEARCHEVENTS";
	public final static String TICKETBOOKING = "TICKETBOOKING";
	public final static String SPORTSEVENT = "SPORTSEVENT";
	public final static String USERLOGIN = "USERLOGIN";
	
	public final static String DELIMETER			= ", ";
	public static int testCaseCounter 				= 0;
	
	
	public static void main(String[] args) throws Exception {		
		
		BufferedReader reader = new BufferedReader(new FileReader(new File("D:\\EventsNowScenarios.csv")));
		String str = "" ;

		BufferedWriter output = null;
		FileWriter file = new FileWriter(new File("D:\\Eventsnow.txt"), true);
		output = new BufferedWriter(file);
		
		
		output.write("Testcaseno" + DELIMETER + "TestCaseName" + DELIMETER + "Result");
		output.newLine();

		WebDriver driver = Util.getChromeDriver();
		
		try {
			while ((str = reader.readLine()) != null) {

				String[] strArray = str.split(",");

				if(strArray != null && strArray.length == 3) {
					String scenarioName = strArray[1];
					String automationStatus = strArray[2];

					if(scenarioName != null && !scenarioName.equals("") && automationStatus != null && !automationStatus.equals("")) {
						
						if(scenarioName.equalsIgnoreCase(BANNEREVENT)) {
							if(automationStatus.equalsIgnoreCase(AUTOMATION_STATUS)) {
								try {
									Bannerevent.executeBannerEvent(driver);
									output.write(++testCaseCounter + DELIMETER + BANNEREVENT + DELIMETER + "Passed ");
									output.newLine();
								} catch(Exception e) {
									output.write(++testCaseCounter + DELIMETER + BANNEREVENT + DELIMETER + "Failed ");
									output.newLine();
								}
							} else {
								output.write(++testCaseCounter + DELIMETER + BANNEREVENT + DELIMETER + "Skipped ");
								output.newLine();
							}
						}
						
						if(scenarioName.equalsIgnoreCase(CATEGORYEVENT)) {
							if(automationStatus.equalsIgnoreCase(AUTOMATION_STATUS)) {
								try {
									CategoryEvent.executeCategoryEvent(driver);
									output.write(++testCaseCounter + DELIMETER + CATEGORYEVENT + DELIMETER + "Passed ");
									output.newLine();
								} catch(Exception e) {
									output.write(++testCaseCounter + DELIMETER + CATEGORYEVENT + DELIMETER + "Failed ");
									output.newLine();
								}
							} else {
								output.write(++testCaseCounter + DELIMETER + CATEGORYEVENT + DELIMETER + "Skipped ");
								output.newLine();
							}
						}
					
						if(scenarioName.equalsIgnoreCase(EVENTSNOWLOGIN)) {
							if(automationStatus.equalsIgnoreCase(AUTOMATION_STATUS)) {
								try {
									Eventsnowlogin.executeEventsnowlogin(driver);
									output.write(++testCaseCounter + DELIMETER + EVENTSNOWLOGIN + DELIMETER + "Passed ");
									output.newLine();
								} catch(Exception e) {
									output.write(++testCaseCounter + DELIMETER + EVENTSNOWLOGIN + DELIMETER + "Failed ");
									output.newLine();
								}
							} else {
								output.write(++testCaseCounter + DELIMETER + EVENTSNOWLOGIN + DELIMETER + "Skipped ");
								output.newLine();
							}
						}
						
						if(scenarioName.equalsIgnoreCase(EVENTSNOWREGISTRATIONPAGE)) {
							if(automationStatus.equalsIgnoreCase(AUTOMATION_STATUS)) {
								try {
									EventsnowRegistrationpage.executeEventsnowRegistrationpage(driver);
									output.write(++testCaseCounter + DELIMETER + EVENTSNOWREGISTRATIONPAGE + DELIMETER + "Passed ");
									output.newLine();
								} catch(Exception e) {
									output.write(++testCaseCounter + DELIMETER + EVENTSNOWREGISTRATIONPAGE + DELIMETER + "Failed ");
									output.newLine();
								}
							} else {
								output.write(++testCaseCounter + DELIMETER + EVENTSNOWREGISTRATIONPAGE + DELIMETER + "Skipped ");
								output.newLine();
							}
						}
						
						if(scenarioName.equalsIgnoreCase(FORGOTPASSWORD)) {
							if(automationStatus.equalsIgnoreCase(AUTOMATION_STATUS)) {
								try {
									ForgotPassword.executeForgotPassword(driver);
									output.write(++testCaseCounter + DELIMETER + FORGOTPASSWORD + DELIMETER + "Passed ");
									output.newLine();
								} catch(Exception e) {
									output.write(++testCaseCounter + DELIMETER + FORGOTPASSWORD + DELIMETER + "Failed ");
									output.newLine();
								}
							} else {
								output.write(++testCaseCounter + DELIMETER + FORGOTPASSWORD + DELIMETER + "Skipped ");
								output.newLine();
							}
						}
						
						
						if(scenarioName.equalsIgnoreCase(MYFAVOURITES)) {
							if(automationStatus.equalsIgnoreCase(AUTOMATION_STATUS)) {
								try {
									MyFavourites.executeMyFavourites(driver);
									output.write(++testCaseCounter + DELIMETER + MYFAVOURITES + DELIMETER + "Passed ");
									output.newLine();
								} catch(Exception e) {
									output.write(++testCaseCounter + DELIMETER + MYFAVOURITES + DELIMETER + "Failed ");
									output.newLine();
								}
							} else {
								output.write(++testCaseCounter + DELIMETER + MYFAVOURITES + DELIMETER + "Skipped ");
								output.newLine();
							}
						}
			
						if(scenarioName.equalsIgnoreCase(MYTICKETS)) {
							if(automationStatus.equalsIgnoreCase(AUTOMATION_STATUS)) {
								try {
									MyTickets.executeMyTickets(driver);
									output.write(++testCaseCounter + DELIMETER + MYTICKETS + DELIMETER + "Passed ");
									output.newLine();
								} catch(Exception e) {
									output.write(++testCaseCounter + DELIMETER + MYTICKETS + DELIMETER + "Failed ");
									output.newLine();
								}
							} else {
								output.write(++testCaseCounter + DELIMETER + MYTICKETS + DELIMETER + "Skipped ");
								output.newLine();
							}
						}
									
					
						
						if(scenarioName.equalsIgnoreCase(REMEMBERME)) {
							if(automationStatus.equalsIgnoreCase(AUTOMATION_STATUS)) {
								try {
									RememberMe.executeRememberMe(driver);
									output.write(++testCaseCounter + DELIMETER + REMEMBERME + DELIMETER + "Passed ");
									output.newLine();
								} catch(Exception e) {
									output.write(++testCaseCounter + DELIMETER + REMEMBERME + DELIMETER + "Failed ");
									output.newLine();
								}
							} else {
								output.write(++testCaseCounter + DELIMETER + REMEMBERME + DELIMETER + "Skipped ");
								output.newLine();
							}
						}
						if(scenarioName.equalsIgnoreCase(SEARCH)) {
							if(automationStatus.equalsIgnoreCase(AUTOMATION_STATUS)) {
								try {
									search.executesearch(driver);
									output.write(++testCaseCounter + DELIMETER + SEARCH + DELIMETER + "Passed ");
									output.newLine();
								} catch(Exception e) {
									output.write(++testCaseCounter + DELIMETER + SEARCH + DELIMETER + "Failed ");
									output.newLine();
								}
							} else {
								output.write(++testCaseCounter + DELIMETER+ SEARCH + DELIMETER + "Skipped ");
								output.newLine();
							}
						}		
					
						if(scenarioName.equalsIgnoreCase(USERPROFILEUPDATE)) {
							if(automationStatus.equalsIgnoreCase(AUTOMATION_STATUS)) {
								try {
									Userprofileupdate.executeUserprofileupdate(driver);
									output.write(++testCaseCounter + DELIMETER + USERPROFILEUPDATE + DELIMETER + "Passed ");
									output.newLine();
								} catch(Exception e) {
									output.write(++testCaseCounter + DELIMETER + USERPROFILEUPDATE + DELIMETER + "Failed ");
									output.newLine();
								}
							} else {
								output.write(++testCaseCounter + DELIMETER+ USERPROFILEUPDATE + DELIMETER + "Skipped ");
								output.newLine();
							}
						}		
					
						if(scenarioName.equalsIgnoreCase(PRINTTICKET)) {
							if(automationStatus.equalsIgnoreCase(AUTOMATION_STATUS)) {
								try {
									printTicket.executeprintTicket(driver);
									output.write(++testCaseCounter + DELIMETER + PRINTTICKET + DELIMETER + "Passed ");
									output.newLine();
								} catch(Exception e) {
									output.write(++testCaseCounter + DELIMETER + PRINTTICKET + DELIMETER + "Failed ");
									output.newLine();
								}
							} else {
								output.write(++testCaseCounter + DELIMETER + PRINTTICKET + DELIMETER + "Skipped ");
								output.newLine();
							}
						}
						
						if(scenarioName.equalsIgnoreCase(TICKETBOOKING)) {
							if(automationStatus.equalsIgnoreCase(AUTOMATION_STATUS)) {
								try {
									Ticketbooking.executeTicketBooking(driver);
									output.write(++testCaseCounter + DELIMETER + TICKETBOOKING + DELIMETER + "Passed ");
									output.newLine();
								} catch(Exception e) {
									output.write(++testCaseCounter + DELIMETER + TICKETBOOKING + DELIMETER + "Failed ");
									output.newLine();
								}
							} else {
								output.write(++testCaseCounter + DELIMETER + TICKETBOOKING + DELIMETER + "Skipped ");
								output.newLine();
							}
						}
						
		
						if(scenarioName.equalsIgnoreCase(SEARCHEVENTS)) {
							if(automationStatus.equalsIgnoreCase(AUTOMATION_STATUS)) {
								try {
									SearchEvents.executeSearchEvents(driver);
									output.write(++testCaseCounter + DELIMETER + SEARCHEVENTS + DELIMETER + "Passed ");
									output.newLine();
								} catch(Exception e) {
									output.write(++testCaseCounter + DELIMETER + SEARCHEVENTS + DELIMETER + "Failed ");
									output.newLine();
								}
							} else {
								output.write(++testCaseCounter + DELIMETER+ SEARCHEVENTS + DELIMETER + "Skipped ");
								output.newLine();
							}
						}				
						

						if(scenarioName.equalsIgnoreCase(CALLOGIN)) {
							if(automationStatus.equalsIgnoreCase(AUTOMATION_STATUS)) {
								try {
									Callogin.searchCallLogin(driver);
									output.write(++testCaseCounter + DELIMETER + CALLOGIN + DELIMETER + "Passed ");
									output.newLine();
								} catch(Exception e) {
									output.write(++testCaseCounter + DELIMETER + CALLOGIN + DELIMETER + "Failed ");
									output.newLine();
								}
							} else {
								output.write(++testCaseCounter + DELIMETER+ CALLOGIN + DELIMETER + "Skipped ");
								output.newLine();
							}
						}								
					
						if(scenarioName.equalsIgnoreCase(SPORTSEVENT)) {
							if(automationStatus.equalsIgnoreCase(AUTOMATION_STATUS)) {
								try {
									Sportsevent.executeSportsevent(driver);
									output.write(++testCaseCounter + DELIMETER + SPORTSEVENT + DELIMETER + "Passed ");
									output.newLine();
								} catch(Exception e) {
									output.write(++testCaseCounter + DELIMETER + SPORTSEVENT + DELIMETER + "Failed ");
									output.newLine();
								}
							} else {
								output.write(++testCaseCounter + DELIMETER+ SPORTSEVENT + DELIMETER + "Skipped ");
								output.newLine();
							}
						}
											
						if(scenarioName.equalsIgnoreCase(USERLOGIN)) {
							if(automationStatus.equalsIgnoreCase(AUTOMATION_STATUS)) {
								try {
									Sportsevent.executeSportsevent(driver);
									output.write(++testCaseCounter + DELIMETER + USERLOGIN + DELIMETER + "Passed ");
									output.newLine();
								} catch(Exception e) {
									output.write(++testCaseCounter + DELIMETER + USERLOGIN + DELIMETER + "Failed ");
									output.newLine();
								}
							} else {
								output.write(++testCaseCounter + DELIMETER+ USERLOGIN + DELIMETER + "Skipped ");
								output.newLine();
							}
						}					
						
								
						}
					}
				}
	
						
		} finally {
			reader.close();
			output.close();
			driver.close();
		}
	}
					}

