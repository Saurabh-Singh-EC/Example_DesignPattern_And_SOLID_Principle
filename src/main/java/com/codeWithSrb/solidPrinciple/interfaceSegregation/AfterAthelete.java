package com.codeWithSrb.solidPrinciple.interfaceSegregation;

/**
 * And now our athlete will be happier to have the choice what to do in the gym and let's say
 * he decides that weight lifting and some cardio will be enough for today.
 */
public class AfterAthelete implements AfterWeightLifter, AfterCardioDoer{
    @Override
    public void doCardio() {
        // who gonna lift the boats and the logs son
    }

    @Override
    public void doWeightLifing() {
        //light weight, baby
    }
}