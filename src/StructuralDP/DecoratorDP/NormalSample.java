package StructuralDP.DecoratorDP;

public class NormalSample {
    //TODO  ************** iphone11 ***********
    public static class Iphone11 {
        public String name(){
            return "Iphone 11"; //100x100
        }

        int getCameraCount() {
            return 2;
        }
    }
    //TODO ************** iphone11 PRO ***********
    public static class Iphone11Pro {

        public String name(){
            return "Iphone 11 Pro"; //120x120
        }

        int getCameraCount() {
            return 3;
        }
    }
    //TODO ************** iphone11 PRO MAX***********
    public static class Iphone11ProMax {

        public String name(){
            return "Iphone 11 Pro Max"; //150x150
        }

        int getCameraCount() {
            return 3;
        }
    }
}
