//two sum 
public class array13 {
 public static void main (String[] args){
    int [] arr = {2,7,8,9};
    int target = 9; // Example target sum
    for(int i = 0; i<arr.length;i++){
        for(int j = i+1 ; j<arr.length;j++){
            if( arr[i]+arr[j]== target)
                System.out.println("Pair found: " + arr[i] + ", " + arr[j]);
                  System.out.println(
                        "Indexes: " + i + " and " + j
                    );
        }
        
    }
 }
    
}
