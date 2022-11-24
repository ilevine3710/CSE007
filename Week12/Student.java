public class Student {
    String name; // default null
    int age; // default 0
    boolean isCSMajor; // default false
    char pronoun; // ('t' for they, 'h' for he/him/his, 's' for she/her(s), and 'o' for other)
    String classLevel;
    static int totalEnrollment = 0; // # student objects
    static int totalCSEnrollment = 0;

    /* Precondition: None; 
     * Postcondition: After this constructor executes, a Student object will 
     * be created in memory (the heap) and total enrollment will increase */
    public Student() {
        classLevel = "First Year";
        totalEnrollment++;
    }

    public Student(String name, int age) {
        //this();
        this.name = name;
        this.age = age;
        System.out.println(this.name);
        this.classLevel = "First Year";
        totalEnrollment++;
    }

    public void declareMajor(String major) {
        if (major.equals("CS")) {
            isCSMajor = true;
            totalCSEnrollment++;
        }
    }

    public void changePronoun(char pronoun) {
        if (pronoun == 't' || pronoun == 'h' || pronoun == 's' || pronoun == 'o') {
            this.pronoun = pronoun;
        } else {
            System.out.println("Invalid pronoun code");
        }
    }

    public void print() {
        System.out.println("Name: \tAge: \tClassLevel:");
        System.out.println(name + " \t " + age + " \t " + classLevel);
    }

}