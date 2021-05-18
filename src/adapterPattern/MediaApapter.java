package adapterPattern;

public class MediaApapter implements AdvancedMediaPlayer{
    @Override
    public void playMp4() {
        System.out.println("Playing MP4");
    }

    @Override
    public void playVlc() {
        System.out.println("Playing VLC");
    }
}
