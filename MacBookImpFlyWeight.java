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
public class MacBookImpFlyWeight implements MacBook{
    
    private String id;
    private static int cont;
    //private MacLigero macligero;
    
    public MacBookImpFlyWeight(String id){
        super();
        this.id=id;
        this.cont++;
        System.out.println(cont);
    }

    @Override
    public String getId() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "";
    }

    @Override
    public int getRam() {
        return 0;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDisco() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 0;
    }

    
    
}
