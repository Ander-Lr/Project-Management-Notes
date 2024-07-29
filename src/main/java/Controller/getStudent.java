package Controller;

import Classes.Asignature;
import Classes.Student;
import Model.ConectionMongoDB;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bson.Document;


// Jilmar
public class getStudent {

    private ConectionMongoDB mongo = new ConectionMongoDB();

    public Student getStudent(String value) {

        mongo.CheckConection();
        MongoCollection<Document> collection = mongo.getCollecStudents();
        Document doc = collection.find(new Document("Cédula", value)).first();

        if (doc == null) {
            return null;
        }

        String name = doc.get("Name").toString();
        String ApeP = doc.get("Ape_Paterno").toString();
        String ApeM = doc.get("Ape_Materno").toString();
        String age = doc.get("Edad").toString();
        String id = doc.get("Cédula").toString();
        String phone = doc.get("Telefono").toString();
        String email = doc.get("Correo").toString();

        ArrayList<Asignature> listAsignature = new ArrayList();
        List<Document> asignature = (List<Document>) doc.get("Asignaturas");

        for (Document a : asignature) {
            String nrc = a.get("Nrc").toString();
            String asignaturaName = a.get("Nombre").toString();
            String docente = a.get("Docente").toString();
            Document notas = (Document) a.get("Notas");

            Map<String, Double> notesMap = new HashMap<>();

            if (notas != null) {
                for (String key : notas.keySet()) {
                    notesMap.put(key, notas.getDouble(key));
                }
            }

            Asignature asig = new Asignature(asignaturaName, docente, nrc, notesMap);
            listAsignature.add(asig);

        }

        Student student = new Student(name, ApeP, ApeM, new Date(121, 10, 25), id, phone, email, listAsignature);

        return student;
    }

    public List<Student> getStudent() {

        mongo.CheckConection();
        MongoCollection<Document> collection = mongo.getCollecStudents();
        FindIterable<Document> docu = collection.find();
        List<Student> listStudent = new ArrayList();

        if (docu == null) {
            return null;
        }

        for (Document doc : docu) {
            String name = doc.get("Name").toString();
            String ApeP = doc.get("Ape_Paterno").toString();
            String ApeM = doc.get("Ape_Materno").toString();
            String age = doc.get("Edad").toString();
            String id = doc.get("Cédula").toString();
            String phone = doc.get("Telefono").toString();
            String email = doc.get("Correo").toString();

            ArrayList<Asignature> listAsignature = new ArrayList();
            List<Document> asignature = (List<Document>) doc.get("Asignaturas");

            for (Document a : asignature) {
                String nrc = a.get("Nrc").toString();
                String asignaturaName = a.get("Nombre").toString();
                String docente = a.get("Docente").toString();
                Document notas = (Document) a.get("Notas");

                Map<String, Double> notesMap = new HashMap<>();

                if (notas != null) {
                    for (String key : notas.keySet()) {
                        notesMap.put(key, notas.getDouble(key));
                    }
                }

                Asignature asig = new Asignature(asignaturaName, docente, nrc, notesMap);
                listAsignature.add(asig);

            }

            Student student = new Student(name, ApeP, ApeM, new Date(121, 10, 25), id, phone, email, listAsignature);

            listStudent.add(student);
        }

        return listStudent;
    }

}
