package com.codeWithSrb.solidPrinciple.liskovSubsti;

/**
 * this is the class which does lots of work and when a child class needs to extend this class it would have to
 * implement all the methods it provides, but liskov substitution principle says that derived or child class must be
 * substitutable for there base or parent class.
 * lets take an example of Apple Watch and Garmin watch, Apple Watch can do all things that are presented by the methods in abstract smartWatch class
 * whereas Garmin watch can not send notification, so having this type of design violates this principle.
 * what is the solution there, instead of abstract class with a list of all possible features several interfaces with separate features
 */
public abstract class BeforeSmartWatch {

    public abstract void countSteps();

    public abstract void keepTrackOfHeartRate();

    public abstract void receiveNotification();

    public abstract void sendNotification();

}