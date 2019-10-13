package pl.sda.spring.operation;

public class PercentageOperation implements Operation {
    @Override
    public double calculate(double arg1, double arg2) {
        return (arg2*100.0d)/arg1;

    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.PERCENTAGE;
    }
}
