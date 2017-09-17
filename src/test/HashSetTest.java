package test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");

		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(set);
			
			byte[] object = bos.toByteArray();
					
			ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(object));
			set = (HashSet<String>)ois.readObject();
			
			System.out.println(set + " " + set.size() + " ");
		} catch (IOException e) {

		} catch(ClassNotFoundException e) {
			
		}
	}
}
