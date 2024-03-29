package Vue;
import Controller.EcouteurRecommencerActionEvent;

import javax.swing.*;
import java.awt.*;

public class PanelWelcome extends JPanel implements ViewBase_Transport{
    private JFrame fenetreBienvenue;

    public PanelWelcome(){
        fenetreBienvenue = new JFrame ("Carbon IUT");
        fenetreBienvenue.setSize (1000, 150);
        fenetreBienvenue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel BienvenueLabel = new JLabel("Bienvenue !");
        JButton commencerButton = new JButton("Commencer");

        buttonPanel.add(BienvenueLabel);
        buttonPanel.add(commencerButton);

        commencerButton.addActionListener(new EcouteurRecommencerActionEvent(this));


        fenetreBienvenue.add(buttonPanel, BorderLayout.CENTER);

        fenetreBienvenue.setResizable(false);
        fenetreBienvenue.setVisible(true);
        fenetreBienvenue.setLocationRelativeTo(null);
    }

    @Override
    public void Recommencer() {
        PanelTransport p = new PanelTransport();
        fenetreBienvenue.dispose();
    }
}
