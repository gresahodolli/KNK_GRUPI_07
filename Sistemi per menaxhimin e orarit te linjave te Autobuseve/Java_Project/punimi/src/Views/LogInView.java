package Views;

import Models.LogIn;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class LogInView extends StackPane {
    private TextField tfUsername = new TextField();
    private PasswordField pfPassword = new PasswordField();
    private Button btnLogin = new Button("Login");
    private Label lblSignup = new Label("Signup");
    private Label lblGuest = new Label("Continue As Guest");
    private Label lblLOGIN = new Label("LOGIN");




    public LogInView() {
        tfUsername.setPromptText("Enter your username");
        pfPassword.setPromptText("Enter your password");
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(15, 10, 15, 10));
        gridPane.setVgap(8);
        gridPane.setHgap(10);


        lblSignup.setTextFill(Color.DARKBLUE);
        lblGuest.setTextFill(Color.DARKBLUE);
        lblLOGIN.setTextFill(Color.DARKBLUE);
        lblLOGIN.setFont(Font.font("Italic", FontWeight.EXTRA_BOLD, 25));

        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.BOTTOM_LEFT);
        hBox.getChildren().addAll(lblSignup);

        HBox hBox1 = new HBox(10);
        hBox1.setAlignment(Pos.BOTTOM_RIGHT);
        hBox1.getChildren().addAll(lblGuest);

        HBox hBox2 = new HBox(10);
        hBox2.setAlignment(Pos.BOTTOM_RIGHT);
        hBox2.getChildren().add(btnLogin);

        HBox hBox3 = new HBox(10);
        hBox3.setAlignment(Pos.CENTER);
        hBox3.getChildren().addAll(lblLOGIN);


        gridPane.add(hBox3, 1, 0);
        gridPane.addRow(1, new Label("Username: "), tfUsername);
        gridPane.addRow(2, new Label("Password: "), pfPassword);
        gridPane.add(hBox2, 1, 3);
        gridPane.addRow(4,hBox);
        gridPane.addRow(4, hBox1);


        getChildren().addAll(gridPane);

        gridPane.setAlignment(Pos.CENTER);

    }


    public TextField getTfUsername() {
        return tfUsername;
    }

    public PasswordField getPfPassword() {
        return pfPassword;
    }

    public Button getBtnLogin() {
        return btnLogin;
    }

    public void setTfUsername(TextField tfUsername) {
        this.tfUsername = tfUsername;
    }

    public void setPfPassword(PasswordField pfPassword) {
        this.pfPassword = pfPassword;
    }

    public void setBtnLogin(Button btnLogin) {
        this.btnLogin = btnLogin;
    }

    public Label getLblGuest() {
        return lblGuest;
    }

    public Label getLblSignup() {
        return lblSignup;
    }
}
