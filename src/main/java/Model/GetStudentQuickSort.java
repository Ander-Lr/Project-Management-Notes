
package Model;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class GetStudentQuickSort {

    private DefaultTableModel modelTable;
    private ConectionMongoDB mongo = new ConectionMongoDB();

    public DefaultTableModel view() {
        mongo.CheckConection(); // no olvidar check
        String[] titles = {"Ape. Paterno", "Ape. Materno", "Nombre", "Edad", "Cedula", "Telefono", "Correo", "Asignaturas"};
        modelTable = new DefaultTableModel(null, titles);

        DBCursor cursor = mongo.getCollecStudent().find();
        ArrayList<String[]> documents = new ArrayList<>();

        while (cursor.hasNext()) {
            DBObject object = cursor.next();
            String[] document = new String[8];
            document[0] = getStringOrEmpty(object, "Ape_Paterno");
            document[1] = getStringOrEmpty(object, "Ape_Materno");
            document[2] = getStringOrEmpty(object, "Name");
            document[3] = getStringOrEmpty(object, "Edad");
            document[4] = getStringOrEmpty(object, "Cédula");
            document[5] = getStringOrEmpty(object, "Telefono");
            document[6] = getStringOrEmpty(object, "Correo");
            document[7] = getStringOrEmpty(object, "Asignaturas");
            documents.add(document);
        }

        // Convertir ArrayList a array para trabajar sin List
        String[][] documentsArray = new String[documents.size()][];
        documents.toArray(documentsArray);

        // Ordenar la lista de documentos utilizando QuickSort
        quickSort(documentsArray, 0, documentsArray.length - 1);

        // Agregar los datos ordenados al modelo de la tabla
        for (String[] doc : documentsArray) {
            modelTable.addRow(doc);
        }

        return modelTable;
    }

    private String getStringOrEmpty(DBObject object, String key) {
        return object.containsField(key) ? object.get(key).toString() : "";
    }

    private void quickSort(String[][] list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);
            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);
        }
    }

    private int partition(String[][] list, int low, int high) {
        String[] pivot = list[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (list[j][0].compareTo(pivot[0]) <= 0) { // Comparar por el campo "Ape_Paterno"
                i++;
                String[] temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }
        String[] temp = list[i + 1];
        list[i + 1] = list[high];
        list[high] = temp;
        return i + 1;
    }
}