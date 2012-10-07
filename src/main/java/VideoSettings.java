import javax.print.attribute.ResolutionSyntax;

/**
 * Created with IntelliJ IDEA.
 * User: Kolipass
 * Date: 07.10.12
 * Time: 21:32
 * This is a video settings parems
 */
public class VideoSettings {
    //I do not know, there may need another entity, or any thread standard
    private int screenWidth = 800;
    private int screenHeight = 600;
    //Max fps?
    private int  bpp=24;

    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }

    public int getBpp() {
        return bpp;
    }

    public void setBpp(int bpp) {
        this.bpp = bpp;
    }
}
