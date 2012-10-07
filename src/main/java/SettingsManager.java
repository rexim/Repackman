/**
 * Created with IntelliJ IDEA.
 * User: Kolipass
 * Date: 07.10.12
 * Time: 21:06
 * About information of this garbage comming soon
 */
public class SettingsManager {
    private static SettingsManager instance;
    private VideoSettings videoSettings;
    private SoundSettings soundSettings;
    private Skin skinSettings;
    private ControlsSettings controlsSettings;

    private SettingsManager() {

    }

    public static SettingsManager getInstance() {
        if (instance == null) {
            synchronized (SettingsManager.class) {
                if (instance == null) {
                    instance = new SettingsManager();
                }
            }
        }
        return instance;
    }

    public VideoSettings getVideoSettings() {
        return videoSettings;
    }

    public void setVideoSettings(VideoSettings videoSettings) {
        this.videoSettings = videoSettings;
    }

    public SoundSettings getSoundSettings() {
        return soundSettings;
    }
         // especially for Rexim
    public int getSoundVolume() {
        return soundSettings.getSound_volume();
    }
    public int getMusic_volume() {
        return soundSettings.getMusic_volume();
    }

    public void setSoundSettings(SoundSettings soundSettings) {
        this.soundSettings = soundSettings;
    }

    public Skin getSkinSettings() {
        return skinSettings;
    }

    public void setSkinSettings(Skin skinSettings) {
        this.skinSettings = skinSettings;
    }

    public ControlsSettings getControlsSettings() {
        return controlsSettings;
    }

    public void setControlsSettings(ControlsSettings controlsSettings) {
        this.controlsSettings = controlsSettings;
    }
}

