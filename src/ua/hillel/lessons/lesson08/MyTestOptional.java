package ua.hillel.lessons.lesson08;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Supplier;

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

	public String toString(){
		return get().toString();
	}

	public int hashCode(){
		return Objects.hashCode(value);
	}

	public boolean equals(Object value) {
		if (this == value) {
			return true;
		}
		if (!(value instanceof MyTestOptional)) {
			return false;
		}
		MyTestOptional<?> other = (MyTestOptional<?>) value;
		return Objects.equals(value, other.value);
	}

	public Type orElseGet(Supplier<? extends Type> otherValue){
		return value;
	}

	public void ifPresent(MyTestOptional<? super Type>myTestOptional){

	}


}
