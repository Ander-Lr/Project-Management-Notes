package Model;

import Classes.Asignature;
import Classes.Student;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;

public class SaveStudent {

    private Student student;
    private ConectionMongoDB mongo = new ConectionMongoDB();

    public SaveStudent(Student student) {
        this.student = student;
    }

public void setStudent() {
    mongo.CheckConection();
    BasicDBObject register = new BasicDBObject();
    register.put("Name", student.getName());
    register.put("Ape_Paterno", student.getFirtsLastName());
    register.put("Ape_Materno", student.getSecondLastName());
    register.put("Edad", student.getAge());
    register.put("Cédula", student.getIdentification());
    register.put("Telefono", student.getPhone());
    register.put("Correo", student.getEmail());

    ArrayList<BasicDBObject> asignaturas = new ArrayList<>();

    for (Asignature aux : student.getArrayList()) {
        BasicDBObject registerAsignature = new BasicDBObject();
        registerAsignature.put("Nrc", aux.getNRC());
        registerAsignature.put("Nombre", aux.getName());
        registerAsignature.put("Docente", aux.getTeacher());

        // Convertir el mapa de grades a BasicDBObject
        BasicDBObject gradesDBObject = new BasicDBObject();
        for (Map.Entry<String, Double> entry : aux.getGrades().entrySet()) {
            gradesDBObject.put(entry.getKey(), entry.getValue());
        }
        registerAsignature.put("Notas", gradesDBObject);

        asignaturas.add(registerAsignature);
    }
    register.put("Asignaturas", asignaturas);

    BasicDBObject code = new BasicDBObject("Cédula", student.getIdentification());
    DBCursor cursorCodigo = mongo.getCollecStudent().find(code);

    if (cursorCodigo.hasNext()) {
        JOptionPane.showMessageDialog(null, "Estudiante ya ingresado");
        return;
    }
    JOptionPane.showMessageDialog(null, "Estudiante agregado con éxito");
    mongo.getCollecStudent().insert(register);
}
}
