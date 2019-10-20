package com.zipcodewilmington.scientificcalculator;

public class Memory {
    private double currentNum;
    private double rememberedNum;

    // Getter
    public double getCurrentNum(){
        return currentNum;
    }

    // Getter
    public double getRememberedNum(){
        return rememberedNum;
    }

    // Setter
    public void setCurrentNum(double a) {
        this.currentNum = a;
    }

    public void setRememberedNum(double b) {
        this.rememberedNum = b;
    }


}
