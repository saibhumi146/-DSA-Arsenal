//Kadane's Algorithm using array 

public class arraykadanes15 {
    public static void main(String[] args){
        int arr[] = {1,2,-1,3,4,-3};

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
          
        for(int i = 0;i<arr.length;i++){
        currentSum = currentSum + arr[i];
        if(currentSum<0){
            currentSum = 0 ;
        }
        if(currentSum>maxSum){
        maxSum = currentSum;
    }}
    System.out.println("Maximum sum is: "+maxSum);
    }
}
