import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Kolipass
 * Date: 07.10.12
 * Time: 21:32
 * This is a video settings params
 */
public class VideoSettings implements SettingModel {
    //I do not know, there may need another entity, or any thread standard
    private int screenWidth = 800;
    private int screenHeight = 600;
    //Max fps
    private int bpp = 24;
    private static final String  tag ="Video";

    public VideoSettings() {

    }

    public VideoSettings(String settingFileName) {
        try {
            getSettingsFromFile(settingFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public SettingModel getSettingsFromFile(String settingFileName) throws IOException {
        VideoSettings v = new VideoSettings();
        Wini ini = new Wini(new File(settingFileName));
        v.screenWidth = ini.get(tag, "screen_width", int.class);
        v.screenHeight = ini.get(tag, "screen_height", int.class);
        v.bpp = ini.get(tag, "bpp", int.class);
        return v;
    }

    @Override
    public boolean writeSettingsToFile(String path) {
        try {
            if (!getSettingsFromFile(path).equals(this)){
            Wini ini = null;
            try {
                ini = new Wini(new File(path));
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
            ini.put(tag, "screen_width", screenWidth);
            ini.put(tag, "screen_height", screenHeight);
            ini.put(tag, "bpp", bpp);
            try {
                ini.store();
            } catch (IOException e) {
                return false;
            }
            }
        } catch (IOException e) {
            e.printStackTrace(); return false;
        }
        return true;
    }

    @Override
    public boolean equals(SettingModel object) {
        if (object.getClass().equals(this.getClass())) {
            if ((((VideoSettings) object).getBpp() == bpp) &&
                    (((VideoSettings) object).getScreenHeight() == screenHeight) &&
                    (((VideoSettings) object).getScreenWidth() == screenWidth)) {
                return true;
            }
        }
        return false;
    }


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
