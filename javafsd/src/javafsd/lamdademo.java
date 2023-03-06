package javafsd;

public class lamdademo {
public static void main(String[] args) {
	int x=10,y=20;
	ICalculator sum = (a,b)->{return a+b;};
	int result =sum.calculate(x,y);
	System.out.println(result);
}
}

interface ICalculator{
	int calculate(int a,int b);
}