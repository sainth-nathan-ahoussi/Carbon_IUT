package Vue;

import javax.swing.*;
import java.awt.*;

import Controller.EcouteurRecommencerActionEvent;
import Controller.EcouteurSuivantActionEvent;
import Model.ModelFood;

public class PanelFood implements ViewBase_Thanks {

    private JFrame fenetreFood;
    private JTextField NbVegan,NbVegetarien,NbBoeuf,NbAutre;

    public PanelFood(){
        fenetreFood = new JFrame ("Carbon IUT");
        fenetreFood.setSize (1000, 250);
        fenetreFood.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fenetreFood.setLayout(new GridLayout(3, 1));

////////////////////////////////////////////////////////////////////////////////////////////
        JPanel HeaderPanel = new JPanel();
        JLabel RepasLabel = new JLabel("Indiquez le nombre de repas de chaque type pris par semaine");
        HeaderPanel.add(RepasLabel);
////////////////////////////////////////////////////////////////////////////////////////////
        JPanel FoodPanel = new JPanel(new GridLayout(1, 4));
        JPanel VeganPanel = new JPanel(new FlowLayout());
        JLabel Plat1Label = new JLabel("Vegan");
        NbVegan = new JTextField(19);
        VeganPanel.add(Plat1Label);
        VeganPanel.add(NbVegan);

        JPanel VegetarienPanel = new JPanel(new FlowLayout());
        JLabel Plat2Label = new JLabel("Végétarien");
        NbVegetarien = new JTextField(19);
        VegetarienPanel.add(Plat2Label);
        VegetarienPanel.add(NbVegetarien);

        JPanel BoeufPanel = new JPanel(new FlowLayout());
        JLabel Plat3Label = new JLabel("À base de boeuf");
        NbBoeuf = new JTextField(19);
        BoeufPanel.add(Plat3Label);
        BoeufPanel.add(NbBoeuf);

        JPanel AutrePanel = new JPanel(new FlowLayout());
        JLabel Plat4Label = new JLabel("À base d'une autre viande ou d'un poisson");
        NbAutre = new JTextField(19);
        AutrePanel.add(Plat4Label);
        AutrePanel.add(NbAutre);

        FoodPanel.add(VeganPanel);
        FoodPanel.add(VegetarienPanel);
        FoodPanel.add(BoeufPanel);
        FoodPanel.add(AutrePanel);
////////////////////////////////////////////////////////////////////////////////////////////
        JPanel buttonPanel = new JPanel();
        JButton SuivantButton = new JButton("Suivant");
        buttonPanel.add(SuivantButton);
        SuivantButton.addActionListener(new EcouteurSuivantActionEvent(this));
////////////////////////////////////////////////////////////////////////////////////////////

        fenetreFood.add(HeaderPanel);
        fenetreFood.add(FoodPanel);
        fenetreFood.add(buttonPanel);

        fenetreFood.setResizable(false);
        fenetreFood.setVisible(true);
        fenetreFood.setLocationRelativeTo(null);
    }

    @Override
    public void Suivant() {
        int nbAutre = Integer.parseInt(NbAutre.getText());
        int nbVegan = Integer.parseInt(NbVegan.getText());
        int nbVegetarien= Integer.parseInt(NbVegetarien.getText());
        int nbBoeuf = Integer.parseInt(NbBoeuf.getText());

        ModelFood model = new ModelFood(nbVegan,nbVegetarien,nbBoeuf,nbAutre);

        fenetreFood.dispose();
        PanelThanks b = new PanelThanks(model);

    }
}
