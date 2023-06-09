// ENGINE MANAGER CREATES TIME

package net.iiab.lukas;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;

public class EngineManager {

    public static final long NANOSECOND = 1000000000L;
    public static final float FRAMERATE = 1000;

    public static int fps;
    public static float frametime = 1.0f / FRAMERATE;

    private boolean isRunning;
    private WindowManager window;
    private GLFWErrorCallback errorCallback;

    private void init(){
        GLFW.glfwSetErrorCallback(errorCallback = GLFWErrorCallback.createPrint(System.err));
    }
    
}
