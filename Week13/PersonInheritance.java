package Week13;
/*Isaac Levine
 * 11/11/2022
 * CSE007 Fall 2022: Lab 12
 * The purpose of this program is to create a calculator object and use it to solve equations
 */
public class PersonInheritance {
    public static void main(String[] args) {
        Person p = new Person();
        LehighPerson l = new LehighPerson("123456789", "isl225@lehigh.edu");
        Student1 s = new Student1("123456789","isl225","Isaac", "123 Main St", "08/21/2003");

        l.saySomething();
        p.saySomething();
        s.saySomething();
        
        s.setMajor(s,"CompE");
        s.setAnticipatedGradDate(s, "2025");

        System.out.println(s.toString());
        


    }   
}
