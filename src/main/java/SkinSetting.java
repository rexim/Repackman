import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Kolipass
 * Date: 07.10.12
 * Time: 21:36
 * About information of this garbage comming soon
 */
public class SkinSetting implements SettingModel {
    //    * About information of this garbage comming soon
    public SkinSetting() {
    }

    public SkinSetting(String settingFileName) {
        try {
            getSettingsFromFile(settingFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public SettingModel getSettingsFromFile(String path) throws IOException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean writeSettingsToFile(String path) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean equals(SettingModel object) {
        if (object.getClass().equals(this.getClass())) {
            return true;
        }
        return false;
    }
}
