package Controller;

import Vue.ViewBase_Choix;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurChoix2ActionEvent implements ActionListener {
    ViewBase_Choix parent;

    public EcouteurChoix2ActionEvent(ViewBase_Choix parent){
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        parent.Covoiturage();
    }
}