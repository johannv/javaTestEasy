/**
 * 
 */
package domain;

import java.util.ArrayList;

/**
 * @author Verbroucht Johann 
 * Test Java Date : 15 aožt. 2011
 */

public class Student extends People {

	private Teacher teacher;
	private ArrayList<Mark> markList;

	public Student() {
		this.teacher = new Teacher();
	}

	public Student(String _lastname, String _firstname) {
		this.teacher = new Teacher();
		super.setLastname(_lastname);
		super.setFirstname(_firstname);
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public ArrayList<Mark> getMarkList() {
		return markList;
	}

	public void setMarkList(ArrayList<Mark> markList) {
		this.markList = markList;
	}
}
