package Vue;

import javax.swing.*;
import java.awt.*;
import Controller.EcouteurRecommencerActionEvent;
import Model.ModelFood;

public class PanelThanks implements ViewBase_Transport {
    private JFrame fenetreThanks;
    String j = "2";

    public PanelThanks(ModelFood modelFood){
        fenetreThanks = new JFrame ("Carbon IUT");
        fenetreThanks.setSize (1000, 150);
        fenetreThanks.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        double m = modelFood.computeCO2(ModelFood.Meal.VEGAN) + modelFood.computeCO2(ModelFood.Meal.VEGETARIEN) + modelFood.computeCO2(ModelFood.Meal.BOEUF) + modelFood.computeCO2(ModelFood.Meal.AUTRE_VIANDE_POISSON) ;

        JLabel BienvenueLabel = new JLabel("Vous émettez entre"+ " " + m + " " +"et"+ " " +j+ " " +"kg de CO2 par semaine");
        JButton RecommencerButton = new JButton("Recommencer");

        RecommencerButton.addActionListener(new EcouteurRecommencerActionEvent(this));

        buttonPanel.add(BienvenueLabel);
        buttonPanel.add(RecommencerButton);


        fenetreThanks.add(buttonPanel, BorderLayout.CENTER);

        fenetreThanks.setResizable(false);
        fenetreThanks.setVisible(true);
        fenetreThanks.setLocationRelativeTo(null);
    }

    @Override
    public void Recommencer() {
            PanelTransport p = new PanelTransport();
            fenetreThanks.dispose();
    }
}
