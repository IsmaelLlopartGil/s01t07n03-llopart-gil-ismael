package s01t07n03_llopart_gil_ismael;

import java.io.Serializable;

@SerializableJSON(path="src//main//resources//")
public class Person implements Serializable {

	private static final long serialVersionUID = 4236621737041330656L;
	private String name;
	private String lastName;
	private int edat;

	public Person(String name, String lastName, int edat) {
		this.name = name;
		this.lastName = lastName;
		this.edat = edat;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public int getEdat() {
		return edat;
	}

	@Override
	public String toString() {

		return String.format("%-12s", name) + String.format("%-20s", lastName) + String.format("%-6s", edat);
	}

}
