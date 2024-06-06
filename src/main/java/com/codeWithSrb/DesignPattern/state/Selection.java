package com.codeWithSrb.DesignPattern.state;

public class Selection implements Tool {

    @Override
    public void mouseUp() {
        System.out.println("Selection icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw dotted rectangle");
    }
}
