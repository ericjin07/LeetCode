package com.eric.editor;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class CharacterStyleFactory {

    private static final Set<CharacterStyle> styles = new HashSet<>();

    public static CharacterStyle getStyle(Font font, int size, Color color) {
        CharacterStyle style = new CharacterStyle(font, size, color);
        for (CharacterStyle s : styles) {
            if (s.equals(style)) return s;
        }
        styles.add(style);
        return style;
    }
}
