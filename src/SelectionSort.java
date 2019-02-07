import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] ints = {5, 7, 1, 3, 2, 0};
        SelectionSort(ints);
    }

    public static void SelectionSort(int[] ints){
        int intsLength = ints.length;
        for (int i = 0; i < intsLength-1; i++){
            int minI = i;
            for (int j = i+1; j < intsLength; j++){
                if (ints[j] < ints[minI]) {
                    minI = j;
                }
                int a = ints[minI];
                ints[minI] = ints[i];
                ints[i] = a;
            }
        }
        System.out.println("Selection sort "+Arrays.toString(ints));
    }
}
