package week.day2;

public class Maths {

	public int add(int a,int b) {
		return (a+b);
}
	public int sub(int a,int b) {
		return(a-b);
	}
	
	public int div(int a,int b) {
		return(a/b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths obj1=new Maths();
	     System.out.println(obj1.add(10,5));
	     System.out.println(obj1.sub(10, 5));
	     System.out.println(obj1.div(10, 5));
	     
		

	}

}
