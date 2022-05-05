/**
 * This class implements the Album that can be driven around 
 * @author Rajan Sah
 * @version 2.0
 * @Date 05/05/2022
 */
public class Album {
	
	private String title;
	private String artist;
	private String genre;
	private Song favoriteTrack;
	private int trackNumber;
	
	public static int numAlbums;
	
	/**
	 * Creating the private instance variable for this class called title, artist, genre.
	 * Adding the favoriteTrack in the this class.
	 * Making the value of trackNumber to integer.
	 * Setting the public static numAlbums.
	 * @param title - This is the title
	 * @param favoriteTrack - favorite track of that album
	 * @param trackNumber - This is the trackNumber
	 * @param artist - Artist of the song 
	 * @param genre - Genre of the song
	 * Incrementing the numAlbums to keep track of the number of albums created
	 */
	public Album(String title, Song favoriteTrack, int trackNumber) {
		// TODO Auto-generated constructor stub
		
		this.title = title;
		this.favoriteTrack = favoriteTrack;
		this.trackNumber = trackNumber;
		this.artist = favoriteTrack.getArtist();
		this.genre = favoriteTrack.getGenre();
		numAlbums++;
		
		
	}
	
	/**
	 * 
	 * @param title this is the title.
	 * @param favoriteTrack passing the trackNumber as 1
	 */
	
	public Album(String title, Song favoriteTrack) {
		trackNumber = 1;
		
	}

	/**
	 * 
	 * @return - This will return the title 
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * 
	 * @return - This will return the Genre 
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * 
	 * @return This will return the FavoriteTrack
	 */
	public Song getFavoriteTrack() {
		return favoriteTrack;
	}

	/**
	 * 
	 * @return This will return the tracknumber
	 */
	public int getTrackNumber() {
		return trackNumber;
	}

	/**
	 * 
	 * @param favoriteTrack - setting the favoriteTrack
	 */
	public void setFavoriteTrack(Song favoriteTrack) {
		this.favoriteTrack = favoriteTrack;
	}
	
	/**
	 * 
	 * @param title - setting the title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * 
	 * @param genre - setting the genre 
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * This is the toString method that will return title, artist and genre
	 */
	public String toString() {
		return title+ "," +artist+ ","+genre ;
		
	}
	
	
}
