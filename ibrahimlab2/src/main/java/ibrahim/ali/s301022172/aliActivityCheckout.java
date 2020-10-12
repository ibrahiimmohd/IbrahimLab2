package ibrahim.ali.s301022172;

import androidx.appcompat.app.AppCompatActivity;

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

    TextView txtV;
    HomeTypes homeType;
    Intent intent;
    ArrayList<Boolean> paymentRadioButtons = new ArrayList<Boolean>();
    RadioButton cash, debit, credit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ali_checkout);

        ArrayList<HomeTypes> homeTypeArray = new ArrayList<HomeTypes>();
        homeTypeArray = (ArrayList<HomeTypes>) getIntent().getSerializableExtra("homeType-array");

        ViewGroup hourButtonLayout = (ViewGroup) findViewById(R.id.ibrahimHomeTypeRadioGroup);  // This is the id of the RadioGroup we defined
        for (int i = 0; i < homeTypeArray.size(); i++) {
            RadioButton button = new RadioButton(this);
            button.setId(i);
            homeType = homeTypeArray.get(i);
            button.setText(homeType.get_address() + " " + homeType.get_price());
            hourButtonLayout.addView(button);
        }
    }

    public void onClick(View view) {

        cash = (RadioButton) findViewById(R.id.ibrahimCashRadioBtn);
        debit = (RadioButton) findViewById(R.id.ibrahimDebitRadioBtn);
        credit = (RadioButton) findViewById(R.id.ibrahimCreditRadioBtn);

        paymentRadioButtons.clear();
        paymentRadioButtons.add(cash.isChecked());
        paymentRadioButtons.add(debit.isChecked());
        paymentRadioButtons.add(credit.isChecked());

        int id = view.getId();

        if( id == R.id.ibrahimPaymentBtn){
            if (((RadioGroup) findViewById(R.id.ibrahimPaymentRadioGroup)).getCheckedRadioButtonId() != -1 && ((RadioGroup) findViewById(R.id.ibrahimHomeTypeRadioGroup)).getCheckedRadioButtonId() != -1)
            {
                // one of the radio buttons is checked
                intent = new Intent(this, aliActivityPayment.class);
                intent.putExtra("isChecked", paymentRadioButtons);
                startActivity(intent);
            }
            else if (((RadioGroup) findViewById(R.id.ibrahimPaymentRadioGroup)).getCheckedRadioButtonId() == -1 && ((RadioGroup) findViewById(R.id.ibrahimHomeTypeRadioGroup)).getCheckedRadioButtonId() == -1)
            {
                //Payment and Home Type Radio Groups are not selected
                Toast.makeText(this, "Payment and Home Type Radio Groups are not selected!", Toast.LENGTH_LONG).show();
            }
            else if(((RadioGroup) findViewById(R.id.ibrahimPaymentRadioGroup)).getCheckedRadioButtonId() == -1 && ((RadioGroup) findViewById(R.id.ibrahimHomeTypeRadioGroup)).getCheckedRadioButtonId() != -1)
            {
                //Payment Radio Group is not selected
                Toast.makeText(this, "Payment Radio Group is not selected!", Toast.LENGTH_LONG).show();
            }
            else if(((RadioGroup) findViewById(R.id.ibrahimPaymentRadioGroup)).getCheckedRadioButtonId() != -1 && ((RadioGroup) findViewById(R.id.ibrahimHomeTypeRadioGroup)).getCheckedRadioButtonId() == -1)
            {
                //Home Type Radio Group is not selected
                Toast.makeText(this, "Home Type Radio Group is not selected!", Toast.LENGTH_LONG).show();
            }
        }
    }

//    @Override
//    public void onBackPressed(){
//        intent = new Intent(aliActivityCheckout.this, aliActivityHomeTypes.class);
//        startActivity(intent);
//    }
}