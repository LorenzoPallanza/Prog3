package sample;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author liliana
 */
public class Controller implements Initializable {
    private Bill electricBill = null;
    private final Random r = new Random();

    @FXML
    private Label label;

    @FXML
    private TextField billValue;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        label.setText("Value of bill:"); // brutto...
        int i = r.nextInt(10000);
        electricBill.setAmountDue(new StringBuilder().append(i).toString());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        electricBill = new Bill();
        billValue.textProperty().bind(electricBill.amountDueProperty());
        // questo listener rimane solo per poter scrivere su standard output il valore di amountDue
        // non serve per la visualizzazione sulla finestra dell'applicazione
        electricBill.amountDueProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> observableValue, String oldVal, String newVal) {
                System.out.println("Electric bill has changed to " + newVal + "!");
            }
        });
    }

}


