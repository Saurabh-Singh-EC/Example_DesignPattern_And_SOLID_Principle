package com.codeWithSrb.solidPrinciple.interfaceSegregation;

/**
 * this principle says that instead of having a big interface with a list of different methods you should divide them into smaller ones, just with specific behaviour
 * doing so will avoid situations when we will be forced to implement features that we don't need.
 * if you see this interface a gym goer is forced to do everything if he enters the gym, hence to avoid overtraining and violation of the interface
 */
public interface BeforeGymGoer {

    void doWeightLifting();

    void doCardio();

    void doPoolSwimming();

    void doYoga();
}