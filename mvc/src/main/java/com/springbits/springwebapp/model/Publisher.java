package com.springbits.springwebapp.model;

import javax.persistence.*;

/**
 * Created by sergioletras on 02/02/19.
 */
@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;

    @OneToOne(mappedBy = "publisher")
    private Book book;

    public Publisher(String name, String address, Book book) {
        this.name = name;
        this.address = address;
        this.book = book;
    }

    public Publisher(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
