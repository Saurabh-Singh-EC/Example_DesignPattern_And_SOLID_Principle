package com.codeWithSrb.DesignPattern.factoryMethodPattern;

public class AeroplaneMileageCalculatorFactory implements BaseAbstractFactory{

    @Override
    public MileageCalculator produceMileageCalculator() {
        return new AeroplaneMileageCalculator();
    }
}
