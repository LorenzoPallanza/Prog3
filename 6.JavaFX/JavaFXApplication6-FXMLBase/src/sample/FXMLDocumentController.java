package sample;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author liliana
 */
public class FXMLDocumentController implements Initializable {

    private Random r = new Random();

    private Model m;

    @FXML
    private Label label;

    @FXML
    private TextField inserimento;

    @FXML
    private TextField visualizza;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        int n = r.nextInt();
        String s = String.format("%d", n);
        label.setText(s);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        m = new Model();
        visualizza.textProperty().bind(inserimento.textProperty());
        // bind valore nel model a inserimento della GUI
        //m.getValoreProperty().bind(inserimento.textProperty());
        //visualizza.textProperty().bind(m.getValoreProperty());
    }

}

