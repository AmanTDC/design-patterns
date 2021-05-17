package momentoPattern;

public class Editor {
    private String content;
    private String fontName;
    private int fontSize;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public EditorState createState(){
        return new EditorState(content,fontName,fontSize);
    }
    public void restore(EditorState es){
        content = es.content;
        fontSize=es.fontSize;
        fontName=es.fontName;
    }


}
