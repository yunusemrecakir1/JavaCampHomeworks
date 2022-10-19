package homework3.entities;

public class Instructor {
	private int _id;
	private String _firstName;
	private String _lastName;
	private String _imageUrl;
	private String _biography;
	
	public void setId(int id) {
		_id =id;
	}
	public int getId() {
		return _id;
	}
	
	
	public void setFirstName(String firstName) {
		_firstName = firstName;
	}
	public String getFirstName() {
		return _firstName;
	}
	
	
	public void setLastName(String lastName) {
		_lastName = lastName;
	}
	public String getLastName() {
		return _lastName;
	}
	
	
	public void setImageUrl(String imageUrl) {
		_imageUrl= imageUrl;
	}
	public String getImageUrl() {
		return _imageUrl;
	}
	
	
	public void setBiography(String biography) {
		_biography=biography;
	}
	public String getBiography() {
		return _biography;
	}
}