package Arrays;

import java.util.Arrays;

public class TekrarEdenCiftSayilar {

    static boolean isFind (int[] array, int value){

        for (int i: array){
            if (i==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {3,7,3,3,2,9,10,21,1,33,9,1,2,2,10,11,10,2,8,8};
        int[] duplicate = new int[list.length];

        int start=0;

        for (int i=0; i<list.length; i++){
            for (int k=0; k<list.length; k++){
                if ((i!=k) && (list[i]==list[k])){
                    if (!isFind(duplicate, list[i])){
                        duplicate[start++]=list[i];
                    
                    }
                    break;
                }

            }

        }
        Arrays.sort(duplicate);

        System.out.print("SAYILAR: ");

        System.out.println(Arrays.toString(list));

        System.out.print("Tekrar Eden Sayılar: ");

        for (int i: duplicate){
            if (i!=0){
                System.out.print(i+" ");
            }

        }
        System.out.println();

        System.out.print("Tekrar Eden Çift Sayılar: ");
        for (int k: duplicate){

            if (k!=0 && k%2==0){
                System.out.print(k+" ");
            }
        }
    }
}
