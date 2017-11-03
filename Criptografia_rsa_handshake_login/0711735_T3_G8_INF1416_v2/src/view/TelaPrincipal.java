package view;

import java.awt.FlowLayout;

import javax.swing.*;


@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
    
    private PainelPrincipal painelPrincipal;
    
    public TelaPrincipal ()
    {
        setTitle("P1 INF1416 - GRUPO8 - MICHELLE RODRIGUES");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLocation(400, 120);
        setLayout(new FlowLayout());    
        setLocationRelativeTo( null );

        painelPrincipal = new PainelPrincipal(this);
        getContentPane().add(painelPrincipal);
        setVisible(true);

        
    }
}
