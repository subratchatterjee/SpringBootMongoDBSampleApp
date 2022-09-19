package com.sample.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document("employees")
public class Employee implements Serializable {

    private static final long serialVersionUID = 7156526077883281623L;

    @Id
    private String id;
    private String name;
    private String department;
    private String age;

    public Employee() {}

    public Employee(String id, String name, String department, String age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
