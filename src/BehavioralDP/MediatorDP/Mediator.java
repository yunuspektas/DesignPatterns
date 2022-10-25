package BehavioralDP.MediatorDP;

// santralde 4 kişi çalışıyor, biri ARGE, diğeri Satış,
//diğeri Finans, diğeri IK
// buralara mesaj geldiği zaman ara bir yapı yönlendirmeyi
// otomatik olarak yapıyor
// burada amaç aktörler birbirlerini bilmeden bir
// aracı santral vasıtası ile iletişime geçebilmeleri
public class Mediator {
    void mediatorDemo(){
        MessageDispatcher dispatcher = new MessageDispatcher();
       // topic 2 ye mesajı göndereren kişi alıcısının actor2 olduğunu
        // bilmesine gerek yok, onun için önemli olan bu mesajı
        // göndermiş olması, bunu şöyle örneklendirelim siz yardım hattını
        // arayınca karsınıza kimin çıktığının önemi yok gibi...
        Actor actor1 = new MessageActor("Actor 1", dispatcher);
        Actor actor2 = new MessageActor("Actor 2", dispatcher);
        Actor actor3 = new MessageActor("Actor 3", dispatcher);
        Actor actor4 = new MessageActor("Actor 4", dispatcher);

        dispatcher.register("topic1", actor1);
        dispatcher.register("topic2", actor2);
        dispatcher.register("topic3", actor3);
        dispatcher.register("topic4", actor4);

        actor1.sendMessage("topic2", "Message for topic 2");
        actor1.sendMessage("topic3", "Message for topic 3");
        actor1.sendMessage("topic4", "Message for topic 4");

        actor2.sendMessage("topic1", "Message for topic 1");
        // topic 5 olmadığı için bu mesajın düşürüldüğünü göreceğiz
        actor2.sendMessage("topic5", "Message for topic 5");
    }

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        mediator.mediatorDemo();
    }
}
