package com.design.patterns.creational.builder;

public class HtmlBuilder {

    private String rootName;
    private HtmlElement root = new HtmlElement();

    public HtmlBuilder(String rootName) {
        this.rootName = rootName;
        root.setName(rootName);
    }

    // non fluent
    public void addChild(String childName, String childText) {
        HtmlElement htmlElement = new HtmlElement(childName, childText);
        root.getHtmlElements().add(htmlElement);
    }

    public HtmlBuilder addChildFluent(String childName, String childText) {
        HtmlElement htmlElement = new HtmlElement(childName, childText);
        root.getHtmlElements().add(htmlElement);
        return this;
    }

    public void clear() {
        root = new HtmlElement();
        root.setName(rootName);
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
