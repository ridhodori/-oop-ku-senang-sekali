/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class array_2_dimensi1301194245 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][]intArray = new int[3][10];
        System.out.println(" output arraynya : ");
        
        for (int z=1; z<2; z+=1){
            for (int a=3; a<10; a+=3){
                intArray[z][a] = z*a;
                System.out.print(intArray [z][a] + " ");
            }
        }
        System.out.println();
        for (int h=1; h<2; h+=1){
            for (int l=1 ; l<8; l+=2){
                intArray[h][l] = h*l;
                System.out.print(intArray [h][l] + " ");
            }
        } 
        System.out.println();
        for(int i=1; i<2; i++){
            for (int j=1; j<6; j++){
                intArray[i][j] = i*j;
                intArray[i][j] = factorial_j(j);
                
                System.out.print(intArray [i][j] + " ");
            }
            System.out.println();
        }
        for(int i=1; i<2; i++){
            for (int j=1; j<7; j++){
                intArray[i][j] = i*j;
                
                System.out.print(intArray [i][j] + " ");
            }
            System.out.println();
        }
       
        
    }
    
    public static int factorial_j(int n_j) {
        if(n_j == 1)return 1;
        return n_j * factorial_j(n_j - 1);
    }
    
}
