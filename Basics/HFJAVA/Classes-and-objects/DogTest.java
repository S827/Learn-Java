class Dog {
	int size;
	String breed;
	String name;
	
	void bark(){
		System.out.println("Woof! Woof!");
	}
}
class DogTest {
	public static void main(String[] args){
		Dog d = new Dog();
		d.size = 30;
		d.bark();
	}
}