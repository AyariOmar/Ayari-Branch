import java.rmi.Naming;
import java.util.Scanner;


public class Client {

    public static void main(String[] args) {
        try {
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            Scanner scanner = new Scanner(System.in);
            
			//do{
            	
	            System.out.println("Entrer votre solde :");
	            String sc = scanner.nextLine();
	            double n=service1.lireSolde(sc);
	            System.out.println("Choisir Menu:");
	            System.out.println("1:Credite");
	            System.out.println("2:Debite");
	            System.out.println("3:Quitter");
	          
	            sc = scanner.nextLine();
	            int ch=Integer.parseInt(sc);
	            if(ch==2)
	            {System.out.println("Debiter :");
	            	 sc = scanner.nextLine();
	            	double d = Double.parseDouble(sc);
	            n=service1.debiter(n,d);
	            System.out.println("Solde :"); 
	            System.out.println(n);}
	            
	            else if(ch==1)
	            {
	            	System.out.println("Créditer :");
	            	 sc = scanner.nextLine();
	            //sc = scanner.nextLine();
	            double c = Double.parseDouble(sc);
	            
	             
	            n=service1.crediter(n,c);   
	            System.out.println("solde :"); 
	            System.out.println(n);}
	            else
	            	{ System.out.println("END");
	            	System.exit(0);}
	            

        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.toString());
        }
    }

}