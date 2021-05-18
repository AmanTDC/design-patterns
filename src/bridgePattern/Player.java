package bridgePattern;

public abstract class Player {
    MediaResource mediaResource;
    Player(MediaResource mediaResource){
        this.mediaResource = mediaResource;
    }
    abstract void showDetails();
}
