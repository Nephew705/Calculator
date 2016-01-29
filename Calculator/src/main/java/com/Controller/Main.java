package com.Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

            FXMLLoader loader = new FXMLLoader(Main.class.getResource("/fxml/sample.fxml"));
    Parent root = loader.load();
    Scene scene = new Scene(root, 254, 392);
    primaryStage.setScene(scene);
    primaryStage.setResizable(false);
    primaryStage.setTitle("Калькуляка");
    primaryStage.show();
}


    public static void main(String[] args) {
        launch(args);
    }
}
