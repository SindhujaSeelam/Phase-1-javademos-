package javafsd;

public class polymorphismdemo {

	public static void main(String[] args) {
	compiletime c = new compiletime();
	c.add(10,20);
	c.add(1.2f,8.2f);
	c.add("Hi", "Good Morning");
	
	}

}
class compiletime{
	public void add(int a,int b) {
		int result=a+b;
		System.out.println("Addition of 2 Integers "+ result);
	}
	public void add(float a,float b) {
		float result=a+b;
		System.out.println("Addition of 2 Float numbers " + result);
	}
	public void add(String a,String b) {
		String result=a+b;
		System.out.println("Addition of 2 Strings " + result);
	}
}
