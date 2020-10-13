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

    DatePickerDialog picker;
    EditText datePicker, creditOrDebitCard, ccv, phone, fullname;
    Intent intent;
    ArrayList<Boolean> radioBtnsArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        radioBtnsArray = new ArrayList<Boolean>();
        radioBtnsArray = (ArrayList<Boolean>) getIntent().getSerializableExtra("isChecked");

        if(radioBtnsArray.get(0) == true){
            setContentView(R.layout.ali_cash_payment);
        }else if(radioBtnsArray.get(1) == true){
            setContentView(R.layout.ali_debit_payment);
        }else if(radioBtnsArray.get(2) == true){
            setContentView(R.layout.ali_credit_payment);
        }

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

    public void onClick(View view) {

        creditOrDebitCard = (EditText) findViewById(R.id.ibrahimInsertCreditCard);
        ccv = (EditText) findViewById(R.id.ibrahimInsertCCV);
        phone = (EditText) findViewById(R.id.ibrahimInsertPhone);
        fullname = (EditText) findViewById(R.id.ibrahimInsertFullname);

        int id = view.getId();

        if( id == R.id.ibrahimPayBtn){

            if(phone.length() != 10)
            {
                phone.setError("Please Insert 10 Digit long number");
            }

            if(fullname.length() == 0)
            {
                fullname.setError("Please Insert your full name");
            }

            if(radioBtnsArray.get(0) != true){
                if(creditOrDebitCard.length() != 16)
                {
                    creditOrDebitCard.setError("Please Insert 16 Digit long number");
                }

                if(ccv.length() != 3)
                {
                    ccv.setError("Please Insert 3 Digit long number");
                }

                if(creditOrDebitCard.length() == 16 && ccv.length() == 3 && phone.length() == 10 && fullname.length() != 0)
                {
                    intent = new Intent(this, aliActivityFinalOrder.class);
                    intent.putExtra("name", fullname.getText().toString());
                    startActivity(intent);
                }

            }else{
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