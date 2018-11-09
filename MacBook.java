/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

/**
 *
 * @author Mateo Quinteros
 */
public interface MacBook {
    /*private String id;
    private int ram;
    private int disco;
    private static int conta;
    
    public MacBook(String id, int ram, int disco, int conta){
        super();
        this.id=id;
        this.disco=disco;
        this.ram=ram;
        this.conta++;
        System.out.println(conta);
    }

    public String getId() {
        return this.id;
    }

    public int getRam() {
        return this.ram;
    }

    public int getDisco() {
        return this.disco;
    }

    public  int getConta() {
        return this.conta;
    }*/
    
    public String getId();
    public int getRam();
    public int getDisco();
    
    
    
}
