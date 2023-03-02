public class DogTest {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.size = 18;
        Dog two = new Dog();
        two.size = 8;
        Dog three = new Dog();
        three.size = 61;
        one.bark();
        two.bark();
        three.bark();
    }
}
class Dog{
    int size; 
    String name;
    void bark(){
        if(size > 60){
            System.out.println("Woof! Woof!");
        } else if(size > 14){
            System.out.println("Riff! Ruff!");
        } else{
            System.out.println("Yip! Yip!");
        }
    }
}
