package Adapter.before;

public class Device {
    public void turnOn(int voltage) {
        if (voltage == 110) {
            System.out.println("Device turned on");
        } else {
            System.out.println("Incorrect voltage");
        }
    }
}
