package com.codeWithSrb.DesignPattern.factoryMethodPattern;

public class CarMileageCalculatorFactory implements BaseAbstractFactory{

    @Override
    public MileageCalculator produceMileageCalculator() {
        return new CarMileageCalculator();
    }
}
