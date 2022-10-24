package StructuralDP.AdapterDP;
// yurt dışı telefon sarj aletlerini kullanırken yaşanan sorun
//2. arbanız var ama tren raylarında götürmek istiyorsunuz

// Aşağıdaki senaryo : Boot projesi yapıyorsunuz, ilk tasarımda id field ı ile
//  sorgu yapılıyor ama daha sonraki geliştirme ile email ile sorgu tasarlanması
//  ,isteniyor ve bu gelişme yapılırken eski şekilde girişlerde devam etsin istiyorsanız
//  Adapter DP bu sorunu çözüyor, ADAPTÖR gibi düşünülebilir
//  BIRBIRIYLE UYUMLU OLMAYAN 2 SİSTEMİN UYUMLU HALE GELMESİNİ SAĞLIYOR
public class Adapter {
    class OldUser{  // eski sistem, id ile giriş
        int id;
        String username;
        String name;
        String lastname;
    }

    interface OldUserService{ // eski sistemin Service katmanı
        // id üzerinden sorgu yapılıyor
        OldUser getUser(int id);
    }

    class User{ // yeni sistem , email ile sorgu yapılacak
        int id;
        String email;
        String username;
        String name;
        String lastname;
        String location;
        Boolean isActive;
    }

    interface UserRepository{ // yeni sistem REPO
        User getUser(String email);
    }

    interface UserService { // yeni sistem Service
        User getUser(String email);
    }

    class UserServiceAdapter implements UserService {
// yeni sistem uyumlu ServiseAdaptörü
        UserRepository userRepository; // yeni Repo
        OldUserService oldUserService; // eski service
// eski sisttemde kalan kullanıcıda email bilgisi olmadığı için
        // id üzerinden bulunması gerekiyor, bunu içinde eski sistemin
// Servis katmanı kullanılarak, yeni sisteme adapte ediliyor
        @Override
        public User getUser(String email) {
            User user = userRepository.getUser(email);
            OldUser oldUser = oldUserService.getUser(user.id);
            user.username = oldUser.username;
            user.lastname = oldUser.lastname;
            return user;
        }
    } // UserServiceAdapter sonu

    public void adapterDemo(){ // main için gerekli method
        UserService userService = new UserServiceAdapter();
        User user = userService.getUser("email@email.com");
        System.out.println(user);
    } // adapterDemo Sonu
// main
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.adapterDemo();
    } // main classı sonu

}
