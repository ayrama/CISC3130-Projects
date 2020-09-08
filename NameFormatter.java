public class NameFormatter extends Application {
  
@Override
public void start(Stage stage)
{

GridPane grid = new GridPane();
grid.setPadding(new Insets(10, 10, 10, 10));
grid.setVgap(5);
grid.setHgap(5);
//Defining the Name text field
final TextField Fname = new TextField();
Fname.setPromptText("Enter your first name.");
Fname.setPrefColumnCount(10);
Fname.getText();
GridPane.setConstraints(Fname, 0, 0);
grid.getChildren().add(Fname);
//Defining the Middle Name text field
final TextField MName = new TextField();
MName.setPromptText("Enter your middle name.");
GridPane.setConstraints(MName, 0, 1);
grid.getChildren().add(MName);
//Defining the Last text field
final TextField Lname = new TextField();
Lname.setPrefColumnCount(15);
Lname.setPromptText("Enter your last name");
GridPane.setConstraints(Lname, 0, 2);
grid.getChildren().add(Lname);
//Defining the preferred title field
final TextField Ptitle=new TextField();
Ptitle.setPrefColumnCount(20);
Ptitle.setPromptText("Enter preferred title");
GridPane.setConstraints(Ptitle,0,3);
grid.getChildren().add(Ptitle);
//Defining the Name button
Button submit = new Button("Show Names");
GridPane.setConstraints(submit, 1, 0);
grid.getChildren().add(submit);
submit.setOnAction(new EventHandler<ActionEvent>() {

@Override
public void handle(ActionEvent e)
{
final Label label = new Label();
GridPane.setConstraints(label, 0, 4);
GridPane.setColumnSpan(label, 2);
grid.getChildren().add(label);
label.setText(Ptitle.getText()+" "+Fname.getText()+" "+MName.getText()+" "+Lname.getText()+"\n"
+Fname.getText()+" "+MName.getText()+" "+Lname.getText()+"\n"
+Fname.getText()+" "+Lname.getText()+"\n"
+Lname.getText()+", "+Fname.getText()+" "+MName.getText()+", "+Ptitle.getText()+"\n"
+Fname.getText()+", "+Lname.getText()+" "+MName.getText()+"\n"
+Fname.getText()+", "+Lname.getText());

}
});
stage.setScene(new Scene(grid));
stage.show();
}


public static void main(String[] args) {
launch(args);
}
  
}