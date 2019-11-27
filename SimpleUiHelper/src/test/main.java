package test;

import com.SimpleUiHelper.Dialog.AlertBox;
import javafx.application.Application;
import javafx.stage.Stage;

public class main  extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
       primaryStage.show();
        AlertBox a = new AlertBox("тестfffffffffffffffffffffffffffffffffffffffffffffff","Test",true);
        a.show();
    }
}
