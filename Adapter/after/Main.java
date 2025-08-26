package Adapter.after;

public class Main {
    public static void main(String[] args) {
        Voltage source = new Voltage();
        VoltageAdapter adapter = new VoltageAdapter(source);
        Device myDevice = new Device();

        myDevice.turnOn(adapter.getVoltage110V());
    }
}
