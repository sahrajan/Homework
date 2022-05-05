/**
 * 
 * @author Rajan Sah
 * @version 3.0
 * @Date 05/05/2022
 *
 */
import java.util.*;

public class MusicCollection {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input  = new Scanner(System.in);
		
		Song song1 = new Song("Dead Like me "," Mimosa "," Dub");
		Song song2 = new Song("The Day ","The Root ","Hip/Hop");
		Song song3 = new Song("The sun and moon ","Emancipator");
		
		Album album1 = new Album("Flux for Lifee", song1, 1);
		Album album2 = new Album("How I Got Overe", song2, 7);
		Album album3 = new Album("Safe in the Steep Cliffse", song3, 9);
		
		
		
		
		
		int in = 3;
		while(in!=0) {
			
			System.out.println("[1] " + album1.getTitle());
			System.out.println("[2] " + album2.getTitle());
			System.out.println("[3] " + album3.getTitle());
			System.out.print("Select an album (0 to quit): ");
			
			
			in = input.nextInt();
			input.nextLine();
			if(in == 1) {
				System.out.println(album1.getTitle() + " by "+ song1.getArtist()+": "+ song1.getGenre());
				albumOptions(album1);
			
//				
			}
			if(in == 2) {
				System.out.println(album2.getTitle() + " by "+ song2.getArtist()+": "+ song2.getGenre());
				albumOptions(album2);
				
			}
			if(in == 3) {
				System.out.println(album3.getTitle() + " by "+ song3.getArtist()+": "+ song3.getGenre());
				albumOptions(album3);
				
			}
		}
		
	}
	
	
	/**
	 * 
	 * @param album
	 */
	public static void albumOptions(Album album) {
		
		int albm = 1;
		Scanner input1 = new Scanner(System.in);
		
	//	System.out.println(album.toString());
	 //   System.out.println(album.getGenre());
		
		while(albm!=0) {
		System.out.println("\nAlbum Options: ");
		System.out.println("[1] Get Favorite Track: ");
		System.out.println("[2] Change Genre (Enter Genre to change): ");
		System.out.println("[0] Return");
		System.out.print("Selections : ");
		
		
		
		albm = input1.nextInt();
		input1.nextLine();
		
		if (albm == 1) {
			System.out.println("\nTrack No. "+album.getTrackNumber()+" : " + album.getFavoriteTrack());
		}
		
		if (albm == 2) {
			
			String newGenre;
			Scanner sc = new Scanner(System.in);
			newGenre = sc.nextLine();
			album.setGenre(newGenre);
			System.out.println("\nNew Genre: "+ album.getGenre());
		}
		
		}
	}
}

	
