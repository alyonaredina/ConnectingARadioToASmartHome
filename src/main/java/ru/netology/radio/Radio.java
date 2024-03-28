package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;


    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextVolume() {
        int target = currentVolume + 1;
        setCurrentVolume(target);
    }

    public void prevVolume() {
        int target = currentVolume - 1;
        setCurrentVolume(target);
    }

    public void nextStation() {
        int target = currentStation + 1;

        if (currentStation == 9) {
            currentStation = 0;
        }
        setCurrentStation(target);
    }

    public void prevStation() {
        int target = currentStation - 1;

        if (currentStation == 0) {
            currentStation = 9;
        }
        setCurrentStation(target);
    }


}
