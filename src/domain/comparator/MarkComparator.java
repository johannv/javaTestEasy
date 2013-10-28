/**
 * 
 */
package domain.comparator;

import java.util.Comparator;

import domain.Mark;

/**
 * @author Verbroucht Johann 
 * Test Java Date : 15 aožt. 2011
 */

public class MarkComparator implements Comparator<Mark> {
	public int compare(Mark mark1, Mark mark2) {

		if (mark1.getMark() > mark2.getMark()) {
			return -1;
		} else if (mark1.getMark() < mark2.getMark()) {
			return 1;
		}

		return 0;
	}
}