import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Kolipass
 * Date: 07.10.12
 * Time: 22:13
 * This interface describes the model of settings
 */
public interface SettingModel {
    SettingModel getSettingsFromFile(String path) throws IOException;
    //return true, if write successfully
    public boolean writeSettingsToFile(String path);
    public boolean equals(SettingModel object);
}
