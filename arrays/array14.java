///best time to buy and sell stock


import java.util.Scanner;

public class array14 {
    public static void main (String [] args){
          Scanner sc = new Scanner(System.in);
          int arr[] = {7, 1, 5, 3, 6, 4};
          int maxProfit = 0 ; 
          int bestBuy = arr[0];

          for(int i = 1; i<arr.length;i++){
                if(arr[i] < bestBuy){
                    bestBuy = arr[i];
                } else {
                    maxProfit = Math.max(maxProfit, arr[i] - bestBuy);
                }
                bestBuy = Math.min(bestBuy,arr[i]); //optional line to update bestBuy if a lower price is found
            }
          System.out.println("Maximum profit: " + maxProfit);
          
          System.out.println("Best buy price: " + bestBuy); 
          
        }
       

    }

