package application;
	

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		Canvas canvas = new Canvas();//criando canvas
		canvas.setWidth(400);//setando tamanho
		canvas.setHeight(200);
		
		GraphicsContext graphicsContext = canvas.getGraphicsContext2D();//obtendo contexto grafico
		//graphicsContext.strokeText("Draw", 100, 100);//desenhando texto
		graphicsContext.strokeLine(10, 10, 10, 10);
		graphicsContext.setLineWidth(2.0);//era pra ta funcionando esse lixo aqui
		graphicsContext.setStroke(Color.GREEN);
		graphicsContext.setFill(Color.BLUE);//cor do preenchimento
		graphicsContext.strokeRoundRect(10, 10, 50, 50, 10, 10);//isso desenha um retangulo e os parametros sao as dimensões
		graphicsContext.fillRoundRect(100, 10, 50, 50, 10, 10);//retangulo que sera preenchido
		graphicsContext.setFill(Color.RED);//nao ta mudando a cor
		//tentando fazer um desenho
		/*graphicsContext.setLineWidth(2.0);
		graphicsContext.setStroke(Color.AZURE);
		graphicsContext.setFill(Color.BLACK);
		graphicsContext.beginPath();
		graphicsContext.moveTo(50, 50);
		graphicsContext.quadraticCurveTo(30, 150, 300, 200);
		graphicsContext.fill();
		graphicsContext.closePath();
		graphicsContext.fill();
		
		claramente uma tenativa falha '-'*/
		
		//tentando abrir uma imagem
		//Image image = new Image();
		
		/*MenuBar menuBar = new MenuBar();
		Menu menuFile = new Menu("Salvar");
		MenuItem menuItem = new MenuItem("Save");
		menuFile.getItems().addAll(menuItem);
		menuBar.getMenus().addAll(menuFile);
		mais uma tentativa falha de adicionar um botao*/
		
		Pane root = new Pane();
		root.getChildren().add(canvas);
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Drawing");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
