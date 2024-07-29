/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class GetStudent {
    private ConectionMongoDB mongo=new ConectionMongoDB();
    private DefaultTableModel modelTable;
    
    public DefaultTableModel view(){
        mongo.CheckConection();// no olvidar check
        String[] titles = {"Nombre", "Ape. Paterno", "Ape. Materno", "Edad", "Cedula", "Telefono", "Correo", "Asignaturas"};
        String Document[]=new String [8];
        modelTable=new DefaultTableModel(null,titles);
        
        DBCursor cursor=mongo.getCollecStudent().find();
        
        while(cursor.hasNext()){
            DBObject object=cursor.next();
            Document[0]=object.get("Name").toString();
            Document[1]=object.get("Ape_Paterno").toString();
            Document[2]=object.get("Ape_Materno").toString();
            Document[3]=object.get("Edad").toString();
            Document[4]=object.get("Cédula").toString();
            Document[5]=object.get("Telefono").toString();
            Document[6]=object.get("Correo").toString();
            Document[7]=object.get("Asignaturas").toString();
            modelTable.addRow(Document);
        }
        return modelTable;
    }
}
