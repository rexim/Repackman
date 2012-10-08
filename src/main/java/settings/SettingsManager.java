package settings;

/**
 * Created with IntelliJ IDEA.
 * User: Kolipass
 * Date: 07.10.12
 * Time: 21:06
 * Information about this garbage is coming soon?
 */
public class SettingsManager {
    private static SettingsManager instance;
    private VideoSettings videoSettings;
    private SoundSettings soundSettings;
    private SkinSetting skinSettings;
    private ControlsSettings controlsSettings;

    private String settingsFileName;

    private SettingsManager() {
        // We search settings.ini in the working directory
        settingsFileName = "settings.ini";
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
        if (videoSettings == null) {
            videoSettings = new VideoSettings(settingsFileName);
        }
        return videoSettings;
    }

    public void setVideoSettings(VideoSettings videoSettings) {
        if (!videoSettings.equals(this.videoSettings)) {
            this.videoSettings = videoSettings;
            videoSettings.writeSettingsToFile(settingsFileName);
        }
    }

    public SoundSettings getSoundSettings() {
        if (soundSettings == null) {
            soundSettings = new SoundSettings(settingsFileName);
        }
        return soundSettings;
    }

    // especially for Rexim
    public int getSoundVolume() {
        if (soundSettings == null) {
            getSoundSettings();
        }
        return soundSettings.getSound_volume();
    }
    public int getMusic_volume() {
        if (soundSettings == null) {
            getSoundSettings();
        }
        return soundSettings.getMusic_volume();
    }

    public void setSoundSettings(SoundSettings soundSettings) {
        if (!soundSettings.equals(this.soundSettings)){
        this.soundSettings = soundSettings;
            soundSettings.writeSettingsToFile(settingsFileName);
        }
    }

    public SkinSetting getSkinSettings() {
        if (skinSettings == null) {
            skinSettings = new SkinSetting(settingsFileName);
        }
        return skinSettings;
    }

    public void setSkinSettings(SkinSetting skinSettings) {
        if (!skinSettings.equals(this.skinSettings)) {
            this.skinSettings = skinSettings;
            skinSettings.writeSettingsToFile(settingsFileName);
        this.skinSettings = skinSettings;                }
    }

    public ControlsSettings getControlsSettings() {
        if (controlsSettings == null) {
            controlsSettings = new ControlsSettings(settingsFileName);
        }
        return controlsSettings;
    }

    public void setControlsSettings(ControlsSettings controlsSettings) {
        if (!controlsSettings.equals(this.controlsSettings)) {
            this.controlsSettings = controlsSettings;
            controlsSettings.writeSettingsToFile(settingsFileName);
        this.controlsSettings = controlsSettings;   }
    }
}

