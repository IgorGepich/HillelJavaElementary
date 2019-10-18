package ua.hillel.lessons.lesson12IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PrintInFileHelloWorld {
	public void writeInFile(){
		try (PrintWriter writer = new PrintWriter(
				new FileOutputStream("hello.txt"))){
			writer.println("Hello World!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
