package com.student;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


public class Discipline extends IntContainer implements Serializable {
    private String description;

    public Discipline() {
    }

    public Discipline(String description) {
        this.description = description;
    }

    @XmlAttribute(name = "name")
    public String getDescription() {
        return this.description;
    }

    @XmlElement(name = "mark")
    private int[] getArray() {
        return array;
    }
}
