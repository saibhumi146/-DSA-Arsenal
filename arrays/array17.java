//Given an array, find the element that appears more than n/2 times, where n is the array length
//Boyer-Moore Voting Algorithm.
public class array17 {
    public static void main (String[] args){
       int[] arr = {1,2,3,4,5,6,4,3,2,2,2};
       
         int candidate = 0;
         int count = 0; 

         for(int i = 0;i<arr.length;i++){
             if(count == 0){
                candidate = arr[i];

             }
             if(arr[i] == candidate){
                    count++;
             }else{
                count--;
             }
         }
         System.out.println("The element that appears more than n/2 times is: "+candidate);
         }

}