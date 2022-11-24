package Week4;
public class Lab3 {
    public static void main(String[] args) {
        int num = 10;
        char c ='E';
        switch (c) {
            case 'A':
                num-=c;
                System.out.println("case A "+num);
                break;
            case 'D': 
                System.out.println("case D "+'0'+num);
                break;
            case 'B': 
                System.out.println("case B "+ ++num);
                break;
            case 'C':
                System.out.println("case C "+ num+2);
                c-=2;
                break;
            case 'E':
                System.out.println("case2 "+ num++);
            case 'F': 
                System.out.println("case F "+ num--);
            default: 
                System.out.println("default "+ --num+2);
        }
        System.out.println("end "+c);
    }
}
