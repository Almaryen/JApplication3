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
import java.util.Scanner; // импортируем класс
public class TCalc {
 
private	float a;
private	int c;
private	double d,y;
    
public TCalc(){} //конструктор по умолчанию

public TCalc(float av, int cv, double dv) //конструктор
{
    a=av;  
    c=cv; 
    d=dv; 
}
float get_a() 
{
	return a;
}
int get_c() 
{
	return c;
}
double get_d() 
{
	return d;
}
//метод для установления значений

public boolean set_values()
{
                Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
		System.out.print( "Введите a типа float а= ");
                 if(sc.hasNextFloat()) { 
                   a = sc.nextFloat();
                 }
                 else { return false;}
		System.out.print( "Введите с типа int с=");
		if(sc.hasNextInt()) { 
                   c = sc.nextInt();}
                else { return false;}
		System.out.print( "Введите d типа double d =");
		if(sc.hasNextDouble()) { 
                   d = sc.nextDouble();}
                else { return false; }
                return true;
};


double  Calc() throws MyException
{
	double y1=0,y2=0;
            if (a == 4.0) throw new MyException("Логарифм близится к безконечности") ; //Логарифм близится к безконечности
            if ((1-a/4)<0) throw new MyException("Ошибка! Выходим за одз Ln"); // выходим за одз Ln
            long t = 2*c; // проверка выражения на переполнение
            if ((t <- 2147483648) || (t >2147483647)) throw new MyException("Ошибка! переполнение типа int при вычислении");
            y1 = 2*c-d/23;
            System.out.print("Знаменатель равен "+y1+"\n");
            y2 = Math.log(1-a/4);
            System.out.print("Числитель равен "+y2+ "\n");
            y =y1/y2;
            System.out.print("Результат "+y+ "\n");
            return y;
}
}

