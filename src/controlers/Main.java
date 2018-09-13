package controlers;

import javafx.application.Application;
import javafx.stage.Stage;
import models.User;

import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;
    private static Main instance;
    private static User user;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.instance = this;
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Budget Planner");

        if (user == null) {
            primaryStage.setScene(LoginSceneController.getLoginScene());
        } else {
            primaryStage.setScene(new MainSceneController().getMainScene());
        }
        
        primaryStage.show();
    }

    public Stage getStage() {
        return primaryStage;
    }

    public static Main getInstance() {
        return instance;
    }

    public static void setUser(User user) {
        Main.user = user;
    }

    public static User getUser() {
        return user;
    }
}
