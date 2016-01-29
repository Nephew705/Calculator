package com.Controller.operations;

/**
 * Created by ПЭ КА on 08.01.2016.
 */
public class Sqrt implements OneNumber {
    @Override
    public double action(double number) {
        return Math.sqrt(number);
    }
}
