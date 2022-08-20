package examen1p2_wilmerzuniga;

public class Armas {
    String Nombre;
    int Daño;
    int Precision;

    public Armas() {
    }

    public Armas(String Nombre, int Daño, int Precision) {
        this.Nombre = Nombre;
        this.Daño = Daño;
        this.Precision = Precision;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDaño() {
        return Daño;
    }

    public void setDaño(int Daño) {
        this.Daño = Daño;
    }

    public int getPrecision() {
        return Precision;
    }

    public void setPrecision(int Precision) {
        this.Precision = Precision;
    }

    @Override
    public String toString() {
        return "Armas{" + "Nombre=" + Nombre + ", Da\u00f1o=" + Daño + ", Precision=" + Precision + '}';
    }


    
    
}
