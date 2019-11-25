package ua.hillel.lessons.lesson12IOStream;

import java.io.*;
import java.time.Duration;
import java.time.Instant;

class CopyBigFile {

	File inputFilePath = new File("baroIcon.jpg");
	File outputFilePath = new File("new_baro_Icon.jpg");
	/**
	 * File is located on local disk. file size = 4 Gb.
	 */
	void copyFileByByte(){
		long startTime = System.nanoTime();
		Instant startMeasurement = Instant.now();
		try(InputStream inputStream = new FileInputStream("Sing.m4v");
			OutputStream outputStream = new FileOutputStream("SingCopyByByte.m4v")) {
			while (inputStream.available() > 0){
				int readFile = inputStream.read();
				if(readFile == -1){
					break;
				}
				outputStream.write(readFile);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Operation time measurement.
		long finishTime = System.nanoTime() - startTime;
		Instant finishMeasurement = Instant.now();
		System.out.println("Time full copy: " + Duration.between(startMeasurement, finishMeasurement).toMillis());
		System.out.println("Time: " + finishTime/1000);
	}

	/**
	 * Buffer 4096 byte
	 */

	//	WORKING ON MISTAKES
	void copyFile(){
		long startTime = System.nanoTime();
		Instant startMeasurement = Instant.now();
		try(InputStream inputStream = new FileInputStream(inputFilePath);
			OutputStream outputStream = new FileOutputStream(outputFilePath)) {
			int test;
			byte[] chunk = new byte[4096];
			while ((test = inputStream.read(chunk)) != -1){
				outputStream.write(chunk, 0, test);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(inputFilePath.length() + " input" );
		System.out.println(outputFilePath.length() + " output");
		System.out.println(outputFilePath.getAbsolutePath());

		// Operation time measurement.
		long finishTime = System.nanoTime() - startTime;
		Instant finishMeasurement = Instant.now();
		System.out.println("Buffer 4096 byte: " + Duration.between(startMeasurement, finishMeasurement).toMillis());
		System.out.println("Time: " + finishTime/1000);
	}

	/**
	 * Buffered Stream
	 */
	void bufferedCopyBigFileBuffered() {
		try(BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
				new FileOutputStream("SingBufferedCopy.m4v"));
				BufferedInputStream bufferedInputStream =
				new BufferedInputStream(new FileInputStream("Sing.m4v")))
		{
			int value;
			byte [] chung = new byte[1024];
			while ((value = bufferedInputStream.read(chung)) != -1) {
				bufferedOutputStream.write(chung, 0, value);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
