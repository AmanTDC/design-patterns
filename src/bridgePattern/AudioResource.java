package bridgePattern;

public class AudioResource implements MediaResource{
    String format;
    String title;
    AudioResource(String title , String format){
        this.title = title;
        this.format = format;
    }
    @Override
    public String type() {
        return "audio" + " " +this.format;
    }

    @Override
    public String name() {
        return title;
    }
}
