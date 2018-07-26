package janani;
import java.util.Scanner;
public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b;
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
a=ja.nextInt();
b=ja.nextInt();
a=a^b;
b=a^b;
a=a^b;
System.out.println(a+" "+b);
	}

}
