package com.in28minutes.java.object;

class Client {
	private int id;

	public Client(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (id != other.id)
			return false;
		return true;
	}

}

public class EqualsHashCodeExamples {

	public static void main(String[] args) {

		// == comparison operator checks if the object references are pointing
		// to the same object. It does NOT look at the content of the object.
		Client client1 = new Client(25);
		Client client2 = new Client(25);
		Client client3 = client1;

		System.out.println(client1==client2);// false
		System.out.println(client1==(client3));// true

		System.out.println(client1.equals(client2));// true
		System.out.println(client1.equals(client3));// true


		int var1=5;
		int var2=5;
		System.out.println(var1==var2);// true



		String str1="SampleString";
		System.out.println("String 1 is "+str1);

		//Hashcode will be same for object of multiple instances.. It wont change.
		for (int i=0 ; i<10 ;i++)
			System.out.println("String hashcode is "+str1.hashCode());

		System.out.println("String hashcode is "+str1.getBytes());
	}
}
