import exceptional.ExceptionalHandlingEx;

public class NewTryClass {

    public static void main(String[] args) throws Exception {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }

        Animal animal = new Cat();
        animal.sleep();

        Dog dog = new Dog();
        dog.eat();
        System.out.println(dog.name);


        ExceptionalHandlingEx ex = new ExceptionalHandlingEx();
        ex.testMygame();
    }
}
