/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipaddressvalidator;

/**
 *
 * @author Ryan Liwanag
 */
public class IPValidationRegexLauncher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IPValidationRegex ipvr = new IPValidationRegex();
        ipvr.readTextFile("ipaddresses.txt");
    }
}
