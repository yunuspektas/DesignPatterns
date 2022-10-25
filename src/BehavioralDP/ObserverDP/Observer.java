package BehavioralDP.ObserverDP;


public class Observer {

    void observerDemo(){
        Channel channel1 = new NewsChannel();
        Channel channel2 = new NewsChannel();
        Channel channel3 = new NewsChannel();

        NewsAgency agency = new NewsAgency();
        agency.addObserver(channel1);
        agency.addObserver(channel2);
        agency.addObserver(channel3);

        agency.setNews("news 1");
        agency.setNews("news 2");
        agency.setNews("news 3");

        System.out.println("channel1 NEWS");
        channel1.printNews();
        System.out.println("*************");
        System.out.println("channel2 NEWS");
        channel2.printNews();
        System.out.println("channel3 NEWS");
        System.out.println("*************");
        channel3.printNews();
    }

    public static void main(String[] args) {
        Observer observer = new Observer();
        observer.observerDemo();
    }
}
