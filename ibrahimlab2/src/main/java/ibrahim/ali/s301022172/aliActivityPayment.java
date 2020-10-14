/**
 * Full Name: Ibrahim Ali
 * Student ID: 301022172
 * Section: COMP 304 - 002
 * */

package ibrahim.ali.s301022172;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.ArrayList;

public class aliActivityPayment extends AppCompatActivity {
    //Declare variables
    DatePickerDialog picker;
    EditText datePicker, creditOrDebitCard, ccv, phone, fullname;
    Intent intent;
    ArrayList<Boolean> radioBtnsArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Initialize radioBtnsArray
        radioBtnsArray = new ArrayList<Boolean>();

        //Retrieve data from aliActivityCheckout activity
        radioBtnsArray = (ArrayList<Boolean>) getIntent().getSerializableExtra("isChecked");

        //Inspect the retrieved data and perform actions accordingly
        if(radioBtnsArray.get(0) == true){
            setContentView(R.layout.ali_cash_payment);
        }else if(radioBtnsArray.get(1) == true){
            setContentView(R.layout.ali_debit_payment);
        }else if(radioBtnsArray.get(2) == true){
            setContentView(R.layout.ali_credit_payment);
        }

        //if xaml file is not cash layout, initialize datepicker variable
        if(radioBtnsArray.get(0) != true){
            datePicker = (EditText) findViewById(R.id.ibrahimInsertDate);
            datePicker.setInputType(InputType.TYPE_NULL);
            datePicker.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.N)
                @Override
                public void onClick(View v) {
                    final Calendar cldr = Calendar.getInstance();
                    int day = cldr.get(Calendar.DAY_OF_MONTH);
                    int month = cldr.get(Calendar.MONTH);
                    int year = cldr.get(Calendar.YEAR);
                    // date picker dialog
                    picker = new DatePickerDialog(aliActivityPayment.this,
                            new DatePickerDialog.OnDateSetListener() {
                                @Override
                                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                    datePicker.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                                }
                            }, year, month, day);
                    picker.show();
                }
            });
        }
    }

    //onClick event listener
    public void onClick(View view) {
        //Get ids' values
        creditOrDebitCard = (EditText) findViewById(R.id.ibrahimInsertCreditCard);
        ccv = (EditText) findViewById(R.id.ibrahimInsertCCV);
        phone = (EditText) findViewById(R.id.ibrahimInsertPhone);
        fullname = (EditText) findViewById(R.id.ibrahimInsertFullname);
        int id = view.getId();

        if( id == R.id.ibrahimPayBtn){

            //Display error messages if validation fails
            if(phone.length() != 10)
            {
                phone.setError(getString(R.string.ibrahimSetPhoneError));
            }

            if(fullname.length() == 0)
            {
                fullname.setError(getString(R.string.ibrahimSetFullnameError));
            }

            if(radioBtnsArray.get(0) != true){
                if(creditOrDebitCard.length() != 16)
                {
                    creditOrDebitCard.setError(getString(R.string.ibrahimSetCreditCardError));
                }

                if(ccv.length() != 3)
                {
                    ccv.setError(getString(R.string.ibrahimSetCCVError));
                }

                if(creditOrDebitCard.length() == 16 && ccv.length() == 3 && phone.length() == 10 && fullname.length() != 0)
                {
                    intent = new Intent(this, aliActivityFinalOrder.class);
                    intent.putExtra("name", fullname.getText().toString());
                    startActivity(intent);
                }

            }else{
                //if validations passes, start aliActivityFinalOrder activity
                if(phone.length() == 10 && fullname.length() != 0)
                {
                    intent = new Intent(this, aliActivityFinalOrder.class);
                    intent.putExtra("name", fullname.getText().toString());
                    startActivity(intent);
                }
            }
        }
    }

}