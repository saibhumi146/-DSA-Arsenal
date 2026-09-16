
///Dutch National Flag algorithm using 3 pointer approach

public class array18 {
    public static void main(String[] args ){

        int [] arr ={2,0,2,1,1,0};
         int low = 0;
         int mid = 0;
         int high = arr.length-1;
          for (int i =0; i<arr.length;i++)
          {
            if(arr[mid]==0)
            {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] =temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
           
          }
           for(int i=0;i<arr.length;i++)
           {
               System.out.print(arr[i]+" ");
           }
    }   
}
