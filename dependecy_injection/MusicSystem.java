package dependecy_injection;

public class MusicSystem {
    private final MusicService musicService;

    public MusicSystem(MusicService musicService) {
        this.musicService = musicService;
    }

    void playMusic() {
        musicService.playMusic();
    }

    public static void main(String[] args) {
        System.out.println(
                "Playing music with single system which is loosely coupled with the help of dependency injection.");

        MusicSystem fmRadioSystem = new MusicSystem(new FmRadioService());
        fmRadioSystem.playMusic();

        MusicSystem bluetoothSystem = new MusicSystem(new BluetoothService());
        bluetoothSystem.playMusic();

        MusicSystem usbMusicSystem = new MusicSystem(new UsbService());
        usbMusicSystem.playMusic();
    }
}
