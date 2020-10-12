package ibrahim.ali.s301022172;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.ArrayList;

public class aliActivityPayment extends AppCompatActivity {

    DatePickerDialog picker;
    EditText datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<Boolean> radioBtnsArray = new ArrayList<Boolean>();
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
}