package javaHW;
public class Student {
	String name;
	int kor,eng,math;
	
	public Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor+eng+math;
		
	}
	
	float getAverage() {
		return (getTotal() / 3f);
	}
	

}
