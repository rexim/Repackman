import org.lwjgl.LWJGLException;
import settings.SettingsManager;

public class Main {
    public static void main(String[] args) throws LWJGLException {
        SettingsManager settingsManager = SettingsManager.getInstance();
        System.out.println("Screen width = " + settingsManager.getVideoSettings().getScreenWidth());
        System.out.println("Screen height = " + settingsManager.getVideoSettings().getScreenHeight());
        System.out.println("Screen bpp = " + settingsManager.getVideoSettings().getBpp());

//        // Initialization
//        Display.setDisplayMode(new DisplayMode(800, 600));
//        Display.setTitle("Repackman");
//        Display.create();
//
//        State currentState = new Splash();
//
//        // Main loop
//        while(currentState != null && !Display.isCloseRequested()) {
//            Display.update();
//
//            // Get next state
//            currentState = currentState.next();
//
//            // Does user want to escape?
//            if(Keyboard.isKeyDown(Keyboard.KEY_ESCAPE))
//                break;
//        }
//
//        // Finalization
//        Display.destroy();
    }
}
