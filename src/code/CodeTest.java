package code;

import java.util.ArrayList;
import java.util.Date;

import junit.framework.TestCase;

import org.junit.Test;

import domain.Mark;
import domain.Student;

public class CodeTest extends TestCase {

	@Test
	public void testListSize() {
		try {
			ArrayList<String> array1 = new ArrayList<String>(6);
			array1.add("Foo");
			array1.add("Bar");
			array1.add("Plop");
			array1.add("Foobar");
			array1.add("Hello");
			array1.add("World");
			ArrayList<String> array2 = new ArrayList<String>(3);
			array2.add("Foo");
			array2.add("Bar");
			array2.add("Plop");
			ArrayList<String> array3 = new ArrayList<String>(0);

			Code code = new Code();

			assertEquals(6, code.listSize(array1));
			assertEquals(3, code.listSize(array2));
			assertEquals(0, code.listSize(array3));
		} catch (Exception e) {
			fail("Grosse erreur");
		}
	}

	@Test
	public void testFactoriel() {
		try {
			Code code = new Code();

			assertEquals(40320, code.factoriel(8));
			assertEquals(1, code.factoriel(0));
			assertEquals(6, code.factoriel(3));
		} catch (Exception e) {
			fail("Grosse erreur");
		}
	}

	@Test
	public void testGetMaxInArray() {
		try {
			ArrayList<String> array1 = new ArrayList<String>(6);
			array1.add("Foo");
			array1.add("Bar");
			array1.add("Plop");
			array1.add("Foobar");
			array1.add("Hello");
			array1.add("World");
			ArrayList<String> array2 = new ArrayList<String>(3);
			array2.add("Foo");
			array2.add("Bar");
			array2.add("Plop");
			ArrayList<String> array3 = new ArrayList<String>(0);

			Code code = new Code();

			assertEquals("Foobar", code.getLongestStringInArray(array1));
			assertEquals("Plop", code.getLongestStringInArray(array2));
			assertEquals(null, code.getLongestStringInArray(array3));

		} catch (Exception e) {
			fail("Grosse erreur");
		}
	}

	@Test
	public void testSortArray() {
		try {
			ArrayList<String> array1 = new ArrayList<String>(6);
			array1.add("Foo");
			array1.add("Bar");
			array1.add("Plop");
			array1.add("Foobar");
			array1.add("Hello");
			array1.add("World");
			ArrayList<String> array2 = new ArrayList<String>(0);

			Code code = new Code();
			code.sortArray(array1);

			assertEquals("Bar", array1.get(0));
			assertEquals("Foo", array1.get(1));
			assertEquals("Foobar", array1.get(2));
			assertEquals("Hello", array1.get(3));
			assertEquals("Plop", array1.get(4));
			assertEquals("World", array1.get(5));
			assertEquals(0, code.sortArray(array2).size());
		} catch (Exception e) {
			fail("Grosse erreur");
		}
	}

	@Test
	public void testDeleteImpairIntArray() {
		try {
			ArrayList<String> array1 = new ArrayList<String>(6);
			array1.add("Foo");
			array1.add("Bar");
			array1.add("Plop");
			array1.add("Foobar");
			array1.add("Hello");
			array1.add("World");
			ArrayList<String> array2 = new ArrayList<String>(0);

			Code code = new Code();

			assertEquals(2, code.deleteImpair(array1).size());
			assertEquals(true, code.deleteImpair(array1).contains("Foobar"));
			assertEquals(true, code.deleteImpair(array1).contains("Plop"));
			assertEquals(0, code.deleteImpair(array2).size());
		} catch (Exception e) {
			fail("Grosse erreur");
		}
	}

	@Test
	public void testgetFrequence() {
		try {
			String string1 = "abababababab";
			String string2 = "oublie aba trada";
			String string3 = "I love chocolat";

			Code code = new Code();

			assertEquals(6, code.getFrequence("a", string1));
			assertEquals(1, code.getFrequence("oublie", string2));
			assertEquals(0, code.getFrequence("latlat", string3));
		} catch (Exception e) {
			fail("Grosse erreur");
		}
	}

	@Test
	public void testNewStudent() {
		Code code = new Code();

		String string1 = "";

		try {
			Student student1 = code.newStudent(3, "Dupont", "jean", 1, "Gomis",
					"anne");
			string1 = student1.getLastname() + " " + student1.getFirstname()
					+ " élève de " + student1.getTeacher().getLastname() + " "
					+ student1.getTeacher().getFirstname();
		} catch (Exception e) {
			fail("Grosse erreur");
		}
		assertEquals("Dupont jean élève de Gomis anne", string1);
	}

	@Test
	public void testMarkAverage() {
		Code code = new Code();

		ArrayList<Mark> markList1 = new ArrayList<Mark>();
		markList1.add(new Mark(new Date(), 18));
		markList1.add(new Mark(new Date(), 12));
		markList1.add(new Mark(new Date(), 14));
		markList1.add(new Mark(new Date(), 16));

		Student student1 = new Student();
		student1.setMarkList(markList1);

		ArrayList<Mark> markList2 = new ArrayList<Mark>();
		markList2.add(new Mark(new Date(), 18));
		markList2.add(new Mark(new Date(), 12));
		markList2.add(new Mark(new Date(), 0));

		Student student2 = new Student();
		student2.setMarkList(markList2);

		try {
			assertEquals(15, code.markAverage(student1));
			assertEquals(10, code.markAverage(student2));
		} catch (Exception e) {
			fail("Grosse erreur");
		}
	}

	@Test
	public void testGetBestMark() {
		Code code = new Code();

		ArrayList<Mark> markList1 = new ArrayList<Mark>();
		markList1.add(new Mark(new Date(), 18));
		markList1.add(new Mark(new Date(), 12));
		markList1.add(new Mark(new Date(), 14));
		markList1.add(new Mark(new Date(), 16));

		Student student1 = new Student();
		student1.setMarkList(markList1);

		ArrayList<Mark> markList2 = new ArrayList<Mark>();
		markList2.add(new Mark(new Date(), 8));
		markList2.add(new Mark(new Date(), 3));
		markList2.add(new Mark(new Date(), 0));

		Student student2 = new Student();
		student2.setMarkList(markList2);

		try {
			assertEquals(18, code.getBestMark(student1));
			assertEquals(8, code.getBestMark(student2));
		} catch (Exception e) {
			fail("Grosse erreur");
		}
	}

	@Test
	public void testGetMarkListSorted() {
		Code code = new Code();

		ArrayList<Mark> markList1 = new ArrayList<Mark>();
		markList1.add(new Mark(new Date(), 18));
		markList1.add(new Mark(new Date(), 12));
		markList1.add(new Mark(new Date(), 14));
		markList1.add(new Mark(new Date(), 16));

		Student student1 = new Student();
		student1.setMarkList(markList1);

		ArrayList<Mark> markList2 = new ArrayList<Mark>();
		markList2.add(new Mark(new Date(), 8));
		markList2.add(new Mark(new Date(), 3));
		markList2.add(new Mark(new Date(), 0));

		Student student2 = new Student();
		student2.setMarkList(markList2);

		try {
			ArrayList<Mark> markListResult1 = code.getMarkListSorted(student1);

			Mark lastMark = new Mark(new Date(), 20);
			for (Mark mark : markListResult1) {
				if (mark.getMark() <= lastMark.getMark()) {
					lastMark = mark;
				} else {
					fail("Non tri�");
				}
			}

			ArrayList<Mark> markListResult2 = code.getMarkListSorted(student2);

			Mark lastMark2 = new Mark(new Date(), 20);
			for (Mark mark : markListResult2) {
				if (mark.getMark() <= lastMark2.getMark()) {
					lastMark2 = mark;
				} else {
					fail("Non tri�");
				}
			}

		} catch (Exception e) {
			fail("Grosse erreur");
		}
	}

}
