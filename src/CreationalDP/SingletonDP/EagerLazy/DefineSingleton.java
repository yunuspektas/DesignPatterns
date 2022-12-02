package CreationalDP.SingletonDP.EagerLazy;

public class DefineSingleton {
    public static DefineSingleton ds = new DefineSingleton();

    private DefineSingleton() {
        // TODO Auto-generated constructor stub
    }

   // Static Factory Method ile Singleton yapı sağlandı
    public static DefineSingleton getInstance()
    {
        return ds;
    }

}
