package com.example.demo8.day190825;

import java.util.Objects;

/**
 * 自定义key
 *
 */
public class Person {

    private String name;
    private Integer age;

    public Person(){ }

    public Person(String name,Integer age){
        this.age=age;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }
}
