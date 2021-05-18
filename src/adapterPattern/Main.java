package adapterPattern;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer= new AudioPlayer("mp3");
        for (String s : Arrays.asList("mp4", "vlc")) {
            audioPlayer.play();
            audioPlayer = new AudioPlayer(s);
        }
        audioPlayer.play();
    }
}
