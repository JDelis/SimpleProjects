package com.SimpleUiHelper;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

public class UiHelper {
    private static HashMap<String, Stage> windows = new HashMap<>();

    public static Scene createWindow(URL window) {

        FXMLLoader loader = new FXMLLoader(window);
        AnchorPane root = null;
        try {
            root = loader.load();

        } catch (IOException e) {

            e.printStackTrace();
        }

        Scene scene = new Scene(root, 800, 600);
        scene.setUserData(loader.getController());


        return scene;
    }
}
