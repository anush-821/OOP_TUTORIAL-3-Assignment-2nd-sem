abstract class StudentFee {
    protected String name;
    public abstract double calculateFee();
}

class Undergraduate extends StudentFee {
    @Override
    public double calculateFee() {
        return 5000.00;
    }
}

class Graduate extends StudentFee {
    @Override
    public double calculateFee() {
        return 8000.00;
    }
}