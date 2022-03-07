package org.jvm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.Configuration;

import net.masterthought.cucumber.ReportBuilder;

public class JVMClass {
	public static void generateJVMReport(String jsonPath) {
	// mention location
			File f = new File(System.getProperty("user.dir")+"\\target\\JvmReport");
			//create class for configuration
			net.masterthought.cucumber.Configuration con = new net.masterthought.cucumber.Configuration(f, "Cucumber");
			con.addClassifications("platform", "Windows");
			con.addClassifications("Jdk version", "1.8");
			con.addClassifications("sprint", "7");		
			
			//json
			List<String> l = new ArrayList<String>();
			l.add(jsonPath);
			
			//generate report
			ReportBuilder r=new ReportBuilder(l, con);
			r.generateReports();

}}
