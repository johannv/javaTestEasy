package code;

import java.util.ArrayList;

import domain.Mark;
import domain.Student;

/**
 * @author Verbroucht Johann
 * Test Java Date : 15 ao�t. 2011
 */
public class Code {

	/*
	 * Pour r�aliser ces exercices il n'y a pas besoin de modifier les autres
	 * classes, il suffit d'�crire les fonctions n�cessaires.
	 */

	/*
	 * Exercice 1 :
	 * 
	 * D�veloppez la fonction permettant de retourner le nombre d'�l�ment d'une
	 * liste.
	 */
	public int listSize(ArrayList<String> list) {
		return 0;
	}

	/*
	 * Exercice 2 :
	 * 
	 * D�veloppez la fonction permettant de retourner le factoriel du nombre.
	 * 
	 * Exemple: 6! = 6*5*4*3*2*1 = 720
	 */

	public int factoriel(int number) {
		return 0;
	}

	/*
	 * Exercice 3 :
	 * 
	 * D�veloppez la fonction permettant de retourner la chaine de caract�res la
	 * plus longue. Si la liste est vide, la fonction renvoie null.
	 */
	public String getLongestStringInArray(ArrayList<String> list) {
		return null;
	}

	/*
	 * Exercice 4 :
	 * 
	 * D�veloppez la fonction permettant de trier la liste par ordre
	 * alphab�tique.
	 */
	public ArrayList<String> sortArray(ArrayList<String> list) {
		return null;
	}

	/*
	 * Exercice 5 :
	 * 
	 * D�veloppez la fonction permettant de supprimer les chaines de caracteres
	 * contenant un nombre impair de caracteres.
	 */
	public ArrayList<String> deleteImpair(ArrayList<String> list) {
		return null;
	}

	/*
	 * Exercice 6 :
	 * 
	 * D�veloppez la fonction permettant de cr�er un nouvel �l�ve en remplissant
	 * ses informations.
	 * 
	 * N'oubliez pas de cr�er le professeur et de l'associer à l'�l�ve.
	 */
	public Student newStudent(int student_id, String student_lastname,
			String student_firstname, int teacher_id, String teacher_lastname,
			String teacher_firstname) {
		return null;
	}

	/*
	 * Exercice 7 :
	 * 
	 * D�veloppez la fonction permettant d'obtenir la moyenne de l'�l�ve
	 */
	public int markAverage(Student student) {
		return 0;
	}

	/*
	 * Exercice 8 :
	 * 
	 * D�veloppez la fonction permettant de r�cup�rer la meilleure note de
	 * l'�l�ve.
	 */

	public int getBestMark(Student student) {
		return 0;
	}

	/*
	 * Exercice 9 :
	 * 
	 * D�veloppez la fonction permettant de r�cup�rer la liste des notes dans un
	 * ordre croissant.
	 * 
	 * La fonction MarkComparator a �t� d�velopp�e pour vous aider.
	 */

	public ArrayList<Mark> getMarkListSorted(Student student) {
		return null;
	}

	/*
	 * Exercice 10 :
	 * 
	 * D�veloppez la fonction permettant de retourner le nombre de fois que la
	 * chaine1 est contenue dans la chaine2.
	 */
	public int getFrequence(String string1, String string2) {
		return 0;
	}

}