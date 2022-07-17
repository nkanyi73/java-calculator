package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatorApp extends JPanel {

    //declaring member variables
    //expression
    String expression = "0";
    //the JFrame
    private JFrame frame;
    //the four JPanels
    private JPanel jPanel1, jPanel2, jPanel3, jPanel4;
    //text areas
    protected JTextArea txtArea1, txtArea2, txtArea3, txtArea4, txtArea5;
    //buttons
    protected JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11,
            btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21;

    //constructor
    public CalculatorApp() {
        //method to initialize the components
        initComponents();
    }

    //giving the method definition
    public void initComponents() {
        //setting attributes for the frame
        frame = new JFrame("Calculator");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        //setting attributes for JPanel1
        jPanel1 = new JPanel(new FlowLayout());
        jPanel1.setSize(380, 100);

        //setting attributes for JPanel2
        jPanel2 = new JPanel(new GridLayout(4, 2, 3, 3));

        //setting attributes for JPanel3
        jPanel3 = new JPanel(new BorderLayout());

        //setting attributes for JPanel4
        jPanel4 = new JPanel(new GridLayout(6, 3));

        //setting attributes for the text areas
        txtArea1 = new JTextArea(1, 30);
        txtArea1.setEditable(false);
        txtArea1.setText(expression);
        txtArea2 = new JTextArea();
        txtArea2.setEditable(false);
        txtArea3 = new JTextArea();
        txtArea3.setEditable(false);
        txtArea4 = new JTextArea();
        txtArea4.setEditable(false);
        txtArea5 = new JTextArea();
        txtArea5.setEditable(false);

        //setting attributes for the buttons
        btn1 = new JButton("cpu 1");
        btn2 = new JButton("cpu 2");
        btn3 = new JButton("cpu 3");
        btn4 = new JButton("cpu 4");
        btn5 = new JButton("0");
        btn6 = new JButton("1");
        btn7 = new JButton("2");
        btn8 = new JButton("3");
        btn9 = new JButton("4");
        btn10 = new JButton("5");
        btn11 = new JButton("6");
        btn12 = new JButton("7");
        btn13 = new JButton("8");
        btn14 = new JButton("9");
        btn15 = new JButton(".");
        btn16 = new JButton("+");
        btn17 = new JButton("-");
        btn18 = new JButton("*");
        btn19 = new JButton("/");
        btn20 = new JButton("Clear");
        btn21 = new JButton("Delete");

        //adding components to jPanel1
        jPanel1.add(txtArea1);

        //adding components to jPanel2
        jPanel2.add(btn1);
        jPanel2.add(txtArea2);
        jPanel2.add(btn2);
        jPanel2.add(txtArea3);
        jPanel2.add(btn3);
        jPanel2.add(txtArea4);
        jPanel2.add(btn4);
        jPanel2.add(txtArea5);

        //adding components to jPanel3
        jPanel3.add(jPanel1, BorderLayout.NORTH);
        jPanel3.add(jPanel2, BorderLayout.CENTER);

        //adding components to jPanel4
        jPanel4.add(btn5);
        jPanel4.add(btn6);
        jPanel4.add(btn7);
        jPanel4.add(btn8);
        jPanel4.add(btn9);
        jPanel4.add(btn10);
        jPanel4.add(btn11);
        jPanel4.add(btn12);
        jPanel4.add(btn13);
        jPanel4.add(btn14);
        jPanel4.add(btn15);
        jPanel4.add(btn16);
        jPanel4.add(btn17);
        jPanel4.add(btn18);
        jPanel4.add(btn19);
        jPanel4.add(btn20);
        jPanel4.add(btn21);

        //adding a listener to the buttons
        NumberListener nl = new NumberListener();
        btn5.addActionListener(nl);
        btn6.addActionListener(nl);
        btn7.addActionListener(nl);
        btn8.addActionListener(nl);
        btn9.addActionListener(nl);
        btn10.addActionListener(nl);
        btn11.addActionListener(nl);
        btn12.addActionListener(nl);
        btn13.addActionListener(nl);
        btn14.addActionListener(nl);
        btn15.addActionListener(nl);
        btn16.addActionListener(nl);
        btn17.addActionListener(nl);
        btn18.addActionListener(nl);
        btn19.addActionListener(nl);
        btn20.addActionListener(nl);
        btn21.addActionListener(nl);
        
        //adding the evaluation listener
        EvaluationListener el = new EvaluationListener();
        btn1.addActionListener(el);
        btn2.addActionListener(el);
        btn3.addActionListener(el);
        btn4.addActionListener(el);

        //adding components to frame
        frame.add(jPanel3, BorderLayout.NORTH);
        frame.add(jPanel4, BorderLayout.CENTER);
        frame.pack();

    }

    private class NumberListener implements ActionListener {
        //number listener for the keypad

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            //0 
            if (ae.getSource() == btn5) {
                //check to make sure the expression is not 0 then append
                if (expression != "0") {
                    expression = expression + "0";
                    txtArea1.append("0");
                }
               //1
            } else if (ae.getSource() == btn6) {
                expression = expression + "1";
                txtArea1.append("1");
            }
            //2
            else if (ae.getSource() == btn7) {
                expression = expression + "2";
                txtArea1.append("2");
            }
            //3
            else if (ae.getSource() == btn8) {
                expression = expression + "3";
                txtArea1.append("3");
            }
            //4
            else if (ae.getSource() == btn9) {
                expression = expression + "4";
                txtArea1.append("4");
            }
            //5
            else if (ae.getSource() == btn10) {
                expression = expression + "5";
                txtArea1.append("5");
            } 
            //6
            else if (ae.getSource() == btn11) {
                expression = expression + "6";
                txtArea1.append("6");
            }
            //7
            else if (ae.getSource() == btn12) {
                expression = expression + "7";
                txtArea1.append("7");
            }
            //8
            else if (ae.getSource() == btn13) {
                expression = expression + "8";
                txtArea1.append("8");
            } 
            //9
            else if (ae.getSource() == btn14) {
                expression = expression + "9";
                txtArea1.append("9");
            } 
            //.
            else if (ae.getSource() == btn15) {
                expression = expression + ".";
                txtArea1.append(".");
            } 
            //+
            else if (ae.getSource() == btn16) {
                //check if the last character is an operator
                //if operator then just replace it
                if (expression.endsWith("-") || expression.endsWith("+")
                        || expression.endsWith("*") || expression.endsWith("/")) {
                    expression = expression.replaceAll(".$", "+");
                    txtArea1.setText(expression);
                } else {
                    expression = expression + "+";
                    txtArea1.append("+");
                }
            }
            //-
            else if (ae.getSource() == btn17) {
                //check if the last character is an operator
                //if operator then just replace it
                if (expression.endsWith("-") || expression.endsWith("+")
                        || expression.endsWith("*") || expression.endsWith("/")) {
                    expression = expression.replaceAll(".$", "-");
                    txtArea1.setText(expression);
                } else {
                    expression = expression + "-";
                    txtArea1.append("-");
                }
            }
            //*
            else if (ae.getSource() == btn18) {
                //check if the last character is an operator
                //if operator then just replace it
                if (expression.endsWith("-") || expression.endsWith("+")
                        || expression.endsWith("*") || expression.endsWith("/")) {
                    expression = expression.replaceAll(".$", "*");
                    txtArea1.setText(expression);
                } else {
                    expression = expression + "*";
                    txtArea1.append("*");
                }
            }
            ///
            else if (ae.getSource() == btn19) {
                //check if the last character is an operator
                //if operator then just replace it
                if (expression.endsWith("-") || expression.endsWith("+")
                        || expression.endsWith("*") || expression.endsWith("/")) {
                    expression = expression.replaceAll(".$", "/");
                    txtArea1.setText(expression);
                } else {
                    expression = expression + "/";
                    txtArea1.append("/");
                }
                //Clear
            } else if (ae.getSource() == btn20) {
                expression = "";
                txtArea1.setText(expression);
            }
            //Delete
            else {
                if (expression != "0") {
                    expression = expression.replaceAll(".$", "");
                    txtArea1.setText(expression);
                    System.out.println(expression);
                }
            }
        }
    }
//Thread Class for the CPU buttons
    private class CalculatorThread extends Thread {
        
        //declaring the components that are used
        private final String expression;
        private final JButton button;
        private final JTextArea textArea;

        //constructor to initialize the thread
        public CalculatorThread(String expression, JButton button, JTextArea textArea) {
            this.button = button;
            this.expression = expression;
            this.textArea = textArea;
        }

        @Override
        //run method
        public void run() {
            //sorround with a try-catch block for to handle any errors
            try {
                //disable the button
                button.setEnabled(false);
                //evaluate the expression and store the answer in a variable
                double ans = evaluation(expression);
                //sleep for 5000 milliseconds
                sleep(5000);
                //set the corresponding text area to display the answer
                textArea.setText(Double.toString(ans));
                //enable the button again
                button.setEnabled(true);
            } catch (InterruptedException ex) {
                Logger.getLogger(CalculatorApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //a class to handle click events from the CPU buttons
    private class EvaluationListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            //if the source is a particular button
            if(ae.getSource() == btn1){
                //create a new thread
                CalculatorThread t1 = new CalculatorThread(expression, btn1, txtArea2);
                //start the thread, which goes to the run method defined
                t1.start();
            }else if(ae.getSource() == btn2){
                CalculatorThread t1 = new CalculatorThread(expression, btn2, txtArea3);
                t1.start();
            }else if(ae.getSource() == btn3){
                CalculatorThread t1 = new CalculatorThread(expression, btn3, txtArea4);
                t1.start();
            }else{
                CalculatorThread t1 = new CalculatorThread(expression, btn4, txtArea5);
                t1.start();
            }
            
        }
    
    }
     private static double evaluation(String expression) {
         String[] sums = expression.split("(?<=\\+)|(?=\\+)|(?<=\\-)|(?=\\-)");
         System.out.println(expression);
         int index = 2;
         double ans = 0;
         String sums0 = sums[0];
         if (sums0.equals("-")) {
             ans = -evaluateProduct(sums[1]);
             index = 3;
         } else {
             ans = evaluateProduct(sums[0]);
         }
         for (int i = index; i < sums.length; i += 2) {
             // System.out.println("operation: " + sums[i-1]);
             double ans_level2 = evaluateProduct(sums[i]);
             switch (sums[i - 1]) {
                 case "+":
                     ans += ans_level2;
                     break;
                 case "-":
                     ans -= ans_level2;
                     break;
                 default:
                     System.out.println("do not recognize method");
             }
         }
         return ans;
     }
    private static double evaluateProduct(String expression0) {
        String[] sums = expression0.split("(?<=\\+)|(?=\\+)|(?<=\\-)|(?=\\-)|(?<=\\*)|(?=\\*)|(?<=\\/)|(?=\\/)");

        int index = 2;
        double ans = 0;
        String sums0 = sums[0];

        if (sums0.equals("-")) {
            ans = Double.parseDouble(sums[0] + sums[1]);
            index = 3;
        } else {
            ans = Double.parseDouble(sums[0]);
        }
        for (int i = index; i < sums.length; i += 2) {
            double aNum = Double.parseDouble(sums[i]);
            switch (sums[i - 1]) {
                case "+":
                    ans += aNum;
                    break;
                case "-":
                    ans -= aNum;
                    break;
                case "*":
                    ans *= aNum;
                    break;
                case "/":
                    ans /= aNum;
                    break;
                default:
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // create a new instance of Calculator, to test it
        new CalculatorApp();
    }

}
