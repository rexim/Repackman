package settings;

import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Kolipass
 * Date: 07.10.12
 * Time: 21:39
 *  This is a Controls settings parems
 */
public class ControlsSettings implements SettingModel {
    public int upKey = 26;
    public int downKey = 28;
    public int leftKey = 25;
    public int rightKey = 27;

    private static final String  tag ="Control";

    public ControlsSettings(String settingFileName) {
        try {
        getSettingsFromFile(settingFileName);
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    public ControlsSettings() {
    }

    @Override
    public SettingModel getSettingsFromFile(String path) throws IOException {
        ControlsSettings v = new ControlsSettings();
        Wini ini = new Wini(new File(path));
        v.upKey = ini.get(tag, "up", int.class);
        v.downKey = ini.get(tag, "down", int.class);
        v.leftKey = ini.get(tag, "left", int.class);
        v.rightKey = ini.get(tag, "right", int.class);
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
                ini.put(tag, "up", upKey);
                ini.put(tag, "down", downKey);
                ini.put(tag, "left", leftKey);
                ini.put(tag, "right", rightKey);
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
            if ((((ControlsSettings) object).downKey == downKey) &&
                    (((ControlsSettings) object).upKey == upKey) &&
                    (((ControlsSettings) object).leftKey == leftKey) &&
                    (((ControlsSettings) object).rightKey == rightKey)) {
                return true;
            }
        }
        return false;
    }
}
