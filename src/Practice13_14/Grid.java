package Practice13_14;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

public class Grid extends Application{
    private int k=0;
    private Tile[][] grid =new Tile[3][3];
    private boolean isPlayable = true;
    private Parent createBoard(){
        Pane root= new Pane();

        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                Tile tile=new Tile();
                tile.setTranslateX(i*200);
                tile.setTranslateY(j*200);
                root.getChildren().addAll(tile);
                grid[i][j]=tile;
            }
        }

        return root;
    }
    private boolean check() {
        for (int i = 0; i < 3; i++) {

            if (!grid[0][i].getValue().equals("") || !grid[1][i].getValue().equals("") || !grid[2][i].getValue().equals("")) {
                if (grid[0][i].getValue().equals(grid[1][i].getValue()) && grid[1][i].getValue().equals(grid[2][i].getValue())) {
                    endGameWin();
                    return true;
                }
            }
            else return true;
        }
        for (int i = 0; i < 3; i++) {

            if (!grid[i][0].getValue().equals("") || !grid[i][1].getValue().equals("") || !grid[i][2].getValue().equals("")) {
                if (grid[i][0].getValue().equals(grid[i][1].getValue()) && grid[i][1].getValue().equals(grid[i][2].getValue())) {
                    endGameWin();
                    return true;
                }
            }
            else return true;
        }
        if (!grid[0][0].getValue().equals("") || !grid[1][1].getValue().equals("") || !grid[2][2].getValue().equals("")) {
            if (grid[0][0].getValue().equals(grid[1][1].getValue()) && grid[1][1].getValue().equals(grid[2][2].getValue())) {
                endGameWin();
                return true;
            }
        }
        else return true;
        if (!grid[0][2].getValue().equals("") && !grid[1][1].getValue().equals("") && !grid[2][0].getValue().equals("")) {
            if (grid[0][2].getValue().equals(grid[1][1].getValue()) && grid[1][1].getValue().equals(grid[2][0].getValue())) {
                endGameWin();
                return true;
            }
        }
        else return true;
        int c=0;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if(!grid[i][j].getValue().equals(""))
                    c++;
            }
        }
        if (c==9){
            endGame();
            return true;
        }
        return true;
    }
    private void endGameWin(){
        isPlayable =false;
        Win();
    }
    private void Win(){
        Line line=new Line();
    }
    private void endGame(){
        isPlayable =false;
    }

    private class Tile extends StackPane {
        Text text = new Text();
        public Tile() {
            text.setFont(Font.font(80));
            Rectangle border = new Rectangle(200, 200);
            border.setFill(null);
            border.setStroke(Color.BLACK);
            getChildren().addAll(border, text);

            setOnMouseClicked(event -> {

                if (isPlayable) {
                    if (k % 2 == 0) {
                        X();
                    } else {
                        O();
                    }
                    k++;
                    check();
                }
            });

        }
        private void X(){
            text.setText("X");
        }
        private void O(){
            text.setText("O");
        }
        public String getValue() {
            return text.getText();
        }
    }

    public void start(Stage stage) throws Exception {

        Group group = new Group();
        Scene scene = new Scene(createBoard(), Color.WHITE);
        stage.setWidth(610);
        stage.setHeight(630);
        stage.setScene(scene);
        stage.setTitle("Tic Tac Toe");
        stage.show();
    }
}