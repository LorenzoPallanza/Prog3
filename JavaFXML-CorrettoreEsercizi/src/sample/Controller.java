package sample;

import java.net.URL;
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
public class Controller implements Initializable {

    @FXML
    private Label valutazione;

    @FXML
    private TextField testoEsercizio;

    @FXML
    private TextField risposta;

    private DataModel model; // NB: senza java annotation!

    @FXML
    private void handleAltroEsercizioAction(ActionEvent event) {
        model.setEsercizio();
    }

    @FXML
    private void handleVerificaRisultato(ActionEvent event) {
        System.out.println("in handleVerificaRisultato");
        model.checkRisposta();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (model != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }
        model = new DataModel();
        testoEsercizio.textProperty().bind(model.getTestoEsercizioProperty());
        model.getRispostaProperty().bind(risposta.textProperty());
        valutazione.textProperty().bind(model.getVerificaRispostaProperty());

        model.setEsercizio();
    }
}
