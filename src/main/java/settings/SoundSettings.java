package settings;

import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Kolipass
 * Date: 07.10.12
 * Time: 21:30
 *  This is a Sound settings parems
 */
public class SoundSettings  implements SettingModel {
    private int music_volume=100;
    private int sound_volume=100;

    private static final String  tag ="Sound";

    public int getMusic_volume() {
        return music_volume;
    }

    public void setMusic_volume(int music_volume) {
        this.music_volume = music_volume;
    }

    public int getSound_volume() {
        return sound_volume;
    }

    public void setSound_volume(int sound_volume) {
        this.sound_volume = sound_volume;
    }

    public SoundSettings(){

    }

    public SoundSettings(String settingFileName) {
        try {
            getSettingsFromFile(settingFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public SettingModel getSettingsFromFile(String path) throws IOException {
        SoundSettings v = new SoundSettings();
        Wini ini = new Wini(new File(path));
        v.music_volume = ini.get(tag, "music_volume", int.class);
        v.sound_volume = ini.get(tag, "sound_volume", int.class);
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
                ini.put(tag, "music_volume",music_volume);
                ini.put(tag, "sound_volume", sound_volume);
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
            if ((((SoundSettings) object).getMusic_volume() == music_volume) &&
                    (((SoundSettings) object).getSound_volume() == sound_volume)) {
                return true;
            }
        }
        return false;
    }
}
