
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeiso
 */
public class Calcular_Notas {
    
     public static void main(String[] args) {
      double NotaTrimestre1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota trimestre 1"));
      double NotaTrimestre2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota trimestre 2"));
      double NotaFinal=NotaTrimestre1+NotaTrimestre2;
		if (NotaFinal>=7) {
			JOptionPane.showMessageDialog(null, "APRUEBA "+NotaFinal);
		}
		else if (NotaFinal>=5 && NotaFinal<7) {
			JOptionPane.showMessageDialog(null, "HABILITA "+NotaFinal);
		}
		else {
			JOptionPane.showMessageDialog(null, "REPRUEBA "+NotaFinal);
		}   
             
         
         
         
}
}