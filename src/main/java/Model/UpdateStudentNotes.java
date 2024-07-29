/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Classes.Asignature;
import Classes.Student;
import com.mongodb.client.MongoCollection;
import java.util.ArrayList;
import java.util.Map;
import org.bson.Document;

/**
 *
 * @author Jilmar
 */
public class UpdateStudentNotes {

    private Student student;
    private ConectionMongoDB mongo = new ConectionMongoDB();

    public UpdateStudentNotes(Student student) {
        this.student = student;
    }

    public void updateStudentNote() {

        mongo.CheckConection();

        for (Asignature a : student.getArrayList()) {
            for (Map.Entry<String, Double> entry : a.getGrades().entrySet()) {
                System.out.println(entry.getValue() + entry.getKey());
            }
        }

        Document register = new Document();
        register.put("Name", student.getName());
        register.put("Ape_Paterno", student.getFirtsLastName());
        register.put("Ape_Materno", student.getSecondLastName());
        register.put("Edad", student.getAge());
        register.put("Cédula", student.getIdentification());
        register.put("Telefono", student.getPhone());
        register.put("Correo", student.getEmail());

        // Crear la lista de asignaturas
        ArrayList<Document> asignaturas = new ArrayList<>();

        for (Asignature aux : student.getArrayList()) {
            Document registerAsignature = new Document();
            registerAsignature.put("Nrc", aux.getNRC());
            registerAsignature.put("Nombre", aux.getName());
            registerAsignature.put("Docente", aux.getTeacher());

            // Añadir las notas al registro de asignatura
            Document gradesDBObject = new Document();
            for (Map.Entry<String, Double> entry : aux.getGrades().entrySet()) {
                gradesDBObject.put(entry.getKey(), entry.getValue());
            }
            registerAsignature.put("Notas", gradesDBObject);

            asignaturas.add(registerAsignature);
        }
        register.put("Asignaturas", asignaturas);

        Document query = new Document("Cédula", student.getIdentification());

        // Crear la actualización usando $set
        Document updateFields = new Document("$set", register);

        // Obtener la colección y realizar la actualización
        MongoCollection<Document> collection = mongo.getCollecStudents();
        collection.updateOne(query, updateFields);
    }

}
