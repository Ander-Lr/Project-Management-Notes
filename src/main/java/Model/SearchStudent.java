/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Classes.Asignature;
import Classes.Student;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author Usuario
 */
public class SearchStudent {

    private ConectionMongoDB mongo = new ConectionMongoDB();

    public DefaultTableModel search(String Camp, String args) {
        mongo.CheckConection();
        String titles[] = {"Nombre", "Ape. Paterno", "Ape. Materno", "Edad", "Cedula", "Telefono", "Correo", "Asignaturas"};
        String Document[] = new String[8];
        DefaultTableModel model = new DefaultTableModel(null, titles);

        BasicDBObject search = new BasicDBObject(Camp, args);
        DBCursor cursor = mongo.getCollecStudent().find(search);

        while (cursor.hasNext()) {
            DBObject object = cursor.next();
            Document[0] = object.get("Name").toString();
            Document[1] = object.get("Ape_Paterno").toString();
            Document[2] = object.get("Ape_Materno").toString();
            Document[3] = object.get("Edad").toString();
            Document[4] = object.get("Cédula").toString();
            Document[5] = object.get("Telefono").toString();
            Document[6] = object.get("Correo").toString();
            Document[7] = object.get("Asignaturas").toString();
            model.addRow(Document);
        }
        return model;
    }

    
}
