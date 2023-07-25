package dependecy_injection;

public class FmRadioService implements MusicService {
    @Override
    public void playMusic() {
        System.out.println("Playing FM radio...");
    }
}
