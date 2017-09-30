package com.topzrt.gl.bean;

/**
 * Created by Vincent;
 * Created on 2017/9/30;
 * DSC:
 */

public class Girl {

    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Girl(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
