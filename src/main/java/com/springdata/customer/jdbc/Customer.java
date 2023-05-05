package com.springdata.customer.jdbc;

public class Customer {
    private Long id;
    private String username;
    private String email;
    public Customer(Long id, String username, String email){
        this.email = email;
        this.username = username;
        this.id = id;
    }
    public Customer(){}

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
