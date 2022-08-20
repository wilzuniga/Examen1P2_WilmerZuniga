/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_wilmerzuniga;

public class Ratreador extends Personajes implements Atacar {

    public Ratreador(String Nombre, int Vida, int Escudo, Armas Arma) {
        super(Nombre, Vida, Escudo, Arma);
    }

    public Ratreador() {
    }

    @Override
    public Personajes Atacar(Personajes Atacante, Personajes Atacado) {
        if (Atacado instanceof Fortaleza || Atacado instanceof Medico) {
            Atacado.setVida(Atacado.getVida() - (Atacante.getArma().getDaño() + (Atacante.getArma().getDaño() % 10)));
        } else {
            Atacado.setVida(Atacado.getVida() - (Atacante.getArma().getDaño()));

        }
        
        return Atacado;

    }

}
