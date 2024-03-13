
import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Atividade");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        
        JTextField textField1 = new JTextField(20);
        panel.add(textField1);
        
        JTextField textField2 = new JTextField(20);
        panel.add(textField2);
        
        JTextField textField3 = new JTextField(20);
        panel.add(textField3);
        
        JLabel label1 = new JLabel("Digite seu nome, idade e telefone:");
        panel.add(label1);
        
        JLabel label2 = new JLabel("");
        panel.add(label2);
        
        JLabel label3 = new JLabel("");
        panel.add(label3);
        
        JButton button = new JButton("Clique Aqui");
        panel.add(button);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = textField1.getText();
                String text2 = textField2.getText();
                String text3 = textField3.getText();
                JOptionPane.showMessageDialog(null, "Você digitou: " + text1 + ", " + text2 + ", " + text3);
            }
        });
        
        frame.setVisible(true);
    }
}