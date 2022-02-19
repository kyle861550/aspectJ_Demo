package com.alien.plugin_aspect_j.point_cut;

public class TestBean {

    private final String s;
    private final int i;

    public TestBean(String s, int i) {
        this.s = s;
        this.i = i;
    }

    public TestBean(String s) {
        this(s, -1);
    }

}
