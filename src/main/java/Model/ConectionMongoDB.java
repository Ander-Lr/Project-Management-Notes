
package Model;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Usuario
 */
public class ConectionMongoDB {
    private MongoClient mongo =new MongoClient("localhost",27017);
    private DB dataBase;
    private DBCollection collecRatings;
    private DBCollection collecStudent;
    
    // Atributos de Jilmar
    MongoDatabase database;
    MongoCollection<Document> collection;
    
    public void CheckConection(){
        dataBase=mongo.getDB("Unidad_Educativa_Alegria");
        collecRatings=dataBase.getCollection("Registro_Notas");
        collecStudent=dataBase.getCollection("Registro_Estudiante");
        
        // Atributos de Jilmar
        database = mongo.getDatabase("Unidad_Educativa_Alegria");
        collection = database.getCollection("Registro_Estudiante");
    }

    public DB getDataBase() {
        return dataBase;
    }

    public void setDataBase(DB dataBase) {
        this.dataBase = dataBase;
    }

    public DBCollection getCollecRatings() {
        return collecRatings;
    }

    public void setCollecRatings(DBCollection collecRatings) {
        this.collecRatings = collecRatings;
    }

    public DBCollection getCollecStudent() {
        return collecStudent;
    }

    public void setCollecStudent(DBCollection collecStudent) {
        this.collecStudent = collecStudent;
    }
    
    // Metodo de Jilmar
    public MongoCollection<Document> getCollecStudents() {
        return collection;
    }
    
}
