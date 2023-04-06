
public class sumit{
    public static void main(String[] args){
        int [] num = { 45,32,545,65,65,63,26};
         int target = 26;
         int ans = linearsearch(num,target);
         System.out.println(ans);

    }
//    search the target and return element itself

    static int linearsearch(int[]arr, int target){
        if(arr.length ==0){
            return -0;
        }
        for( int index = 0; index < arr.length; index++){
            int element = arr[index];
            if( element == target){
                return index;

            }
        }
        return -1;
    }



}