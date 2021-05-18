package adapterPattern;

public class AudioPlayer implements MediaPlayer{
    @Override
    public void play() {
        System.out.print("Playing audio mp3");
    }
}
