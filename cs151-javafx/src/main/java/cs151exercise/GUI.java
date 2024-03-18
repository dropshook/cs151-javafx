package cs151exercise;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.*;

public class GUI extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Jack White", new Image("e"), 11));
        studentList.add(new Student("Andrew Peck", new Image("e"), 12));

        VBox vb = new VBox();
        for (Student s : studentList) {
            vb.getChildren().addAll();
        }

        BorderPane bp = new BorderPane();
        bp.setCenter(vb);

        Scene scene = new Scene(bp, 300, 200, Color.web("#AAAAAA"));
        stage.setTitle("IDs of Students");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

    private VBox getStudent(Student s) {
        VBox student = new VBox();
        student.getChildren().addAll(new Text("Name:" + s.getName()));
        student.getChildren().addAll(new Text("ID:" + s.getStudentId()));
        
        return student;
    }
}

