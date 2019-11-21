package com.zoo;

import java.util.ArrayList;

public class CoolList<E> extends ArrayList<E> {
    String name;

    public CoolList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
