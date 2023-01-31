package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    @Test
    public void shouldStationSix() {
        Radio radio = new Radio();


        radio.setCurrentStation(6);


        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldStationEight() {
        Radio radio = new Radio();


        radio.setCurrentStation(8);


        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldStationNine() {
        Radio radio = new Radio();


        radio.setCurrentStation(9);


        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldStationNull() {
        Radio radio = new Radio();


        radio.setCurrentStation(10);


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldStationNullIfMinus() {
        Radio radio = new Radio();


        radio.setCurrentStation(-5);


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldStationNullIfNull() {
        Radio radio = new Radio();


        radio.setCurrentStation(0);


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldVolumeNullIfNull() {
        Radio radio = new Radio();


        radio.setCurrentVolume(0);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeNullIfMinus() {
        Radio radio = new Radio();


        radio.setCurrentVolume(-5);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeOne() {
        Radio radio = new Radio();


        radio.setCurrentVolume(1);


        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeNine() {
        Radio radio = new Radio();


        radio.setCurrentVolume(9);


        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeTen() {
        Radio radio = new Radio();


        radio.setCurrentVolume(10);


        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeNullIfEleven() {
        Radio radio = new Radio();


        radio.setCurrentVolume(11);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeNullIfMore() {
        Radio radio = new Radio();


        radio.setCurrentVolume(15);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextStationPlasOne() {
        Radio radio = new Radio();


        radio.setCurrentStation(6);


        radio.next();


        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextStationNullIfNine() {
        Radio radio = new Radio();


        radio.setCurrentStation(9);


        radio.next();


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextStationNext() {
        Radio radio = new Radio();


        radio.setCurrentStation(0);


        radio.next();


        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextStationNullIfTen() {
        Radio radio = new Radio();


        radio.setCurrentStation(10);


        radio.next();


        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }




    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();


        radio.setCurrentStation(7);


        radio.prev();


        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevStationNullToNine() {
        Radio radio = new Radio();


        radio.setCurrentStation(0);


        radio.prev();


        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevStationNineIfOne() {
        Radio radio = new Radio();


        radio.setCurrentStation(1);


        radio.prev();


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMaxVolumeNathing() {
        Radio radio = new Radio();


        radio.setCurrentVolume(10);


        radio.maxVolume();


        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMaxVolumeNine() {
        Radio radio = new Radio();


        radio.setCurrentVolume(9);


        radio.maxVolume();


        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMinVolume() {
        Radio radio = new Radio();


        radio.setCurrentVolume(0);


        radio.minVolume();


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void eshouldMinVolumeOne() {
        Radio radio = new Radio();


        radio.setCurrentVolume(1);


        radio.minVolume();


        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);
        int expected = 15;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

}

