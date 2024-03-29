package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vue.ViewBase_Transport;
public class EcouteurRecommencerActionEvent implements ActionListener {
    ViewBase_Transport parent;

    public EcouteurRecommencerActionEvent(ViewBase_Transport parent){
        this.parent = parent;
    }
    public void actionPerformed(ActionEvent e) {
        parent.Recommencer();
    }
}
