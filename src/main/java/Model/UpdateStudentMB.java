/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class UpdateStudentMB {
    private ConectionMongoDB mongo = new ConectionMongoDB();
    private JTextField Name;
    private JTextField Ape_Paterno;
    private JTextField Ape_Materno;
    private JDateChooser Date;
    private JTextField Cédula;
    private JTextField Telefono;
    private JTextField Correo;

    public UpdateStudentMB(JTextField Name, JTextField Ape_Paterno, JTextField Ape_Materno, JDateChooser Date, JTextField Cédula, JTextField Telefono, JTextField Correo) {
        this.Name = Name;
        this.Ape_Paterno = Ape_Paterno;
        this.Ape_Materno = Ape_Materno;
        this.Date = Date;
        this.Cédula = Cédula;
        this.Telefono = Telefono;
        this.Correo = Correo;
    }


    public void search(String Camp,String args){
        mongo.CheckConection();
        
        BasicDBObject search=new BasicDBObject(Camp,args);
        DBCursor cursor=mongo.getCollecStudent().find(search);
        
        while(cursor.hasNext()){
            DBObject object=cursor.next();
            Name.setText(object.get("Name").toString());
            Ape_Paterno.setText(object.get("Ape_Paterno").toString());
            Ape_Materno.setText(object.get("Ape_Materno").toString());
            Cédula.setText(object.get("Cédula").toString());
            Telefono.setText(object.get("Telefono").toString());
            Correo.setText(object.get("Correo").toString()); 
        }
    } 
}
