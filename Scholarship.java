abstract class Scholarship {
    protected String studentName;

    public Scholarship(String studentName) {
        this.studentName = studentName;
    }

    public abstract boolean checkEligibility();
}

class MeritScholarship extends Scholarship {
    private double gpa;

    public MeritScholarship(String studentName, double gpa) {
        super(studentName);
        this.gpa = gpa;
    }

    @Override
    public boolean checkEligibility() {
        return gpa >= 3.8;
    }
}

class NeedBasedScholarship extends Scholarship {
    private double annualIncome;

    public NeedBasedScholarship(String studentName, double annualIncome) {
        super(studentName);
        this.annualIncome = annualIncome;
    }

    @Override
    public boolean checkEligibility() {
        return annualIncome < 20000;
    }
}