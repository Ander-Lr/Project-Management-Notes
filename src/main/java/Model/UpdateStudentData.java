
package Model;

import Classes.Asignature;
import Classes.Student;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import java.util.ArrayList;

public class UpdateStudentData {

    private Student student;
    private ConectionMongoDB mongo = new ConectionMongoDB();

    public UpdateStudentData(Student student) {
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
            asignaturas.add(registerAsignature);
        }
        register.put("Asignaturas", asignaturas);

        BasicDBObject code = new BasicDBObject("Cédula", student.getIdentification());// checar en poner el mismo citerio de busqueda
        DBCursor cursorCodigo = mongo.getCollecStudent().find(code);

        mongo.getCollecStudent().insert(register);
    }


}
