package StructuralDP.ProxyDP;
/* Aşağıdaki örnek uygulamamızın senaryosu resim gösterimi
üzerine olsun. Gerçekte gösterilecek resimler büyük boyutta
olsun ve kullanıcıya resmi gösterirken ilk sefer hariç,
resimler yüklenirken geçen zamanı save edebilmek için proxy
class yazalım. Tabi ki kodlarımızın uzamaması için sadece
konsol ekranına yazı yazdıracağız.
 */
public interface ImageGenerator {

    void showImage();
}
