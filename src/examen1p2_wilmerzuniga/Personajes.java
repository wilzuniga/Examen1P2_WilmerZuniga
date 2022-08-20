package examen1p2_wilmerzuniga;

public abstract class Personajes implements Atacar{
   String Nombre;
   int Vida;
   int Escudo;
   Armas Arma;

    public Personajes(String Nombre, int Vida, int Escudo, Armas Arma) {
        this.Nombre = Nombre;
        this.Vida = Vida;
        this.Escudo = Escudo;
        this.Arma = Arma;
    }

    public Personajes() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public int getEscudo() {
        return Escudo;
    }

    public void setEscudo(int Escudo) {
        this.Escudo = Escudo;
    }

    public Armas getArma() {
        return Arma;
    }

    public void setArma(Armas Arma) {
        this.Arma = Arma;
    }

    @Override
    public String toString() {
        return "Personajes{" + "Nombre=" + Nombre + ", Vida=" + Vida + ", Escudo=" + Escudo + ", Arma=" + Arma + '}';
    }




    
   
}
