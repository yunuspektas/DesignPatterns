package CreationalDP.SingletonDP.EagerLazy;

public class EagerSingleton {
    // burada yapı EAGER olduğu için , obje , çağırılmadan oluşturulmasını istediğimizden
    // variable static olarak oluşturuldu ve atama yani newleme yapıldı, variable
    // static tanımlandığından , uygulama ayağa kalktığı anda static objeler
    // çağırılmadan otomatik oluştutulur.
        private static final EagerSingleton instance = new EagerSingleton();
        //private HashMap<Object, Object> map;

        private EagerSingleton() {
            //map = new HashMap<Object, Object>();
        }


        public static EagerSingleton getInstance(){
            return instance;
        }

    }
