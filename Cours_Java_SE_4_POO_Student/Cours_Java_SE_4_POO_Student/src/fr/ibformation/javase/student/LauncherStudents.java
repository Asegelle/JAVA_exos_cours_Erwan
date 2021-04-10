package fr.ibformation.javase.student;

import java.util.ArrayList;
import java.util.List;

import fr.ibformation.javase.student.bo.Student;

public class LauncherStudents {

	
	/*
	L'id�e est de r�aliser la gestion d'une liste d'�l�ves dans une classe
	Cr�er une liste d'�l�ves avec nom, classe (CP, CE1, etc...), �ge
	- Cr�er 5 �l�ves :
		Yoann, CP, 6 ans
		Emma, CP, 6 ans
		Erwann, CE1, 7 ans
		Bastien, CP, 8 ans
		Alienor, CE1, 8 ans

	- Afficher la liste des �l�ves
	- Ajouter une nouvelle �l�ve Alicia, CE2, 8 ans
	- Supprimer l��l�ve Erwann
	- Modifier Bastien qui est en CM1 en r�alit�
	- Afficher la liste des �l�ves
	
	Indice : 
	- Partir sur une ArrayList
	- Une ArrayList peut avoir comme type un Business Object
 
 */
	
	public static void main(String[] args) {
		
		// Etape 1 : D�claration des variables
		List<Student> students = new ArrayList<Student>();
		
		// Etape 2 : Cr�er les 5 �l�ves
		students.add(new Student("Yoann", "CP", 6));
		students.add(new Student("Emma", "CP", 6));
		students.add(new Student("Erwann", "CE1", 7));
		students.add(new Student("Bastien", "CP", 8));
		students.add(new Student("Alienor", "CE1", 8));
		
		// Etape 3 : Afficher la liste des �l�ves
		displayStudents(students);
		
		// Etape 4 : Ajouter une nouvelle �l�ve
		students.add(new Student("Alicia", "CE2", 8));
		
		// Etape 5 : Supprimer l��l�ve Erwann
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName() == "Erwann") {
				students.remove(i);
				break;
			}
		}
		
		// Etape 6 : Modifier Bastien qui est en CM1 en r�alit�
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName() == "Bastien") {
				students.get(i).setClassroom("CM1");
				break;
			}
		}
		
		// Etape 7 : Afficher la liste des �l�ves
		displayStudents(students);
	}

	private static void displayStudents(List<Student> students) {
		for (Student student : students) {
			System.out.println(student);
		}
		
	}

}
