package BehavioralDP.MediatorDP;

// dağitim işini yapıyor
public interface Dispatcher{
    void dispatch(String topic, String message);
}
