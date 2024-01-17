package org.reporting;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReportingClass {
	public static void generateReport(String json) {
		
		//to locate where our JVM report Stored
		
		File file=new File("C:\\Users\\Thameem M\\eclipse-workspace1\\CucumberFramework\\target");
		Configuration con=new Configuration(file, "Adactin Hotel Page fuctional Test");
		con.addClassifications("User", "Thameem");
		con.addClassifications("U_story", "59520");
		con.addClassifications("Tool", "Eclipse_Photon");
		con.addClassifications("JDK_Version", "JDK 11.0");
		con.addClassifications("Description", "Full fuctional Test");
		
		List<String> li=new LinkedList<String>();
		li.add(json);
		
		ReportBuilder report = new ReportBuilder(li, con);
		report.generateReports();
	}

}
