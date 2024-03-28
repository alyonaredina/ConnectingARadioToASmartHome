package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldCurrentStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(5);

        int expected = 5;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(50);

        int expected = 50;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notSetVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        rad.setCurrentVolume(101);

        int expected = 5;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        rad.setCurrentVolume(100);

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notSetVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        rad.setCurrentVolume(-1);

        int expected = 5;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        rad.setCurrentVolume(0);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notSetStationAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(3);

        rad.setCurrentStation(10);

        int expected = 3;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(3);

        rad.setCurrentStation(9);

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationN5() {
        Radio rad = new Radio();

        rad.setCurrentStation(5);

        int expected = 5;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notSetStationBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(4);

        rad.setCurrentStation(-1);

        int expected = 4;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(4);

        rad.setCurrentStation(0);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        rad.nextVolume();

        int expected = 6;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.nextVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        rad.prevVolume();

        int expected = 4;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.prevVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);

        rad.nextStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(2);

        rad.prevStation();

        int expected = 1;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.prevStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


}
