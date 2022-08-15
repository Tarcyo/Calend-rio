/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendário;


import java.util.GregorianCalendar;

/**
 *
 * @author Tarcyo
 */
public class HoraAtual {
     static GregorianCalendar data=new GregorianCalendar();
    public static void main(String args[]){
         System.out.println("A hora atual é: "+data.toZonedDateTime().getHour());
         data.add(11, -1);
         System.out.println("A hora anterior foi: "+data.toZonedDateTime().getHour());
         data=new GregorianCalendar();
         data.add(11, +1);
         System.out.println("A hora seguinte será: "+data.toZonedDateTime().getHour());
         
         
    }
}
