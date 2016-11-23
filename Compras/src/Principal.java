import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

	    Vector<Artigo> artigos= new Vector<Artigo>();
	    
	        double soma = 0;
	        String x  ;
	        double y=0 ;
	        
	        Artigo artigo1 = new Artigo();
	        System.out.println("insira o nome para o artigo");
	        x = new Scanner(System.in).nextLine();
	        artigo1.setnome(x);
	        System.out.println("insira o preço para o artigo ");
	        y = new Scanner(System.in).nextDouble();
	        artigo1.setpreco(y);
	        artigos.add(artigo1);

	        Artigo artigo2 = new Artigo();
	        System.out.println("insira o nome para o artigo");
	        x = new Scanner(System.in).nextLine();
	        artigo2.setnome(x);
	        System.out.println("insira o preço para o artigo ");
	        y = new Scanner(System.in).nextDouble();
	        artigo2.setpreco(y);
	        artigos.add(artigo2);

	        Artigo artigo3 = new Artigo();
	        System.out.println("insira o nome para o artigo");
	        x = new Scanner(System.in).nextLine();
	        artigo3.setnome(x);
	        System.out.println("insira o preço para o artigo ");
	        y = new Scanner(System.in).nextDouble();
	        artigo3.setpreco(y);
	        artigos.add(artigo3);
	        
	        
	        for (int i = 0; i < artigos.size(); i++) {
	        	Artigo elementAt = artigos.elementAt(i);
	            System.out.println(artigos.elementAt(i).getNome() + " " + artigos.elementAt(i).getPreco()+"\n");
	        }
	        
	        for (int z = 0; z < artigos.size(); z++) {
	        	Artigo elementAt = artigos.elementAt(z);
	            soma += artigos.elementAt(z).getPreco();
	        }
	        
	       System.out.println("o preço total dos produtos é de "+soma+ "€ \n");
	    }
	
}

