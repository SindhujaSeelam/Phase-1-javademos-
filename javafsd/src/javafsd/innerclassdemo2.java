package javafsd;

public class innerclassdemo2 {
	public static void main(String[] args) {
		Car1 car = new Car1("blue");
		car.start();
		Car1.MusicSystem ms = car.new MusicSystem(8);
		ms.displayDetails();
		ms.playSomeMusic();
	}

}
class Car1{
	private static String model="Hyundao I20";
	private String colour;
	void start() {
		System.out.println("Car with "+ colour+"colour");
	}
	Car1(String colour){
		this.colour=colour;
		
	}
	class MusicSystem{
		private int numofchnnels;
		MusicSystem(int num){
			this.numofchnnels=num;
		}
		void displayDetails() {
			System.out.println("Model of the car" + Car1.model);
			System.out.println("The colour of the car :" + Car1.this.colour);
			System.out.println("Number of channels" + this.numofchnnels);
		}
		void playSomeMusic() {
			System.out.println("Playing some Music");
			class Channel{
				int frequency;
				void getCurrentPalyingSong() {
					System.out.println("Displayig current playing song");
				}
				
			}
			Channel channel = new Channel();
			channel.getCurrentPalyingSong();
		}
	}
}
