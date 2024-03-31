package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int quantityStation = 10;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;


    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public int getQuantityStation() {
        return quantityStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
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

        if (currentStation == maxStation) {
            currentStation = minStation;
        }
        setCurrentStation(target);
    }

    public void prevStation() {
        int target = currentStation - 1;

        if (currentStation == minStation) {
            currentStation = maxStation;
        }
        setCurrentStation(target);
    }

    public Radio() {

    }

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }


}
