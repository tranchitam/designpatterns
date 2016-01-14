package org.tctam.designpatterns.creational.factory;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("rawtypes")
public class ColorFactory {

    private static Map<String, Class> colors = new HashMap<String, Class>();

    static {
        colors.put(RedColor.NAME, RedColor.class);
        colors.put(GreenColor.NAME, GreenColor.class);
        colors.put(BlueColor.NAME, BlueColor.class);
    }

    public static Color getColor(String name) {
        Class colorClass = colors.get(name);
        Color color = null;
        try {
            color = (Color) colorClass.newInstance();
        } catch (InstantiationException e) {

        } catch (IllegalAccessException e) {

        }
        return color;
    }
}
