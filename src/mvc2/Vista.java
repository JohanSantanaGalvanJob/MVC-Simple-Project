
package mvc2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Vista extends JFrame {
    
    JButton b;
    JTextField texto;
    JLabel nombre;
    public Vista(){
        
       setLayout(null);
       setBounds(0, 0, 400, 400);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b = new JButton("Poner en mayúscula el nombre");
        b.setBounds(20, 20, 250, 30);
        add(b);
        
        texto = new JTextField();
        texto.setBounds(20,70,250,30);
        add(texto);
        setVisible(true); 
        
         nombre = new JLabel();
        nombre.setBounds(20,110,250,30);
        add(nombre);
        
        
    }
    
     
        
}
