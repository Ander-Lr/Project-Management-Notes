package Classes;

import java.util.HashMap;
import java.util.Map;

public class Asignature {
    private String name;
    private String teacher;
    private String NRC;
    private Map<String, Double> grades;

    public Asignature(String name, String teacher, String NRC) {
        this.name = name;
        this.teacher = teacher;
        this.NRC = NRC;
        this.grades = new HashMap<>();
    }

    public Asignature(String name, String teacher, String NRC, Map<String, Double> grades) {
        this.name = name;
        this.teacher = teacher;
        this.NRC = NRC;
        this.grades = grades;
    }
    

    // Métodos para agregar y obtener notas
    public void addGrade(String examName, double grade) {
        grades.put(examName, grade);
        calculateAverage();
    }

    public double getGrade(String examName) {
        return grades.getOrDefault(examName, 0.0);
    }

    public double getAverage() {
        return grades.getOrDefault("Promedio", 0.0);
    }

    public Map<String, Double> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Double> grades) {
        this.grades = grades;
    }
    
    

    // Método para calcular el promedio
    private void calculateAverage() {
        if (grades.isEmpty()) {
            grades.put("Promedio", 0.0);
        } else {
            double sum = 0.0;
            int count = 0;
            for (Map.Entry<String, Double> entry : grades.entrySet()) {
                if (!entry.getKey().equals("Promedio")) {
                    sum += entry.getValue();
                    count++;
                }
            }
            double average = (count == 0) ? 0.0 : sum / count;
            grades.put("Promedio", average);
        }
    }

    // Getters y setters para los otros atributos
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getNRC() {
        return NRC;
    }

    public void setNRC(String NRC) {
        this.NRC = NRC;
    }

}
