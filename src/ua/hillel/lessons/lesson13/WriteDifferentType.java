package ua.hillel.lessons.lesson13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class WriteDifferentType {

	//First task
		//* write .bin file
	void writeBinFile(){
		try (DataOutputStream dataOutputStream = new DataOutputStream(
				new FileOutputStream("different_type_data.bin"))){
					dataOutputStream.writeUTF("Hello World");
					dataOutputStream.writeInt(123);
					dataOutputStream.writeDouble(1.2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//Second task
		//* read bin file
	void readBinFile(){
		try (DataInputStream dataInputStream = new DataInputStream(
				new FileInputStream("different_type_data.bin"))){
					String stringValue = dataInputStream.readUTF();
					int intValue = dataInputStream.readInt();
					double doubleValue = dataInputStream.readDouble();
			System.out.println(stringValue + " " + intValue + " " + doubleValue);
				} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//Third task
		//* write collection in .bin file
	void writeStringCollectionInFile(){
		List<String> stringToBin = new ArrayList<>();
		try (DataOutputStream writeStringColl = new DataOutputStream(
				new FileOutputStream("string_collection.bin"))){
			 stringToBin.add("Igor Ivanoff");
			 stringToBin.add("Anastasia Ivanova");
			for (String string : stringToBin){
				writeStringColl.writeUTF(string);
			}
		} catch (IOException e) {
		   e.printStackTrace();
	   }
	}

	void readStringCollectionFromFile(){
		List<String> stringFromBin = new ArrayList<>();
		try (DataInputStream dataInputStream = new DataInputStream(
				new FileInputStream("string_collection.bin"))) {
					while (dataInputStream.available() > 0){
						stringFromBin.add(dataInputStream.readUTF());
					}
			System.out.println(stringFromBin.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
