import java.util.*;
public class isPrimew {
    public static boolean isprime(int n){
        for(int i = 2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 200;
        for(int i = a;i<=b;i++){
            if(isprime(i)){
                System.out.print(i+"  ");
            }
        }
    }
}
