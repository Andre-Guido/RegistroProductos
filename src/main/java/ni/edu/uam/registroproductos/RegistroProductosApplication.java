package ni.edu.uam.registroproductos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistroProductosApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RegistroProductosApplication.class.getResource("registro-productos.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("¡Bienvenido al registro de productos!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
