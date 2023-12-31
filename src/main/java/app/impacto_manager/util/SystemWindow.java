package app.impacto_manager.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class SystemWindow {

    public static Stage openWindowInOtherStage(String fxmlUri, String title, boolean resizable, Modality modality) {
        FXMLLoader fxmlLoader = new FXMLLoader(SystemWindow.class.getResource(fxmlUri));
        Parent root;
        try {
            root = fxmlLoader.load();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle(title);
        stage.setResizable(resizable);
        stage.initModality(modality);
        stage.initStyle(StageStyle.UNIFIED);
        stage.show();
        return stage;
    }

    public static Pane openWindowInSameStage(String fxmlUri) {
        FXMLLoader fxmlLoader = new FXMLLoader(SystemWindow.class.getResource(fxmlUri));
        Pane pane;
        try {
            pane = fxmlLoader.load();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return pane;
    }
    public static void fecharJanela(Stage stage){
        stage.close();
    }
}
