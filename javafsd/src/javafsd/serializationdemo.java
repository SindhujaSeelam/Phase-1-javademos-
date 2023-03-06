package javafsd;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class serializationdemo {

	public static void main(String[] args) {
 SerializationDemoSimplified();
 DeserializationDemo();
	}
	private static void DeserializationDemo() {
		try (FileInputStream fis = new FileInputStreaam("");
		ObjectInputStream ois=new ObjectInputstream(fis);){
		Employee emp=(Employee)ois.readObject();
		System.out.print("Object Deserialized" +emp);
		}catch(FileNotFoundException e) {
			
		}
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