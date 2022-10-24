package CreationalDP;

import java.util.ArrayList;
import java.util.List;

public class sil {
    /*
          Check if all elements are unique in an integer List by using loops.
        */
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(23);
        int count = 0;
        for (int w : myList){
            for (int k : myList){
                if (w==k){
                    count++;
                    System.out.println("w : "+ w);
                    System.out.println("k : "+ k);
                    System.out.println("count : "+count);
                }
            }
        }
        if (count==myList.size()){
            System.out.println("There is no repeated element");
        } else {
            System.out.println("At least one element was repeated");
        }
    }












}
