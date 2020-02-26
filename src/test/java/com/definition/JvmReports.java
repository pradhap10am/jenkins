package com.definition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class JvmReports {
	public static void generateJvmReport(String json) {
		File f = new File("C:\\Users\\user\\eclipse-workspace\\cucmberNew\\target");
		Configuration con = new Configuration(f,"facebook login");
		con.addClassifications("platforms", "windows");
		con.addClassifications("windows", "10");
		con.addClassifications("browser", "chrome");
		con.addClassifications("sprint", "3");
		
		List<String> js= new ArrayList<String>();
		js.add(json);
		
		
		
		
		
		ReportBuilder r = new ReportBuilder(js,con);
		r.generateReports();
	}

}
