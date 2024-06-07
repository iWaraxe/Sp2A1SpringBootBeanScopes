package com.coherentsolutions.spring.school.springbootbeanscopes;

import java.util.concurrent.atomic.AtomicInteger;

public class MyClass {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private String name;

    public MyClass(String name) {
        this.id = count.incrementAndGet();
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
