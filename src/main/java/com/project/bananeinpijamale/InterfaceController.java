package com.project.bananeinpijamale;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class InterfaceController implements Initializable {
    @FXML
    private Button startButton;
    @FXML
    private BorderPane scenePane1;
    @FXML
    private Button exitButton;
    @FXML
    private ImageView imageview;



    Stage stage;

    public void exit(ActionEvent event){
        stage = (Stage) scenePane1.getScene().getWindow();
        System.out.println("U closed the app");
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       

    }


}