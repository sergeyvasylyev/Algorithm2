import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] ints = {5, 7, 1, 3, 2, 0};
        ints = QuickSort(ints);
        System.out.println("Quick sort " + Arrays.toString(ints));
    }

    public static int[] QuickSort(int[] ints) {

        int intsLenght = ints.length;
        if (intsLenght == 1) {
            return ints;
        } else {
            int[] low = new int[intsLenght];
            int[] up = new int[intsLenght];
            int[] totalints = new int[intsLenght];
            int root = ints[0];
            int lowi, upi;
            lowi = upi = 0;
            for (int i = 1; i < intsLenght; i++) {
                if (ints[i] >= root) {
                    up[upi] = ints[i];
                    upi++;
                } else {
                    low[lowi] = ints[i];
                    lowi++;
                }
            }

            int[] newlow = new int[lowi];
            for (int i = 0; i < lowi; i++) {
                newlow[i] = low[i];
            }
            int[] newup = new int[upi];
            for (int i = 0; i < upi; i++) {
                newup[i] = up[i];
            }
            if (lowi > 0) {
                low = QuickSort(newlow);
            }
            if (upi > 0) {
                up = QuickSort(newup);
            }

            for (int i = 0; i < lowi; i++) {
                totalints[i] = low[i];
            }
            totalints[lowi] = root;
            for (int i = 0; i < upi; i++) {
                totalints[lowi + i + 1] = up[i];
            }

            return totalints;
        }
    }
}
