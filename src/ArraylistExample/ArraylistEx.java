package ArraylistExample;

import java.util.ArrayList;

public class ArraylistEx {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ashish");
        names.add("Delta");

//        System.out.println(names.get(0));
        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
            names.set(i, "abc");
        }

        for(String name: names){
            System.out.println(name+ name.charAt(0)+name.length());
            name = "anc";
        }

        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.set(0, 12);
        for (Integer number: numbers ){
            System.out.println(number);
        }


    }
}
