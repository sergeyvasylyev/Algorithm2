import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] ints = {5, 7, 1, 3, 2, 0};
        InsertionSort(ints);
    }

    public static void InsertionSort(int[] ints) {
        for (int i =0; i< ints.length; i++){
            //int min = ints[i];
            for (int j = 0; j< ints.length; j++){
                if (ints[i] < ints[j]){
                    int a = ints[i];
                    ints[i] = ints[j];
                    ints[j] = a;
                }
            }
        }

        System.out.println("Insertion sort "+Arrays.toString(ints));
    }
}
