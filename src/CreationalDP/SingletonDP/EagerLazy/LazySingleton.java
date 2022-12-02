package CreationalDP.SingletonDP.EagerLazy;

public class LazySingleton {
    // burada yapı lAZY olduğu için , obje , çağırılmadan oluşturulmasını istemediğimizden
    // variable static olarak oluşturuldu ama tama yani newleme yapılmadı,
    // new leme işlemi cağırılgığı anda aşağıdaki getInstance() methodu aracılığı ile yapılacak
    private static LazySingleton instance;
     // private HashMap<Object, Object> map;

    private LazySingleton()
    {
       // map = new HashMap<Object, Object>();
    }

    // Static Factory Mthod kullanılarak Singleton yapı kuruldu.
        //if bloğu ile, eğer daha önce nesne oluştuysa onu gönder, ilk
        // defa oluşacak ise de yukardaki static method üzerinden obje
        // oluşturuluyor
    public static LazySingleton getInstance(){
        if(instance == null)
        {
            instance = new LazySingleton();
        }
        return instance;
    }
}
