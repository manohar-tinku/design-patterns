package com.pov.design.patterns.factory;

public class GenerateBill {
    public static void main(String[] args){
        GetPlanFactory getPlanFactory=new GetPlanFactory();
        Plan plan=getPlanFactory.getPlan("Domesticplan");
        plan.getRate();
        plan.calculateBill(3);
    }
}
