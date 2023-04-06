public class seachinrange {
    public static void main(String[] args){
        int[] arr= { 18, 12,-7,3,14,28};
        int target = -7;
        System.out.println(search(arr,target, 1,4));


    }
    static int search(int[]arr, int target, int start, int end){
        if(arr.length ==0){
            return -0;
        }
        for( int index = start; index <= end; index++){
            int element = arr[index];
            if( element == target){
                return index;

            }
        }
        return -1;
    }
}
