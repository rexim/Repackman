import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Main {
    public static void main(String[] args) throws LWJGLException{
        // Initialization
        Display.setDisplayMode(new DisplayMode(800, 600));
        Display.setTitle("Repackman");
        Display.create();

        State currentState = new Splash();

        // Main loop
        while(currentState != null && !Display.isCloseRequested()) {
            Display.update();

            // Get next state
            currentState = currentState.next();

            // Does user want to escape?
            if(Keyboard.isKeyDown(Keyboard.KEY_ESCAPE))
                break;
        }

        // Finalization
        Display.destroy();
    }
}
