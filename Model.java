

package week06;
import java.util.Scanner;
import java.util.InputMismatchException;




public class Model {

	public static void main (String []args)
	{
		int maxsubjects;
		int [] marks =new int [5];
		int total=0;
		double avg=0;
		
		Scanner sc= new Scanner (System.in);
		
		try {
			
			System.out.println(" enter the marks you obtain:");
			       int maxsubjets = sc.nextInt();
			       
			for (int i=0;i<marks.length;i++) {
				
				
				System.out.println("enter the marks");
				
				marks [i] =sc.nextInt();
				
				total= total+marks[i];
				avg= total/marks.length;
				
				
			} 
			
			   
			}  catch (InputMismatchException e){ 
				   System.out.println(e);
				
		}catch (ArithmeticException e) {
			System.out.println(e);
			
		}catch (ArrayIndexOutOfBoundsException e)
		{
		
		
		System.out.println(e);
		
		
	}
		finally {
			System.out.println("This code will be gurrentied to run");
			System.out.println("total is:"+total);
			System.out.println("avg is:"+avg);
			}
	
		System.out.println("in the end");
		
}
}
