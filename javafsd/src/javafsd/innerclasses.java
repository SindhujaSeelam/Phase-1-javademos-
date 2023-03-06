package javafsd;

public class innerclasses {
	public static void main(String[] args) {
		ElectronicDevice.poweron();
		ElectronicDevice.Chip.brandname();
		ElectronicDevice.Chip chip = new ElectronicDevice.Chip();
		chip.specs();
		ElectronicDevice laptop = new ElectronicDevice();
		laptop.poweron();
		ElectronicDevice.Processor proc = laptop.new Processor();
		proc.getVoltage();
		ElectronicDevice.Processor.displayProcBrand();
	}
    
}

class ElectronicDevice{
	static void poweron() {
		System.out.println("Device powered on");
	}
	static class Chip{
		static void brandname() {
			System.out.println("Current Flow..");
		}
		void specs() {
			System.out.println("Specifications for this chip...");
		}
	}
	class Processor{
		void getVoltage() {
			System.out.println("Display voltage on the processor...");
		}
		static void displayProcBrand() {
			System.out.println("Processor Brand...");
		}
	}
}