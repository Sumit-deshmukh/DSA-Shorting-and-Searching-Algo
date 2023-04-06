import java.util.Arrays;

public class bubblesearch {
    public static void main(String[] args) {
        int [] arr = { 1,3,5,3,7,8,3,4,9,4};
        bbsearch(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bbsearch( int[]arr){
        boolean swapped;
//        rune the steps n-1 times
        for (int i =0; i<arr.length; i++){
            swapped = false;
//            swap if the item is smaller then the privious
            for ( int j = 1; j<arr.length-i; j++){
                if(arr[j]< arr[j-1]){
//                    swap the values
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;

                }
            }
            if(!swapped){
                break;
            }
        }

    }
}
