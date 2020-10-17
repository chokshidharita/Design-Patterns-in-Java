package com.design.patterns.creational.builder;

import java.util.Arrays;
import java.util.List;

/**
 * Builder pattern allows you to build your domain objects piece by piece. Example StringBuilder.append()
 */
public class BuilderMain {

    public static void main(String[] args) {

        // we want to build a simple HTML paragraph
        String hello = "Fruit Market";
        System.out.println("<p>" + hello + "</p>");

        // build list of words using Java in-built builder i.e. StringBuilder
        List<String> fruits = Arrays.asList("Apple", "Mango", "Banana");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<ul>\n");
        fruits.forEach(fruit -> stringBuilder.append(String.format("    <li>%s</li>\n", fruit)));
        stringBuilder.append("</ul>");
        System.out.println(stringBuilder);

        // ordinary non-fluent builder
        HtmlBuilder htmlBuilder = new HtmlBuilder("ul");
        htmlBuilder.addChild("li", "Orange");
        htmlBuilder.addChild("li", "Sweet Lemon");
        System.out.println(htmlBuilder);

        // fluent builder
        htmlBuilder.clear();
        htmlBuilder.addChildFluent("li", "Orange")
                .addChildFluent("li", "Sweet Lemon");
        System.out.println(htmlBuilder);
    }
}
