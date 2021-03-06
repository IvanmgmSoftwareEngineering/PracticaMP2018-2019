/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Posicion;
import Controlador.Controlador;
import Modelo.GameEvent;
import java.awt.Color;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;





public class VentanaPrincipal  extends JFrame implements Observer {

    /**
     * Creates new form NewJFrame
     */
    private int idVentana;
    private JPanel [][] matriz;
    private Controlador controlador;
    private boolean nombreIntroducido;
    private String nombreJugador;
    private Color colorFruta;
    private int altura_tablero;
    private int ancho_tablero;
    private int velocidadSerpiente;
    private boolean juegoIniciado;
    
    
   
    
    public VentanaPrincipal(int idVentana,Controlador controlador, int altura_tablero, int ancho_tablero, int velocidad_serpiente) {
        initComponents();
        this.idVentana = idVentana;
        this.controlador = controlador;
        this.altura_tablero = altura_tablero;
        this.ancho_tablero = ancho_tablero;
        this.velocidadSerpiente = velocidad_serpiente;
        this.nombreJugador = "";
        
        matriz = new JPanel [altura_tablero][ancho_tablero];
        this.jPanel2.setLayout(new GridLayout(altura_tablero,ancho_tablero));
        this.rellenaPanel();
        
        desplegableColores.removeAllItems();
        desplegableColores.addItem("Green");
        desplegableColores.addItem("Red");
        desplegableColores.addItem("Black");
        desplegableColores.addItem("Blue");
        introducirNombre.setText("Introduzca nombre del jugador, el color y pulsar iniciar");
        
        this.anadirFuncionalidadTeclado();
        this.colorFruta = Color.pink;
        this.nombreIntroducido = false;
        this.juegoIniciado = false;
        

        
        
    }

    /**
     * This method is called   within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonIniciar = new javax.swing.JButton();
        introducirNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        muestraNombre = new javax.swing.JTextPane();
        muestraCoordenadaX = new javax.swing.JTextField();
        muestraCoordenadaY = new javax.swing.JTextField();
        botonGirarArriba = new javax.swing.JButton();
        botonGirarIzquierda = new javax.swing.JButton();
        botonGirarDerecha = new javax.swing.JButton();
        botonGirarAbajo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        botonPausa = new javax.swing.JButton();
        desplegableColores = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Nombre");

        jLabel2.setText("Eje Y");

        jLabel3.setText("Eje X");

        botonIniciar.setText("Iniciar");
        botonIniciar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });

        introducirNombre.setText("Introduzca nombre del jugador y pulsar iniciar");
        introducirNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introducirNombreActionPerformed(evt);
            }
        });

        muestraNombre.setEditable(false);
        jScrollPane1.setViewportView(muestraNombre);

        muestraCoordenadaX.setEditable(false);
        muestraCoordenadaX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muestraCoordenadaXActionPerformed(evt);
            }
        });

        muestraCoordenadaY.setEditable(false);

        botonGirarArriba.setText("▲");
        botonGirarArriba.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonGirarArriba.setEnabled(false);
        botonGirarArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGirarArribaActionPerformed(evt);
            }
        });

        botonGirarIzquierda.setText("◀");
        botonGirarIzquierda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonGirarIzquierda.setEnabled(false);
        botonGirarIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGirarIzquierdaActionPerformed(evt);
            }
        });

        botonGirarDerecha.setText("►");
        botonGirarDerecha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonGirarDerecha.setEnabled(false);
        botonGirarDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGirarDerechaActionPerformed(evt);
            }
        });

        botonGirarAbajo.setText("▼");
        botonGirarAbajo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonGirarAbajo.setEnabled(false);
        botonGirarAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGirarAbajoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        botonPausa.setText("Pause");
        botonPausa.setEnabled(false);
        botonPausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPausaActionPerformed(evt);
            }
        });

        desplegableColores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        desplegableColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desplegableColoresActionPerformed(evt);
            }
        });

        jLabel4.setText("Color");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(muestraCoordenadaX, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabel3)
                                        .addGap(19, 19, 19)
                                        .addComponent(muestraCoordenadaY, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonGirarIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonGirarAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonGirarDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(introducirNombre)
                                .addGap(18, 18, 18)
                                .addComponent(botonGirarArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(botonIniciar)
                                .addGap(34, 34, 34)
                                .addComponent(botonPausa))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(desplegableColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(introducirNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(muestraCoordenadaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(muestraCoordenadaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(botonGirarArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonGirarIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonGirarDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonGirarAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desplegableColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonIniciar)
                    .addComponent(botonPausa))
                .addContainerGap(416, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if(botonIniciar.getText() == "Iniciar" && nombreIntroducido == true && desplegableColores.getSelectedItem()!= " " ) {           
            this.controlador.start(this.idVentana,(String)desplegableColores.getSelectedItem(), this.velocidadSerpiente,this.nombreJugador); 
        }
        else if (botonIniciar.getText() == "Reiniciar"){           
            this.controlador.reiniciar();
        }
    }                                            

    private void introducirNombreActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        if(introducirNombre.getText().length()>0 && introducirNombre.getText().length()<10){
            muestraNombre.setText(introducirNombre.getText());
            introducirNombre.setText("");
            nombreIntroducido = true;
            this.nombreJugador = muestraNombre.getText();
        }
        else{
            introducirNombre.setCaretColor(Color.red);
        }

    }                                                

    private void botonPausaActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if(botonPausa.getText() == "Pause") {
            this.controlador.pause();
         }
        else if (botonPausa.getText() == "Reanudar"){
            this.controlador.reanudar();  
        }    
    }                                          

    private void botonGirarDerechaActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        this.controlador.girarDerecha(this.idVentana);
    }                                                 

    private void desplegableColoresActionPerformed(java.awt.event.ActionEvent evt) {                                                   
       
    }                                                  

    private void botonGirarIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        this.controlador.girarIzquierda(this.idVentana);
    }                                                   

    private void botonGirarArribaActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        this.controlador.girarArriba(this.idVentana);
    }                                                

    private void botonGirarAbajoActionPerformed(java.awt.event.ActionEvent evt) {                                                
    this.controlador.girarAbajo(this.idVentana);
    }                                               

    private void muestraCoordenadaXActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    
    
    
    public int getNumFilas() {
        return this.altura_tablero;
    }

    public int getNumColumnas() {
        return this.ancho_tablero;
    }
    
    public JTextField getMuestraCoordenadaX() {
        return muestraCoordenadaX;
    }

    public JTextField getMuestraCoordenadaY() {
        return muestraCoordenadaY;
    }
    
    public  void rellenaPanel (){
                
                for(int i =0; i < altura_tablero ; i++){
                    for(int j =0; j < ancho_tablero ; j++){
                            JPanel panel = new JPanel();
                            matriz[i][j]= new JPanel();
                            matriz[i][j].setBackground(Color.white);
                            this.jPanel2.add(matriz[i][j]); 
                    }
                }
            }
     
    public void ponerBlanco () {
        SwingUtilities.invokeLater(new Runnable() {            
            @Override
            public void run() {
                for(int i =0; i < altura_tablero ; i++) {
                    for(int j =0; j < ancho_tablero ; j++) {
                        matriz[i][j].setBackground(Color.white); 
                    }
                }
            }
        });
    }
    
    //public JPanel muestraPosicion (JPanel panelPrincipal){
        
    
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton botonGirarAbajo;
    private javax.swing.JButton botonGirarArriba;
    private javax.swing.JButton botonGirarDerecha;
    private javax.swing.JButton botonGirarIzquierda;
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonPausa;
    private javax.swing.JComboBox<String> desplegableColores;
    private javax.swing.JTextField introducirNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField muestraCoordenadaX;
    private javax.swing.JTextField muestraCoordenadaY;
    private javax.swing.JTextPane muestraNombre;
    // End of variables declaration                   
    
   
    //@Override
    public void notifyEvent(GameEvent evento) {
        
        SwingUtilities.invokeLater(new Runnable() {
            //SwingUgilities clase que contiene el metodod static 'invokeLater'
            //Runnable: interfaz que solo tiene el método run
            // el objetivo de lo anterior es crear una cola de eventos para ir almacenando los eventos
            @Override
            public void run() {
                manejarEvento(evento);
            } 
        });
    }
    
    
    
    public void manejarEvento (GameEvent evento) {
        switch (evento.getEvento()){
            
            case START: 
                if(this.idVentana == (int) evento.getDatos6()){
                    this.start();
                    this.juegoIniciado = true;
                    this.dibujaFruta((Posicion)evento.getDatos5());
                    this.dibujaSerpiente((Posicion)evento.getDatos1(),(Posicion) evento.getDatos2(),(String) evento.getDatos3(), (int) evento.getDatos6());
                }   
                    break; 
  
            case PAUSE:
                    this.pause();
                    break;
                
            case REANUDAR:
                    this.reanudar();
                    break;
                
            case REINICIAR:
                    this.reiniciar();
                    break;
                    
            case MOVER_SERPIENTE: 
                if(this.juegoIniciado == true){
                    this.dibujaSerpiente((Posicion)evento.getDatos1(),(Posicion) evento.getDatos2(),(String) evento.getDatos3(), (int)evento.getDatos4());
                }
                    break; 
                    
            case NUEVA_FRUTA: 
                    this.dibujaFruta((Posicion) evento.getDatos1());
                    break;         
                   
            case FINALIZAR_JUEGO:
                    this.finalizarJuego();
                    break;
             
            case NOMBRE_NO_VALIDO:  
                    if(this.idVentana == (int)evento.getDatos2()){
                        this.nombreNoValido((String) evento.getDatos1());
                    }
                    break; 
                    
            case COLOR_NO_VALIDO:
                    if(this.idVentana == (int)evento.getDatos3()){
                        this.colorNoValido((String) evento.getDatos1());
                    }
                    break; 
                    
                    
        } 
    }
    
    private void dibujaSerpiente (Posicion nuevaPosicionCabeza, Posicion PosicionColaPonerABlanco, String colorSerpiente, int idVentana){
        this.matriz[nuevaPosicionCabeza.getFila()][nuevaPosicionCabeza.getColumna()].setBackground(this.StringColorSerpienteToColor(colorSerpiente));
        this.matriz[PosicionColaPonerABlanco.getFila()][PosicionColaPonerABlanco.getColumna()].setBackground(Color.white);
        if(idVentana == this.idVentana){
            this.mostrarCoordenadasCabeza(nuevaPosicionCabeza.getFila(),nuevaPosicionCabeza.getColumna());
        }

        

    }
    
    private void dibujaFruta (Posicion posicionFruta){
        this.matriz[posicionFruta.getFila()][posicionFruta.getColumna()].setBackground(this.colorFruta);
    }
    /*
    private void dibujaSerpiente (int nuevaPosicionFila, int nuevaPosicionColumna, String colorSerpiente){
        this.matriz[nuevaPosicionFila][nuevaPosicionColumna].setBackground(this.StringColorSerpienteToColor(colorSerpiente));
        this.matriz[this.posicionCabeza.getFila()][this.posicionCabeza.getColumna()].setBackground(Color.white);
        this.posicionCabeza.setFila(nuevaPosicionFila);
        this.posicionCabeza.setColumna(nuevaPosicionColumna);
        
        //this.posicionesSerpiente.addFirst (nuevaPosCabeza);
        //this.matriz[this.posicionesSerpiente.getFirst().getFila()][this.posicionesSerpiente.getFirst().getColumna()].setBackground(this.colorSerpiente);
        //this.matriz[this.posicionesSerpiente.getLast().getFila()][this.posicionesSerpiente.getLast().getColumna()].setBackground(Color.white);
        //this.posicionesSerpiente.removeLast(); 
    }
*/
    
    private void start(){
        introducirNombre.setText("");
        muestraCoordenadaX.setEnabled(true);
        muestraCoordenadaY.setEnabled(true);
        botonIniciar.setEnabled(false);
        botonPausa.setEnabled(true);
        botonGirarDerecha.setEnabled(true);
        botonGirarIzquierda.setEnabled(true);
        botonGirarAbajo.setEnabled(true);
        botonGirarArriba.setEnabled(true);
        botonIniciar.setText("Reiniciar");
        desplegableColores.setEnabled(false);
        
    }
    
    private void reiniciar(){
        desplegableColores.setEnabled(true);
        desplegableColores.setSelectedItem(" ");
        botonIniciar.setText("Iniciar");
        botonPausa.setText("Pause");
        botonPausa.setEnabled(false);
        muestraNombre.setText("");
        desplegableColores.removeAllItems();
        desplegableColores.addItem("Green");
        desplegableColores.addItem("Red");
        desplegableColores.addItem("Black");
        desplegableColores.addItem("Blue");
        introducirNombre.setText("Introduzca nombre del jugador, el color y pulsar iniciar");
        muestraCoordenadaX.setText("-");
        muestraCoordenadaY.setText("-");
        nombreIntroducido = false;
        this.juegoIniciado = false;
        SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            ponerBlanco();  
                        }
                    });
        
    }
    
    private void pause(){
        botonIniciar.setEnabled(true);
        botonPausa.setText("Reanudar");
        
    }
    
    private void reanudar(){
        this.anadirFuncionalidadTeclado();
        botonPausa.setText("Pause");
        
        
    }
    
    private void nombreNoValido(String nombreCliente){
        this.introducirNombre.setCaretColor(Color.RED);
        this.introducirNombre.setText("El nombre: " + nombreCliente + ", ya lo ha escogido otro jugador, por favor introduzca otro");
        this.introducirNombre.setCaretColor(Color.black);
    }
    
    private void colorNoValido(String colorSerpiente){
        this.introducirNombre.setText("El color: " + colorSerpiente + ", ya lo ha escogido otro jugador, por favor escoja otro");
        this.desplegableColores.removeItem(colorSerpiente );
        
    }
    
    public void finalizarJuego() {
        botonPausa.setEnabled(false);
        botonIniciar.setEnabled(true);
        this.mostrarGameOver();
        
        //Aquí tenemos que meter más cosas para parar la partida
    }
    
    private void mostrarGameOver (){
        SwingUtilities.invokeLater(new Runnable() {            
            @Override
            public void run() {
                //Muestra la G
                matriz[2][3].setBackground(Color.red);
                matriz[2][4].setBackground(Color.red);
                matriz[3][2].setBackground(Color.red);
                matriz[4][2].setBackground(Color.red);
                matriz[5][2].setBackground(Color.red);
                matriz[5][4].setBackground(Color.red);
                matriz[6][3].setBackground(Color.red);
                matriz[6][4].setBackground(Color.red);
            }
        });
        
        SwingUtilities.invokeLater(new Runnable() {            
            public void run() {       
        //Muestra la A
                matriz[2][7].setBackground(Color.red);
                matriz[3][6].setBackground(Color.red);
                matriz[3][8].setBackground(Color.red);
                matriz[4][6].setBackground(Color.red);
                matriz[4][7].setBackground(Color.red);
                matriz[4][8].setBackground(Color.red);
                matriz[5][6].setBackground(Color.red);
                matriz[5][8].setBackground(Color.red);
                matriz[6][6].setBackground(Color.red);
                matriz[6][8].setBackground(Color.red);
            }
        });
        
        SwingUtilities.invokeLater(new Runnable() {            
            public void run() {
        //Muestra la M
                matriz[2][11].setBackground(Color.red);
                matriz[2][13].setBackground(Color.red);
                matriz[3][10].setBackground(Color.red);
                matriz[3][12].setBackground(Color.red);
                matriz[3][14].setBackground(Color.red);
                matriz[4][10].setBackground(Color.red);
                matriz[4][12].setBackground(Color.red);
                matriz[4][14].setBackground(Color.red);
                matriz[5][10].setBackground(Color.red);
                matriz[5][12].setBackground(Color.red);
                matriz[5][14].setBackground(Color.red);
                matriz[6][10].setBackground(Color.red);
                matriz[6][14].setBackground(Color.red);
            }
        });
        
        SwingUtilities.invokeLater(new Runnable() {            
            public void run() {
        //Muestra la E
                matriz[2][16].setBackground(Color.red);
                matriz[2][17].setBackground(Color.red);
                matriz[2][18].setBackground(Color.red);
                matriz[3][16].setBackground(Color.red);
                matriz[4][16].setBackground(Color.red);
                matriz[4][17].setBackground(Color.red);
                matriz[5][16].setBackground(Color.red);
                matriz[6][16].setBackground(Color.red);
                matriz[6][17].setBackground(Color.red);
                matriz[6][18].setBackground(Color.red);
            }
        });
        
        SwingUtilities.invokeLater(new Runnable() {            
            public void run() {
        //Muestra la O
                matriz[8][4].setBackground(Color.red);
                matriz[9][3].setBackground(Color.red);
                matriz[9][5].setBackground(Color.red);
                matriz[10][3].setBackground(Color.red);
                matriz[10][5].setBackground(Color.red);
                matriz[11][3].setBackground(Color.red);
                matriz[11][5].setBackground(Color.red);
                matriz[12][4].setBackground(Color.red);
            }
        });
        
        SwingUtilities.invokeLater(new Runnable() {            
            public void run() {
        //Muestra la V
                matriz[8][7].setBackground(Color.red);
                matriz[8][9].setBackground(Color.red);
                matriz[9][7].setBackground(Color.red);
                matriz[9][9].setBackground(Color.red);
                matriz[10][7].setBackground(Color.red);
                matriz[10][9].setBackground(Color.red);
                matriz[11][7].setBackground(Color.red);
                matriz[11][9].setBackground(Color.red);
                matriz[12][8].setBackground(Color.red);
            }
        });
        
        SwingUtilities.invokeLater(new Runnable() {            
            public void run() {
        //Muestra la E
                matriz[8][11].setBackground(Color.red);
                matriz[8][12].setBackground(Color.red);
                matriz[8][13].setBackground(Color.red);
                matriz[9][11].setBackground(Color.red);
                matriz[10][11].setBackground(Color.red);
                matriz[10][12].setBackground(Color.red);
                matriz[11][11].setBackground(Color.red);
                matriz[12][11].setBackground(Color.red);
                matriz[12][12].setBackground(Color.red);
                matriz[12][13].setBackground(Color.red);
            }
        });
        
        SwingUtilities.invokeLater(new Runnable() {            
            @Override
            public void run() {
                //Muestra la R
                matriz[8][15].setBackground(Color.red);
                matriz[8][16].setBackground(Color.red);
                matriz[9][15].setBackground(Color.red);
                matriz[9][17].setBackground(Color.red);
                matriz[10][15].setBackground(Color.red);
                matriz[10][16].setBackground(Color.red);
                matriz[11][15].setBackground(Color.red);
                matriz[11][17].setBackground(Color.red);
                matriz[12][15].setBackground(Color.red);
                matriz[12][17].setBackground(Color.red);
            }
        });
    }
   
    
       
    
   
        
        
    
    
            

    private Color StringColorSerpienteToColor(String color) {
        
        Color resultado = Color.ORANGE;
        
        switch (color){
            
            case "Green":
                
                resultado = Color.green;
                break;
             
            case "Red":
                
                resultado = Color.red; 
                break;
                
            case "Black":
                
                resultado = Color.black; 
                break;
                
             case "Blue":
                
                resultado = Color.blue; 
                break;
        }
        return resultado;
    }
    
    private String ColorSerpienteToString(Color color) {
        
        String resultado = "";
        if(color == Color.green){                
            resultado = "Green";
        }
        else if (color == Color.red){                
            resultado = "Red";   
        }
        else if (color == Color.black){                
            resultado = "Black";   
        }
        else if (color == Color.blue){                
            resultado = "Blue";   
        }
        return resultado;             
    }
    
    public void mostrarCoordenadasCabeza(int posicionCabezaX, int posicionCabezaY ){
        muestraCoordenadaX.setText(String.valueOf(posicionCabezaX));
        muestraCoordenadaY.setText(String.valueOf(posicionCabezaY));
    }
    
    
    
     

    private void anadirFuncionalidadTeclado() {
        this.setFocusable(true);
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode()== 39){
                    
                        controlador.girarDerecha(idVentana);     
                }
                else if(e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode()== 37){
                    
                        controlador.girarIzquierda(idVentana);    
                }
                else if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode()== 38){
                    
                        controlador.girarArriba(idVentana);
                }
                else if(e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode()== 40){
                    
                        controlador.girarAbajo(idVentana);
                }           
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
}

