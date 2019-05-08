package com.michael.myjavaproject.customer;

public class Customer {

    private static String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private long ssn;
    private String phone;
    private String dob;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String zipCode;
    private double annualIncome;
    private boolean citizenship;
    private String username;
    private String password;

    public Customer() {
    }

    public Customer(String firstName, String middleName, String lastName, String email, long ssn, String phone, String dob, String addressLine1, String addressLine2, String city, String zipCode, double annualIncome, boolean citizenship, String username, String password) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.ssn = ssn;
        this.phone = phone;
        this.dob = dob;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.zipCode = zipCode;
        this.annualIncome = annualIncome;
        this.citizenship = citizenship;
        this.username = username;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        Customer.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public boolean isCitizenship() {
        return citizenship;
    }

    public void setCitizenship(boolean citizenship) {
        this.citizenship = citizenship;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", ssn=" + ssn +
                ", phone='" + phone + '\'' +
                ", dob='" + dob + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", annualIncome=" + annualIncome +
                ", citizenship=" + citizenship +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void openNewAccount() {

    }

}
