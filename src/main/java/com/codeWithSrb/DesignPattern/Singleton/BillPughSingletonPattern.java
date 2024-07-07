package com.codeWithSrb.DesignPattern.Singleton;

public class BillPughSingletonPattern {

    private BillPughSingletonPattern(){}

    private static class SingletonHelper {
        private static final BillPughSingletonPattern INSTANCE = new BillPughSingletonPattern();
    }

    public static BillPughSingletonPattern getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
