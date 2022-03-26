import java.util.Scanner;

import javax.swing.JOptionPane;





public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        int mat [][] = new int [3][3];

        System.out.println("Diguite la matriz: ");
        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                System.out.println("Matriz["+i+"]["+j+"]");
                mat[i][j]=entrada.nextInt();
            }
        }
        System.out.println("\nLa matriz original:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("");
        }

        //Trasponer la matriz
        int aux;
        for(int i=0;i<3;i++){
            for(int j=0;j<i;j++){
                aux= mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=aux;

            }
        }
        System.out.println("\nLa matriz compuesta es:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                System.out.print(mat[i][j]+"");
            }
            System.out.println("");

        }

    }
}
