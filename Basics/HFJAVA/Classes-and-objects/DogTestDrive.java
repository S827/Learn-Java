class Dog{
	int size;
	String breed;
	String name;
	void bark() {
		System.out.println("Ruff! Ruff!");
	}
}
class DogTestDrive{
	public static void main(String[] args) {
		Dog d = new Dog(); // make a dog object
		d.size = 40;
		d.bark();
	} 
}