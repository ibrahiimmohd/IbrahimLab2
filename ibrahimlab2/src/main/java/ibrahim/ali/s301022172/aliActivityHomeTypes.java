package ibrahim.ali.s301022172;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class aliActivityHomeTypes extends AppCompatActivity {
    Intent intent;
    ArrayList<HomeTypes> checkboxEntries = new ArrayList<HomeTypes>();
    HomeTypes apt1, apt2, apt3, apt4;
    HomeTypes condo1, condo2, condo3, condo4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ali_home_types);
        //Apartments
        apt1 = new HomeTypes("43 Toronto", 60000);
        apt2 = new HomeTypes("85 Vancover", 80000);
        apt3 = new HomeTypes("44 Toronto", 10000);
        apt4 = new HomeTypes("25 Vancover", 40000);
        //Condiminums
        condo1 = new HomeTypes("43 Toronto", 60000);
        condo2 = new HomeTypes("85 Vancover", 80000);
        condo3 = new HomeTypes("44 Toronto", 10000);
        condo4 = new HomeTypes("25 Vancover", 40000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.aliApt:
                setContentView(R.layout.apartments_type);
            break;
            case R.id.aliDetached:
                setContentView(R.layout.detached_type);
                break;
            case R.id.aliSemiDetached:
                setContentView(R.layout.semi_detached_type);
                break;
            case R.id.aliCondominium:
                setContentView(R.layout.condominium_type);
                break;
            case R.id.aliTownHouse:
                setContentView(R.layout.town_house_type);
                break;
            default: setContentView(R.layout.activity_ali_home_types);
        }


        /*int id = item.getItemId();

        if(id == R.id.aliApt){
            apt1.setVisibility(View.VISIBLE);
            return true;
        }else{
            apt1.setVisibility(View.INVISIBLE);
        }*/

        return true;
    }

    public void onClick(View view) {

      switch(view.getId()){

        case R.id.ibrahimAptAddBtn:

            if (((CheckBox) findViewById(R.id.ibrahimAptChbx1)).isChecked()) {
                if (checkboxEntries.contains(apt1) != true){
                    checkboxEntries.add(apt1);
                    Toast.makeText(this, "You have added Apartment 1!", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, "Apartment 1 has already been added!", Toast.LENGTH_LONG).show();
                }
            }

            if (((CheckBox) findViewById(R.id.ibrahimAptChbx2)).isChecked()) {
                if (checkboxEntries.contains(apt2) != true){
                    checkboxEntries.add(apt2);
                    Toast.makeText(this, "You have added Apartment 2!", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, "Apartment 2 has already been added!", Toast.LENGTH_LONG).show();
                }
            }

            if (((CheckBox) findViewById(R.id.ibrahimAptChbx3)).isChecked()) {
                if (checkboxEntries.contains(apt3) != true){
                    checkboxEntries.add(apt3);
                    Toast.makeText(this, "You have added Apartment 3!", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, "Apartment 3 has already been added!", Toast.LENGTH_LONG).show();
                }
            }

            if (((CheckBox) findViewById(R.id.ibrahimAptChbx4)).isChecked()) {
                if (checkboxEntries.contains(apt4) != true){
                    checkboxEntries.add(apt4);
                    Toast.makeText(this, "You have added Apartment 4!", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, "Apartment 4 has already been added!", Toast.LENGTH_LONG).show();
                }
            }

            break;
        case R.id.ibrahimCondoAddBtn:

            if (((CheckBox) findViewById(R.id.ibrahimCondoChx1)).isChecked()) {
                if (checkboxEntries.contains(condo1) != true){
                    checkboxEntries.add(condo1);
                    Toast.makeText(this, "You have added Condominium 1!", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, "Condominium 1 has already been added!", Toast.LENGTH_LONG).show();
                }
            }

            if (((CheckBox) findViewById(R.id.ibrahimCondoChx2)).isChecked()) {
                if (checkboxEntries.contains(condo2) != true){
                    checkboxEntries.add(condo2);
                    Toast.makeText(this, "You have added Condominium 2!", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, "Condominium 2 has already been added!", Toast.LENGTH_LONG).show();
                }
            }

            if (((CheckBox) findViewById(R.id.ibrahimCondoChx3)).isChecked()) {
                if (checkboxEntries.contains(condo3) != true){
                    checkboxEntries.add(condo3);
                    Toast.makeText(this, "You have added Condominium 3!", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, "Condominium 3 has already been added!", Toast.LENGTH_LONG).show();
                }
            }

            if (((CheckBox) findViewById(R.id.ibrahimCondoChx4)).isChecked()) {
                if (checkboxEntries.contains(condo4) != true){
                    checkboxEntries.add(condo4);
                    Toast.makeText(this, "You have added Condominium 4!", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, "Condominium 4 has already been added!", Toast.LENGTH_LONG).show();
                }
            }
            break;

        case R.id.ibrahimAptNextBtn:
        case R.id.ibrahimCondoNextBtn:
            intent = new Intent(aliActivityHomeTypes.this, aliActivityCheckout.class);
            intent.putExtra("homeType-array", checkboxEntries);
            startActivity(intent);
            break;
        default:
      }
    }
}