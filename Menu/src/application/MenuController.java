package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class MenuController {
	@FXML
	private Button f1;
	
	@FXML
	private Button f2;
	
	@FXML
	private Button f3;
	
	@FXML
	private Button f4;
	
	@FXML
	private Button exit;
	
	@FXML
	private Pane startpane;
	
	@FXML
	private Pane pane1;
	
	@FXML
	private Pane pane2;
	
	@FXML
	private Pane pane3;

	public MenuController() {
		System.out.println("startPane");
	}

	public void exit(ActionEvent event) {
		System.exit(0);
	}
	
	public void changeToPane1(ActionEvent event) {
		System.out.println("pane1");
		startpane.setVisible(false);
		pane1.setVisible(true);
		pane2.setVisible(false);
		pane3.setVisible(false);
	}
	
	public void changeToPane2(ActionEvent event) {
		System.out.println("pane2");
		startpane.setVisible(false);
		pane1.setVisible(false);
		pane2.setVisible(true);
		pane3.setVisible(false);
	}
	
	public void changeToPane3(ActionEvent event) {
		System.out.println("pane3");
		startpane.setVisible(false);
		pane1.setVisible(false);
		pane2.setVisible(false);
		pane3.setVisible(true);
	}
	

	
}
