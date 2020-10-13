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
        fullname.setText("Thank you "+name+" for your purchase! We would love to see you again!");
    }
}