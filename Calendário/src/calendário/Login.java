/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendário;

import javax.swing.JOptionPane;

/**
 *
 * @author Tarcyo
 */
import java.util.GregorianCalendar;

public class Login {

    static GregorianCalendar data = new GregorianCalendar();
    static String nome = "Tarcyo";
    static String senha = "123";

    public static void main(String[] args) {
        String n = JOptionPane.showInputDialog("Informe o nome da conta");
        String s = JOptionPane.showInputDialog("Informe a senha");
       if (nome.equals(n) && senha.equals(s)) {
            JOptionPane.showMessageDialog(null, "Olá! " + nome);
            if (data.toZonedDateTime().getHour() > 6 && data.toZonedDateTime().getHour() <= 11) {
                JOptionPane.showMessageDialog(null, "Bom dia!!!");
                JOptionPane.showMessageDialog(null, "A data atual é: " + data.toZonedDateTime().getDayOfMonth() + "/" + data.toZonedDateTime().getMonthValue() + "/" + data.toZonedDateTime().getYear());
                JOptionPane.showMessageDialog(null, "Agora são: " + data.toZonedDateTime().getHour() + ":" + data.toZonedDateTime().getMinute());
                return;
            }
            if (data.toZonedDateTime().getHour() >=12  && data.toZonedDateTime().getHour() < 18) {
                JOptionPane.showMessageDialog(null, "Boa tarde!!!");
                JOptionPane.showMessageDialog(null, "A data atual é: " + data.toZonedDateTime().getDayOfMonth() + "/" + data.toZonedDateTime().getMonthValue() + "/" + data.toZonedDateTime().getYear());
                JOptionPane.showMessageDialog(null, "Agora são: " + data.toZonedDateTime().getHour() + ":" + data.toZonedDateTime().getMinute());
                return;
            }
            if (data.toZonedDateTime().getHour() >= 18 || data.toZonedDateTime().getHour() <= 5) {
                JOptionPane.showMessageDialog(null, "Boa noite!!!");
                JOptionPane.showMessageDialog(null, "A data atual é: " + data.toZonedDateTime().getDayOfMonth() + "/" + data.toZonedDateTime().getMonthValue() + "/" + data.toZonedDateTime().getYear());
                JOptionPane.showMessageDialog(null, "Agora são: " + data.toZonedDateTime().getHour() + ":" + data.toZonedDateTime().getMinute());
                return;
                
            }
        }else{
           JOptionPane.showMessageDialog(null,"Usuário ou senha errados");
       }
    }
}