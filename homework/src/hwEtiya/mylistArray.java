package hwEtiya;

public class mylistArray {
	String[] cityArray;
	int size;
	int initialCapacity;

	private static final int DEFAULT_CAPACITY = 10;

	public mylistArray() {
		this.initialCapacity = DEFAULT_CAPACITY;
		cityArray = new String[DEFAULT_CAPACITY];
	}

	public mylistArray(String[] cityArray, int initialCapacity) {
		this.initialCapacity = initialCapacity;
		cityArray = new String[initialCapacity];
	}

	public void add(String city) {

		if (size == initialCapacity) {
			size();
		}

		cityArray[size] = city;
		size++;

	}

	public void delete(int index) {

		for (int j = index; j < size - 1; j++) {
			cityArray[j] = cityArray[j + 1];
		}
		size--;
	}

	public int size() {
		return this.size;
	}

	public boolean contains(String city) {

		for (int i = 0; i < size - 1; i++) {
			if (city.equals(cityArray[i])) {
				return true;
			}
		}

		return false;
	}

	public void list() {
		for (String string : cityArray) {
			System.out.println(string);
		}
	}

}
