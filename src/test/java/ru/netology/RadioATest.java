package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioATest {
    @Test
    public void shouldMaxStation() {
        Radio radio = new Radio(10);


        radio.setCurrentStation(9);


        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMax() {
        Radio radio = new Radio(15);


        radio.setCurrentStation(10);


        int expected = 10;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


}