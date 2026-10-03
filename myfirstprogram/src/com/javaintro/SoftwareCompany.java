package com.javaintro;

public class SoftwareCompany {
	int bugId;
	String applicationName;
	String bugTittle;
	String severity;
	String priority;
	String status;
	String assignedDevelper;

	public static void main(String[] args) {
		SoftwareCompany s = new  SoftwareCompany();
		s.bugId=101;
		s.applicationName="phonepay";
		s.bugTittle="phonepayerror";
		s.severity="highrisk";
		s.priority="high";
		s.status="open";
		s. assignedDevelper="simhadri";
		s.bugId();
		s. applcationName();
		s.bugTittle();
		s.priority();
		s.status();
		s.assigndevlepoer();
		s.assigntoDevlper(102,"ramu");
		s.updateStatus("completed");
		s.displaybigSummary();
	
		
		
		
		
		
		
		
		
		
		
		
		

	}
	int bugId() {
		return bugId;
	}
	String applcationName() {
		return applicationName;
		
	}
	String bugTittle() {
		return bugTittle;
		
	}
	String priority() {
		return priority;
	}
	String status() {
		return status;
	}
	String assigndevlepoer() {
		return assignedDevelper;
	}
	void assigntoDevlper(int id,String assignedDevleper) {
		bugId =id;
		assignedDevelper=applicationName;
	}
	void updateStatus(String status) {
	status ="completed";
	}
	 void displaybigSummary() {
		 System.out.println("bugId : " + bugId);
		 System.out.println("applicationName : " + applicationName);
		 System.out.println("severity : " + severity);
		 System.out.println("  priority: " + priority);
		 System.out.println("status : " + status);
		 System.out.println("assigndevelper : " + assignedDevelper);
	 }
		

}
