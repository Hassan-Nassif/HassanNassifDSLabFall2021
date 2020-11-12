
package Assignment2EX2;

import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class concat {

    public static String concat(int [] Array1,int [] Array2 ){
            int sum= Array1.length+Array2.length;
            int a1=Array1.length;
            int a2=Array2.length;
            int[] newArray= new int[sum];
            System.arraycopy (Array1, 0, newArray,0 , a1);
            System.arraycopy ( Array2,0,newArray,a1,a2);
            return  Arrays.toString(newArray); 
    } 
       
    public static void main(String[] args) {
        int [] x= {1,3,8};
        int [] y ={0,5,9};
        
            
            
        
        System.out.println(concat(x,y));
    }
    
}
