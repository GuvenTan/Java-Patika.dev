public class Main {
    static boolean state = true;
    static int kontrol = 0;
    static int Desen(int sayi){
        System.out.print(sayi+ " ");
        if (state == true && sayi > 0){
            kontrol++;
            return Desen(sayi - 5);
        }else{
            kontrol--;
            if (kontrol == -1){
                return sayi;
            }
            state = false;
            return Desen(sayi + 5);
        }
    }

    public static void main(String[] args) {
        Desen(32);
    }
}