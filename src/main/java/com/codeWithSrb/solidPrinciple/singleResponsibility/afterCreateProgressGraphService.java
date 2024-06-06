package com.codeWithSrb.solidPrinciple.singleResponsibility;

public class afterCreateProgressGraphService {

    public void createProgressGraph(String graphType) {
        if(graphType == "barbell") {
            System.out.println("create barbell progress graph");
        }
        if(graphType == "calories") {
            System.out.println("creating calories progress graph");
        }
    }
}
