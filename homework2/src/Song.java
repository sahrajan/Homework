/**
 * This class implements the Song that can be driven around 
 * @author Rajan Sah
 * @version 1.0
 * @Date 05/05/2022
 * 
 * 
 */

public class Song {
	
	private String title;
	private String artist;
	private String genre;
	
	/**
	 * Creating the private instance variable for this class called title, artist, genre.
	 * @param title - title of the Song
	 * @param artist - Artist of the song 
	 * @param genre - Genre of the song
	 * @return 
	 */
	public Song(String title, String artist, String genre) {
		
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		
	}
	
	/**
	 * 
	 * @param title - The title of the songs Chaining from previous constructor
	 * @param artist - The artist of the songs Chaining from previous constructor
	 * Genre - Genre set to default value "Unknown"
	 */
	public Song(String title, String artist) {
		// TODO Auto-generated constructor stub
		
		this(title,artist,"Unknown");
		
		
	}

	/**
	 * This returns the title of the songs.
	 * @return - This will title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Setting the title of this Song 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This returns the artist of the songs.
	 * @return - This will return Artist
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * Setting the Artist of this Song 
	 * @param artist - 
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}

	/**
	 * Setting the Genre of this Song 
	 * @return
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * This returns the Genre of the songs.
	 * @param genre This will return the String Genre
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	/**
	 * - Return the String with title, artist, and genre.
	 */
	public String toString() {
		return title+ "," +artist+ ","+genre ;
		
	}

}
