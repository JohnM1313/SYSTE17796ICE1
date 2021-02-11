/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather;

/**
 *
 * @author Lego1
 */
public class Weather {

    /**
     * @param args the command line arguments
     */
    /*I have edited this file*/
    public static void main(String[] args) {
        double[] temps = {3,5,6,-20,34,-17,45,10,-34,20,12,-20,-10,-14};
        double averageTemp = calcAvg(temps);
        System.out.println(averageTemp);
    }
    public static double calcAvg(double[] n)
    {
        double sum = 0;
        for(int i=0; i<n.length; i++)
            if(n[i]>= 50 || n[i]<=-50){
                continue;
            }
        else
        {
           sum+=n[i];
        }
        return sum/n.length;
    } 
  }
    
