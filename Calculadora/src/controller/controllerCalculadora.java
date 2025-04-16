package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class controllerCalculadora {

	@FXML
	private Button bt0;

	@FXML
	private Button bt1;

	@FXML
	private Button bt2;

	@FXML
	private Button bt3;

	@FXML
	private Button bt4;

	@FXML
	private Button bt5;

	@FXML
	private Button bt6;

	@FXML
	private Button bt7;

	@FXML
	private Button bt8;

	@FXML
	private Button bt9;

	@FXML
	private Button btDividir;

	@FXML
	private Button btIgual;

	@FXML
	private Button btLimpar;

	@FXML
	private Button btMultiplicar;

	@FXML
	private Button btSomar;

	@FXML
	private Button btSubtrair;

	@FXML
	private Label txtVisor;
	
    @FXML
    private Button nbtExcluir;

	String val1 = "";
	String val2 = "";
	String operacao = "";

	// Este método aciona o numero 0
	@FXML
	void action0(ActionEvent event) {

		if(operacao.equals("")){
			txtVisor.setText(txtVisor.getText() + "0");
			val1 = val1 + "0";
		}else {
			txtVisor.setText(txtVisor.getText() + "0");
			val2 = val2 + "0";
		}
		System.out.println("Valor 1: "+ val1);
		System.out.println("Valor 2: "+ val2);

	}

	@FXML
	void action1(ActionEvent event) {
		if(operacao.equals("")){
			txtVisor.setText(txtVisor.getText() + "1");
			val1 = val1 + "1";
		}else {
			txtVisor.setText(txtVisor.getText() + "1");
			val2 = val2 + "1";
		}
		System.out.println("Valor 1: "+ val1);
		System.out.println("Valor 2: "+ val2);
	}

	@FXML
	void action2(ActionEvent event) {
		if(operacao.equals("")){
			txtVisor.setText(txtVisor.getText() + "2");
			val1 = val1 + "2";
		}else {
			txtVisor.setText(txtVisor.getText() + "2");
			val2 = val2 + "2";
		}
		System.out.println("Valor 1: "+ val1);
		System.out.println("Valor 2: "+ val2);
	}

	@FXML
	void action3(ActionEvent event) {
		if(operacao.equals("")){
			txtVisor.setText(txtVisor.getText() + "3");
			val1 = val1 + "3";
		}else {
			txtVisor.setText(txtVisor.getText() + "3");
			val2 = val2 + "3";
		}
		System.out.println("Valor 1: "+ val1);
		System.out.println("Valor 2: "+ val2);
	}

	@FXML
	void action4(ActionEvent event) {
		if(operacao.equals("")){
			txtVisor.setText(txtVisor.getText() + "4");
			val1 = val1 + "4";
		}else {
			txtVisor.setText(txtVisor.getText() + "4");
			val2 = val2 + "4";
		}
		System.out.println("Valor 1: "+ val1);
		System.out.println("Valor 2: "+ val2);
	}

	@FXML
	void action5(ActionEvent event) {
		if(operacao.equals("")){
			txtVisor.setText(txtVisor.getText() + "5");
			val1 = val1 + "5";
		}else {
			txtVisor.setText(txtVisor.getText() + "5");
			val2 = val2 + "5";
		}
		System.out.println("Valor 1: "+ val1);
		System.out.println("Valor 2: "+ val2);
	}

	@FXML
	void action6(ActionEvent event) {
		if(operacao.equals("")){
			txtVisor.setText(txtVisor.getText() + "6");
			val1 = val1 + "6";
		}else {
			txtVisor.setText(txtVisor.getText() + "6");
			val2 = val2 + "6";
		}
		System.out.println("Valor 1: "+ val1);
		System.out.println("Valor 2: "+ val2);
	}

	@FXML
	void action7(ActionEvent event) {
		if(operacao.equals("")){
			txtVisor.setText(txtVisor.getText() + "7");
			val1 = val1 + "7";
		}else {
			txtVisor.setText(txtVisor.getText() + "7");
			val2 = val2 + "7";
		}
		System.out.println("Valor 1: "+ val1);
		System.out.println("Valor 2: "+ val2);
	}

	@FXML
	void action8(ActionEvent event) {
		if(operacao.equals("")){
			txtVisor.setText(txtVisor.getText() + "8");
			val1 = val1 + "8";
		}else {
			txtVisor.setText(txtVisor.getText() + "8");
			val2 = val2 + "8";
		}
		System.out.println("Valor 1: "+ val1);
		System.out.println("Valor 2: "+ val2);
	}

	@FXML
	void action9(ActionEvent event) {
		if(operacao.equals("")){
			txtVisor.setText(txtVisor.getText() + "9");
			val1 = val1 + "9";
		}else {
			txtVisor.setText(txtVisor.getText() + "9");
			val2 = val2 + "9";
		}
		System.out.println("Valor 1: "+ val1);
		System.out.println("Valor 2: "+ val2);
	}

	@FXML
	void actionDivisao(ActionEvent event) {
		operacao = "÷";
		txtVisor.setText(txtVisor.getText() + "÷");
	}

	@FXML
	void actionLimpar(ActionEvent event) {
		val1 = "";
		val2 = "";
		operacao ="";
		txtVisor.setText("");
	}

	@FXML
	void actionMultiplicar(ActionEvent event) {
		operacao = "x";
		txtVisor.setText(txtVisor.getText() + "x");
	}

	@FXML
	void actionSomar(ActionEvent event) {
		operacao = "+";
		txtVisor.setText(txtVisor.getText() + "+");
	}

	@FXML
	void actionSubtrair(ActionEvent event) {
		operacao = "-";
		txtVisor.setText(txtVisor.getText() + "-");
	}
	

    @FXML
    void actionExcluir(ActionEvent event) {
    	if(val2.equals("")) {
    	String aux = txtVisor.getText();
    	
    	String exluir = ""+aux.charAt(aux.length() - 1);
    	
    	val1 = val1.replace(exluir, "");
    	aux = aux.replace(exluir,"");
    	txtVisor.setText(aux);
    	}else if(operacao.equals("+") || operacao.equals("-") ||operacao.equals("x")
    			||operacao.equals("÷" )){
    		
        	String aux = txtVisor.getText();
        	char exluir = aux.charAt(aux.length() - 1);
        	char aux2 = 0;
        	aux = aux.replace(exluir,aux2);
        	txtVisor.setText(aux);
        	operacao = "";
    	}else {
        	String aux = txtVisor.getText();
        	String exluir = "" + aux.charAt(aux.length() - 1);
        	val2 = val2.replace(exluir, "");
        	aux = aux.replace(exluir,"");
        	txtVisor.setText(aux);
    	}
    }

	@FXML
	void actionIgual(ActionEvent event) {
		if(val1!= "" && val2 != "") {
			double valor1 = Double.parseDouble(val1);
			double valor2 = Double.parseDouble(val2);
			double resultado;
			switch(operacao) {
			case "+":
				resultado = valor1+valor2;
				txtVisor.setText(""+resultado);
				break;
			case "-": 
				resultado = valor1-valor2;
				txtVisor.setText(""+resultado);	
				break;
			case "÷":
				if(valor1 != 0 && valor2 != 0) {
					resultado = valor1/valor2;
					txtVisor.setText(""+resultado);
				}else {
					txtVisor.setText("ERROR");
				}
				break;
			case "x":
				resultado = valor1*valor2;
				txtVisor.setText(""+resultado);
				break;
			default:
				txtVisor.setText("ERROR");
			}
		}else {
			txtVisor.setText("ERROR");
		}

	}


}
