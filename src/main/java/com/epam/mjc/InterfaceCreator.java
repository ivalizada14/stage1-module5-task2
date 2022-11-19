package com.epam.mjc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        Operation<Integer> operation = (x) -> {
            List<Integer> l = new ArrayList<>();
            for(Integer i : x)
                l.add(i/divider);
            return l;
        };
        return operation;
    }
}
