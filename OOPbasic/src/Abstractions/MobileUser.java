package Abstractions;

public abstract class MobileUser {

    void call(){  // non abstract
        System.out.println("Call Method");
    }
    abstract void sendMessage();

}
