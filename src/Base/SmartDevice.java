package Base;

public abstract class SmartDevice {
    protected double price;
    protected String manufacturer;
    protected double screenSize;
    protected double weight;
    protected double height;
    protected int ram;
    protected int rom;
    protected String os;
    protected double osVersion;

    public SmartDevice() {

    }

    public SmartDevice(double price, String manufacturer, double screenSize, double weight, double height, int ram, int rom, String os, double osVersion) {
        this.price = price;
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
        this.weight = weight;
        this.height = height;
        this.ram = ram;
        this.rom = rom;
        this.os = os;
        this.osVersion = osVersion;
    }


}
