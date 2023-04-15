/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author ifzs
 */
@Stateless
public class calcbean implements calcbeanLocal {

    @Override
    public Integer suma(int a, int b) {
        return a + b;
    }

    @Override
    public Integer resta(int a, int b) {
        return a - b;
    }
    
    @Override
    public Integer exponente(int a, int b) {
        int c = (int) Math.pow(a, b);
        return c;
    }

    @Override
    public Integer multiplicar(int a, int b) {
        return a * b;
    }

    @Override
    public Integer dividir(int a, int b) {
        return a / b;
    }

    @Override
    public Integer modulo(int a, int b) {
        return a % b;
    }
    
}
