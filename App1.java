import javax.swing.*;
import javax.swing.text.FlowView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App1 extends JFrame {

    private int counter = 0;

    public App1() {
        setTitle("CounterApp window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 360, 220);

        Font font = new Font("Arial", Font.BOLD, 30);

        JLabel counterView = new JLabel(String.valueOf(counter));
        counterView.setHorizontalAlignment(SwingConstants.CENTER);
        counterView.setFont(font);
        counterView.setBounds(150,70, 50, 50);
        add(counterView);

        setLayout(null);
        JButton incrementButton = new JButton(">");
        incrementButton.setBounds(294,0,50,181);
        add(incrementButton);
        JButton decrementButton = new JButton("<");
        decrementButton.setBounds(0,0,50,181);
        add(decrementButton);
        JButton nullButton = new JButton("zero");
        nullButton.setBounds(50,0,244,50);
        add(nullButton);
        JButton plusTen = new JButton("+10");
        plusTen.setBounds(50,131,122,50);
        add(plusTen);
        JButton minusTen = new JButton("-10");
        minusTen.setBounds(172,131,122,50);
        add(minusTen);
        setVisible(true);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == incrementButton) {
                    counter++;
                } else if (e.getSource() == decrementButton) {
                    counter--;
                } else if (e.getSource() == nullButton) {
                    counter = 0;
                }  else if (e.getSource() == plusTen){
                counter += 10;
                } else if (e.getSource() == minusTen){
                    counter -= 10;
                }
                refreshCounterView(counterView);
            }
        };


        decrementButton.addActionListener(actionListener);
        incrementButton.addActionListener(actionListener);
        nullButton.addActionListener(actionListener);
        plusTen.addActionListener(actionListener);
        minusTen.addActionListener(actionListener);

        setVisible(true);
    }

    private void refreshCounterView(JLabel counterView) {
        counterView.setText(String.valueOf(counter));
    }

    public static void main(String[] args) {
        new App1();
    }
}