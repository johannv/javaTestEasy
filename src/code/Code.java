package code;

import java.util.ArrayList;

import domain.Mark;
import domain.Student;

/**
 * @author Verbroucht Johann
 * Test Java Date : 15 août. 2011
 */
public class Code {

	/*
	 * Pour réaliser ces exercices il n'y a pas besoin de modifier les autres
	 * classes, il suffit d'écrire les fonctions nécessaires.
	 */

	/*
	 * Exercice 1 :
	 * 
	 * Développez la fonction permettant de retourner le nombre d'élément d'une
	 * liste.
	 */
	public int listSize(ArrayList<String> list) {
		return 0;
	}

	/*
	 * Exercice 2 :
	 * 
	 * Développez la fonction permettant de retourner le factoriel du nombre.
	 * 
	 * Exemple: 6! = 6*5*4*3*2*1 = 720
	 */

	public int factoriel(int number) {
		return 0;
	}

	/*
	 * Exercice 3 :
	 * 
	 * Développez la fonction permettant de retourner la chaine de caractères la
	 * plus longue. Si la liste est vide, la fonction renvoie null.
	 */
	public String getLongestStringInArray(ArrayList<String> list) {
		return null;
	}

	/*
	 * Exercice 4 :
	 * 
	 * Développez la fonction permettant de trier la liste par ordre
	 * alphabétique.
	 */
	public ArrayList<String> sortArray(ArrayList<String> list) {
		return null;
	}

	/*
	 * Exercice 5 :
	 * 
	 * Développez la fonction permettant de supprimer les chaines de caracteres
	 * contenant un nombre impair de caracteres.
	 */
	public ArrayList<String> deleteImpair(ArrayList<String> list) {
		return null;
	}

	/*
	 * Exercice 6 :
	 * 
	 * Développez la fonction permettant de créer un nouvel élève en remplissant
	 * ses informations.
	 * 
	 * N'oubliez pas de créer le professeur et de l'associer √† l'élève.
	 */
	public Student newStudent(int student_id, String student_lastname,
			String student_firstname, int teacher_id, String teacher_lastname,
			String teacher_firstname) {
		return null;
	}

	/*
	 * Exercice 7 :
	 * 
	 * Développez la fonction permettant d'obtenir la moyenne de l'élève
	 */
	public int markAverage(Student student) {
		return 0;
	}

	/*
	 * Exercice 8 :
	 * 
	 * Développez la fonction permettant de récupérer la meilleure note de
	 * l'élève.
	 */

	public int getBestMark(Student student) {
		return 0;
	}

	/*
	 * Exercice 9 :
	 * 
	 * Développez la fonction permettant de récupérer la liste des notes dans un
	 * ordre croissant.
	 * 
	 * La fonction MarkComparator a été développée pour vous aider.
	 */

	public ArrayList<Mark> getMarkListSorted(Student student) {
		return null;
	}

	/*
	 * Exercice 10 :
	 * 
	 * Développez la fonction permettant de retourner le nombre de fois que la
	 * chaine1 est contenue dans la chaine2.
	 */
	public int getFrequence(String string1, String string2) {
		return 0;
	}

}