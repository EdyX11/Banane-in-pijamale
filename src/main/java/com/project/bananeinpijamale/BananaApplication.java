package com.project.bananeinpijamale;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BananaApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("interface-view.fxml"));
        primaryStage.setTitle("Application");
        primaryStage.setScene(new Scene(root, 600, 488));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}