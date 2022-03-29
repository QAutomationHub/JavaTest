package weather_project;

import weather_project.view.IUserInterface;
import weather_project.view.UserInterface;

public class Main {

    public static void main(String[] args) {
        IUserInterface userInterface = new UserInterface();
        userInterface.showUI();


    }

}
