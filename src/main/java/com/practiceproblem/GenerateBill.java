package com.practiceproblem;

public class GenerateBill {
    public static void main(String args[]) {
        GetPlanFactory planFactory = new GetPlanFactory();
        Plan plan = planFactory.getPlan("DOMESTICPLAN");
        plan.getRate();


        Plan plan1 = planFactory.getPlan("COMMERCIALPLAN");
        plan1.calculateBill(7);
    }

}
