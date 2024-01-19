/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author marco
 */
public class Controlador implements ActionListener{
    private Vista view;
    private Modelo model;
    
    public Controlador(Vista view, Modelo model){
        
        this.view = view;
        this.model = model;
        this.view.btnMultiplicar.addActionListener(this);
    }
    public void iniciar(){
        
        view.setTitle("MVC Multiplicar");
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
        model.setNumeroUno(Integer.parseInt(view.Txt1.getText()));
        model.setNumeroDos(Integer.parseInt(view.Txt2.getText()));
        model.multiplicar();
        view.txtResultado.setText(String.valueOf( model.getResultado()));
    }
    
}
