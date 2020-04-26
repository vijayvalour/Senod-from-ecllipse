package maccess;
import java.util.Scanner;
import p1.IArthematic;
import p2.*;
public class Mainclass{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter v1");
		int v1 = Integer.parseInt(s.nextLine());
		System.out.println("enter v2");
		int v2 = Integer.parseInt(s.nextLine());
		System.out.println("enter choice");
		System.out.println("1.addition\n2.subtraction\n3.multiplication");
		int choice = Integer.parseInt(s.nextLine());
		switch(choice)
		{
		case 1 :
			IArthematic b1 = new Addition() :: add ;
			b1.cal(v1,v2);
			break;
		case 2 :
			IArthematic b2 = new Subtraction() :: sub ;
			b2.cal(v1,v2);
			break;
		case 3 :
			IArthematic b3 = new Multiplication() :: mul ;
			b3.cal(v1,v2);
			break;
			default :
			System.out.println("invalid choice");
		}
		s.close();
		}
		
	}
