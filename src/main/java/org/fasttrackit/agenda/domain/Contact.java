package org.fasttrackit.agenda.domain;

/**
 * @author ttritean
 * @since 3/18/2019
 */
public class Contact {


    private String firstName;

    private String lastName;

    private String phone;

    private String address;


    public Contact() {
        super();
        phone="";
    }

    public Contact(String firstNameParam, String lastNameParam){
        this();
        this.firstName = firstNameParam;
        this.lastName = lastNameParam;
    }

    public Contact(String fisrtN, String ln, String ad) {
        this(fisrtN,ln);
        this.address = ad;
    }


    public void setFirstName(String firstNameParam) {
        //valida
        if (firstNameParam.equals("")) {
            throw new IllegalArgumentException("First name " +
                    "cannot be empty");
        }
        this.firstName = firstNameParam;
    }

    public String getFirstName() {
        return this.firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "First name is: " + firstName +
                " and last name is: " + lastName;
    }
//
//    public boolean equals(Object c) {
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        Contact second = (Contact) o;
        if (second.getFirstName().equals(this.firstName) &&
                second.getLastName().equals(this.getLastName())
        ) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        return firstName != null ? firstName.hashCode() : 0;
    }
}
