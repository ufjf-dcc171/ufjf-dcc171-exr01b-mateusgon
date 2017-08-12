package dcc171.ufjf.br;

import javax.swing.JOptionPane;

public class Aula02Exr01b {

    public static void main(String[] args) {
        try {
        Double x1, x2;
        Double y1, y2;
        String x = JOptionPane.showInputDialog("Digite o valor de X1");
        String y = JOptionPane.showInputDialog("Digite o valor de Y1");
        String xi = JOptionPane.showInputDialog("Digite o valor de X2");
        String yi = JOptionPane.showInputDialog("Digite o valor de Y2");
        x1 = Double.parseDouble(x);
        y1 = Double.parseDouble(y);
        x2 = Double.parseDouble(xi);
        y2 = Double.parseDouble(yi);
        Double valor = Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow(y2-y1, 2)));
        JOptionPane.showMessageDialog(null, "A distância entre os pontos X1 (" +  
        x1 + "," + y1 + ") e X2 (" + x2 + "," + y2 + ") +  é " + valor, "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null,"Algum valor foi digitado de forma errada", "Digite novamente", JOptionPane.ERROR_MESSAGE);
        }
    }
}
