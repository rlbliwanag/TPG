/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipaddressvalidator;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Ryan Liwanag
 */
public class IPValidationRegex {
    
    private Pattern pattern;
    private Matcher matcher;
    
    private static final String IPADDRESS_PATTERN = 
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
            
    public IPValidationRegex(){
        pattern = Pattern.compile(IPADDRESS_PATTERN);
    }
    
    public void readTextFile(String fileName){
        
        String line = null;
        
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader (fileReader);
            
            while((line = bufferedReader.readLine())!= null){
                validateIpAddress(line);
            }
            
            bufferedReader.close();
        }
        catch(FileNotFoundException ex){
            System.out.println(
                    "Unable to open file '" + fileName + "'");
        }
        catch(IOException ex){
            System.out.println(
                    "Error reading file '"   + fileName + "'");
            ex.printStackTrace();
        }
    }
    
    private void validateIpAddress(String ip){
        //pattern = Pattern.compile(IPADDRESS_PATTERN);
        matcher = pattern.matcher(ip);
        
        if (matcher.matches()){
            System.out.println(ip);
        }
    }
}
