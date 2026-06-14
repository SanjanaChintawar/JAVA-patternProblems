public class thirteenPattern {
    public static void main(String[] arg){
        char alpha = 'A';
        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" "+alpha+" ");
                alpha++;
            }
            System.out.println();
        }
    }
}
