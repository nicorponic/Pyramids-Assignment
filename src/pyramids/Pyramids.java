/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;
/**
 * @author N1CO
 */
public class Pyramids {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1; i<10;i++){
            for(int r=0; r<i;r++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
