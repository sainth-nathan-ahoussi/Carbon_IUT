package Controller;

import Vue.ViewBase_Choix;
import Vue.ViewBase_Transport;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurChoixActionEvent implements ActionListener {
    ViewBase_Choix parent;

    public EcouteurChoixActionEvent(ViewBase_Choix parent){
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        parent.Voiture();
    }
}
