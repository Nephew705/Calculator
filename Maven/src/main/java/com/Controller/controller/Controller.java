package com.Controller.controller;

import com.Controller.operations.*;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.awt.*;
import java.io.IOException;


public class Controller {
    @FXML
    Spinner spinner;
    @FXML
    Pane pane;
    @FXML
    Button sqrt;
    @FXML
    Button buttonC;
    @FXML
    Button button1;
    @FXML
    Button button2;
    @FXML
    Button button3;
    @FXML
    Button button4;
    @FXML
    Button button5;
    @FXML
    Button button6;
    @FXML
    Button button7;
    @FXML
    Button button8;
    @FXML
    Button button9;
    @FXML
    Button button0;
    @FXML
    Button buttonKoma;
    @FXML
    Button buttonPlus;
    @FXML
    Button buttonMinus;
    @FXML
    Button buttonMult;
    @FXML
    Button buttonDiv;
    @FXML
    Button buttonEq;
    @FXML
    Button buttonB;
    @FXML
    Button buttonSR;
    @FXML
    Button buttonLR;
    @FXML
    TextField textFormula;
    @FXML
    TextField textField;
    @FXML
    MenuBar menuBar;

    int x = 0;
    int y = 0;
    double number1;
    double number2;
    double result;
    double savedResult;
    OneNumber oneNumber;
    TwoNumbers twoNumbers;


    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setResult(double result) {
        this.result = result;
    }
    public double getResult(){return result;}

    public void setSavedResult(double savedResult) {
        this.savedResult = savedResult;
    }

    public int getX() {
        return x;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public double getSavedResult() {
        return savedResult;
    }

    @FXML
    public void initialize() throws IOException {
                textField.setEditable(false);
                button0.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>() {
                    @Override
                    public void handle(Event event) {
                        if (result != 0 || y > 0) {
                            textField.clear();
                            setResult(0);
                        }
                        if (textField.getText().equals("")) {
                        } else textField.insertText(x++, "0");
                    }
                });
        button1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                if (result != 0 || y > 0) {
                    textField.clear();
                    setResult(0);
                }
                textField.insertText(x++, "1");
            }
        });
        button2.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                if (result != 0 || y > 0) {
                    textField.clear();
                    setResult(0);
                }
                textField.insertText(x++, "2");
            }
        });
        button3.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                if (result != 0 || y > 0) {
                    textField.clear();
                    setResult(0);
                }
                textField.insertText(x++, "3");
            }
        });
        button4.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                if (result != 0 || y > 0) {
                    textField.clear();
                    setResult(0);
                }
                textField.insertText(x++, "4");
            }
        });
        button5.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                if (result != 0 || y > 0) {
                    textField.clear();
                    setResult(0);
                }
                textField.insertText(x++, "5");
            }
        });
        button6.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                if (result != 0 || y > 0) {
                    textField.clear();
                    setResult(0);
                }
                textField.insertText(x++, "6");
            }
        });
        button7.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                if (result != 0 || y > 0) {
                    textField.clear();
                    setResult(0);
                }
                textField.insertText(x++, "7");
            }
        });
        button8.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                if (result != 0 || y > 0) {
                    textField.clear();
                    setResult(0);
                }
                textField.insertText(x++, "8");
            }
        });
        button9.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                if (result != 0 || y > 0) {
                    textField.clear();
                    setResult(0);
                }
                textField.insertText(x++, "9");
            }
        });
        buttonKoma.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                boolean isPoint = false;
                if (result != 0) {
                    textField.clear();
                    setResult(0);
                }
                char[] a = new char[textField.getLength()];
                for (int i = 0; i < textField.getLength(); i++) {
                    a[i] = textField.getText().charAt(i);
                    for (int j = 0; j < a.length; j++) {
                        String s = String.valueOf(a[i]);
                        if (s.equals(".")) {
                            isPoint = true;
                        }
                    }
                }
                if (!isPoint) {
                    if (textField.getText().equals("")) {
                        textField.insertText(x, "0.");
                        setX(x+2);
                    } else textField.insertText(x++, ".");
                }

            }
        });
        buttonPlus.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(y != 0){
                    setNumber2(Double.parseDouble(textField.getText()));
                    setResult(twoNumbers.operation(getNumber1(), getNumber2()));
                    setNumber1(getResult());
                    textField.setText(String.valueOf(getResult()));
                }
                else
                setNumber1(Double.parseDouble(textField.getText()));
                y++;
                setX(0);
                twoNumbers = new Summation();
            }
        });
        buttonMinus.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(y != 0){
                    setNumber2(Double.parseDouble(textField.getText()));
                    setResult(twoNumbers.operation(getNumber1(), getNumber2()));
                    setNumber1(getResult());
                    textField.setText(String.valueOf(getResult()));
                }
                else
                setNumber1(Double.parseDouble(textField.getText()));
                y++;
                setX(0);
                twoNumbers = new Subtraction();
            }
        });
        buttonDiv.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(y != 0){
                    setNumber2(Double.parseDouble(textField.getText()));
                    setResult(twoNumbers.operation(getNumber1(), getNumber2()));
                    setNumber1(getResult());
                    textField.setText(String.valueOf(getResult()));
                }
                else
                setNumber1(Double.parseDouble(textField.getText()));
                y++;
                setX(0);
                twoNumbers = new Division();
            }
        });
        buttonMult.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(y != 0){
                    setNumber2(Double.parseDouble(textField.getText()));
                    setResult(twoNumbers.operation(getNumber1(),getNumber2()));
                    setNumber1(getResult());
                    textField.setText(String.valueOf(getResult()));
                }
                else
                setNumber1(Double.parseDouble(textField.getText()));
                y++;
                setX(0);
                twoNumbers = new Multiplication();
            }
        });
        buttonEq.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (textField.getText().equals("")) setNumber2(0.0);
                else setNumber2(Double.parseDouble(textField.getText()));
                if (twoNumbers == null) {
                    textField.clear();
                    setX(0);
                }
                setResult(twoNumbers.operation(getNumber1(), getNumber2()));
                textField.setText(String.valueOf(result));
                twoNumbers = null;
                setX(0);
                y = 0;
            }
        });
        buttonC.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                setX(0);
                setResult(0);
                textField.clear();
            }
        });
        buttonB.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (getX() > 0) {
                    textField.deleteText(x - 1, x);
                    setX(x - 1);
                }
            }
        });
        buttonSR.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (textField.getText().equals("")) {
                } else
                    setSavedResult(Double.parseDouble(textField.getText()));
            }
        });
        buttonLR.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (getSavedResult() == 0) {
                } else {
                    textField.setText(String.valueOf(getSavedResult()));
                    setX(textField.getLength());
                }
            }
        });
        sqrt.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                setNumber1(Double.parseDouble(textField.getText()));
                setX(0);
                textField.clear();
                oneNumber = new Sqrt();
                setResult(oneNumber.action(getNumber1()));
                textField.setText(String.valueOf(oneNumber.action(getNumber1())));
            }
        });

    }
}
