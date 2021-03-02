package com.company;

import java.util.ArrayList;
import java.util.List;

public class Element extends Object{

    private static List<Element> elements = new ArrayList<>();

    static {
        elements.add(new Element("eau"));
        elements.add(new Element("air"));
        elements.add(new Element("feu"));
        elements.add(new Element("vent"));
        elements.add(new Element("vie"));
        elements.add(new Element("dragon"));
        elements.add(new Element("gel"));
        elements.add(new Element("ténèbre"));
        elements.add(new Element("fantôme"));
        elements.add(new Element("psy"));
    }
    private String element;

    private Element (String element){
        this.element = element;
    }
    public static List<Element> getElements() {
        return elements;
    }

    public static Element getRandomElement(){
        return elements.get((int)(Math.random()*elements.size()));
    }

    @Override
    public String toString() {
        return "Element{" +
                "element='" + element + '\'' +
                '}';
    }

    public enum Elementenum{
        EAU , AIR , FEU , ... ;

    }

}
