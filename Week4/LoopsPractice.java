package Week4;
public class LoopsPractice {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; ++i) {
            System.out.print (i*i + " ");
        } System.out.println();

        for (int j = 0; j < 5; ++j) {
            System.out.println("*****");
        } System.out.println();

        for (int k = 0; k < 5; ++k) {
            int count = k;
            while (count >= 0) {
                System.out.print("*");
                count -= 1;
            } System.out.println();
        } System.out.println();

        for (int l = 0; l < 5; ++l) {
            int count = 5 - l;
            while (count > 0) {
                System.out.print("*");
                count -= 1;
            } System.out.println();
        } System.out.println();
        
        int sum = 0;
        for (int m = 0; m <= 20; ++m) {
            if (m == 10 || m == 11) {
                continue; // SKIPS ITERATING THESE VALUES, m = 10 and m = 11, CONTINUES ITERATING OTHER VALUES
            } sum += m;
        } System.out.println("Sum = " + sum);

        int product = 1;
        for (int n = 1; n < 4; ++n) {
            for (int o = 1; o < 4; ++o) {
                if (o > n) {
                    break; // BREAKS IF STATEMENT, ENDS THE INNER MOST FOR LOOP
                } product *= o;
            }
        } System.out.println(product);

    



    }
}
