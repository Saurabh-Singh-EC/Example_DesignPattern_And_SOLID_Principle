package com.codeWithSrb.DesignPattern.state;

public class Brush implements Tool{

    @Override
    public void mouseUp() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw line");
    }
}
