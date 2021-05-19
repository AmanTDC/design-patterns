package bridgePattern;

public class SparseMediaPlayer extends Player{
    SparseMediaPlayer(MediaResource mediaResource) {
        super(mediaResource);
    }

    @Override
    void showDetails() {
        System.out.println(mediaResource.name());
    }
}
