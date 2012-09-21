import org.lwjgl.opengl.GL11;

/**
 * @author rexim
 * */
public class Splash implements State {
    @Override
    public State next() {
        // Draw splash triangle
        GL11.glBegin(GL11.GL_TRIANGLES);
        GL11.glColor3d(1.0, 0.0, 0.0);
        GL11.glVertex2d(-0.5, -0.5);

        GL11.glColor3d(0.0, 1.0, 0.0);
        GL11.glVertex2d(0.5, -0.5);

        GL11.glColor3d(0.0, 0.0, 1.0);
        GL11.glVertex2d(0.0, 0.5);
        GL11.glEnd();

        // Not changing the game state
        return this;
    }
}
