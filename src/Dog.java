public class Dog implements Animal{
    String name;
    public void eat() {
        System.out.println("Dog eat");
    }

    @Override
    public void sleep() {
        System.out.println("Dog eat");
    }
    Dog(){
        name= "abc";
    }
}
