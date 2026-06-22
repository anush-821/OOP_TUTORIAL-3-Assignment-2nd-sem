public class Member {
    protected String memberId;
    protected String name;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public int getBorrowingLimit() {
        return 2;
    }
}

class StudentMember extends Member {
    public StudentMember(String memberId, String name) {
        super(memberId, name);
    }

    @Override
    public int getBorrowingLimit() {
        return 3;
    }
}

class TeacherMember extends Member {
    public TeacherMember(String memberId, String name) {
        super(memberId, name);
    }

    @Override
    public int getBorrowingLimit() {
        return 10;
    }
}