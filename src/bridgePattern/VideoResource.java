package bridgePattern;

public class VideoResource implements MediaResource{
    String title;
    String format;
    int quality;
    VideoResource (String title , String format ,int quality ){
        this.title = title;
        this.format = format;
        this.quality = quality;
    }
    @Override
    public String type() {
        return "Video"+" "+format + " " + quality;
    }

    @Override
    public String name() {
        return title;
    }
}
