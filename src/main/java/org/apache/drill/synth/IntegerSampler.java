package org.apache.drill.synth;

import org.apache.mahout.common.RandomUtils;

import java.util.Random;

/**
 * Samples from a "foreign key" which is really just an integer.
 */
public class IntegerSampler extends FieldSampler {
    private int min = 0;
    private int max = 100;
    private Random base;

    public IntegerSampler() {
        base = RandomUtils.getRandom();
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public String sample() {
        return java.lang.Integer.toString(min + base.nextInt(max - min));
    }

}
