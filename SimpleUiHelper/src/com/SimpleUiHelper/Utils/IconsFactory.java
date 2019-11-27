package com.SimpleUiHelper.Utils;

import javafx.scene.image.Image;

import java.util.HashMap;

public class IconsFactory {
    static HashMap<String, Image> icons = new HashMap();

    public static Image getImage(String name) {
        if (!icons.containsKey(name)) {
            if (name != null) {
                Image img = getIcon(name);
                if (img != null) {
                    icons.put(name, img);
                }
            }
        }

        return icons.get(name);

    }

    private static Image getIcon(String name) {
        return new Image("icon/" + name + ".png");
    }

}
