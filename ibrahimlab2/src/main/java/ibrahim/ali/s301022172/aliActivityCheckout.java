/**
 * Full Name: Ibrahim Ali
 * Student ID: 301022172
 * Section: COMP 304 - 002
 * */

package ibrahim.ali.s301022172;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class aliActivityCheckout extends AppCompatActivity {
    //Declare Variables
    TextView txtV;
    HomeTypes homeType;
    Intent intent;
    ArrayList<Boolean> paymentRadioButtons = new ArrayList<Boolean>();
    RadioButton cash, debit, credit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ali_checkout);

        //Retrieve passed data from aliActivityHomeTypes
        ArrayList<HomeTypes> homeTypeArray = new ArrayList<HomeTypes>();
        homeTypeArray = (ArrayList<HomeTypes>) getIntent().getSerializableExtra("homeType-array");

        //Create Radio Buttons
        ViewGroup hourButtonLayout = (ViewGroup) findViewById(R.id.ibrahimHomeTypeRadioGroup);
        for (int i = 0; i < homeTypeArray.size(); i++) {
            RadioButton button = new RadioButton(this);
            button.setId(i);
            homeType = homeTypeArray.get(i);
            button.setText(getString(R.string.ibrahimSetAddress) + homeType.get_address() + getString(R.string.ibrahimSetPrice) + homeType.get_price());
            button.setTextSize(17);
            hourButtonLayout.addView(button);
        }
    }

    //onClick event listener
    public void onClick(View view) {
        //Get ids' values
        cash = (RadioButton) findViewById(R.id.ibrahimCashRadioBtn);
        debit = (RadioButton) findViewById(R.id.ibrahimDebitRadioBtn);
        credit = (RadioButton) findViewById(R.id.ibrahimCreditRadioBtn);
        int id = view.getId();

        //Clear array
        paymentRadioButtons.clear();

        //Add radio buttons selection to array
        paymentRadioButtons.add(cash.isChecked());
        paymentRadioButtons.add(debit.isChecked());
        paymentRadioButtons.add(credit.isChecked());

        if( id == R.id.ibrahimCheckoutBtn){
            //Scenario Payment btn and Home Type radio btn both selected
            if (((RadioGroup) findViewById(R.id.ibrahimPaymentRadioGroup)).getCheckedRadioButtonId() != -1 && ((RadioGroup) findViewById(R.id.ibrahimHomeTypeRadioGroup)).getCheckedRadioButtonId() != -1)
            {
                //Start new aliActivityPayment activity
                intent = new Intent(this, aliActivityPayment.class);
                intent.putExtra("isChecked", paymentRadioButtons);
                startActivity(intent);
            }
            //Scenario Payment btn and Home Type radio btn both not selected
            else if (((RadioGroup) findViewById(R.id.ibrahimPaymentRadioGroup)).getCheckedRadioButtonId() == -1 && ((RadioGroup) findViewById(R.id.ibrahimHomeTypeRadioGroup)).getCheckedRadioButtonId() == -1)
            {
                Toast.makeText(this, R.string.ibrahimIfHomePayment, Toast.LENGTH_LONG).show();
            }
            //Scenario Payment btn not selected and Home Type radio selected
            else if(((RadioGroup) findViewById(R.id.ibrahimPaymentRadioGroup)).getCheckedRadioButtonId() == -1 && ((RadioGroup) findViewById(R.id.ibrahimHomeTypeRadioGroup)).getCheckedRadioButtonId() != -1)
            {
                Toast.makeText(this, R.string.ibrahimIfPayment, Toast.LENGTH_LONG).show();
            }
            //Scenario Payment btn selected and Home Type radio not selected
            else if(((RadioGroup) findViewById(R.id.ibrahimPaymentRadioGroup)).getCheckedRadioButtonId() != -1 && ((RadioGroup) findViewById(R.id.ibrahimHomeTypeRadioGroup)).getCheckedRadioButtonId() == -1)
            {
                Toast.makeText(this, R.string.ibrahimIfHome, Toast.LENGTH_LONG).show();
            }
        }
    }

    //If back btn pressed, display alert dialog
    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.ibrahimSelectionsClear);
        builder.setCancelable(false);

        builder.setPositiveButton(
                "Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        intent = new Intent(aliActivityCheckout.this, aliActivityHomeTypes.class);
                        startActivity(intent);
                    }
                });

        builder.setNegativeButton(
                "No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert = builder.create();
        alert.show();
    }
}