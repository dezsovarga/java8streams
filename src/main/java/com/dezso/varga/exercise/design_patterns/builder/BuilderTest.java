package com.dezso.varga.exercise.design_patterns.builder;

public class BuilderTest {

    public static void main(String args[]) {

        Account account = new Account.AccountBuilder().setActive(true).setRating(1697).setFirstName("Dezso")
                .setLastName("Varga").build();

        System.out.println(account);
    }
}
