import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] ints = {5, 7, 1, 3, 2, 0};
        ints = MergeSort(ints);
        System.out.println("Merge sort " + Arrays.toString(ints));
    }

    public static int[] MergeSort(int[] ints){

        int intsLength = ints.length;
        if (intsLength == 1) {
            return ints;
        }
        else{
            int len2 = (intsLength % 2 == 0) ? (intsLength / 2) : (intsLength / 2 + 1);

            int[] intsLeft = new int[len2];
            for (int j = 0; j < len2; j++) {
                intsLeft[j] = ints[j];
            }
            int[] intsRight = new int[intsLength - len2];
            for (int j = len2; j < intsLength; j++) {
                intsRight[j-len2] = ints[j];
            }
            intsLeft = MergeSort(intsLeft);
            intsRight = MergeSort(intsRight);
            ints = Merge(intsLeft, intsRight);
            return ints;
        }
        //return ints;
    }

    public static int[] Merge(int[] intsLeft, int[] intsRight){

        int intsLeftlength =intsLeft.length;
        int intsRightlength = intsRight.length;

        int totalLenght = intsLeftlength + intsRightlength;
        int[] ints = new int[totalLenght] ;

        int i,li,ri;
        i = li = ri = 0;
        while ( i < totalLenght) {
            if ((li < intsLeftlength) && (ri<intsRightlength)) {
                if (intsLeft[li] < intsRight[ri]) {
                    ints[i] = intsLeft[li];
                    i++;
                    li++;
                }
                else {
                    ints[i] = intsRight[ri];
                    i++;
                    ri++;
                }
            }
            else {
                if (li >= intsLeftlength) {
                    while (ri < intsRightlength) {
                        ints[i] = intsRight[ri];
                        i++;
                        ri++;
                    }
                }
                if (ri >= intsRightlength) {
                    while (li < intsLeftlength) {
                        ints[i] = intsLeft[li];
                        li++;
                        i++;
                    }
                }
            }
        }

        return ints;
    }
}
