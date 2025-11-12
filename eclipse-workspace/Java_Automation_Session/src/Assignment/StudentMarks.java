package Assignment;

class Student {
	   int subjectA;
	   int subjectB;
	   int subjectC;
	   // Constructor
	   Student(int a, int b, int c) {
	       subjectA = a;
	       subjectB = b;
	       subjectC = c;
	   }
	   // Method to get total marks of a student
	   int getTotal() {
	       return subjectA + subjectB + subjectC;
	   }
	}
	public class StudentMarks {
	   public static void main(String[] args) {
	       // Create 3 student objects
	       Student s1 = new Student(85, 90, 80);
	       Student s2 = new Student(75, 88, 92);
	       Student s3 = new Student(70, 60, 78);
	       // Store students in array
	       Student[] students = {s1, s2, s3};
	       int totalAllMarks = 0;
	       int totalA = 0, totalB = 0, totalC = 0;
	       // Loop through students to compute totals
	       for (Student s : students) {
	           totalA += s.subjectA;
	           totalB += s.subjectB;
	           totalC += s.subjectC;
	           totalAllMarks += s.getTotal();
	       }
	       int numberOfStudents = students.length;
	       int totalSubjects = 3;
	       double avgAllMarks = (double) totalAllMarks / (numberOfStudents * totalSubjects);
	       double avgA = (double) totalA / numberOfStudents;
	       double avgB = (double) totalB / numberOfStudents;
	       double avgC = (double) totalC / numberOfStudents;
	       // Print results
	       System.out.println("Total marks of all students in all subjects: " + totalAllMarks);
	       System.out.println("Average marks of all students in all subjects: " + avgAllMarks);
	       System.out.println("Total marks in subject A: " + totalA + ", Average: " + avgA);
	       System.out.println("Total marks in subject B: " + totalB + ", Average: " + avgB);
	       System.out.println("Total marks in subject C: " + totalC + ", Average: " + avgC);
	   }
	}
