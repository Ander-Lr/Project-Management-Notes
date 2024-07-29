/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class GetStudentBubbleSort {
    private ConectionMongoDB mongo = new ConectionMongoDB();
    private DefaultTableModel modelTable;

    public DefaultTableModel view() {
        mongo.CheckConection(); // no olvidar check

        String[] titles = {"Cedula","Nombre", "Ape. Paterno", "Ape. Materno", "Edad", "Telefono", "Correo", "Asignaturas"};
        modelTable = new DefaultTableModel(null, titles);

        DBCursor cursor = mongo.getCollecStudent().find();
        String[][] documents = new String[100][8]; // Suponemos un tamaño máximo para simplificar, ajustar según necesidad
        int count = 0;

        while (cursor.hasNext()) {
            if (count >= documents.length) {
                documents = Arrays.copyOf(documents, documents.length * 2); // Ampliar si es necesario
            }
            DBObject object = cursor.next();
            documents[count][0]= getStringOrEmpty(object, "Cédula");
            documents[count][1] = getStringOrEmpty(object, "Name");
            documents[count][2] = getStringOrEmpty(object, "Ape_Paterno");
            documents[count][3] = getStringOrEmpty(object, "Ape_Materno");
            documents[count][4] = getStringOrEmpty(object, "Edad");            
            documents[count][5] = getStringOrEmpty(object, "Telefono");
            documents[count][6] = getStringOrEmpty(object, "Correo");
            documents[count][7] = getStringOrEmpty(object, "Asignaturas");
            count++;
        }

        // Reducir el tamaño del array a los elementos realmente leídos
        documents = Arrays.copyOf(documents, count);

        // Ordenar la lista de documentos utilizando Bubble Sort
        bubbleSort(documents);

        // Agregar los datos ordenados al modelo de la tabla
        for (String[] doc : documents) {
            modelTable.addRow(doc);
        }

        return modelTable;
    }

    private String getStringOrEmpty(DBObject object, String key) {
        return object.containsField(key) ? object.get(key).toString() : "";
    }

    private void bubbleSort(String[][] list) {
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Comparar las cédulas como números enteros
                if (Integer.parseInt(list[j][4]) > Integer.parseInt(list[j + 1][4])) {
                    // Intercambiar las filas
                    String[] temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}