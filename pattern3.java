import java.util.*;
public class pattern3{
public static void main(String[] args){  //
int n=12;
int m=5;
for(int i=1;i<=n;i++){
for(int k=1;k<=i-1;k++){
System.out.print(" ");
}
for(int j=1;j<=m;j++){
System.out.print("*");
}
System.out.println();
}
}
}