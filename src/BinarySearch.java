public class BinarySearch {

    public static void main(String[] args) {
        int[] ints = {1, 3, 4, 5, 8, 9};
        int searchValue = 3;
        System.out.println("BinarySearch.  Search value "+searchValue+". Found index "+BinarySearch(ints, searchValue));
        searchValue = 10;
        System.out.println("BinarySearch.  Search value "+searchValue+". Found index "+BinarySearch(ints, searchValue));
        searchValue = 1;
        System.out.println("BinarySearch.  Search value "+searchValue+". Found index "+BinarySearch(ints, searchValue));
        searchValue = 4;
        System.out.println("BinarySearch.  Search value "+searchValue+". Found index "+BinarySearch(ints, searchValue));
        searchValue = 7;
        System.out.println("BinarySearch.  Search value "+searchValue+". Found index "+BinarySearch(ints, searchValue));
    }

    public static int BinarySearch(int[] ints, int searchValue){

        int res = -1;
        int minL = 0;
        int maxL = ints.length-1;

        if (searchValue > ints[maxL] || searchValue < ints[minL]){
            return res;
        }

        while (true){

            int med = (minL + maxL)/2;
            if (searchValue < ints[med]){
                maxL = med-1;
            } else if (searchValue > ints[med]) {
                minL = med + 1;
            } else {
                res = med;
                break;
            }
            if (minL >= maxL) {
                if (searchValue == ints[minL]) {
                    res = minL;
                }
                break;
            }
        }
        return res;
    }
}
