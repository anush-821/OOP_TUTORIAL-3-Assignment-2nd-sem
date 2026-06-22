interface ResultProcessor {
    String processGrade(double marks);
}

class EngineeringDepartment implements ResultProcessor {
    @Override
    public String processGrade(double marks) {
        if (marks >= 80) return "Distinction";
        else if (marks >= 60) return "First Class";
        return "Pass";
    }
}

class ManagementDepartment implements ResultProcessor {
    @Override
    public String processGrade(double marks) {
        if (marks >= 75) return "A Grade";
        else if (marks >= 55) return "B Grade";
        return "C Grade";
    }
}