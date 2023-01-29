package ru.netology;


public class Radio {
    private int currentStation;
    private int currentVolume;



    public void next() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }


    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }


    public void maxVolume() {
        if (currentVolume == 10) {
            return;
        }
    }


    public void minVolume() {
        if (currentVolume == 0) {
            return;
        }
    }


    public int getCurrentStation() {
        return currentStation;
    }


    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
package ru.netology;


public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;


    public Radio() {
        maxStation = 9;
        minStation = 0;
        maxVolume = 99;
        minVolume = 0;
    }


    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;
    }




    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }


    public void prev() {
        if (currentStation != minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }


    public void maxVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
    }


    public void minVolume() {
        if (currentVolume == minVolume) {
            return;
        }
    }


    public int getCurrentStation() {
        return currentStation;
    }


    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
