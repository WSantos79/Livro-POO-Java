package code.unidade4.secao1;

/**
 *
 * @author jesimar
 */
public class ArrayMultidimensional {
    public static void main(String[] args) {
        ArrayMultidimensional array = new ArrayMultidimensional();
        array.matriz();
        array.array0();
        array.array1();
        array.array2();
        array.array3();
        array.array4();
    }
    
    private void matriz(){
        double matriz[][] = {{1.5, 5.2}, {3.6, 4.9}, {2.4, 8.1}}; 
        for (int i = 0; i < matriz.length; i++) { 
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Array[" + i + "][" + j + "]: " + matriz[i][j]); 
            }
        }
    }
    
    private void array0(){
        int matrizInteiros[][] = {{1, 5}, {3, 4}, {2, 8}};
        System.out.println("Array[0][0]: " + matrizInteiros[0][0]);
        System.out.println("Array[0][1]: " + matrizInteiros[0][1]);
        System.out.println("Array[1][0]: " + matrizInteiros[1][1]);
        System.out.println("Array[1][1]: " + matrizInteiros[1][1]);
        System.out.println("Array[2][0]: " + matrizInteiros[2][0]);
        System.out.println("Array[2][1]: " + matrizInteiros[2][1]);
//        System.out.println("Array0: " + vetorInteiros[5]); //gera uma exceçao
//        System.out.println("Array0: " + vetorInteiros[-1]);//gera uma exceçao
    }
    
    private void array1(){
        int matrizInteiros[][] = {{1, 5}, {3, 4}, {2, 8}};
        for (int i = 0; i < matrizInteiros.length; i++){
            for (int j = 0; j < matrizInteiros[i].length; j++){
                System.out.println("Array[" + i + "][" + j + "] " + matrizInteiros[i][j]);
            }
        }
    }
    
    private void array2(){
        float matrizFloat[][] = new float [3][2];
        matrizFloat[0][0] = 1.0f;
        matrizFloat[0][1] = 5.0f;
        matrizFloat[1][0] = 3.0f;
        matrizFloat[1][1] = 4.0f;
        matrizFloat[2][0] = 2.0f;
        matrizFloat[2][1] = 8.0f;
        for (int i = 0; i < matrizFloat.length; i++){
            for (int j = 0; j < matrizFloat[i].length; j++){
                System.out.println("Array[" + i + "][" + j + "] " + matrizFloat[i][j]);
            }
        }
    }
        
    private void array3(){
        int matriz[][][] = new int [4][3][2];
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    matriz[i][j][k] = soma;
                    soma++;
                }
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                for (int k = 0; k < matriz[0][0].length; k++) {
                    System.out.println("mat[" + i + "][" + j + "][" + k + "] = " 
                            + matriz[i][j][k]);
                }
            }
        }
    }
    
    private void array4(){
        System.out.println("Exemplo4");
        int mat[][] = {{2, 4, 7}, {6, 3}, {5, 1, 9, 0}};
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("mat[" + i + "][" + j + "] = " + mat[i][j]);
            }
        }
    }
}