public class TowerOfHanoi_practImple {
    public static void sH(int n, char sou, char aux, char dest){
        if(n==1){
            System.out.println("Move disk 1 from "+sou+" to "+dest);
            return;
        }
        sH(n-1, sou, dest, aux);
        System.out.println("Move disk "+n+" from "+sou+" to "+dest);

        sH(n-1, aux, sou, dest);
    }
    public static void main(String[] args) {
        int n=3;
        sH(n, 'A', 'B', 'C');
    }
}
