package sample;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.*;

public class Controller {
    public TextField txfSource;
    public Label labTarget;

    public void txfSourceDragDetected(MouseEvent mouseEvent) {
        TextField ref = (TextField) mouseEvent.getSource();
        Dragboard db = ref.startDragAndDrop(TransferMode.ANY);
        ClipboardContent content = new ClipboardContent();
        content.putString(ref.getText());
        db.setContent(content);
    }

    public void labTargetDragOver(DragEvent dragEvent) {
        dragEvent.acceptTransferModes(TransferMode.ANY);
    }

    public void labTargetDragDrop(DragEvent dragEvent) {
        TextField refSource = (TextField) dragEvent.getGestureSource();
        Label refTarget = (Label) dragEvent.getGestureTarget();
        Dragboard db = dragEvent.getDragboard();
        refTarget.setText(db.getString());
    }
}
