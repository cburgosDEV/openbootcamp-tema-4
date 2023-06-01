import Base.SmartDevice;

public class Main {
    public static void main(String[] args) {
        SmartDevice smartPhone = new SmartPhone(2.1, "Apple", 5.5, 156, 5.7, 8, 256, "IOS", 14, 4, 8, 16);
        SmartDevice smartWatch = new SmartWatch(2.1, "Apple", 5.5, 156, 5.7, 8, 256, "IOS", 14, true, false, true);
        System.out.println(smartPhone.toString());
        System.out.println(smartWatch.toString());
    }
}