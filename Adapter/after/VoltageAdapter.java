package Adapter.after;

public class VoltageAdapter {
    private Voltage source;

    public VoltageAdapter(Voltage source) {
        this.source = source;
    }

    public int getVoltage110V() {
        // Real conversion from 220V to 110V
        return source.getVoltage() / 2;
    }
}
