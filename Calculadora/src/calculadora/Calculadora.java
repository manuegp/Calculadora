/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author manue
 */
public class Calculadora {
    private int num1; /*@see*/
    private int num2;
    //ESTO HA SIDO EDITADO DESDE la terminal de  la rama2
    /**
     *
     * @param a
     * @param b
     */
    public Calculadora (int a, int b){
    num1=a;
    num2=b;
    } 
    
    /**
     *
     * @return
     */
    public int suma(){
    int result =num1+num2;
    return result;
    }

    /**
     *
     * @return
     */
    public int resta(){
    int result =num1-num2;
    return result;
    }

    /**
     *
     * @return
     */
    public int multiplicacion(){
    int result =num1*num2;
    return result;
    }

    /**
     *
     * @return
     */
    public int divide(){
    int result =num1/num2;
    return result;
    }
}

