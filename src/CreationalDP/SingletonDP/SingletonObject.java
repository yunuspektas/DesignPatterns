package CreationalDP.SingletonDP;

public class SingletonObject {
    String message ="Merhaba";
    // oluşacak instance static oluşturuldu çünki sadece 1 adet üretilecek
    private static SingletonObject instance = new SingletonObject();
    // constructor ı private yaparak bu sınıfın çağırılamamasını sağlıyorum
    private SingletonObject(){};

// obje oluşmadan method çağırılabilsin diye static tanımlandı.
    public static SingletonObject getInstance(){

        return instance;
    }

    public void showMessage(){
        this.message = this.message+ " Batch 82-83";
        System.out.println(this.message );
    }
}
