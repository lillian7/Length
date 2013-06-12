package com.length;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: lilliansusan
 * Date: 6/12/13
 * Time: 9:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class Metertest {

    @Test

    public void makes_a_meter_to_string()
    {
        Meter meter = new Meter(6);

        assertThat(meter.toString(), is("6m"));

    }

    @Test

    public void make_centimeter_to_string()
    {
        Centimeter centimeter = new Centimeter(6);

        assertThat(centimeter.toString(), is("6cm"));
    }
}
