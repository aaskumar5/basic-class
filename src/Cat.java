public class Cat implements Animal{
    public void eat(){
        System.out.println("Cat eat");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleep");
    }

}
