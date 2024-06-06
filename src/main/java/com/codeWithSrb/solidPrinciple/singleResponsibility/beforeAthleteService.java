package com.codeWithSrb.solidPrinciple.singleResponsibility;

/**
 * a service  which has to many methods and have a reason to be changed always
 * as it is doing just to many things
 */
public class beforeAthleteService {

    public void changeBarbellWeight(long barbellWeight) {
        System.out.println("barbell weight changed to ...");
    }

    public void persistBarbellWeight(long barbellWeight) {
        System.out.println("barbell weight persisted to ...");
    }

    public void calculateNetCalories(long netCalories) {
        System.out.println("calculating net calories..");
    }

    public void persistNetCalories() {
        System.out.println("persisting net calories...");
    }

    public void createProgressGraph() {
        System.out.println("creating progress graph..");
    }
}