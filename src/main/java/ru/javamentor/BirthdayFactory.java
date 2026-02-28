package ru.javamentor;

import java.util.Calendar;

public interface BirthdayFactory {
    Cake getCake();

    Gift getGift();

    Card getCard();
}
