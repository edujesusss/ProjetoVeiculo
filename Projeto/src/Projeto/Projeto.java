
package Projeto;

import javax.swing.JOptionPane;
import model.Veiculo;

public class Projeto {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo ();
        
        v1.setQuilometros (Integer.parseInt (JOptionPane.showInputDialog ("Digite os Km's percorridos: ")));
        v1.setLitros (Integer.parseInt (JOptionPane.showInputDialog ("Digite os Litros gastos: ")));
        
        JOptionPane.showMessageDialog (null, "O consumo de " + v1.getConsumo() + "Km/1");

    }
    
}
