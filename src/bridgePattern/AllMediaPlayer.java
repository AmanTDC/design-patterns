package bridgePattern;

public class AllMediaPlayer extends Player {
    AllMediaPlayer(MediaResource mediaResource) {
        super(mediaResource);
    }

    @Override
    void showDetails() {
        System.out.println (mediaResource.name()+" "+mediaResource.type());
    }
}
