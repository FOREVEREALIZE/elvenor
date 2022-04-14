package me.foreverealize.game;

import static org.lwjgl.glfw.GLFW.*;

public class Window {

    long windowHandle;
    String title;
    int width;
    int height;
    boolean vSync;
    private boolean resized;

    public Window(String title, int width, int height, boolean vSync) {
        this.title = title;
        this.width = width;
        this.height = height;
        this.vSync = vSync;
        this.resized = false;
    }

    public boolean isKeyPressed(int keyCode) {
        return glfwGetKey(windowHandle, keyCode) == GLFW_PRESS;
    }

    public void init() {
        glfwSetFramebufferSizeCallback(windowHandle, (window, width, height) -> {
            Window.this.width = width;
            Window.this.height = height;
            Window.this.setResized(true);
        });
    }

    public void setResized(boolean resized) {
        this.resized = resized;
    }
}
