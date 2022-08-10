package week1.day2;

public class Fibbinocci {
 
	public static void main(String[] args) {
		
		int firstNum =0, secNum=1, sum=0;
		System.out.println("fibbinocci for first 11 numbers \n");
		System.out.print(firstNum+"  "+secNum);
	for(int i=secNum+1; i<11; i++)
	{
		sum = firstNum + secNum;
		firstNum=secNum;
	    secNum=sum;
	    System.out.print(" "+sum+" ");
	}
	}
	
}
