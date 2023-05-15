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
    public void shouldGetRadioVolume() {
        Radio radioTesting = new Radio();

        int expected = 0;
        int actual = radioTesting.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddVolumeWhenInRange() {
        Radio volumeTesting = new Radio();

        volumeTesting.setCurrentRadioVolume(1);
        volumeTesting.incRadioVolumeBy1();

        int expected = 2;
        int actual = volumeTesting.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolumeWhenInRange() {
        Radio volumeTesting = new Radio();

        volumeTesting.setCurrentRadioVolume(99);
        volumeTesting.decRadioVolumeBy1();

        int expected = 98;
        int actual = volumeTesting.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotAddVolumeWhenWhenAbove() {
        Radio volumeTesting = new Radio();

        volumeTesting.setCurrentRadioVolume(100);
        volumeTesting.incRadioVolumeBy1();

        int expected = 100;
        int actual = volumeTesting.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotDecreaseVolumeWhenWhenBelow() {
        Radio volumeTesting = new Radio();

        volumeTesting.setCurrentRadioVolume(0);
        volumeTesting.decRadioVolumeBy1();

        int expected = 0;
        int actual = volumeTesting.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }
}
