package javapractice;
import java.util.Scanner;

public class lengthLineUC01 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scanner=new Scanner(System.in);
	//Variable for storing values of X & Y
	double[] x=new double[2];
	double[] y=new double[2];

	for(int i=0;i<2;i++) {
		x[i]=scanner.nextDouble();//Xa Xb
		y[i]=scanner.nextDouble();//Ya Yb
	}

	System.out.printf("%.3f",Math.sqrt((x[1]-x[0])*(x[1]-x[0])+(y[1]-y[0])*(y[1]-y[0])));
}
}
