package ua.hillel.lessons.lesson12IOStream;

import java.io.*;
import java.time.Duration;
import java.time.Instant;

class CopyBigFile {
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
		long startTime = System.nanoTime();
		Instant start = Instant.now();
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
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		// Operation time measurement.
		long finishTime = System.nanoTime() - startTime;
		Instant finish = Instant.now();
		System.out.println("Time 1: " + Duration.between(start, finish).toMillis());
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
