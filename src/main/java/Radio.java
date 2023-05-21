public class Radio {
    private int amountOfRadioStations = 10;
    private int maxRadioStationNumber = amountOfRadioStations - 1;
    private int minRadioVolume = 0;
    private int maxRadioVolume = 100;
    private int currentRadioStationNumber = 0;
    private int currentRadioVolume = minRadioVolume;

    public Radio(int amountOfRadioStations) {

        if (amountOfRadioStations > 10) {
            this.amountOfRadioStations = amountOfRadioStations;
        } else {
            this.amountOfRadioStations = 10;
        }
    }

    public Radio() {
        amountOfRadioStations = 10;
    }

    public int getAmountOfRadioStations() {

        return amountOfRadioStations;
    }

    public void setAmountOfRadioStations(int newAmountOfRadioStations) {

        if (newAmountOfRadioStations > amountOfRadioStations) {
            amountOfRadioStations = newAmountOfRadioStations;
        } else {
            if (newAmountOfRadioStations > 10) {
                amountOfRadioStations = newAmountOfRadioStations;
            } else {
                amountOfRadioStations = 10;
            }
        }
        maxRadioStationNumber = amountOfRadioStations - 1;
    }

    public int getCurrentRadioStationNumber() {

        return currentRadioStationNumber;
    }

    public int getCurrentRadioVolume() {

        return currentRadioVolume;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber > maxRadioStationNumber) {
            return;
        }
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void nextRadioStation() {
        getCurrentRadioStationNumber();
        if (currentRadioStationNumber == maxRadioStationNumber) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber++;
        }
    }

    public void prevRadioStation() {
        getCurrentRadioStationNumber();
        if (currentRadioStationNumber == 0) {
            setCurrentRadioStationNumber(maxRadioStationNumber);
        } else {
            currentRadioStationNumber--;
        }
    }

    public void incRadioVolumeBy1() {
        getCurrentRadioVolume();
        if (currentRadioVolume == maxRadioVolume) {
            return;
        } else {
            currentRadioVolume++;
        }
    }

    public void decRadioVolumeBy1() {
        getCurrentRadioVolume();
        if (currentRadioVolume == minRadioVolume) {
            return;
        } else {
            currentRadioVolume--;
        }
    }

    public void setCurrentRadioVolume(int newCurrentRadioVolume) {
        if (newCurrentRadioVolume > maxRadioVolume) {
            return;
        }
        if (newCurrentRadioVolume < minRadioVolume) {
            return;
        }
        currentRadioVolume = newCurrentRadioVolume;
    }
}
