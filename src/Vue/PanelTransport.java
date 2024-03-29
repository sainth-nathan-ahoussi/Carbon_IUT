package Vue;

import Controller.*;

import javax.swing.*;
import java.awt.*;

public class PanelTransport implements ViewBase_Choix{
    private JFrame fenetreTransport;

    public PanelTransport(){
        fenetreTransport = new JFrame ("Carbon IUT");
        fenetreTransport.setSize (1000, 150);
        fenetreTransport.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel BienvenueLabel = new JLabel("Transport Pour venir à l'IUT :");
        JButton VoitureButton = new JButton("Voiture perso");
        JButton CovoiturageButton = new JButton("Covoiturage");
        JButton VeloButton = new JButton("Vélo");
        JButton TransportCommunButton = new JButton("Transport en commun");
        JButton AutreButton = new JButton("Autre");


        buttonPanel.add(VoitureButton);
        buttonPanel.add(CovoiturageButton);
        buttonPanel.add(VeloButton);
        buttonPanel.add(TransportCommunButton);
        buttonPanel.add(AutreButton);

        VoitureButton.addActionListener(new EcouteurChoixActionEvent(this));
        CovoiturageButton.addActionListener(new EcouteurChoix2ActionEvent(this));
        VeloButton.addActionListener(new EcouteurChoix3ActionEvent(this));
        TransportCommunButton.addActionListener(new EcouteurChoix4ActionEvent(this));
        AutreButton.addActionListener(new EcouteurChoix5ActionEvent(this));

        fenetreTransport.add(buttonPanel, BorderLayout.CENTER);

        fenetreTransport.setResizable(false);
        fenetreTransport.setVisible(true);
        fenetreTransport.setLocationRelativeTo(null);
    }

    @Override
    public void Voiture() {
        PanelFood p = new PanelFood();
        fenetreTransport.dispose();
    }

    @Override
    public void Covoiturage() {
        PanelFood p = new PanelFood();
        fenetreTransport.dispose();
    }

    @Override
    public void Vélo() {
        PanelFood p = new PanelFood();
        fenetreTransport.dispose();
    }

    @Override
    public void TransCom() {
        PanelFood p = new PanelFood();
        fenetreTransport.dispose();
    }

    @Override
    public void Autre() {
        PanelFood p = new PanelFood();
        fenetreTransport.dispose();
    }
}
