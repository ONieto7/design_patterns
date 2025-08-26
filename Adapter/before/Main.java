package Adapter.before;

public class Main {
    public static void main(String[] args) {
        Voltage source = new Voltage();
        Device myDevice = new Device();

        myDevice.turnOn(source.getVoltage()); // Incorrect voltage
    }
}
