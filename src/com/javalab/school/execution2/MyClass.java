package com.javalab.school.execution2;

import java.util.Objects;

public class MyClass {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // toString() 메소드 오버라이딩
    @Override
    public String toString() {
        return "MyClass{id=" + id + ", name='" + name + "'}";
    }

    // equals() 메소드 오버라이딩
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyClass myClass = (MyClass) obj;
        return id == myClass.id && Objects.equals(name, myClass.name);
    }

    // hashCode() 메소드 오버라이딩
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

