package Controller;
import View.Inicio_GUI;
import javax.swing.JOptionPane;

public class Calcula_DAO {
    
    public static void calculo(){
        
        float altura = 0, peso = 0, imc = 0;
        peso = Float.parseFloat(View.Inicio_GUI.txtPeso.getText());
        altura = Float.parseFloat(View.Inicio_GUI.txtAltura.getText());
       
        
        imc = peso / (altura*altura);
        if (imc < 18.5) {
            View.Inicio_GUI.bai.setVisible(true);
            View.Inicio_GUI.mag.setVisible(false);
            View.Inicio_GUI.mei.setVisible(false);
            View.Inicio_GUI.meiG.setVisible(false);
            View.Inicio_GUI.gor.setVisible(false);
        } else if (imc >= 18.5 && imc < 25) {
            View.Inicio_GUI.bai.setVisible(false);
            View.Inicio_GUI.mag.setVisible(true);
            View.Inicio_GUI.mei.setVisible(false);
            View.Inicio_GUI.meiG.setVisible(false);
            View.Inicio_GUI.gor.setVisible(false);
        } else if (imc >= 25 && imc < 30) {
            View.Inicio_GUI.bai.setVisible(false);
            View.Inicio_GUI.mag.setVisible(false);
            View.Inicio_GUI.mei.setVisible(true);
            View.Inicio_GUI.meiG.setVisible(false);
            View.Inicio_GUI.gor.setVisible(false);
        } else if (imc >= 30 && imc < 35) {
            View.Inicio_GUI.bai.setVisible(false);
            View.Inicio_GUI.mag.setVisible(false);
            View.Inicio_GUI.mei.setVisible(false);
            View.Inicio_GUI.meiG.setVisible(true);
            View.Inicio_GUI.gor.setVisible(false);
        } else if (imc >= 35) {
            View.Inicio_GUI.bai.setVisible(false);
            View.Inicio_GUI.mag.setVisible(false);
            View.Inicio_GUI.mei.setVisible(false);
            View.Inicio_GUI.meiG.setVisible(false);
            View.Inicio_GUI.gor.setVisible(true);
        }
        View.Inicio_GUI.imcResul.setText(String.valueOf(imc));
        
    }
    
}
