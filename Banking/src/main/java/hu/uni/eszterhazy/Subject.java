package hu.uni.eszterhazy;

public interface Subject {
    void subscribeObserver(Observer observer);
    void unsubscribeObserver(Observer observer);
<<<<<<< HEAD:src/main/java/hu/uni/eszterhazy/Subject.java
    void notifyObservers();
=======
    void notifyObservers( );
>>>>>>> 8a6938219fe52377adae85d3dcbc4533e83db77b:Banking/src/main/java/hu/uni/eszterhazy/Subject.java
    String getState();


}
