import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] ints1 = {5, 7, 1, 3, 2, 0};
        BubbleSortWhile(ints1);
    }

    public static void BubbleSortWhile(int[] ints){

        boolean f = false;
        while (f == false) {
            f = true;
            for (int i = 0; i < ints.length - 1; i++) {
                if (ints[i] > ints[i+1]){
                    int a =ints[i];
                    ints[i] = ints[i+1];
                    ints[i+1] = a;
                    f = false;
                }
            }
        }
        System.out.println("Bubble sort (while) "+Arrays.toString(ints));
    }

    public static void BubbleSortFor(int[] ints){

        for (int i = 0; i < ints.length; i++) {
            boolean f = false;
            for (int j = 0; j < ints.length - 1; j++) {
                if (ints[j] > ints[j+1]){
                    int a = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = a;
                    f = true;
                }
            }
            if (f == false){
                break;
            }
        }
        System.out.println("Bubble sort (for) "+Arrays.toString(ints));
    }


}
