package CreationalDP.SingletonDP.EagerLazy;

public class ItemTest {
    public static void main(String[] args) {
        DefineSingleton ds = DefineSingleton.getInstance();
        DefineSingleton ds2 = DefineSingleton.getInstance();

        EagerSingleton es = EagerSingleton.getInstance();
        EagerSingleton es2 = EagerSingleton.getInstance();

        LazySingleton ls = LazySingleton.getInstance();
        LazySingleton ls2 = LazySingleton.getInstance();


       // oluşturulan objelerin aynı olup olmadığını anlamak için
        //hashCode() kullanıldı
        System.out.println("ds = " + ds.hashCode());
        System.out.println("ds2 = " + ds2.hashCode());
        System.out.println("********************");
        System.out.println("es = " + es.hashCode());
        System.out.println("es2 = " + es2.hashCode());
        System.out.println("********************");
        System.out.println("ls2 = " + ls2.hashCode());
        System.out.println("ls2 = " + ls2.hashCode());

        // aralarındaki tek fark LAzy olan threadSafe değildir..


    }

}
