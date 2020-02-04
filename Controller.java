package sample;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;

public class Controller {
    public TextField txfSource;
    public ImageView imgCorbeille;
    public ImageView imgCorbeille1;
    public TextField txfSource2;
    public ComboBox cmbTarget2;


    //Exercice 1


    public void txfSourceDragDetected(MouseEvent mouseEvent) {
        TextField ref = (TextField) mouseEvent.getSource();
        if (!ref.getText().isEmpty()) {
            Dragboard db = ref.startDragAndDrop(TransferMode.ANY);
            ClipboardContent content = new ClipboardContent();
            content.putString(txfSource.getText());
            db.setContent(content);
        }
    }

    public void imgTargetDragOver(DragEvent dragEvent) {
        dragEvent.acceptTransferModes(TransferMode.ANY);
    }

    public void imgTargetDragDrop(DragEvent dragEvent) {
        TextField refSource = (TextField) dragEvent.getGestureSource();
        Dragboard db = dragEvent.getDragboard();
        refSource.clear();
    }


    //Exercice 2


    public void txfSource2DragDetected(MouseEvent mouseEvent) {
        if (!txfSource2.getText().isEmpty()) {
            Dragboard db = txfSource2.startDragAndDrop(TransferMode.ANY);
            ClipboardContent facher = new ClipboardContent();
            facher.putString(txfSource2.getText());
            db.setContent(facher);
        }
    }

    public void cmbTarget2DragOver(DragEvent dragEvent) {
        dragEvent.acceptTransferModes(TransferMode.ANY);
    }

    public void cmbTarget2DragDrop(DragEvent dragEvent) {
        Dragboard db = dragEvent.getDragboard();
        cmbTarget2.getItems().add(db.getString());
        txfSource2.clear();
    }


    //Exercice 3


    public void txfSource3DragDetected(MouseEvent mouseEvent) {
        TextField ref = (TextField) mouseEvent.getSource();
        if(!ref.getText().isEmpty()) {
            Dragboard db = ref.startDragAndDrop(TransferMode.ANY);
            ClipboardContent empathique = new ClipboardContent();
            empathique.putString(ref.getText());
            db.setContent(empathique);
        }
    }

    public void imgTarget3DragOver(DragEvent dragEvent) {
        dragEvent.acceptTransferModes(TransferMode.ANY);
    }

    public void imgTarget3DragDrop(DragEvent dragEvent) {
        Dragboard db = dragEvent.getDragboard();
        TextField refSource = (TextField) dragEvent.getGestureSource();
        refSource.clear();
    }


    //Exercice 4


    public void txf4DragDetected(MouseEvent mouseEvent) {
        TextField refSource = (TextField) mouseEvent.getSource();
        Dragboard db = refSource.startDragAndDrop(TransferMode.ANY);
        ClipboardContent triste = new ClipboardContent();
        triste.putString(refSource.getText());
        db.setContent(triste);
    }

    public void txf4DragOver(DragEvent dragEvent) {
        dragEvent.acceptTransferModes(TransferMode.ANY);
    }

    public void txf4DragDrop(DragEvent dragEvent) {
        TextField refSource = (TextField) dragEvent.getGestureSource();
        TextField refTarget = (TextField) dragEvent.getGestureTarget();
        if (!refSource.getText().isEmpty()) {
            Dragboard db = dragEvent.getDragboard();
            refTarget.setText(db.getString());
            refSource.clear();
        }
    }
}
