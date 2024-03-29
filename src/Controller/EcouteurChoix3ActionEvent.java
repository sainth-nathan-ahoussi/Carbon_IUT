package Controller;

import Vue.ViewBase_Choix;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurChoix3ActionEvent implements ActionListener {
    ViewBase_Choix parent;

    public EcouteurChoix3ActionEvent(ViewBase_Choix parent){
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        parent.Vélo();
    }
}