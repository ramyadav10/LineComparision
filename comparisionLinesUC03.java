package javapractice;
import java.util.Scanner;

public class comparisionLinesUC3{

public static void main(String[] args) {
   Scanner scanner=new Scanner(System.in);
   //Variable for storing values of X, Y, Length
   double[] x=new double[4];
   double[] y=new double[4];
   double[] length=new double[2];
   for(int i=0;i<4;i++) {
      System.out.println("Enter the value for x"+(i+1));
      x[i]=scanner.nextDouble();//storing value of X in array
      System.out.println("Enter the value for y"+(i+1));
      y[i]=scanner.nextDouble();//storing value of Y  in array
   }

   //Calculating the length
   for(int i=0;i<2;i++) {
      length[i] = Math.sqrt(Math.pow(x[i+1]-x[i],2)+ Math.pow(y[i+1]-y[i],2));
      System.out.println("Length-"+(i+1)+" = "+length[i] );
   }

   //checking the condition to compare the length
   if ( length[0] == length[1]) {
      System.out.println("length-1 is equal to length-2");
   }else if (length[0] > length[1])
      System.out.println("length-1 is greater than length-2");
   else {
       System.out.println("length-1 is Less than length-2");
   }
}
}
