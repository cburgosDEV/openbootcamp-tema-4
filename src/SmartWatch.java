import Base.SmartDevice;

public class SmartWatch extends SmartDevice {
    boolean calls;
    boolean camera;
    boolean hearthRate;

    public SmartWatch() {

    }

    public SmartWatch(double price, String manufacturer, double screenSize, double weight, double height,
                      int ram, int rom, String os, double osVersion, boolean calls, boolean camera,
                      boolean hearthRate) {
        super(price, manufacturer, screenSize, weight, height, ram, rom, os, osVersion);
        this.calls = calls;
        this.camera = camera;
        this.hearthRate = hearthRate;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "calls=" + calls +
                ", camera=" + camera +
                ", hearthRate=" + hearthRate +
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
