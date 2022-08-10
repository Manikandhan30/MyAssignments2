package week1.day2;

public class Calculator {

	  int add, sub;
	  double mul;
	  float div;
	  int add (int num1,int num2,int num3) {
		  add= num1+num2+num3;
		  return add;
	  }
	  int sub (int num1,int num2) {
		  sub=num1-num2;
		  return sub;
	  }
	  double mul (double num1,double num2) {
		  mul= num1*num2;
		  return mul;
	  }
	  float div (int num1, int num2) {
		  div = num1/num2;
		  return div;
	  }
}
    class MyCalculator  {
    		public static void main(String[] args) {
				Calculator obj =new Calculator();
				System.out.println("add" +obj.add(10,5,5));
			    System.out.println("sub" +obj.sub(10,5));
			    System.out.println("mul"+obj.mul(10,5));
			    System.out.println("div" +obj.div(10,2));    
    		}
    }