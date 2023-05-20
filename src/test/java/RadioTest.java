import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldGetRadioStation() {
        Radio radioTesting = new Radio();

        int expected = 0;
        int actual = radioTesting.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation() {
        Radio radioTesting = new Radio();

        radioTesting.setCurrentRadioStationNumber(7);

        int expected = 7;
        int actual = radioTesting.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationWhenBelow() {
        Radio radioTesting = new Radio();

        radioTesting.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = radioTesting.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationWhenAbove() {
        Radio radioTesting = new Radio();

        radioTesting.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = radioTesting.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextRadioStation() {
        Radio radioTesting = new Radio();

        radioTesting.nextRadioStation();

        int expected = 1;
        int actual = radioTesting.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextRadioStationWhen9thStation() {
        Radio radioTesting = new Radio();

        radioTesting.setCurrentRadioStationNumber(9);
        radioTesting.nextRadioStation();

        int expected = 0;
        int actual = radioTesting.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchToPrevRadioStation() {
        Radio radioTesting = new Radio();

        radioTesting.setCurrentRadioStationNumber(9);
        radioTesting.prevRadioStation();

        int expected = 8;
        int actual = radioTesting.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevRadioStationWhen0thStation() {
        Radio radioTesting = new Radio();

        radioTesting.setCurrentRadioStationNumber(0);
        radioTesting.prevRadioStation();

        int expected = 9;
        int actual = radioTesting.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetRadioVolume() {
        Radio radioTesting = new Radio();

        int expected = 0;
        int actual = radioTesting.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddVolumeWhenInRange() {
        Radio volumeTesting = new Radio();

        volumeTesting.setCurrentRadioVolume(0);
        volumeTesting.incRadioVolumeBy1();

        int expected = 1;
        int actual = volumeTesting.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolumeWhenInRange() {
        Radio volumeTesting = new Radio();

        volumeTesting.setCurrentRadioVolume(100);
        volumeTesting.decRadioVolumeBy1();

        int expected = 99;
        int actual = volumeTesting.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotAddVolumeWhenAbove() {
        Radio volumeTesting = new Radio();

            volumeTesting.setCurrentRadioVolume(100);
            volumeTesting.incRadioVolumeBy1();

            int expected = 100;
            int actual = volumeTesting.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotDecreaseVolumeWhenBelow() {
        Radio volumeTesting = new Radio();

        volumeTesting.setCurrentRadioVolume(0);
        volumeTesting.decRadioVolumeBy1();

        int expected = 0;
        int actual = volumeTesting.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotDecreaseVolumeWhenBelow0() {
        Radio volumeTesting = new Radio();

        volumeTesting.setCurrentRadioVolume(-1);
        volumeTesting.decRadioVolumeBy1();

        int expected = 0;
        int actual = volumeTesting.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotAddVolumeWhenAbove100() {
        Radio volumeTesting = new Radio();

        volumeTesting.setCurrentRadioVolume(101);
        volumeTesting.incRadioVolumeBy1();

        int expected = 1;
        int actual = volumeTesting.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }
}
