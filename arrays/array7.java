import java.util.Scanner;

public abstract class array7 {
     public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
         int zee[] = new int[5];
         System.out.println("enter the numbers:");
         for(int i=0;i<zee.length;i++){
                System.out.println("enter element"+ i+":");
                zee[i] = sc.nextInt();
         }

         int max = zee[0] ;
         for(int i =0;i<zee.length;i++){
            if(zee[i]>max){
                max=zee[i];
            }
            }
            int smax = Integer.MIN_VALUE;;
             for(int i =0;i<zee.length;i++){
            if (zee[i] < max && zee[i] > smax) {
              smax = zee[i];
}
        }
        System.out.println("maximum element="+max);
        System.out.println("secondmaximum element="+smax);
        

sc.close();
}
}
