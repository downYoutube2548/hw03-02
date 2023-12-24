import javax.swing.*;
import java.awt.*;

public class CalendarApp {
    public static void main(String[] args) {
        JFrame app = new JFrame();

        app.add(new JLabel("January 2024", SwingConstants.CENTER), BorderLayout.PAGE_START);

        JPanel dataEntryPanel = new JPanel();
        dataEntryPanel.setLayout(new GridLayout(6, 7));
        dataEntryPanel.add(new JButton("Sun"));
        dataEntryPanel.add(new JButton("Mon"));
        dataEntryPanel.add(new JButton("Tue"));
        dataEntryPanel.add(new JButton("Wed"));
        dataEntryPanel.add(new JButton("Thu"));
        dataEntryPanel.add(new JButton("Fri"));
        dataEntryPanel.add(new JButton("Sat"));

        for (int i = 0; i < 35; i++) {
            dataEntryPanel.add(new JLabel((i >= 1 && i <= 31) ? String.valueOf(i) : "", SwingConstants.CENTER));
        }

        JPanel endPanel = new JPanel();
        endPanel.add(new JButton("<<"));
        endPanel.add(new JButton(">>"));


        app.add(dataEntryPanel, BorderLayout.CENTER);
        app.add(endPanel, BorderLayout.PAGE_END);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        app.setSize(500, 400);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
    }
}
