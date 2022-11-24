package Week1;
/*
CSE 007: Class 3
The purpose of this program is to demonstrate the use of variables in simple expressions
*/
public class VarDemo {
    public static void main(String[]args){

    //augmented assignment operators
    double a=6;//6.0
    a+=2; //equivalent expression? a=a+2;
    System.out.println("a: "+ a);  //8.0  
    a=12.34; 
    a/=2; //a=a/2
    System.out.println("a: "+ a); //6.17

    //pre/post increment
    double x = 1.0;
    double y = 5.0;
    double z = x-- + ++y; 
    //x = 0.0, y = 6.0
    System.out.println("z: "+ z); // 7.0
    System.out.println("x: "+ x); // 1.0

    //casting
    double num = 1.7;
    float f;
    //num2=num; //produces error...why can't we do this?
    f = (float) num;
    num = (int) num;
    System.out.println("num: "+ num); // 1
    System.out.println("f: "+f); // 1.7


    //Integer division vs Real Division
    int b = 9;
    int c = 2;
    System.out.println(b/c); // 4
    System.out.println( b / (double) c ); // 4.5

    }
}