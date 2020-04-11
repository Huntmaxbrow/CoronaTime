/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronatime;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author H_Browder
 */
public class jsoup {
    
    
    public static void main(String[] args){
    
    
         
        try {
            Document doc = Jsoup.connect("https://news.google.com/covid19/map?hl=en-US&gl=US&ceid=US:en").userAgent("morzilla/17.0").get();
            Elements temp = doc.select("div.eWp4nd");
            ArrayList<String> stats = new ArrayList<>();
            
            
            
            for(Element name:temp){
            
            String method = name.select("tbody.ppcUXd tr.sgXwHf  ").text();
            System.out.println(method);
            stats.add(method);
            
            }
            
            for(String s : stats){
            System.out.println(s);
            
            }
            
        } catch (IOException ex) {
            Logger.getLogger(jsoup.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
}
