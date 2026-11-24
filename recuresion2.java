public class recuresion2{
    public static void printTable(int n, int i){
        if(n==11)return ;
            System.out.println(n+" X "+i+"="+"n*i");
            printTable(n, i+1);

        }
        public static void main(String[] args){
            printTable(n:9,i:1);
    }
}
