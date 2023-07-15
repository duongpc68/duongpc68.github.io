package control;

import java.awt.*;

public abstract class Button {

    public static final int NONE = 0;
    public static final int PRESSED = 1;
    public static final int HOVER = 2;

    protected String text;
    protected int posX;
    protected int posY;
    protected int width;
    protected int height;
    protected int paddingTextX;
    protected int paddingTextY;
    protected boolean enabled;

    protected int state;
    protected Color bgColor;
    protected Color pressedBgColor;
    protected Color hoverBgColor;

    public Button(String text, int posX, int posY, int width, int height, int paddingTextX, int paddingTextY,
                  Color bgColor) {
        this.text = text;
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
        this.paddingTextX = paddingTextX;
        this.paddingTextY = paddingTextY;
        this.bgColor = bgColor;
        enabled = true;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPaddingTextX() {
        return paddingTextX;
    }

    public void setPaddingTextX(int paddingTextX) {
        this.paddingTextX = paddingTextX;
    }

    public int getPaddingTextY() {
        return paddingTextY;
    }

    public void setPaddingTextY(int paddingTextY) {
        this.paddingTextY = paddingTextY;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getState() {
        return state;
    }

    public Color getBgColor() {
        return bgColor;
    }

    public Color getPressedBgColor() {
        return pressedBgColor;
    }

    public Color getHoverBgColor() {
        return hoverBgColor;
    }

    public void setEnable(boolean enabled) {
        this.enabled = enabled;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setBgColor(Color color) {
        bgColor = color;
    }

    public void setHoverBgColor(Color color) {
        hoverBgColor = color;
    }
    public void setPressedBgColor(Color color) {
        pressedBgColor = color;
    }

    public abstract boolean isInButton(int x, int y);
    public abstract void draw(Graphics2D g);

    public abstract void draw(Graphics g);
}
