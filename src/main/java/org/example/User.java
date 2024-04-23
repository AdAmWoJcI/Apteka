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

    public User(String firstName, String lastName, String privince, String town, String postCode, String street, String houseNumber, String flatNumber, String phone, String email, String email_ver, String password, String created_at) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.privince = privince;
        this.town = town;
        this.postCode = postCode;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
        this.phone = phone;
        this.email = email;
        this.email_ver = email_ver;
        this.password = password;
        this.created_at = created_at;
    }
}
