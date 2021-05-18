package adapterPattern;

public class AudioPlayer implements MediaPlayer{
    String songType;
    AudioPlayer(String songType){
        this.songType = songType;
    }
    public void play() {
        if(songType.equalsIgnoreCase("mp3"))
            System.out.println("Playing audio mp3");
        else if(songType.equalsIgnoreCase("mp4"))
            new MediaApapter().playMp4();
        else if(songType.equalsIgnoreCase("vlc"))
            new MediaApapter().playVlc();
    }
}
