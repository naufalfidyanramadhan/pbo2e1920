package hellogui;
import javax.swing.*;
public class HelloGui {

    public static void main(String[] args) {
        JFrame frame;
        frame = new JFrame("ini percobaan HelloGui Frame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//program berhenti jika ditutup 
            frame.setSize(600,300);//lebar tinggi windows 
            frame.setLocation(200,200);//x,y tampilan pada windows 
           //frame.setLocationRelativeTo(null);//menampilkan frame ditengah-tengah layar
           frame.setVisible(true);//untuk menampilkan frame
    }
}
