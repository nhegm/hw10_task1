public class Radio {
    private int currentRadioStationNumber;
    private int currentRadioVolume;

    public int getCurrentRadioStationNumber() {

        return currentRadioStationNumber;
    }

    public int getCurrentRadioVolume() {

        return currentRadioVolume;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void nextRadioStation() {

        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber++;
        }
    }

    public void prevRadioStation() {

        if (currentRadioStationNumber == 0) {
            setCurrentRadioStationNumber(9);
        } else {
            currentRadioStationNumber--;
        }
    }

    public void incRadioVolumeBy1() {

        if (currentRadioVolume == 100) {
            return;
        } else {
            currentRadioVolume++;
        }
    }

    public void decRadioVolumeBy1() {

        if (currentRadioVolume == 0) {
            return;
        } else {
            currentRadioVolume--;
        }
    }

    public void setCurrentRadioVolume(int newCurrentRadioVolume) {
        if (newCurrentRadioVolume > 100) {
            return;
        }
        if (newCurrentRadioVolume < 0) {
            return;
        }
        currentRadioVolume = newCurrentRadioVolume;
    }
}
