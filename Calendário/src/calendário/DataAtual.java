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
    
public class DataAtual {
     static  GregorianCalendar data= new GregorianCalendar();
    public static void main(String args[]){
        System.out.println("A data atual é: "+data.toZonedDateTime().getDayOfMonth()+"/"+data.toZonedDateTime().getMonthValue()+"/"+data.toZonedDateTime().getYear());
        data.add(5, 1);
        System.out.println("A data de amanhã será: "+data.toZonedDateTime().getDayOfMonth()+"/"+data.toZonedDateTime().getMonthValue()+"/"+data.toZonedDateTime().getYear());
        data.add(5,-2);
        System.out.println("A data de ontem foi: "+data.toZonedDateTime().getDayOfMonth()+"/"+data.toZonedDateTime().getMonthValue()+"/"+data.toZonedDateTime().getYear());
    }
}
