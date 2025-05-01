interface PhoneCall {
    void makeCall(String number);
    void receiveCall();
}

interface MusicPlayer {
    void playMusic(String song);
    void stopMusic();
}

interface Camera {
    void takePhoto();
    void recordVideo();
}

class Smartphone implements PhoneCall, MusicPlayer, Camera {
    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving incoming call");
    }

    @Override
    public void playMusic(String song) {
        System.out.println("Playing: " + song);
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stopped");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        
        // Phone functionality
        phone.makeCall("123-456-7890");
        phone.receiveCall();
        
        // Music functionality
        phone.playMusic("Favorite Song");
        phone.stopMusic();
        
        // Camera functionality
        phone.takePhoto();
        phone.recordVideo();
    }
}