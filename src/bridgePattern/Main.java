package bridgePattern;

public class Main {
    public static void main(String[] args) {
        AudioResource audioResource = new AudioResource("Tanhai","mp3");
        AllMediaPlayer allMediaPlayer = new AllMediaPlayer(audioResource);
        allMediaPlayer.showDetails();

        allMediaPlayer = new AllMediaPlayer(new VideoResource("Tanhai","mp4",1080));
        allMediaPlayer.showDetails();
    }
}
