
package mvc2;
public class mvc2 {
     public static void main(String[] args)
    {
        Modelo mod = new Modelo();
        Vista view = new Vista();
        Controlador ctrl = new Controlador(view,mod);
        ctrl.iniciar();
        view.setVisible(true); 
    }    
}
