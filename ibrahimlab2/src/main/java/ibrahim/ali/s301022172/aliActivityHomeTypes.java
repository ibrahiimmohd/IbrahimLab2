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
    HomeTypes town1, town2, town3, town4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ali_home_types);
        //Apartments
        apt1 = new HomeTypes(getString(R.string.ibrahimApt1String), 600000);
        apt2 = new HomeTypes(getString(R.string.ibrahimApt2String), 869000);
        apt3 = new HomeTypes(getString(R.string.ibrahimApt3String), 695000);
        apt4 = new HomeTypes(getString(R.string.ibrahimApt4String), 449900);

        //Condiminums
        condo1 = new HomeTypes(getString(R.string.ibrahimCondo1String), 698000);
        condo2 = new HomeTypes(getString(R.string.ibrahimCondo2String), 524900);
        condo3 = new HomeTypes(getString(R.string.ibrahimCondo3String), 495000);
        condo4 = new HomeTypes(getString(R.string.ibrahimCondo4String), 599900);

        //Town House
        town1 = new HomeTypes(getString(R.string.ibrahimTown1String), 660000);
        town2 = new HomeTypes(getString(R.string.ibrahimTown2String), 489000);
        town3 = new HomeTypes(getString(R.string.ibrahimTown3String), 569000);
        town4 = new HomeTypes(getString(R.string.ibrahimTown4String), 950000);
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

        return true;
    }

    public void onClick(View view) {

      switch(view.getId()){

        case R.id.ibrahimAptAddBtn:

            if (((CheckBox) findViewById(R.id.ibrahimAptVChbx1)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimAptPChbx1)).isChecked()) {
                if (checkboxEntries.contains(apt1) != true){
                    checkboxEntries.add(apt1);
                    Toast.makeText(this, "You have added " + getString(R.string.ibrahimApt1String), Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, getString(R.string.ibrahimApt1String) + " has already been added!", Toast.LENGTH_LONG).show();
                }
            }

            if (((CheckBox) findViewById(R.id.ibrahimAptVChbx2)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimAptPChbx2)).isChecked()) {
                if (checkboxEntries.contains(apt2) != true){
                    checkboxEntries.add(apt2);
                    Toast.makeText(this, "You have added " + getString(R.string.ibrahimApt2String), Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,  getString(R.string.ibrahimApt2String) + " has already been added!", Toast.LENGTH_LONG).show();
                }
            }

            if (((CheckBox) findViewById(R.id.ibrahimAptVChbx3)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimAptPChbx3)).isChecked()) {
                if (checkboxEntries.contains(apt3) != true){
                    checkboxEntries.add(apt3);
                    Toast.makeText(this, "You have added " + getString(R.string.ibrahimApt3String), Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, getString(R.string.ibrahimApt3String) + " has already been added!", Toast.LENGTH_LONG).show();
                }
            }

            if (((CheckBox) findViewById(R.id.ibrahimAptVChbx4)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimAptPChbx4)).isChecked()) {
                if (checkboxEntries.contains(apt4) != true){
                    checkboxEntries.add(apt4);
                    Toast.makeText(this, "You have added " + getString(R.string.ibrahimApt4String), Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, getString(R.string.ibrahimApt4String) + " has already been added!", Toast.LENGTH_LONG).show();
                }
            }

            if(checkboxEntries.size() == 0)
            {
                Toast.makeText(this, "Please add any house(s) of your interest", Toast.LENGTH_LONG).show();
            }

            break;
        case R.id.ibrahimCondoAddBtn:

            if (((CheckBox) findViewById(R.id.ibrahimCondoVChbx1)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimCondoPChbx1)).isChecked()) {
                if (checkboxEntries.contains(condo1) != true){
                    checkboxEntries.add(condo1);
                    Toast.makeText(this, "You have added " + getString(R.string.ibrahimCondo1String), Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, getString(R.string.ibrahimCondo1String) + " has already been added!", Toast.LENGTH_LONG).show();
                }
            }

            if (((CheckBox) findViewById(R.id.ibrahimCondoVChbx2)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimCondoPChbx2)).isChecked()) {
                if (checkboxEntries.contains(condo2) != true){
                    checkboxEntries.add(condo2);
                    Toast.makeText(this, "You have added " + getString(R.string.ibrahimCondo2String), Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,  getString(R.string.ibrahimCondo2String) + " has already been added!", Toast.LENGTH_LONG).show();
                }
            }

            if (((CheckBox) findViewById(R.id.ibrahimCondoVChbx3)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimCondoPChbx3)).isChecked()) {
                if (checkboxEntries.contains(condo3) != true){
                    checkboxEntries.add(condo3);
                    Toast.makeText(this, "You have added " + getString(R.string.ibrahimCondo3String), Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, getString(R.string.ibrahimCondo3String) + " has already been added!", Toast.LENGTH_LONG).show();
                }
            }

            if (((CheckBox) findViewById(R.id.ibrahimCondoVChbx4)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimCondoPChbx4)).isChecked()) {
                if (checkboxEntries.contains(condo4) != true){
                    checkboxEntries.add(condo4);
                    Toast.makeText(this, "You have added " + getString(R.string.ibrahimCondo4String), Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, getString(R.string.ibrahimCondo4String) + " has already been added!", Toast.LENGTH_LONG).show();
                }
            }

            if(checkboxEntries.size() == 0)
            {
                Toast.makeText(this, "Please add any house(s) of your interest", Toast.LENGTH_LONG).show();
            }

            break;

          case R.id.ibrahimTownAddBtn:

              if(checkboxEntries.size() == 0)
              {
                  Toast.makeText(this, "Please add any house of your interest", Toast.LENGTH_LONG).show();
              }

              if (((CheckBox) findViewById(R.id.ibrahimTownVChbx1)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimTownPChbx1)).isChecked()) {
                  if (checkboxEntries.contains(town1) != true){
                      checkboxEntries.add(town1);
                      Toast.makeText(this, "You have added " + getString(R.string.ibrahimTown1String), Toast.LENGTH_LONG).show();
                  }else{
                      Toast.makeText(this, getString(R.string.ibrahimTown1String) + " has already been added!", Toast.LENGTH_LONG).show();
                  }
              }

              if (((CheckBox) findViewById(R.id.ibrahimTownVChbx2)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimTownPChbx2)).isChecked()) {
                  if (checkboxEntries.contains(town2) != true){
                      checkboxEntries.add(town2);
                      Toast.makeText(this, "You have added " + getString(R.string.ibrahimTown2String), Toast.LENGTH_LONG).show();
                  }else{
                      Toast.makeText(this,  getString(R.string.ibrahimTown2String) + " has already been added!", Toast.LENGTH_LONG).show();
                  }
              }

              if (((CheckBox) findViewById(R.id.ibrahimTownVChbx3)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimTownPChbx3)).isChecked()) {
                  if (checkboxEntries.contains(town3) != true){
                      checkboxEntries.add(town3);
                      Toast.makeText(this, "You have added " + getString(R.string.ibrahimTown3String), Toast.LENGTH_LONG).show();
                  }else{
                      Toast.makeText(this, getString(R.string.ibrahimTown3String) + " has already been added!", Toast.LENGTH_LONG).show();
                  }
              }

              if (((CheckBox) findViewById(R.id.ibrahimTownVChbx4)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimTownPChbx4)).isChecked()) {
                  if (checkboxEntries.contains(town4) != true){
                      checkboxEntries.add(town4);
                      Toast.makeText(this, "You have added " + getString(R.string.ibrahimTown4String), Toast.LENGTH_LONG).show();
                  }else{
                      Toast.makeText(this, getString(R.string.ibrahimTown4String) + " has already been added!", Toast.LENGTH_LONG).show();
                  }
              }

              if(checkboxEntries.size() == 0)
              {
                  Toast.makeText(this, "Please add any house(s) of your interest", Toast.LENGTH_LONG).show();
              }

              break;

        case R.id.ibrahimAptNextBtn:
        case R.id.ibrahimCondoNextBtn:
        case R.id.ibrahimTownNextBtn:

            if(checkboxEntries.size() == 0)
            {
                Toast.makeText(this, "Please add any house(s) of your interest", Toast.LENGTH_LONG).show();
            }else
            {
                intent = new Intent(aliActivityHomeTypes.this, aliActivityCheckout.class);
                intent.putExtra("homeType-array", checkboxEntries);
                startActivity(intent);
            }

            break;
        default:
      }
    }
}