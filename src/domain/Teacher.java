/**
 * 
 */
package domain;

/**
 * @author Verbroucht Johann 
 * Test Java Date : 15 ao�t. 2011
 */

public class Teacher extends People {

	private String lessonName;

	public Teacher() {

	}

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

}
