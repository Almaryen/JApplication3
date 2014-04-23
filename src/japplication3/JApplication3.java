/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package japplication3;

/**
 *
 * @author Ann
 */
public class JApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       for(;;)	
	{   
            System.out.print("   2*c-d/23"+"\n");
            System.out.print("y= ---------"+"\n");
            System.out.print("   ln(1-a/4)"+"\n");
            TCalc obj = new TCalc();
            System.out.print( "Обект obj:\n");
        try {
            while (!obj.set_values());
            System.out.print("Результат: " + obj.Calc() + "\n");
            }
        catch (MyException ex) 
            {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            }
        }
    }
    
}
