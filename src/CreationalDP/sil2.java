package CreationalDP;

import java.util.ArrayList;
import java.util.List;

public class sil2 {
    public static void main(String[] args) {
        //EX:Size verilen ArrayListte 8 (inclusive-dahil) ve 8 den onceki tum elemanlari 2 katina cikariniz

        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(22);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        System.out.println("Listenin ilk hali "+nums);//[12, 7, 21, 8, 9]

        for(int i=0; i<nums.size();i++){
            if(nums.get(i)==8){
                nums.set(i,nums.get(i)*2);
                break;
            }
            nums.set(i,nums.get(i)*2);
        }
        System.out.println("Dersteki cozum ile "+nums);
    }


}
