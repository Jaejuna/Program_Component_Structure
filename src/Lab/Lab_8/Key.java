package Lab.Lab_8;

public class Key {
	
	private int id;
	
	/** */
	public Key(int i) {
		id = i;
	}
	
	/** */
	public boolean equals(Key k) {
		return id == k.id();
	}
	
	/** */
	public int id() {
		return id;
	}

}



