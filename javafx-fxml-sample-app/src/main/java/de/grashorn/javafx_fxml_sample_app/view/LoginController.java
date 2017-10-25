package de.grashorn.javafx_fxml_sample_app.view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable {

	@FXML
	private TextField username;
	@FXML
	private PasswordField password;
	@FXML
	private Button loginButton;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		 loginButton.setOnAction(e -> {System.out.println("Ussername: " +
		 username.getText() + "Password: " + password.getText());
		 });
	}

}
