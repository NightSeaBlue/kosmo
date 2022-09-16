package chapter10.EX09;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	VIPCustomer () {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		bonusPoint = 10;
		
	}
	
	VIPCustomer (int customerID , String customerName, int agentID) {
			super(customerID, customerName);
			customerGrade = "VIP";
			bonusRatio = 0.05;
			bonusPoint = 10;
	}
	// 교재 10장. 339 Page 까지 진도나감. Method Overriding 및 Super 까지 완료.
}
