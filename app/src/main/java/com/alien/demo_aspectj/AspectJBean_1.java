package com.alien.demo_aspectj;

import java.util.ArrayList;
import java.util.List;

public class AspectJBean_1 {

    private final long id;


    private static final List<String> BASE_INFO = new ArrayList<>();

    static {
        BASE_INFO.add("Hello");
        BASE_INFO.add("Aspect-J");
    }


    public AspectJBean_1(long id) {
        this.id = id;
    }
}
