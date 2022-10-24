package CreationalDP.BuilderDP;

import java.sql.SQLOutput;

public class BuilderRun {
    public static void main(String[] args) {
        // BU UZUN ÇÖZÜM VE TAVSİYE EDİLMİYOR, 40 PARAMETRELİ BİR SINIF İÇİN
        // 35 TANESİ GEREKLİ OLACAKİSE, 35 TANE SET METODU YAZMAM GEREKECEK
        Product product1 = new Product();
        product1.setId(12L);
        product1.setDescription("Description");
        product1.setName("Name");
        product1.setPrice(100);

        Product product2 = new Product.ProductBuilder()
                .id(12L)
                .name("Name")
                .description("Description")
                .price(100)
                .build();


        System.out.println("**********  Product 1  ************* ");
        System.out.println(product1);
        System.out.println("");
        System.out.println("**********  Product 2  ************* ");
        System.out.println(product2);


    }
}
