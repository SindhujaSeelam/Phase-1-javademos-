package javafsd;

public class garbagecollection {
public static void main(String[] args) {
	for(int i=1;i<=1000;i++) {
		new House(i);
	}
}
}

class House{
	int id;
	House(int id){
		this.id=id;
		Utils.printmessage("House Created");
	}protected void finalize() throws Throwable{
		System.out.println("House Destroyes "+id);
		}
}