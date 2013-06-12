package com.length;

/**
 * Created with IntelliJ IDEA.
 * User: lilliansusan
 * Date: 6/12/13
 * Time: 9:15 AM
 * To change this template use File | Settings | File Templates.
 */
public class Meter {
    private  int length;

    public Meter(int length) {

        this.length = length;
    }

    @Override

    public String toString()
    {
        return length + "m" ;
    }
}
