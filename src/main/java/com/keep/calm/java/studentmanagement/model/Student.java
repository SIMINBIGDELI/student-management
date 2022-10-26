package com.keep.calm.java.studentmanagement.model;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String family;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_address",referencedColumnName = "id")
    private Address address;
    public Student() {}

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Student(long id, String name, String family, Address address) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", address=" + address +
                '}';
    }
}
