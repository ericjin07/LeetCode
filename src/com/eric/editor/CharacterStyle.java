package com.eric.editor;

import java.awt.*;
import java.util.Objects;

public class CharacterStyle {

    private Font font;
    private int size;
    private Color color;

    public CharacterStyle(Font font, int size, Color color) {
        this.font = font;
        this.size = size;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharacterStyle that = (CharacterStyle) o;
        return size == that.size && Objects.equals(font, that.font) && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(font, size, color);
    }
}
