/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_wilmerzuniga;

public class Jugadores {
    String Nombre;
    int Id;
    String Contraseña;

    Personajes Personaje;

    public Jugadores(String Nombre, String Contraseña) {
        this.Nombre = Nombre;
        this.Id = (int)(Math.random()*(5000-1+1)+1);
        this.Contraseña = Contraseña;
        //this.Personaje = new Personajes();
    }

    public Jugadores(String Nombre, int Id, String Contraseña, Personajes Personaje) {
        this.Nombre = Nombre;
        this.Id = Id;
        this.Contraseña = Contraseña;
        this.Personaje = Personaje;
    }
    
    

    public Jugadores() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public Personajes getPersonaje() {
        return Personaje;
    }

    public void setPersonaje(Personajes Personaje) {
        this.Personaje = Personaje;
    }

    @Override
    public String toString() {
        return Nombre + "   [ " + Id + " ]" ;
    }

    
    
    
}
