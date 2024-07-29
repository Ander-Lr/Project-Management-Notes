package Model;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;

public class DeleteStudent {
    ConectionMongoDB connection;
    DBCollection collecStudent;
    
    public DeleteStudent() {
        connection = new ConectionMongoDB();
        connection.CheckConection();
        collecStudent = connection.getCollecStudent();
    }
    
    public boolean deleteStudent(String cedula) {
        BasicDBObject query = new BasicDBObject();
        query.put("Cédula", cedula);
        BasicDBObject deletedDocument = (BasicDBObject) collecStudent.findAndRemove(query);
        return deletedDocument != null;
    }
}
