/**
 * 
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
	 * 
	 * @param title
	 * @param favoriteTrack
	 * @param trackNumber
	 */
	public Album(String title, Song favoriteTrack, int trackNumber) {
		// TODO Auto-generated constructor stub
		
		this.title = title;
		this.favoriteTrack = favoriteTrack;
		this.trackNumber = trackNumber;
		this.artist = favoriteTrack.getArtist();
		this.genre = favoriteTrack.getGenre();
		numAlbums++;
		return;
		
	}
	
	/**
	 * 
	 * @param title
	 * @param favoriteTrack
	 */
	
	public Album(String title, Song favoriteTrack) {
		trackNumber = 1;
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
	 * @return
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * 
	 * @return
	 */
	public Song getFavoriteTrack() {
		return favoriteTrack;
	}

	/**
	 * 
	 * @return
	 */
	public int getTrackNumber() {
		return trackNumber;
	}

	/**
	 * 
	 * @param favoriteTrack
	 */
	public void setFavoriteTrack(Song favoriteTrack) {
		this.favoriteTrack = favoriteTrack;
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
