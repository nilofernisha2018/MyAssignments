package week1.day1;

public class Fibbinocci {
	
public static void main(String[] args) {
	int firstNum=0;
	int secondNum=1;
	int sum;
	
	System.out.println("Fibbinocci first number is"+0);
	
	for(int i=0;i<=11;i++) {
		sum=firstNum+secondNum;
		 firstNum=secondNum;
		 secondNum=sum;
		 System.out.println("Fibbinocci series is"+sum);
		
	}

}
}