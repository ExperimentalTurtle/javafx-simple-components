package com.example.javafxsimplecomponents.controllers;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.WindowEvent;

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

    @FXML
    TableView<String> tableView;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Table view
        tableView.getColumns().add(new TableColumn<>("Column 1"));
        tableView.getColumns().add(new TableColumn<>("Column 2"));
        tableView.getColumns().add(new TableColumn<>("Column 3"));
        tableView.getColumns().add(new TableColumn<>("Column 4"));
        tableView.getColumns().add(new TableColumn<>("Long column"));
        tableView.getColumns().forEach(c -> c.setCellValueFactory(data -> new SimpleObjectProperty("Lorem ipsum")));

        ObservableList<String> list = FXCollections.observableArrayList();
        for (int i = 0; i < 1000; i++) list.add(i + "asd");
        tableView.setItems(list);

        // List view
        listView.getItems().addAll(generalItems);
        listView.getSelectionModel().selectFirst();

        // Tree view
        TreeItem<String> root1 = new TreeItem<>("Root 1");
        TreeItem<String> root2 = new TreeItem<>("!!!! context menu here !!!!");

        TreeItem<String> model11 = new TreeItem<>("Model1.1");
        TreeItem<String> model12 = new TreeItem<>("Model1.2");

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
