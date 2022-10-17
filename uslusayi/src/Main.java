public class Main {

    static int üslüSayi(int üs, int sayi){
        if(üs == 0){
            return 1;
        } else if (sayi == 0) {
            return 0;
        }
        return sayi * üslüSayi(üs-1,sayi);

    }

    public static void main(String[] args) {
        System.out.println(üslüSayi(2,3));

    }
}