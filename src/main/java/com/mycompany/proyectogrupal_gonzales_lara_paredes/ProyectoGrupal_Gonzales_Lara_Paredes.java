
package com.mycompany.proyectogrupal_gonzales_lara_paredes;
import Classes.Asignature;
import Classes.Student;
import Model.SearchStudent;
import Model.UpdateStudentNotes;
import View.Start;
import View.Login;

public class ProyectoGrupal_Gonzales_Lara_Paredes {

    public static void main(String[] args) {
       /* Login log =new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);*/
     
       Start strart=new Start();
        strart.setVisible(true);
       strart.setLocationRelativeTo(null);
       
        /*SearchStudent s = new SearchStudent();
        //Student stu = s.searchStudent("Cédula", "1234567892");
        
        s.getStudent();
        /*stu.setSecondLastName("Joselo");
        stu.setName("Jilmar");
        
        
        // Añadir notas a cada asignatura
        for (Asignature a : stu.getArrayList()) {
            a.addGrade("Primer Parcial", 85);
            a.addGrade("Segundo Parcial", 56);
            a.addGrade("Tercer Parcial", 95);
        } 

        // Actualizar el estudiante en la base de datos con las nuevas notas
        UpdateStudentNotes up = new UpdateStudentNotes(stu);
        up.updateStudentNote();*/
        
    }
        
}
