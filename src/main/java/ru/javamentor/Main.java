package ru.javamentor;


public class Main {
    public static void main(String[] args) {
        AdultBirthdaySet adultBirthdaySet = new AdultBirthdaySet();
        KidsBirthdaySet kidsBirthdaySet = new KidsBirthdaySet();
        System.out.println(doParty(adultBirthdaySet));
        System.out.println(doParty(kidsBirthdaySet));
    }

    public static String doParty(BirthdayFactory birthdayFactory) {
        return birthdayFactory.getCard().getName() + " и " +
                birthdayFactory.getGift().getName() + " и " +
                birthdayFactory.getCake().getName();
    }

}
