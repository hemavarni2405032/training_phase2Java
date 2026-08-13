package oops;
import java.util.*;
class shirt{
	int pid;
	String p_name;
	float price;
}
public class classAndObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shirt s=new shirt();
		shirt s1=new shirt();
		s.pid=100;
		s.p_name="formal shirt";
		s.price=1000.00f;
		shirt s2=new shirt();
		System.out.println(s.p_name);
		System.out.println(s.price);
		System.out.println(s.pid);
		s1.pid=101;
		s1.p_name="casual shirt";
		s1.price=1500.00f;
		System.out.println(s1.p_name);
		System.out.println(s1.price);
		System.out.println(s1.pid);
		System.out.println(s2.pid);
		System.out.println(s2.p_name);
		
		

	}

}
