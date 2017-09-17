package test;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {

		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(100);
		set.add(200);
		set.add(3000);
		set.add(44333);
		set.add(3443543);
		set.add(5323);
		set.add(356);
		set.add(576587);
		set.add(2321);
		set.add(436457);
		set.add(546457);
		System.out.println(set);

		// [100, 200, 3000, 44333, 3443543, 5323, 356, 576587, 2321, 436457,
		// 546457]

		LinkedHashMap<Integer, Object> map = new LinkedHashMap<Integer, Object>(20, .75f, true);
		map.put(100, null);
		map.put(200, null);
		map.put(3000, null);
		map.put(44333, null);
		map.put(3443543, null);
		map.put(5323, null);
		map.put(356, null);
		map.put(576587, null);
		map.put(2321, null);
		map.put(436457, null);
		map.put(546457, null);
		System.out.println(map);
		// {100=null, 200=null, 3000=null, 44333=null, 3443543=null, 5323=null,
		// 356=null, 576587=null, 2321=null, 436457=null, 546457=null}

		LinkedHashMap<Person, Object> persons = new LinkedHashMap<Person, Object>(20, .75f, true);
		persons.put(new Person(101), null);
		persons.put(new Person(200), null);
		persons.put(new Person(3000), null);
		persons.put(new Person(44333), null);
		persons.put(new Person(3443543), null);
		persons.put(new Person(5323), null);
		persons.put(new Person(356), null);
		persons.put(new Person(576584), null);
		persons.put(new Person(2325), null);
		persons.put(new Person(436458), null);
		persons.put(new Person(546457), null);
		persons.get(new Person(200));
		persons.get(new Person(3000));
		for(Person p : persons.keySet()) {
			System.out.println(p);
		}
		System.out.println("First entry: " + persons.remove(null));
	}
}

class Person {

	int rollNo;

	Person(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public int hashCode() {

		return this.rollNo % 2;
	}

	@Override
	public boolean equals(Object object) {

		if (object == null)
			return false;
		if (!(object instanceof Person))
			return false;
		Person p = (Person) object;
		if (p.rollNo == this.rollNo)
			return true;
		else
			return false;

	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Person [rollNo=" + rollNo + "]";
	}

}
