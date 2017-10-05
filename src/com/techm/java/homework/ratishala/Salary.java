package com.techm.java.homework.ratishala;
public class Salary {
public static void main(String[] args) {
      calSalary(7300.7);
      
}
      private static void calSalary(double bsal)
      {
            double hra=(0.5*bsal);
            double pFund=(0.12*bsal);
            double conv=(0.02*bsal);
            double bonus=(0.03*bsal);
            double grat=(0.05*bsal);
            double prem=(0.01*bsal);
            double fpay=(bsal+hra+pFund+conv+bonus+grat+prem);
            System.out.println("Base Salary:"+"\t\t"+bsal);
            System.out.println("Provident Fund:"+"\t\t"+pFund);
            System.out.println("Conveyance:"+"\t\t"+conv);
            System.out.println("Bonus:"+"\t\t\t"+bonus);
            System.out.println("Gratuity:"+"\t\t"+grat);
            System.out.println("Insurance Premium:"+"\t"+prem);
            System.out.println("Total Pay"+"\t\t"+fpay);
      }
}
