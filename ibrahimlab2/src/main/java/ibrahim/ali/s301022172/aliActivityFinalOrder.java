/**
 * Full Name: Ibrahim Ali
 * Student ID: 301022172
 * Section: COMP 304 - 002
 * */

package ibrahim.ali.s301022172;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class aliActivityFinalOrder extends AppCompatActivity {

    TextView fullname;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ali_final_order);

        fullname = (TextView) findViewById(R.id.ibrahimTxtFullNameFinalOrder);

        name = getIntent().getExtras().getString("name");
        fullname.setText(getString(R.string.ibrahimSetThankYou1)+name+getString(R.string.ibrahimSetThankYou2));
    }
}