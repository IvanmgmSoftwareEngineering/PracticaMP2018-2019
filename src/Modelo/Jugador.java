package Modelo;


import java.util.ArrayDeque;
import java.util.Deque;


public class Jugador {

    private int idVentana;
    private String nombreJugador;
    private HebraSerpiente serpiente;
    private Deque<Posicion> posicionesSerpiente;

    public Jugador(int idVantana, String nombreJugador, HebraSerpiente serpiente, Posicion posicionInicialCabeza) {
        this.idVentana = idVantana;
        this.nombreJugador = nombreJugador;
        this.serpiente = serpiente;
        this.posicionesSerpiente = new ArrayDeque<Posicion>();
        this.posicionesSerpiente.addFirst(posicionInicialCabeza);
    }

    public HebraSerpiente getSerpiente() {
        return serpiente;
    }

    public Deque<Posicion> getPosicionesSerpiente() {
        return posicionesSerpiente;
    }

    public int getIdVentana() {
        return idVentana;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }





    public void setPosicionesSerpiente(Deque<Posicion> posicionesSerpiente) {
        this.posicionesSerpiente = posicionesSerpiente;
    }




    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Jugador){
            Jugador jugador = (Jugador) obj;
            return this.idVentana == jugador.idVentana;
        }
        else{
            return false;
        }
    }







}
