package BehavioralDP.MediatorDP;

import java.util.HashMap;
import java.util.Map;

// mesaj dağıtım işini yapan class, Yönlendirme işini yapan
class MessageDispatcher implements Dispatcher{
    Map<String, Actor> registeredActors = new HashMap<>();

    void register(String topic, Actor actor){
        registeredActors.put(topic, actor);
    }

    @Override
    public void dispatch(String topic, String message) {
        Actor actor = registeredActors.get(topic);
        // önce aktör var mı kontrol ediliyor
        //daha sonra da mesaj gönderiliyor
        if(actor == null){
            System.out.println("No actor registered for this topic");
        }else{
            actor.receiveMessage(message);
        }
    }
}