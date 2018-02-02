/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottoalexander
 */
public class CalculadoraI {
    Stack<String> mystack;
    public String suma(String a, String b, String c){   
    c = a + b; 
    mystack.push(a);  
    mystack.push(b);
    mystack.pop(c); 
    return c; 
    }
    public int resta(int a, int b, int c){   
    c = a - b;
    mystack.push(a);
    mystack.push(b); 
    mystack.pop(c); 
    return c;
    }
    public int multiplicar(int a, int b, int c){   
    c = a * b;
    mystack.push(a);
    mystack.push(b); 
    mystack.pop(c); 
    return c;
    }
    public int dividir(int a, int b, int c){   
    c = a / b; 
    mystack.push(a);
    mystack.push(b);
    mystack.pop(c); 
    return c;
    }
    
}
