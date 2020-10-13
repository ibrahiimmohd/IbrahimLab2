/**
 * Full Name: Ibrahim Ali
 * Student ID: 301022172
 * Section: COMP 304 - 002
 * */

package ibrahim.ali.s301022172;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ibrahimActivity extends AppCompatActivity {
    //Declare intent variable
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ibrahim);
    }

    public void onClick(View view) {

        int id = view.getId();

        if( id == R.id.ibrahimEnter){
            intent = new Intent(ibrahimActivity.this, aliActivityHomeTypes.class);
            //starts the new activity
            startActivity(intent);
        }
    }
}