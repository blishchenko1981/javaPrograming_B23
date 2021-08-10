package day42_CustomClass_Constructor.warmUp;

public class CybertekStudentsObject {
    public static void main(String[] args) {
        CybertekStudents student1 = new CybertekStudents("Vitalii", 40, 'M');
        CybertekStudents student2 = new CybertekStudents("Hende", 32, 'F');
        CybertekStudents student3 = new CybertekStudents("Abbos", 22, 'M');
        CybertekStudents student4 = new CybertekStudents("Ksenia", 27, 'F');

        student1.attendClass();
        student2.askForBreak();
        student3.replit();
        System.out.println(student4.name + " just perfect");


    }
}
