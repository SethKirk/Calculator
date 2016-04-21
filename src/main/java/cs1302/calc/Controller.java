package cs1302.calc;

import java.math.BigDecimal;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.TextInputControl;
import java.util.Scanner;

public class Controller{
    String text = "";
    String ans = "";
    String buttonLabel = "Use Recursion";
    IterativeMath im = new IterativeMath();
    RecursiveMath rm = new RecursiveMath();
    @FXML public TextField display;
    @FXML public Label answer;
    @FXML public Button button;    
    @FXML public Button useThing;    
    public static String input = "";
    @FXML public void handleButton0(ActionEvent event){
	text += "0";
	display.setText(text);
	}
    @FXML public void handleButton1(ActionEvent event){
	text += "1";
	display.setText(text);
	}
    @FXML public void handleButton2(ActionEvent event){
	text += "2";
	display.setText(text);
	}
    @FXML public void handleButton3(ActionEvent event){
	text += "3";
	display.setText(text);
	}
    @FXML public void handleButton4(ActionEvent event){
	text += "4";
	display.setText(text);
	}
    @FXML public void handleButton5(ActionEvent event){
	text += "5";
	display.setText(text);
	}
    @FXML public void handleButton6(ActionEvent event){
	text += "6";
	display.setText(text);
	}
    @FXML public void handleButton7(ActionEvent event){
	text += "7";
	display.setText(text);
	}
    @FXML public void handleButton8(ActionEvent event){
	text += "8";
	display.setText(text);
	}
    @FXML public void handleButton9(ActionEvent event){
	text += "9";
	display.setText(text);
	}
    @FXML public void handleButtonDivide(ActionEvent event){
	text += " / ";
	display.setText(text);
	}
    @FXML public void handleButtonMultiply(ActionEvent event){
	text += " * ";
	display.setText(text);
	}
    @FXML public void handleButtonSubtract(ActionEvent event){
	text += " - ";
	display.setText(text);
	}
    @FXML public void handleButtonAdd(ActionEvent event){
	text += " + ";
	display.setText(text);
	}
    @FXML public void handleButtonFactorial(ActionEvent event){
	text += " ! ";
	display.setText(text);
	}
    @FXML public void handleButtonExponential(ActionEvent event){
	text += " ^ ";
	display.setText(text);
	}
    @FXML public void handleButtonLeftShift(ActionEvent event){
	text += " « ";
	display.setText(text);
	}
    @FXML public void handleButtonRightShift(ActionEvent event){
	text += " » ";
	display.setText(text);

	}
    @FXML public void handleButtonBackspace(ActionEvent event){
	text = text.substring(0,text.length()-1);
	display.setText(text);

	}
    @FXML public void handleButtonClear(ActionEvent event){
	text = "";
	display.setText(text);

	}
    @FXML public void handleButtonUse(ActionEvent event){
	if(buttonLabel == "Use Recursion")buttonLabel = "Use Iteration";
	else buttonLabel = "Use Recursion";
	useThing.setText(buttonLabel);
	
	}
    @FXML public void handleButtonEquals(ActionEvent event){
	text += " ";
	display.setText(text);
	input = display.getText();
	text = "";
	//display.setText(text);
	System.out.println(input);
	//checkErrors(input);
	doMath(input);
	answer.setText(ans);
    }
    public void checkErrors(String input){
	/*
	int numChars = input.length();
	if(input.charAt(0) == [0-9]){
	    System.out.println("Not a number first!");
	}
	
	for(int i = 0; i < numChars; i++){
	    if(input.charAt(i) == 0){
		
	    }    
	}
	*/
    }
    public void doMath(String input){
	try{
	String copyInput = input;
	String temp1 = input.substring(0, input.indexOf(" "));
        copyInput = input.substring(copyInput.indexOf(" ") + 1, input.length());
        String temp2 =  copyInput.substring(0, copyInput.indexOf(" "));
        copyInput = copyInput.substring(copyInput.indexOf(" ") + 1, copyInput.length());
        String temp3 =  copyInput.substring(0, copyInput.indexOf(" "));
        int part1 = Integer.parseInt(temp1);
        int part2 = Integer.parseInt(temp3);
	//ans = Integer.toString(part1 + part2);
	int l = part1;
	int r = part2;
       
	if(useThing.getText().equals("Use Recursion")){//This is for the iteration methods
	    // System.out.println("bar!");
	    if(temp2.equals("+")){
		//System.out.println("foo!");
		ans = Integer.toString(im.add(l,r));
	    }
	    if(temp2.equals("-")){
		ans = Integer.toString(im.sub(l,r));
	    }
	    if(temp2.equals("*")){
		im.mul(l,r);
	    }
	    if(temp2.equals("/")){
		im.div(l,r);
	    }
	    if(temp2.equals("!")){
		im.fac(l);
	    }
	    if(temp2.equals("^")){
		im.pow(l,r);
	    }
	    if(temp2.equals("«")){
		
	    }
	    if(temp2.equals("»")){
		
		
	    }
	}
	if(useThing.getText().equals("Use Iteration")){//This is for the recursionn methods
	    
	    if(temp2.equals("+")){
		//System.out.println("foo");
		ans = Integer.toString(rm.add(l,r));
	    }
	    if(temp2.equals("-")){
		ans = Integer.toString(rm.sub(l,r));
	    }
	    if(temp2.equals("*")){
		ans = Integer.toString(rm.mul(l,r));
	    }
	    if(temp2.equals("/")){
		ans = Integer.toString(rm.div(l,r));
	    }
	    if(temp2.equals("!")){
		rm.fac(l);
	    }
	    if(temp2.equals("^")){
		rm.pow(l,r);
	    }
	    if(temp2.equals("«")){
		
	    }
	    if(temp2.equals("»")){
		
	    }
	}
    }
    catch(Exception e){
	System.out.println("Dafuq");
    }
    }//doMath
}//Controller