package com.byt.main.models;

import java.util.Objects;

public class Hobby {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hobby)) return false;
        Hobby hobby = (Hobby) o;
        return getName().equals(hobby.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hobby(String name) {
        this.name = name;
    }
}
