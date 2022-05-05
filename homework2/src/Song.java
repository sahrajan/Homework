

public class Song {
	
	private String title;
	private String artist;
	private String genre;
	
	

	public Song(String title, String artist, String genre) {
		
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		return;
	}
	
	public Song(String title, String artist) {
		// TODO Auto-generated constructor stub
		
		this(title,artist,"Unknown");
		return;
		
	}


	public String getTitle() {
		return title;
	}

	
	public void setTitle(String title) {
		this.title = title;
	}


	public String getArtist() {
		return artist;
	}

	
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String toString() {
		return title+ "," +artist+ ","+genre ;
		
	}

}
