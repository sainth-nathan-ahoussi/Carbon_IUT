package Controller;

import Vue.ViewBase_Choix;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurChoix4ActionEvent implements ActionListener {
    ViewBase_Choix parent;

    public EcouteurChoix4ActionEvent(ViewBase_Choix parent){
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        parent.TransCom();

    }
}