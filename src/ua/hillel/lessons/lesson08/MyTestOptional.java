package ua.hillel.lessons.lesson08;

import java.util.NoSuchElementException;

public class MyTestOptional<Type> {

	private Type value;

	public MyTestOptional(Type value) {
		this.value = value;
	}

	public boolean isPresent(){
		if(value != null) {
			return true;
		}
		else return false;
	}

	public Type get() {
		if(value == null){
			throw new NoSuchElementException();
		}
		return value;
	}

	public static <Type>MyTestOptional<Type> of (Type value){
		if(value == null){
			throw new NullPointerException();
		}
		return new MyTestOptional <> (value);
	}

	public static <Type> MyTestOptional<Type> ofNullble (Type value){
		if(value != null)
		return new MyTestOptional <> (value);
		else return new MyTestOptional<>(null);
	}

	public static <Type>MyTestOptional<Type> empty(){
		return new MyTestOptional<>(null);
	}

	public Type orElse(Type anotherValue){
		if(!isPresent()){
			return anotherValue;
		}
		else return this.value;
	}

	public int hashCode(){
		return hashCode();
	}


}
