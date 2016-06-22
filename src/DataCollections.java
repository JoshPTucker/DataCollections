import java.util.Collections; 
import java.util.ArrayList;
import java.util.Scanner;
public class DataCollections {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choice = "yes";
		Scanner in=new Scanner(System.in);
		ArrayList<String> favBooks=new ArrayList<String>();
		ArrayList<String> favmovie=new ArrayList<String>();
		System.out.println("Enter your favorite books");
		
		while(choice.equals("yes")){
			System.out.println("Enter favorite book");
			String book =in.nextLine();
			System.out.println("Enter your favorite movie");
			String movie=in.nextLine();
			favBooks.add(book);
			favmovie.add(movie);
			System.out.println("would you like to add more books or movies?");
			choice=in.nextLine();
		}
		for(int i=0; i<favmovie.size();i++){
			System.out.println(favmovie.get(i));
		}
		in.close();
	}

}
