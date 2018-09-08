package com.dezso.varga.exercise.design_patterns.builder;

public class Account {

    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private String tel;
    private int rating;
    private boolean active;

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    public int getRating() {
        return rating;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", rating=" + rating +
                ", active=" + active +
                '}';
    }

    private Account(AccountBuilder accountBuilder) {
        this.id = accountBuilder.id;
        this.firstname = accountBuilder.firstName;
        this.lastname = accountBuilder.lastName;
        this.email = accountBuilder.email;
        this.address = accountBuilder.address;
        this.tel = accountBuilder.tel;
        this.rating = accountBuilder.rating;
        this.active = accountBuilder.active;

    }

    public static class AccountBuilder {

        private int id;
        private String firstName;
        private String lastName;
        private String email;
        private String address;
        private String tel;
        private int rating;
        private boolean active;

        public AccountBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public AccountBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public AccountBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public AccountBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public AccountBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public AccountBuilder setTel(String tel) {
            this.tel = tel;
            return this;
        }

        public AccountBuilder setRating(int rating) {
            this.rating = rating;
            return this;
        }

        public AccountBuilder setActive(boolean active) {
            this.active = active;
            return this;
        }

        public Account build() {
            return new Account(this);
        }
    }
}
