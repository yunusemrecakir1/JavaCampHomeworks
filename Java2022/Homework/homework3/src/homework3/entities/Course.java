package homework3.entities;

public class Course {
	private int _id;
	private int _categoryId;
	private int _instructorId;
	private int _completePercent;
	private String _name;
	private double _price;
	
	
	public void setId(int id) {
		_id=id;
	}
	public int getId() {
		return _id;
	}
	
	
	public void setCategoryId(int categoryId) {
		_categoryId=categoryId;
	}
	public int getCategoryId() {
		return _categoryId;
	}
	
	
	public void setInstructorId(int instructorId) {
		_instructorId=instructorId;
	}
	public int getInstructorId() {
		return _instructorId;
	}
	
	
	public void setCompletePercent(int completePercent) {
		_completePercent = completePercent;
	}
	public int getCompletePercent() {
		return _completePercent;
	}
	
	
	public void setName(String name) {
		_name=name;
	}
	public String getName() {
		return _name;
	}
	
	
	
	public double get_price() {
		return _price;
	}
	public void set_price(double price) {
		_price = price;
	}
}

