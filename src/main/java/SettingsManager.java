/**
 * Created with IntelliJ IDEA.
 * User: Kolipass
 * Date: 07.10.12
 * Time: 21:06
 * To change this template use File | Settings | File Templates.
 */
public class SettingsManager {
    private static SettingsManager instance;

    private SettingsManager() {}

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

    public Object getControls(){
        return new Object();
    }

    public Object getSound(){
        return new Object();
    }
    public Object getVideo(){
        return new Object();
    }

    public Object getSkin(){
        return new Object();
    }
}

