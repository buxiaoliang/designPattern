package adapter;

/**
 * Created by bu on 11/15/2016.
 * Adapter pattern works as a bridge between two incompatible interfaces
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
