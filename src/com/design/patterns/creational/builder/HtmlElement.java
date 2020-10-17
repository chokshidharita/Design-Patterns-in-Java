package com.design.patterns.creational.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class HtmlElement {

    private String name;
    private String text;
    private List<HtmlElement> htmlElements = new ArrayList<>();
    private static final int INDENT_SIZE = 2;
    private final String newLine = System.lineSeparator();

    public HtmlElement() {
    }

    public HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<HtmlElement> getHtmlElements() {
        return htmlElements;
    }

    private String toStringImpl(int indent) {
        StringBuilder stringBuilder = new StringBuilder();
        String copies = String.join("", Collections.nCopies(indent * INDENT_SIZE, " "));
        stringBuilder.append(String.format("%s<%s>%s", copies, name, newLine));

        if (Objects.nonNull(text)) {
            stringBuilder.append(String.join("", Collections.nCopies(INDENT_SIZE * (indent + 1), " ")))
                    .append(text)
                    .append(newLine);
        }

        htmlElements.forEach(htmlElement -> stringBuilder.append(htmlElement.toStringImpl(indent + 1)));
        stringBuilder.append(String.format("%s</%s>%s", copies, name, newLine));

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return toStringImpl(0);
    }
}
