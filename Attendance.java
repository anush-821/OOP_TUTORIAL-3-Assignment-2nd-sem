public class Attendance {
    public double calculateAttendance(int daysPresent, int totalDays) {
        return ((double)daysPresent / totalDays) * 100;
    }
}

class EngineeringAttendance extends Attendance {
    @Override
    public double calculateAttendance(int daysPresent, int totalDays) {
        return super.calculateAttendance(daysPresent, totalDays);
    }
}

class MedicalAttendance extends Attendance {
    @Override
    public double calculateAttendance(int daysPresent, int totalDays) {
        return super.calculateAttendance(daysPresent, totalDays);
    }
}