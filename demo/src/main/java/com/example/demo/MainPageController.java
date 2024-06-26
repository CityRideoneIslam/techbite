package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainPageController {
    @FXML
    private Button dashboard;

    @FXML
    private Button menu;

    @FXML
    private Button table;

    @FXML
    private Button payment;

    @FXML
    private BorderPane borderPane;

    private Button previousSelectedButton = null;



    // normal button
    public void highlightedButton(Button button) {
        button.setStyle("-fx-background-color: #D9D9D9; -fx-text-fill: #2B3336;");
    }

    // highlighted button
    public void normalButton(Button button) {
        button.setStyle("-fx-background-color: #2B3336; -fx-text-fill: #D9D9D9;");
    }



    public void dashboardPage(MouseEvent mouseEvent) {
        // the previous button will revert to its normal colour
        if (this.previousSelectedButton != null) {
            normalButton(this.previousSelectedButton);
        }
        highlightedButton(dashboard);
        this.previousSelectedButton = dashboard;
    }

    public void tablesPage(MouseEvent mouseEvent) throws IOException {
        if (this.previousSelectedButton != null) {
            normalButton(this.previousSelectedButton);

        }
        highlightedButton(table);
        this.previousSelectedButton = table;

        // add the tables page to the centre of the border pane
        Node tablesPage = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("table-page.fxml")));

        borderPane.setCenter(tablesPage);
    }

    public void menusPage(MouseEvent mouseEvent) {
        if (this.previousSelectedButton != null) {
            normalButton(this.previousSelectedButton);
        }
        highlightedButton(menu);
        this.previousSelectedButton = menu;
    }

    public void paymentPage(MouseEvent mouseEvent) {
        if (this.previousSelectedButton != null) {
            normalButton(this.previousSelectedButton);
        }
        highlightedButton(payment);
        this.previousSelectedButton = payment;
    }
}
