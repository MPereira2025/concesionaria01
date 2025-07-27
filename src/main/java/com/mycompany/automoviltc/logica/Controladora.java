/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automoviltc.logica;

import com.mycompany.automoviltc.persistencia.ControladoraPersistencia;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author massi
 */
public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int puertas) {
        
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(puertas);
        
        controlPersis.agregarAutomovil(auto);
        
    }
    
    
    public void mostrarMensaje(String mensaje, String tipo, String titulo){
                JOptionPane optionPane = new JOptionPane(mensaje);
                if(tipo.equals("Info")){
                        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                }
                else if(tipo.equals("Error")){
                    optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
                }
                JDialog dialog = optionPane.createDialog(titulo);
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
    }

    public List<Automovil> traerAutos() {
       return  controlPersis.traerAutos();
    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }

    public void modificarAutomovil(Automovil auto, String modelo, String marca, String motor, String color, String patente, int puertas) {
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(puertas);
        
        controlPersis.modificarAuto(auto);
    }
    
}
