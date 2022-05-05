/**
 * 
 * @author Rajan Sah
 * @version 1.0
 * @Date 05/05/2022
 *
 */

public class Song {
	
	private String title;
	private String artist;
	private String genre;
	
	/**
	 * 
	 * @param title
	 * @param artist
	 * @param genre
	 */
	public Song(String title, String artist, String genre) {
		
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		return;
	}
	
	/**
	 * 
	 * @param title
	 * @param artist
	 */
	public Song(String title, String artist) {
		// TODO Auto-generated constructor stub
		
		this(title,artist,"Unknown");
		return;
		
	}

	/**
	 * 
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 
	 * @return
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * 
	 * @param artist
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}

	/**
	 * 
	 * @return
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * 
	 * @param genre
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	/**
	 * 
	 */
	public String toString() {
		return title+ "," +artist+ ","+genre ;
		
	}

}
