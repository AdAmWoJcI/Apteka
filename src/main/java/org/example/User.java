package org.example;

public abstract class User {
    public String firstName;
    private String lastName;
    private String privince;
    private String town;
    private String postCode;
    private String street;
    private String houseNumber;
    private String flatNumber;
    private String phone;
    private String email;
    private String email_ver;

    private String password;
    private String  created_at;
    public String updated_at;

    public User (String FN, String LN){
        this.firstName=FN;
        this.lastName=LN;
    }
}
