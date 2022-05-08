package com.example.javafxsimplecomponents;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class Demo2Application extends Application {
    @Override
    public void start(Stage stage) throws IOException, NullPointerException {
        URL url = getClass().getResource("demo2.fxml");
        Parent root = FXMLLoader.load(Objects.requireNonNull(url));
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}