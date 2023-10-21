package statickeywordnevergivesuchname;

public class Teacher {

    private static int teacherCount = 0;

    private String firstName;
    private String lastName;

    public Teacher() {
        teacherCount++;
    }

    public Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        teacherCount++;
    }

    public static int getTeacherCount() {
        return teacherCount;
    }

    public static void setTeacherCount(int teacherCount) {
        Teacher.teacherCount = teacherCount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher's number='" + getTeacherCount() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }
}
