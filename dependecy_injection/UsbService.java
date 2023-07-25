package dependecy_injection;

public class UsbService implements MusicService {
    @Override
    public void playMusic() {
        System.out.println("Playing music via USB...");
    }
}
