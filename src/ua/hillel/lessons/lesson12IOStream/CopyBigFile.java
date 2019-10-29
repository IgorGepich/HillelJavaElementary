package ua.hillel.lessons.lesson12IOStream;

import java.io.*;

public class CopyBigFile {
	/**
	 * File is located on local disk. file size = 4 Gb.
	 */
	void copyFileByByte(){
		long startTime = System.currentTimeMillis();
		try(InputStream inputStream = new FileInputStream("Sing.m4v");
			OutputStream outputStream = new FileOutputStream("SingCopyByByte.m4v")) {
			while (inputStream.available() > 0){
				int readFile = inputStream.read();
				if(readFile == -1){
					break;
				}
				outputStream.write(readFile);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Operation time measurement.
		long finishTime = System.currentTimeMillis() - startTime;
			System.out.println("Time: " + finishTime/1000);
	}

	/**
	 * Buffer 4096 byte
	 */
	void copyFile(){
		long startTime = System.currentTimeMillis();
		try(InputStream inputStream = new FileInputStream("Sing.m4v");
			OutputStream outputStream = new FileOutputStream("SingCopy.m4v")) {
			byte[] chunk = new byte[4096];
			while (inputStream.available() > 0){
				int readFile = inputStream.read(chunk);
				if(readFile <= 0){
					break;
				}
				outputStream.write(chunk);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Operation time measurement.
		long finishTime = System.currentTimeMillis() - startTime;
		System.out.println("Time: " + finishTime/1000);
	}

	/**
	 * Buffered Stream
	 */
	void bufferedRead() throws FileNotFoundException {
		try(BufferedInputStream bufferedInputStream = new BufferedInputStream(
				new FileInputStream("Sing.m4v"))){
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	void bufferedWrite() throws FileNotFoundException {
		try(BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
				new FileOutputStream("SingBufferedCopy.m4v"))){
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
