/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_wilmerzuniga;

/**
 *
 * @author wilme
 */
public class Medico extends Personajes implements Atacar {

    public Medico(String Nombre, int Vida, int Escudo, Armas Arma) {
        super(Nombre, Vida, Escudo, Arma);
    }

    public Medico() {
    }

    @Override
    public Personajes Atacar(Personajes Atacante, Personajes Atacado) {
        if (Atacado instanceof Ratreador ) {
            Atacado.setVida(Atacado.getVida() - (Atacante.getArma().getDaño() + (Atacante.getArma().getDaño() % 5)));
        } else {
            Atacado.setVida(Atacado.getVida() - (Atacante.getArma().getDaño()));

        }

        return Atacado;
    }

}
