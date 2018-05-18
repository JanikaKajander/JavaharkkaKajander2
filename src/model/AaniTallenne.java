package model;

public class AaniTallenne {
	
	private String name, artist, recordtype, land, producer;
	private int id, year;
	
	public AaniTallenne() {

		this.id = 0;
		this.name = null;
		this.artist = null;
		this.recordtype = null;
		this.land = null;
		this.producer = null;
		this.year = 0;
	}
	
	public AaniTallenne(String name, String artist, String type, String land, String producer, int year) {
		super();
		this.name = name;
		this.artist = artist;
		this.recordtype = type;
		this.land = land;
		this.producer = producer;
		this.year = year;
	}

	public AaniTallenne(int id, String name, String artist, String type, String land, String producer, int year) {
		super();
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.recordtype = type;
		this.land = land;
		this.producer = producer;
		this.year = year;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getArtist() {
		return artist;
	}

	public String getRecordtype() {
		return recordtype;
	}

	public String getLand() {
		return land;
	}

	public String getProducer() {
		return producer;
	}

	public int getYear() {
		return year;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setRecordtype(String type) {
		this.recordtype = type;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "AaniTallenne [id=" + id + ", name=" + name + ", artist=" + artist + ", recordtype=" + recordtype + ", land=" + land
				+ ", producer=" + producer + ", year=" + year + "]";
	}

}