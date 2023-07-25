package dependecy_injection;

public class BluetoothService implements MusicService {
    @Override
    public void playMusic() {
        System.out.println("Playing music from bluetooth...");
    }
}
