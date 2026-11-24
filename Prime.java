public class Prime{
	public static void main(String[]args){
	int k=18;
	Boolean isPrime=true;
	for(int i=2;i<k;i++){
	if(k%i==0){
	isPrime=false;
	}
}
if(isPrime){
System.out.println(k+"number is prime");
}
else{
System.out.println(k+"number is not prime");
}
}
}
