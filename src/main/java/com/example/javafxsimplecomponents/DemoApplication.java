package com.example.javafxsimplecomponents;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class DemoApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, NullPointerException {
        URL demoScreen = DemoApplication.class.getResource("demo.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(demoScreen);
        Scene scene = new Scene(fxmlLoader.load(), 1320, 900);

        // add all css
        addStyles(scene);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private void addStyles(Scene scene) {
        // general
        URL generalResource = getClass().getResource("/com/example/javafxsimplecomponents/styles/general.css");
        URL scrollbarResource = getClass().getResource("/com/example/javafxsimplecomponents/styles/scrollbar.css");
        URL contextmenuResource = getClass().getResource("/com/example/javafxsimplecomponents/styles/contextmenu.css");

        // components
        URL menuBarResource = getClass().getResource("/com/example/javafxsimplecomponents/styles/menu-bar.css");
        URL comboboxResource = getClass().getResource("/com/example/javafxsimplecomponents/styles/combobox.css");
        URL buttonResource = getClass().getResource("/com/example/javafxsimplecomponents/styles/button.css");
        URL treeviewResource = getClass().getResource("/com/example/javafxsimplecomponents/styles/treeview.css");
        URL tabsResource = getClass().getResource("/com/example/javafxsimplecomponents/styles/tabs.css");
        URL checkboxResource = getClass().getResource("/com/example/javafxsimplecomponents/styles/checkbox.css");
        URL radioResource = getClass().getResource("/com/example/javafxsimplecomponents/styles/radio.css");
        URL listResource = getClass().getResource("/com/example/javafxsimplecomponents/styles/list.css");

        // forms
        URL formsResource = getClass().getResource("/com/example/javafxsimplecomponents/styles/forms.css");

        assert generalResource != null;
        assert scrollbarResource != null;
        assert contextmenuResource != null;

        assert menuBarResource != null;
        assert comboboxResource != null;
        assert buttonResource != null;
        assert treeviewResource != null;
        assert tabsResource != null;
        assert checkboxResource != null;
        assert radioResource != null;
        assert listResource != null;

        assert formsResource != null;

        scene.getStylesheets().add(generalResource.toExternalForm());
        scene.getStylesheets().add(scrollbarResource.toExternalForm());
        scene.getStylesheets().add(contextmenuResource.toExternalForm());

        scene.getStylesheets().add(menuBarResource.toExternalForm());
        scene.getStylesheets().add(comboboxResource.toExternalForm());
        scene.getStylesheets().add(buttonResource.toExternalForm());
        scene.getStylesheets().add(treeviewResource.toExternalForm());
        scene.getStylesheets().add(tabsResource.toExternalForm());
        scene.getStylesheets().add(checkboxResource.toExternalForm());
        scene.getStylesheets().add(radioResource.toExternalForm());
        scene.getStylesheets().add(formsResource.toExternalForm());
        scene.getStylesheets().add(listResource.toExternalForm());
    }
}