package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author liliana
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane root = new BorderPane();
        FXMLLoader listLoader = new FXMLLoader(getClass().getResource("list.fxml"));
        root.setCenter(listLoader.load());
        ListController listController = listLoader.getController();

        FXMLLoader editorLoader = new FXMLLoader(getClass().getResource("editor.fxml"));
        root.setRight(editorLoader.load());
        EditorController editorController = editorLoader.getController();

        DataModel model = new DataModel();
        listController.initModel(model);
        editorController.initModel(model);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
