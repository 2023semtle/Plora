package team.banana.windows;

import team.banana.plan.Plan;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("Plora");
        setSize(1200, 600);

        List<Plan> plans = new ArrayList();




        JButton b1 = new JButton("일정 추가");
        b1.setBounds(100, 100, 100, 40);
        this.add(b1);
        this.setLayout(null);
        this.setVisible(true);

        JButton b2 = new JButton("전체 삭제");
        b2.setBounds(100, 200, 100, 40);
        this.add(b2);
        this.setLayout(null);
        this.setVisible(true);

        JButton b3 = new JButton("일정 삭제");
        b3.setBounds(100, 300, 100, 40);
        this.add(b3);
        this.setLayout(null);
        this.setVisible(true);


    }
}
