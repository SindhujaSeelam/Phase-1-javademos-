package javafsd;

public class MultipleInheritancedemo {
	public static void main(String[] args) {	
Desktop d = new Desktop();
d.poweron();
}}
class  Desktop implements Tv,Monitor{
	@Override
	public void poweron() {
		Tv.super.poweron();
		Monitor.super.poweron();
	}
}
interface Tv{
	public default void poweron() {
		System.out.println("Tv is starting");
	}
}
interface Monitor{
	public default void poweron() {
		System.out.println("Monitor is starting");
	}
}