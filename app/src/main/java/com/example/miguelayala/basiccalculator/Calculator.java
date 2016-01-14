package com.example.miguelayala.basiccalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    // the most recent number, operator entered
    String current = "";

    // current operator
    String currentOperator = "";

    // the most recent first value in the calculation
    int n1 = 0;

    // the most recent second value in the calculation
    int n2 = 0;

    // the most recent result
    int res = 0;

    //a boolean indicating whether or not a result has finished being calculated
    boolean result = false;

    //a boolean indicating whether or not n1 is empty
    boolean empty = true;

    // how many integers have been entered
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * method to add two numbers
     */

    private void addNumbers(){
        res = n1 + n2;
    }

    /**
     * method to subtract two numbers
     */
    private void subtractNumbers(){
        res = n1 - n2;
    }

    /**
     * method to multiply numbers
     */
    private void multiplyNumbers(){
        res = n1*n2;
    }

    /**
     * method to divide two numbers
     */
    private void divideNumbers(){
        res = n1/n2;
    }

    /**
     * method that is called when one is clicked
     */
    public void one_click(View view){
        if(result){
            clearCalculator();
        }
        current += "1";
        count++;
        updateDisplay(current);
    }

    /**
     * method that is called when two is clicked
     */
    public void two_click(View view){
        if(result){
            clearCalculator();
        }
        current += "2";
        count++;
        updateDisplay(current);
    }

    /**
     * method that is called when three is clicked
     */
    public void three_click(View view){
        if(result){
            clearCalculator();
        }
        current += "3";
        count++;
        updateDisplay(current);
    }

    /**
     * method that is called when four is clicked
     */
    public void four_click(View view){
        if(result){
            clearCalculator();
        }
        current += "4";
        count++;
        updateDisplay(current);
    }

    /**
     * method that is called when five is clicked
     */
    public void five_click(View view){
        if(result){
            clearCalculator();
        }
        current += "5";
        count++;
        updateDisplay(current);
    }

    /**
     * method that is called when six is clicked
     */
    public void six_click(View view){
        if(result){
            clearCalculator();
        }
        current += "6";
        count++;
        updateDisplay(current);
    }

    /**
     * method that is called when seven is clicked
     */
    public void seven_click(View view){
        if(result){
            clearCalculator();
        }
        current += "7";
        count++;
        updateDisplay(current);
    }

    /**
     * method that is called when eight is clicked
     */
    public void eight_click(View view){
        if(result){
            clearCalculator();
        }
        current += "8";
        count++;
        updateDisplay(current);
    }

    /**
     * method that is called when nine is clicked
     */
    public void nine_click(View view){
        if(result){
            clearCalculator();
        }
        current += "9";
        count++;
        updateDisplay(current);
    }

    /**
     * method that is called when zero is clicked
     */
    public void zero_click(View view){
        if(result){
            clearCalculator();
        }
        current += "0";
        count++;
        updateDisplay(current);
    }

    /**
     * method that updates the app's main text view
     */
    public void updateDisplay(String string){
        TextView tv = (TextView) findViewById(R.id.mytextview);
        tv.setText(string);
    }

    /**
     * method that is called when plus is clicked
     */
    public void plus_click(View view){
        if (count > 0){
            if(currentOperator.equals("")) {
                if (result) {
                    reset();
                } else {
                    n1 = Integer.parseInt(current);
                    empty = false;
                }
                current = "+";
                currentOperator = "+";
                updateDisplay(current);
                current = "";
            } else if (!currentOperator.equals("") && !current.equals("")){
                equalsOperation();
                result = false;
                reset();
                current = "+";
                currentOperator = "+";
                updateDisplay(current);
                current = "";
            }
        }
    }

    /**
     * method that is called when minus is clicked
     */
    public void minus_click(View view){
        if(count > 0) {
            if (currentOperator.equals("")) {
                if (result) {
                    reset();
                } else {
                    n1 = Integer.parseInt(current);
                    empty = false;
                }
                current = "-";
                currentOperator = "-";
                updateDisplay(current);
                current = "";
            } else if (!currentOperator.equals("") && !current.equals("")){
                equalsOperation();
                result = false;
                reset();
                current = "-";
                currentOperator = "-";
                updateDisplay(current);
                current = "";
            }
        }
    }

    /**
     * method that is called when multiply is clicked
     */
    public void multiply_click(View view){
        if (count > 0){
            if(currentOperator.equals("")) {
                if (result) {
                    reset();
                } else {
                    n1 = Integer.parseInt(current);
                    empty = false;
                }
                current = "X";
                currentOperator = "X";
                updateDisplay(current);
                current = "";
            } else if (!currentOperator.equals("") && !current.equals("")){
                equalsOperation();
                result = false;
                reset();
                current = "X";
                currentOperator = "X";
                updateDisplay(current);
                current = "";
            }
        }
    }

    /**
     * method that is called when divide is clicked
     */
    public void divide_click(View view){
        if(count > 0) {
            if (currentOperator.equals("")) {
                if (result) {
                    reset();
                } else {
                    n1 = Integer.parseInt(current);
                    empty = false;
                }
                current = "/";
                currentOperator = "/";
                updateDisplay(current);
                current = "";
            } else if (!currentOperator.equals("") && !current.equals("")){
                equalsOperation();
                result = false;
                reset();
                current = "/";
                currentOperator = "/";
                updateDisplay(current);
                current = "";
            }
        }
    }

    /**
     * method that is called when equals is clicked
     */
    public void equals_click(View view){
        equalsOperation();
    }

    /**
     * method that is called when clear is clicked
     */
    public void clear_click(View view){
        current = "0";
        updateDisplay(current);
        clearCalculator();
    }

    /**
     * method that evaluates the current calculation
     */
    private void equalsOperation(){
        if(count>0){
            if(!current.equals("") && empty){
                res = Integer.parseInt(current);
            } else {
                n2 = Integer.parseInt(current);
                if(currentOperator.equals("+")){
                    addNumbers();
                } else if(currentOperator.equals("-")){
                    subtractNumbers();
                }else if(currentOperator.equals("X")) {
                    multiplyNumbers();
                }else if(currentOperator.equals("/")){
                    divideNumbers();
                }
            }
            result = true;
            currentOperator = "";
            updateDisplay(Integer.toString(res));
        }
    }

    /**
     * method that resets the current calculation
     */
    private void reset(){
        n1 = res;
        result = false;
        empty = false;
        n2 = 0;
        res = 0;
    }

    /**
     * method that completely clears the calculator
     */
    private void clearCalculator(){
        n1 = 0;
        empty = true;
        n2 = 0;
        res = 0;
        result = false;
        current = "";
        currentOperator="";
    }


}
