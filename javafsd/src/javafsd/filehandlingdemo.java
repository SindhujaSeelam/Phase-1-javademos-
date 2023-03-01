package javafsd;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class filehandlingdemo {
	public static void main(String[] args) {
		fileInputStreamDemo();		
	}
	static void fileInputStreamDemo() {
		int i;
		File myfile = new File("file.txt");
		try {
			FileInputStream fis= new FileInputStream(myfile);
			System.out.print("File Opened");
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			fis.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
	}

}
	static void fileOutputStream() {
		int i;
		File myfile = new File("file.txt");
		try {
			FileOutputStream fos = new FileOutputStream(myfile);
			System.out.print("File Opened");
			String data="from";
			byte[] dataByteArray=data.getBytes();
			fos.write(dataByteArray);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
	}
	}

}