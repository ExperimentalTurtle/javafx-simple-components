package com.example.javafxsimplecomponents.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;


public class DemoController implements Initializable {
    private final String[] generalItems = {"pizza", "sushi", "ramen"};

    @FXML
    AnchorPane anchorPane;

    @FXML
    ColorPicker colorPicker;

    @FXML
    ListView<String> listView;

    @FXML
    TreeView<String> treeView;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listView.getItems().addAll(generalItems);
        listView.getSelectionModel().selectFirst();

        // TreeView
        TreeItem<String> root1 = new TreeItem<>("Root 1");
        TreeItem<String> root2 = new TreeItem<>("!!!! context menu here !!!!");

        TreeItem<String> model11 = new TreeItem<>("Model1.1");
        TreeItem<String> model12 = new TreeItem<>("Model1.2");

//        model12.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("/com/example/javafxsimplecomponents/images/icons8_angle_right_32px_1.png"))));

        root1.getChildren().add(model11);
        root1.getChildren().add(model12);

        for (int i = 0; i < 100; i++) {
            root1.getChildren().add(new TreeItem<>("Model " + i*100));
        }

        // for showing multiple roots on tree view
        TreeItem<String> invisibleRoot = new TreeItem<>(null);
        invisibleRoot.getChildren().addAll(root1, root2);
        treeView.setRoot(invisibleRoot);
        treeView.setShowRoot(false);


        // add context menu to tree
        ContextMenu contextMenu = new ContextMenu();

        MenuItem menuItem1 = new MenuItem("menu item 1");
        MenuItem menuItem2 = new MenuItem("menu item 2");
        MenuItem menuItem3 = new MenuItem("menu item 3");

        contextMenu.getItems().addAll(menuItem1, menuItem2, menuItem3);
        treeView.setContextMenu(contextMenu);

    }
}
