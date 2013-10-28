package domain;

import java.util.Date;

/**
 * @author Verbroucht Johann 
 * Test Java Date : 15 aot. 2011
 */

public class Mark {

	private Date date;
	private int mark;

	public Mark(Date _date, int _mark) {
		this.date = _date;
		this.mark = _mark;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}
}
