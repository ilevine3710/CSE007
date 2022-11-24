package Week13;
public class Student1 extends LehighPerson {
    private String major;
    private String anticipatedGradDate;
    private static int totalCSEnrollment = 0;    
    public Student1 () {
    }
    public Student1 (String lin, String email) {
        super(lin, email);
    }
    public Student1 (String lin, String email, String name, String address, String birthdate) {
        super(lin, email, name, address, birthdate);
    }
    public String getMajor(LehighPerson student) {
        return major;
    } public String getAnticipatedGradDate(LehighPerson student) {
        return anticipatedGradDate;
    } public int getTotalCSEnrollment() {
        return totalCSEnrollment;
    } public void setMajor(LehighPerson student, String major) {
        this.major = major;
    } public void setAnticipatedGradDate(LehighPerson student, String s) {
        anticipatedGradDate = s;
    } 

    public void saySomething() {
        System.out.println("Registration sucks");
    }
    @Override
    public String toString () {
        String out = super.toString() + "; major: " + major + "; Anticipated Graduation Date: " + anticipatedGradDate;
        return out;
    }
}
