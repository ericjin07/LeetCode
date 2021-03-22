package com.eric.editor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Editor {

    List<Character> text;

    public Editor() {
        this.text = new ArrayList<>();
    }

    public void appendChar(char c, Font font, int size, Color color) {
        text.add(new Character(c, CharacterStyleFactory.getStyle(font, size, color)));
    }
}
