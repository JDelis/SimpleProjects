package com.SimpleUiHelper.Dialog;

import com.SimpleUiHelper.Utils.IconsFactory;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class AlertBox extends BaseDialog {

    private int TEXT_WIDTH = 300;
    private int ICON_WIDTH = 48;
    private int ICON_HEIGHT= 48;
    private int MIN_WINDOW_W = TEXT_WIDTH + ICON_WIDTH;
    private int MIN_WINDOW_H = 100;


    public AlertBox(String title, String message) {
        super(message, title);
    }

    public AlertBox(String title, String message, Boolean isModal) {
        super(message, title, isModal);
    }

    @Override
    public void show() {
        Stage window;
        try {
            window = new Stage();
        } catch (ExceptionInInitializerError e) {
            System.out.println("Ошибка создания окна");
            return;
        }
        if (isModal) {
            window.initModality(Modality.APPLICATION_MODAL);
        }
        window.setTitle(title);
        window.setMinWidth(MIN_WINDOW_W);
        window.setMinHeight(MIN_WINDOW_H);
        window.setResizable(false);

        Label info = new Label(message);
        info.setMaxWidth(TEXT_WIDTH);
        info.setWrapText(true);

        ImageView icon = new ImageView();
        icon.setImage(IconsFactory.getImage("info"));
        icon.setFitWidth(ICON_WIDTH);
        icon.setFitHeight(ICON_HEIGHT);
        HBox h = new HBox(icon, info);

        Button close = new Button();
        close.setText("OK");
        close.setPrefSize(48, 28);

        close.setOnAction(e -> {
            window.close();
        });

        VBox main = new VBox();
        main.setAlignment(Pos.BOTTOM_RIGHT);
        VBox.setMargin(close, new Insets(5, 5, 5, 5));
        main.setSpacing(5);
        main.getChildren().addAll(h, close);
        Scene root = new Scene(main);
        window.setScene(root);
        window.show();
    }
}
