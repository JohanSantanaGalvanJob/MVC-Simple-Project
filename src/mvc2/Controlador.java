
package mvc2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private Vista v;
    private Modelo m;

    public Controlador(Vista v, Modelo m) {
        this.v = v;
        this.m = m;
        this.v.b.addActionListener(this);
    }
    
    public void iniciar(){
        v.setTitle("MVC");
        v.setLocationRelativeTo(null);
    }
    
     public void actionPerformed (ActionEvent e){
        m.setPalabra(v.texto.getText());
        m.ponerPalabraMayus();
       
        v.nombre.setText(String.valueOf(m.getMayusPalabra()));
    }
    
    
}
