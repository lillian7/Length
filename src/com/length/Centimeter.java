package com.length;

/**
 * Created with IntelliJ IDEA.
 * User: lilliansusan
 * Date: 6/12/13
 * Time: 5:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Centimeter {
    private int centimeter;

    public Centimeter(int length) {
        this.centimeter = length;
    }

    @Override
    public String toString() {
        return centimeter + "cm";
    }
}
