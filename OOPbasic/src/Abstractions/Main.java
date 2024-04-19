package Abstractions;

public class Main {
    public static void main(String[] args) {
        MobileUser mobileUser; // mobileUser is reference

        mobileUser = new Rahim();
        mobileUser.sendMessage();
        mobileUser.call();
        mobileUser = new Karim();
        mobileUser.sendMessage();



    }
}
