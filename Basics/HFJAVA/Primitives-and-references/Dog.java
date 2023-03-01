

public class Dog{
    String name;
    public static void main(String[] args) {
                // make a dog object and access it
        Dog dog1 = new Dog();
        dog1.name = "dogya";
        dog1.bark();
        

        // now make a dog array
        Dog[] myDogs = new Dog[3];
        // put some dogs in it
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        // now access the dogs usinf the array references
        myDogs[0].name = "pumpkin";
        myDogs[1].name = "lola";
        // what's myDogs[2] name
        System.out.print("last dog's name is ");
        System.out.println(myDogs[2].name);

        System.out.println(myDogs.length);
        // loop through the array and tell dogs to bark
        int x = 0;
        while(x < myDogs.length){
            myDogs[x].bark();
            x += 1;
        }
    }
    public void bark(){
        System.out.println(name + " says woof!");
    }
}

