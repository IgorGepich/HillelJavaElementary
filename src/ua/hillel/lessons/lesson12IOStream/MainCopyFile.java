package ua.hillel.lessons.lesson12IOStream;

import java.util.List;

public class MainCopyFile {
	public static void main(String[] args) {
		CopyBigFile copyBigFile = new CopyBigFile();
		copyBigFile.copyFileByByte();
		copyBigFile.copyFile();
		copyBigFile.bufferedCopyBigFileBuffered();

		RandomNumber randomNumber = new RandomNumber();
		randomNumber.writeNumberInFile();
		List<Integer> integerList = randomNumber.readNumberFromFile();
		randomNumber.average(integerList);

	}
}
