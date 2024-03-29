package Controller;

import Vue.ViewBase_Thanks;
import Vue.ViewBase_Transport;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurSuivantActionEvent  implements ActionListener {
    ViewBase_Thanks parent;

    public EcouteurSuivantActionEvent(ViewBase_Thanks parent){
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        parent.Suivant();
    }
}
