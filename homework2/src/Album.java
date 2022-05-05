/**
 * @author Rajan Sah
 *
 */
public class Album {
	
	private String title;
	private String artist;
	private String genre;
	private Song favoriteTrack;
	private int trackNumber;
	
	public static int numAlbums;
	
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
	
	public Album(String title, Song favoriteTrack) {
		trackNumber = 1;
		return;
	}


	public String getTitle() {
		return title;
	}
	
	public String getGenre() {
		return genre;
	}

	public Song getFavoriteTrack() {
		return favoriteTrack;
	}

	public int getTrackNumber() {
		return trackNumber;
	}

	public void setFavoriteTrack(Song favoriteTrack) {
		this.favoriteTrack = favoriteTrack;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String toString() {
		return title+ "," +artist+ ","+genre ;
		
	}
	
	
}
