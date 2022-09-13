package oops;

public class Emp {
	private int id;
	private java.lang.String name;

	public Emp() {
	}

	public Emp(int id, java.lang.String name) {
		super(); // always the first statement inside a constructor
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	@Override
	public java.lang.String toString() {
		return "Emp Details [ id  : " + this.id + ", name : " + this.name + "]";
	}
}