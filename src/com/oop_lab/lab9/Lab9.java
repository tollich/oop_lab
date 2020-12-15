package com.oop_lab.lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab9 {
    private static JTextField devisor;
    private static JTextField devisable;
    private static JLabel devisableLablel;
    private static JLabel devisorLabel;
    private static JLabel error;
    private static JLabel result;
    private static JButton button;

    public static void main(String[] args) {
        JFrame frame = new JFrame("LAB9 - Tolici Constantin FAF-193");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setResizable(false);
        Container c = frame.getContentPane();

        devisable = new JTextField();
        devisable.setSize(100,25);
        devisable.setLocation(100, 50);
        c.add(devisable);

        devisor = new JTextField();
        devisor.setSize(50,25);
        devisor.setLocation(300, 50);
        c.add(devisor);

        devisorLabel = new JLabel("Devisor:");
        devisorLabel.setSize(100, 25);
        devisorLabel.setLocation(100,100);
        c.add(devisorLabel);

        devisableLablel = new JLabel("Devisable:");
        devisableLablel.setSize(100, 25);
        devisableLablel.setLocation(300, 100);
        c.add(devisableLablel);

        result = new JLabel("Result:");
        result.setSize(100, 25);
        result.setLocation(100, 150);
        c.add(result);

        error = new JLabel();
        error.setForeground(Color.RED);
        error.setSize(250, 25);
        error.setLocation(250, 200);
        c.add(error);

        button = new JButton("Calculate");
        button.setSize(100, 25);
        button.setLocation(250, 250);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    result.setText("Result:");
                    error.setText("");
                    float num1 = Float.parseFloat(devisable.getText());
                    float num2 = Float.parseFloat(devisable.getText());

                    if (num2 == 13) {
                        throw new UnluckyExpression();
                    }
                    float res = num1 / num2;
                    result.setText(String.format("Result: %.4f",res));
                } catch (NullPointerException npe) {
                    error.setText("Error: Fill all fields");
                } catch (NumberFormatException nfe) {
                    error.setText("Error: Wrong input. Can You Fell My Heart");
                } catch (ArithmeticException ae) {
                    error.setText("Error: Can't evaluate");
                } catch (UnluckyExpression ue) {
                    error.setText("Error, it's 13...");
                }
            }
        });
        c.add(button);
        frame.setVisible(true);
    }
}
