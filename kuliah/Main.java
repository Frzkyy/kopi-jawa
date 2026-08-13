import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        // Membuat window
        JFrame frame = new JFrame("Input Nama");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Layout vertikal
        frame.setLayout(new GridLayout(3, 1));

        // Komponen
        JLabel label = new JLabel("Masukkan nama:");
        JTextField textField = new JTextField();
        JButton button = new JButton("Kirim");

        // Aksi ketika tombol diklik
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textField.getText();
                label.setText("Halo " + nama);
            }
        });

        // Menambahkan ke frame
        frame.add(label);
        frame.add(textField);
        frame.add(button);

        // Menampilkan window
        frame.setVisible(true);
    }
}