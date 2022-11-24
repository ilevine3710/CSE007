package Week3;
public class InsertionSelection {
    public static void main(String[] args) {
        int [] array = {3,2,1,31, 183, 1378};
        Insertion(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
    public static void Insertion(int [] array) {
        for (int i = 0; i < array.length; i++) {
            int j = i;
            while (j > 0 && array [j] < array [j - 1]) { // swap < to sort reverse
                int temp = array [j];
                array [j] = array [j - 1];
                array [j - 1] = temp;
                j -= 1; 
            } 
        }
    } 
    public static void Selection(int [] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array [j] < min) { // swap < to sort reverse
                    min = array[j];
                    index = j;
                }
            } int temp = array [index];
            array [index] = array [i];
            array [i] = temp;
        }
    }
}
