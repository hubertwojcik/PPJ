package Tablice_2d.Cwiczenie_07_03;

public class Main {
    public static void main(String[] args){
        char[][] tab={
                {'S','a','m','s','u','n','g'},
                {'N','o','k','i','a'},
                {'A','p','p','l','e'},
                {'B','l','a','c','k','B','e','r','r','y'},
                {'A','l','c','a','t','e','l'},
                {'J','o','l','l','a'}
        };
        int[] hasTheSamelettersArray=new int[tab.length];
         for(int i=0;i<tab.length;i++){
             int[] signs=new int[0xFFFF];
             for(int j=0;j<tab[i].length;j++){
                 char val=Character.toLowerCase(tab[i][j]);
                 signs[val]++;
             }
             for(int k=0;k<signs.length;k++){
                 if(signs[k]>1){
                     hasTheSamelettersArray[i]=1;
                     break;
                 }
             }
         }
        for(int i=0;i<hasTheSamelettersArray.length;i++){
            if(hasTheSamelettersArray[i]==0) continue;
                for(int j=0;j<tab[i].length;j++){
                    System.out.print(tab[i][j]+" ");
                }
                System.out.println();
        }
    }

}
