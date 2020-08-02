package com.example.myfirstapp.model;

public class User {
    private String name;
    private String email;
    private String password;
    private String address;
    private String city;
    private String state;
    private int zipcode;


    /**
     * Method used to read users set name
     * @return saved name
     */
    public String getName() {
        return name;
    }

    /**
     * Method used to set the users name
     * @param name obtained from user
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method used to read users set email
     * @return saved email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Method used to set the users email
     * @param email obtained from user
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Method used to read users set password
     * @return saved password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Method used to set the users password
     * @param password obtained from user
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Method used to read users set address
     * @return saved address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Method used to set the users address
     * @param address obtained from user
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Method used to read users set city
     * @return saved city
     */
    public String getCity() {
        return city;
    }

    /**
     * Method used to set the users city
     * @param city obtained from user
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Method used to read users set state
     * @return saved state
     */
    public String getState() {
        return state;
    }

    /**
     * Method used to set the users state
     * @param state obtained from user
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Method used to read users set zipcode
     * @return saved zipcode
     */
    public int getZipcode() {
        return zipcode;
    }

    /**
     * Method used to set the users zipcode
     * @param zipcode obtained from user
     */
    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}