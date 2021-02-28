import java.lang.String;
import java.util.Scanner;
public class Exceptions{
	public static void cal(){
		try{
			int a=10,b=0,c;
			c=a/b;
		}catch(ArithmeticException e){
			System.out.println("Divide by zero error");
		}
		try{
			int d[] = new int[5];
			System.out.print(d[10]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index out of bounds");
		}
		try{
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e){
			System.out.println("Null pointer Exception");
		}
		try{
			String s1= "hello";
			int i = Integer.parseInt(s1);
		}
		catch(NumberFormatException e){
			System.out.println(e);
		}
		finally{
			int p=10,q=5;
			System.out.println("division of p/q :"+p/q);
		}
		int a1=18;
		if(a1<20){
			throw new ArithmeticException("throw has worked");
		}
	}
	public static void main(String[] args)  throws Exception{
		cal();
	}
}