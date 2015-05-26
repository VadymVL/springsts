package audioLibrary.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="songs")
public class SongsModel {
	
	@Column(name = "id")
	private Long id;
	private String title;
	private String artist;
	private String album;
	private int year;

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getArtist() {
		return this.artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getAlbum() {
		return this.album;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
