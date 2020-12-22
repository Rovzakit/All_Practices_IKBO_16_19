package Practice11_12;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Calculator extends Application {
    private double a = 0;
    private double b = 0;
    private Button multiplication;
    private Button addition;
    private Button subtraction;
    private Button division;
    private Button equality;
    String c;
    private TextField textField1;


    public void thisStart() {
        Application.launch();
    }


    private TextField textFieldMaker(int a) {
        textField1 = new TextField();
        textField1.setPrefSize(500, 100);
        textField1.setFont(Font.font(30));
        return textField1;

    }


    public void start(Stage stage) throws Exception {
        multiplication = new Button("*");
        multiplication.setFont(Font.font(40));
        multiplication.setLayoutX(75);
        multiplication.setLayoutY(350);
        multiplication.setPrefSize(100,100);
        addition = new Button("+");
        addition.setLayoutX(75);
        addition.setLayoutY(150);
        addition.setFont(Font.font(40));
        addition.setPrefSize(100,100);
        subtraction = new Button("-");
        subtraction.setLayoutX(325);
        subtraction.setLayoutY(150);
        subtraction.setFont(Font.font(40));
        subtraction.setPrefSize(100,100);
        division = new Button("/");
        division.setPrefSize(100,100);
        division.setLayoutX(325);
        division.setLayoutY(350);
        division.setFont(Font.font(40));
        equality = new Button("=");
        equality.setLayoutX(200);
        equality.setLayoutY(550);
        equality.setFont(Font.font(40));
        equality.setPrefSize(100, 100);
        Group group = new Group(textFieldMaker(1), multiplication, subtraction, addition, division, equality);

        Scene scene = new Scene(group, Color.BLUE);
        stage.setScene(scene);
        stage.setTitle("task 11_12");
        stage.setWidth(500);
        stage.setHeight(750);
        stage.show();
        stage.setScene(scene);
        stage.setTitle("TextField in JavaFX");
        stage.show();

        subtraction.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                a = Double.parseDouble(textField1.getText());
                textField1.clear();
                c = "-";
            }
        });
        addition.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                a = Double.parseDouble(textField1.getText());
                textField1.clear();
                c = "+";
            }
        });
        multiplication.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                a = Double.parseDouble(textField1.getText());
                textField1.clear();
                c = "*";
            }
        });
        division.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                a = Double.parseDouble((textField1.getText()));
                textField1.clear();
                c = "/";

            }
        });
        equality.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                b = Double.parseDouble((textField1.getText()));
                textField1.clear();
                calc(c);
            }
        });

    }

    private void calc(String c) {

        if (c.equals("*")) {
            textField1.setText(String.valueOf(a * b));
        }
        else if (c.equals("-"))
            textField1.setText(String.valueOf(a - b));
        else if( c.equals("/"))
            textField1.setText(String.valueOf(a / b));
        else
            textField1.setText(String.valueOf(a + b));
    }
}
