package com.techm.java.homework.keerthi;

public class BasicSalaryCalculation {
	
	public static void main(String[] args) {
		System.out.println("Description	"  + "	Amount " + "    Adjustment " + " Arrears " + " Amount Paid " + "      "
				+ "sRemarks");
		BasicSalary(8568);
		HRA(8568);
		ShiftAllowance(25);
		AdvanceVariablePay(1256);
		
	}
	
	private static void BasicSalary(float basic){
		
		float BasicSalaryAmount = basic ;
		float Adjustment = 0.0f;
		
		System.out.println("BasicSalary 		" +  BasicSalaryAmount +"		"+  Adjustment);
		//return BasicSalaryAmount;
	}
private static void HRA(float HRAA){
		
		float HRAAM = (10f/100) * HRAA ;
		System.out.println("HRA 			" + HRAAM);
		//return HRAAM;
}
private static void ShiftAllowance(int Days){
	
	int ShiftAllowance = (400) * Days ;
	System.out.println("ShiftAllowance 		" + ShiftAllowance);
	//return ShiftAllowance;
}
private static void AdvanceVariablePay(int amount){
	
	float AVP =  amount ;
	float pay = (60f/100) * amount;
	System.out.println("AdvanceVariablePay 	" + AVP + "				"+ pay );
	//return ShiftAllowance;
}

	
	
}
