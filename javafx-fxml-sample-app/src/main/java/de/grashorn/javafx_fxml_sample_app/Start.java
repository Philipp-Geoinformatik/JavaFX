package de.grashorn.javafx_fxml_sample_app;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import de.grashorn.javafx_fxml_sample_app.view.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class Start extends Application{
	public static void main(String[] args) {
		System.out.println("Hello World!");
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		try {
			final URL fxmlUrl = getClass().getResource("view/simplegui.fxml");
			final FXMLLoader loader = new FXMLLoader(fxmlUrl);
			loader.setController(new LoginController());
			final Parent root = loader.load();
			primaryStage.setScene(new Scene(root, 400, 600));
			primaryStage.setTitle("Hello Login");
			primaryStage.show();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
