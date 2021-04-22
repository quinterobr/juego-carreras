package clases;

import javax.swing.JLabel;

public class Vehiculo {

    private JLabel etiqueta;
    private Conductor conductor;
    private int recorrido;

    public Vehiculo() {
        this.recorrido = 0; 
    }

    public JLabel getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(JLabel etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    
    public int getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(int recorrido) {
        this.recorrido = recorrido;
    }
    
    public void avanzar(int avance){
        etiqueta.setLocation(etiqueta.getX() + avance, etiqueta.getY());
    }

}
