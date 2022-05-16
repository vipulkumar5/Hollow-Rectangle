import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a first  value:");
		int n=sc.nextInt();
		System.out.println("enter a second vlue:");
		int m=sc.nextInt();
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=m;j++){
		        if(i==1 || j==1 || i==n || j==m){
		            System.out.print("*");
		        }
		        else{
		            System.out.print(" ");
		        }
		        
		    }
		    System.out.println( );
		}
		
	}
}
