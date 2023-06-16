package team.banana;

import team.banana.plan.Plan;
import team.banana.plan.PlanFactory;
import team.banana.windows.MainWindow;

public class Plora {

    private static MainWindow mainWindow;
    public static void main(String[] args){
        PlanFactory.init();
        mainWindow = new MainWindow();
        mainWindow.setVisible(true);
    }
}
