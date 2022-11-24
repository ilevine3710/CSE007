package Week2;
/*Isaac Levine
8/26
CSE7 Lab 1
The purpose of this program is to convert a value in pounds into a value in kilograms using variables, through IDE Visual Studio Code.
 */
public class ConvertWeight {
    public static void main(String[] args){

        final double kgPerPound = 0.45359237;
        double weightInPounds = 150.32;
        double weightInKilograms;

        weightInKilograms = weightInPounds*kgPerPound;
        System.out.println(weightInPounds + "lbs is equal to " + weightInKilograms+"kg");
    }
}
