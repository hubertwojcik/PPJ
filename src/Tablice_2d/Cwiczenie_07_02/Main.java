package Tablice_2d.Cwiczenie_07_02;

public class Main {
    public static void main(String[] args){
        int[][] multiDimArray= new int[8][8];
        for(int i=0;i<multiDimArray.length;i++){
            for(int j=0;j<multiDimArray[i].length;j++){
                multiDimArray[i][j]=((int)(Math.random()*11));
                System.out.print(multiDimArray[i][j]+" ");
            }
            System.out.println();
        }
        int numElements=0;
        int[] firstDiag=new int[11];
        int[] secondDiag=new int[11];
        for(int i=0;i<multiDimArray.length;i++){
            firstDiag[multiDimArray[i][i]]++;
        }
        for(int i=0;i<multiDimArray.length;i++){
            secondDiag[multiDimArray[i][7-i]]++;
        }

        for(int i = 0; i < firstDiag.length; i++){
            if(firstDiag[i] >= 3){
                System.out.println("Wartość " + i + " występuje przynajmniej 3 razy w pierwszej przekątnej");

            }
        }
        for(int i = 0; i < secondDiag.length; i++){
            if(secondDiag[i] >= 3){
                System.out.println("Wartość " + i + " występuje przynajmniej 3 razy w drugiej przekątnej");

            }
        }
    }
}
