package javafsd;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class serializationdemo {

	public static void main(String[] args) {
		Employee e1= new Employee(1,"Mark",10000,"AA343");
		System.out.print(e1);
	}

}

class Employee implements Serializable{
	int id;
	String name;
	double salary;
	String aadharno;
	Employee(int id,String name,double salary,String aadharno){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.aadharno=aadharno;
	}
@Override
public String toString() {
	return this.id + " " + this.name + " " + this.salary + " "+ this.aadharno;
}
}