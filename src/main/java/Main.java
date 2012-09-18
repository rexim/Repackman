import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

public class Main {
    public static void main(String[] args) throws LWJGLException{
        // Initialization
        Display.setDisplayMode(new DisplayMode(800, 600));
        Display.setTitle("Repackman");
        Display.create();

        // Main loop
        while(!Display.isCloseRequested()) {
            Display.update();

            // Draw test triangle
            GL11.glBegin(GL11.GL_TRIANGLES);
                GL11.glColor3d(1.0, 0.0, 0.0);
                GL11.glVertex2d(-0.5, -0.5);

                GL11.glColor3d(0.0, 1.0, 0.0);
                GL11.glVertex2d(0.5, -0.5);

                GL11.glColor3d(0.0, 0.0, 1.0);
                GL11.glVertex2d(0.0, 0.5);
            GL11.glEnd();

            // Does user want to escape?
            if(Keyboard.isKeyDown(Keyboard.KEY_ESCAPE))
                break;
        }

        // Finalization
        Display.destroy();
    }
}
