package com.barbero.ws.vo;

public class BarberoVo {
	
	private int id ;
	private String email;
	private String password;
	private Long cellphonebarber;
	private int typeCount;
	private int age;
	private String nickname;
	private String lasname;
	private String  namebarber;
	private String description;
	private String certificates;
	private String date_of_birth;
	private String gender;
	private String qualification;
	private String city;
	private int linked_barbershops;
	public BarberoVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BarberoVo(int id, String email, String password, Long cellphonebarber, int typeCount, int age,
			String nickname, String lasname, String namebarber, String description, String certificates,
			String date_of_birth, String gender, String qualification, String city, int linked_barbershops) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.cellphonebarber = cellphonebarber;
		this.typeCount = typeCount;
		this.age = age;
		this.nickname = nickname;
		this.lasname = lasname;
		this.namebarber = namebarber;
		this.description = description;
		this.certificates = certificates;
		this.date_of_birth = date_of_birth;
		this.gender = gender;
		this.qualification = qualification;
		this.city = city;
		this.linked_barbershops = linked_barbershops;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getCellphonebarber() {
		return cellphonebarber;
	}
	public void setCellphonebarber(Long cellphonebarber) {
		this.cellphonebarber = cellphonebarber;
	}
	public int getTypeCount() {
		return typeCount;
	}
	public void setTypeCount(int typeCount) {
		this.typeCount = typeCount;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getLasname() {
		return lasname;
	}
	public void setLasname(String lasname) {
		this.lasname = lasname;
	}
	public String getNamebarber() {
		return namebarber;
	}
	public void setNamebarber(String namebarber) {
		this.namebarber = namebarber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCertificates() {
		return certificates;
	}
	public void setCertificates(String certificates) {
		this.certificates = certificates;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getLinked_barbershops() {
		return linked_barbershops;
	}
	public void setLinked_barbershops(int linked_barbershops) {
		this.linked_barbershops = linked_barbershops;
	}
	@Override
	public String toString() {
		return "BarberoVo [id=" + id + ", email=" + email + ", password=" + password + ", cellphonebarber="
				+ cellphonebarber + ", typeCount=" + typeCount + ", age=" + age + ", nickname=" + nickname
				+ ", lasname=" + lasname + ", namebarber=" + namebarber + ", description=" + description
				+ ", certificates=" + certificates + ", date_of_birth=" + date_of_birth + ", gender=" + gender
				+ ", qualification=" + qualification + ", city=" + city + ", linked_barbershops=" + linked_barbershops
				+ "]";
	}
	
	

	
	
	 
	
	
	
	
	

	
	
	

}
