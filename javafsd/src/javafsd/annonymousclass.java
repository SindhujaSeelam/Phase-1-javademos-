package javafsd;

public class annonymousclass {
	public static void main(String[] args) {
		
printer p=new printer();
p.getprintercon();
}
}

class printer{
	void getprintercon() {
		connection con = new connection() {
			public void getconnection() {
				System.out.println("Annonymous class");
			}
		};
		con.getconnection();
	}
}

interface connection{
	void getconnection();
}
