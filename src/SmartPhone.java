import Base.SmartDevice;

public class SmartPhone extends SmartDevice {
    int numberOfCameras;
    double frontCameraResolution;
    double mainCameraResolution;

    public SmartPhone() {

    }

    public SmartPhone(double price, String manufacturer, double screenSize, double weight, double height,
                      int ram, int rom, String os, double osVersion, int numberOfCameras, double frontCameraResolution,
                      double mainCameraResolution) {
        super(price, manufacturer, screenSize, weight, height, ram, rom, os, osVersion);
        this.numberOfCameras = numberOfCameras;
        this.frontCameraResolution = frontCameraResolution;
        this.mainCameraResolution = mainCameraResolution;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "numberOfCameras=" + numberOfCameras +
                ", frontCameraResolution=" + frontCameraResolution +
                ", mainCameraResolution=" + mainCameraResolution +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", screenSize=" + screenSize +
                ", weight=" + weight +
                ", height=" + height +
                ", ram=" + ram +
                ", rom=" + rom +
                ", os='" + os + '\'' +
                ", osVersion=" + osVersion +
                '}';
    }
}
