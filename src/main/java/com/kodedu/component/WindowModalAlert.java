package com.kodedu.component;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class WindowModalAlert extends Alert {
    public WindowModalAlert(AlertType alertType) {
        super(alertType);
        super.initModality(Modality.WINDOW_MODAL);
        showAlwaysOnTop(this);
    }

    public WindowModalAlert(AlertType alertType, String contentText, ButtonType... buttons) {
        super(alertType, contentText, buttons);
        super.initModality(Modality.WINDOW_MODAL);
        showAlwaysOnTop(this);
    }


    private static void showAlwaysOnTop(DialogPane dialogPane) {
        ((Stage) dialogPane.getScene().getWindow()).setAlwaysOnTop(true);
    }

    private static void showAlwaysOnTop(Alert alert) {
        showAlwaysOnTop(alert.getDialogPane());
    }

}
