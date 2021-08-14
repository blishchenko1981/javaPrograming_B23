package practiceOOP;

public class TV {
    private int channel = 1;
    private int volumeLevel = 0;
    private boolean on = false;
    private String brand = "undefined";

    public TV() {
        System.out.println("Creating TV object using no arg - constructor");

    }

    public TV(String brand) {
        System.out.println("Creating TV object using 1 arg - constructor");

    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if (volumeLevel < 0 || volumeLevel >= 7 || on == false) {
            System.out.println("ERROR: TV is either OFF or invalid Volume Level");
        } else {
            this.volumeLevel = volumeLevel;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp() {

        channel += 1;
    }

    public void channelDown() {
        channel -= 1;
    }

    public void volumeUp() {
        volumeLevel += 1;
    }

    public void volumeDown() {
        volumeLevel -= 1;
    }

    public boolean isOn() {
        if (on == true) {
            return true;
        } else {
            return false;
        }
    }

    public void turnOff() {
        if (isOn()) {
            on = false;
        } else {
            System.out.println("TV is already OFF");
        }
    }

    public void turnOn() {
        if (isOn()) {
            System.out.println("TV is already ON");
        } else {
            on = true;
        }
    }

    public void setChannel(int channel) {
        if (channel > 120 || channel <= 0 || on == false) {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        } else {
            this.channel = channel;
        }
    }
}