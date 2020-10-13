/**
 * Full Name: Ibrahim Ali
 * Student ID: 301022172
 * Section: COMP 304 - 002
 * */

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
    HomeTypes det1, det2, det3, det4;
    HomeTypes semiD1, semiD2, semiD3, semiD4;
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

        //Detached
        det1 = new HomeTypes(getString(R.string.ibrahimDet1String), 434900);
        det2 = new HomeTypes(getString(R.string.ibrahimDet2String), 550000);
        det3 = new HomeTypes(getString(R.string.ibrahimDet3String), 959900);
        det4 = new HomeTypes(getString(R.string.ibrahimDet4String), 999000);

        //Semi Detached
        semiD1 = new HomeTypes(getString(R.string.ibrahimSemiD1String), 899900);
        semiD2 = new HomeTypes(getString(R.string.ibrahimSemiD2String), 999000);
        semiD3 = new HomeTypes(getString(R.string.ibrahimSemiD3String), 788800);
        semiD4 = new HomeTypes(getString(R.string.ibrahimSemiD4String), 739900);

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
                    Toast.makeText(this, getString(R.string.ibrahimSetAdded) + getString(R.string.ibrahimApt1String), Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, getString(R.string.ibrahimApt1String) + getString(R.string.ibrahimSetAlreadyAdded), Toast.LENGTH_LONG).show();
                }
            }

            if (((CheckBox) findViewById(R.id.ibrahimAptVChbx2)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimAptPChbx2)).isChecked()) {
                if (checkboxEntries.contains(apt2) != true){
                    checkboxEntries.add(apt2);
                    Toast.makeText(this, getString(R.string.ibrahimSetAdded) + getString(R.string.ibrahimApt2String), Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,  getString(R.string.ibrahimApt2String) + getString(R.string.ibrahimSetAlreadyAdded), Toast.LENGTH_LONG).show();
                }
            }

            if (((CheckBox) findViewById(R.id.ibrahimAptVChbx3)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimAptPChbx3)).isChecked()) {
                if (checkboxEntries.contains(apt3) != true){
                    checkboxEntries.add(apt3);
                    Toast.makeText(this, getString(R.string.ibrahimSetAdded) + getString(R.string.ibrahimApt3String), Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, getString(R.string.ibrahimApt3String) + getString(R.string.ibrahimSetAlreadyAdded), Toast.LENGTH_LONG).show();
                }
            }

            if (((CheckBox) findViewById(R.id.ibrahimAptVChbx4)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimAptPChbx4)).isChecked()) {
                if (checkboxEntries.contains(apt4) != true){
                    checkboxEntries.add(apt4);
                    Toast.makeText(this, getString(R.string.ibrahimSetAdded) + getString(R.string.ibrahimApt4String), Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, getString(R.string.ibrahimApt4String) + getString(R.string.ibrahimSetAlreadyAdded), Toast.LENGTH_LONG).show();
                }
            }

            if(checkboxEntries.size() == 0)
            {
                Toast.makeText(this, R.string.ibrahimSetHouseInterest, Toast.LENGTH_LONG).show();
            }

            break;
        case R.id.ibrahimCondoAddBtn:

            if (((CheckBox) findViewById(R.id.ibrahimCondoVChbx1)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimCondoPChbx1)).isChecked()) {
                if (checkboxEntries.contains(condo1) != true){
                    checkboxEntries.add(condo1);
                    Toast.makeText(this, getString(R.string.ibrahimSetAdded) + getString(R.string.ibrahimCondo1String), Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, getString(R.string.ibrahimCondo1String) + getString(R.string.ibrahimSetAlreadyAdded), Toast.LENGTH_LONG).show();
                }
            }

            if (((CheckBox) findViewById(R.id.ibrahimCondoVChbx2)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimCondoPChbx2)).isChecked()) {
                if (checkboxEntries.contains(condo2) != true){
                    checkboxEntries.add(condo2);
                    Toast.makeText(this, getString(R.string.ibrahimSetAdded) + getString(R.string.ibrahimCondo2String), Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,  getString(R.string.ibrahimCondo2String) + getString(R.string.ibrahimSetAlreadyAdded), Toast.LENGTH_LONG).show();
                }
            }

            if (((CheckBox) findViewById(R.id.ibrahimCondoVChbx3)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimCondoPChbx3)).isChecked()) {
                if (checkboxEntries.contains(condo3) != true){
                    checkboxEntries.add(condo3);
                    Toast.makeText(this, getString(R.string.ibrahimSetAdded) + getString(R.string.ibrahimCondo3String), Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, getString(R.string.ibrahimCondo3String) + getString(R.string.ibrahimSetAlreadyAdded), Toast.LENGTH_LONG).show();
                }
            }

            if (((CheckBox) findViewById(R.id.ibrahimCondoVChbx4)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimCondoPChbx4)).isChecked()) {
                if (checkboxEntries.contains(condo4) != true){
                    checkboxEntries.add(condo4);
                    Toast.makeText(this, getString(R.string.ibrahimSetAdded) + getString(R.string.ibrahimCondo4String), Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, getString(R.string.ibrahimCondo4String) + getString(R.string.ibrahimSetAlreadyAdded), Toast.LENGTH_LONG).show();
                }
            }

            if(checkboxEntries.size() == 0)
            {
                Toast.makeText(this, R.string.ibrahimSetHouseInterest, Toast.LENGTH_LONG).show();
            }

            break;

          case R.id.ibrahimSemiDAddBtn:

              if (((CheckBox) findViewById(R.id.ibrahimSemiDVChbx1)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimSemiDPChbx1)).isChecked()) {
                  if (checkboxEntries.contains(semiD1) != true){
                      checkboxEntries.add(semiD1);
                      Toast.makeText(this, getString(R.string.ibrahimSetAdded) + getString(R.string.ibrahimSemiD1String), Toast.LENGTH_LONG).show();
                  }else{
                      Toast.makeText(this, getString(R.string.ibrahimSemiD1String) + getString(R.string.ibrahimSetAlreadyAdded), Toast.LENGTH_LONG).show();
                  }
              }

              if (((CheckBox) findViewById(R.id.ibrahimSemiDVChbx2)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimSemiDPChbx2)).isChecked()) {
                  if (checkboxEntries.contains(semiD2) != true){
                      checkboxEntries.add(semiD2);
                      Toast.makeText(this, getString(R.string.ibrahimSetAdded) + getString(R.string.ibrahimSemiD2String), Toast.LENGTH_LONG).show();
                  }else{
                      Toast.makeText(this,  getString(R.string.ibrahimSemiD2String) + getString(R.string.ibrahimSetAlreadyAdded), Toast.LENGTH_LONG).show();
                  }
              }

              if (((CheckBox) findViewById(R.id.ibrahimSemiDVChbx3)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimSemiDPChbx3)).isChecked()) {
                  if (checkboxEntries.contains(semiD3) != true){
                      checkboxEntries.add(semiD3);
                      Toast.makeText(this, getString(R.string.ibrahimSetAdded) + getString(R.string.ibrahimSemiD3String), Toast.LENGTH_LONG).show();
                  }else{
                      Toast.makeText(this, getString(R.string.ibrahimSemiD3String) + getString(R.string.ibrahimSetAlreadyAdded), Toast.LENGTH_LONG).show();
                  }
              }

              if (((CheckBox) findViewById(R.id.ibrahimSemiDVChbx4)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimSemiDPChbx4)).isChecked()) {
                  if (checkboxEntries.contains(semiD4) != true){
                      checkboxEntries.add(semiD4);
                      Toast.makeText(this, getString(R.string.ibrahimSetAdded) + getString(R.string.ibrahimSemiD4String), Toast.LENGTH_LONG).show();
                  }else{
                      Toast.makeText(this, getString(R.string.ibrahimSemiD4String) + getString(R.string.ibrahimSetAlreadyAdded), Toast.LENGTH_LONG).show();
                  }
              }

              if(checkboxEntries.size() == 0)
              {
                  Toast.makeText(this, R.string.ibrahimSetHouseInterest, Toast.LENGTH_LONG).show();
              }

              break;

          case R.id.ibrahimDetAddBtn:

              if (((CheckBox) findViewById(R.id.ibrahimDetVChbx1)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimDetPChbx1)).isChecked()) {
                  if (checkboxEntries.contains(det1) != true){
                      checkboxEntries.add(det1);
                      Toast.makeText(this, getString(R.string.ibrahimSetAdded) + getString(R.string.ibrahimDet1String), Toast.LENGTH_LONG).show();
                  }else{
                      Toast.makeText(this, getString(R.string.ibrahimDet1String) + getString(R.string.ibrahimSetAlreadyAdded), Toast.LENGTH_LONG).show();
                  }
              }

              if (((CheckBox) findViewById(R.id.ibrahimDetVChbx2)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimDetPChbx2)).isChecked()) {
                  if (checkboxEntries.contains(det2) != true){
                      checkboxEntries.add(det2);
                      Toast.makeText(this, getString(R.string.ibrahimSetAdded) + getString(R.string.ibrahimDet2String), Toast.LENGTH_LONG).show();
                  }else{
                      Toast.makeText(this,  getString(R.string.ibrahimDet2String) + getString(R.string.ibrahimSetAlreadyAdded), Toast.LENGTH_LONG).show();
                  }
              }

              if (((CheckBox) findViewById(R.id.ibrahimDetVChbx3)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimDetPChbx3)).isChecked()) {
                  if (checkboxEntries.contains(det3) != true){
                      checkboxEntries.add(det3);
                      Toast.makeText(this, getString(R.string.ibrahimSetAdded) + getString(R.string.ibrahimDet3String), Toast.LENGTH_LONG).show();
                  }else{
                      Toast.makeText(this, getString(R.string.ibrahimDet3String) + getString(R.string.ibrahimSetAlreadyAdded), Toast.LENGTH_LONG).show();
                  }
              }

              if (((CheckBox) findViewById(R.id.ibrahimDetVChbx4)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimDetPChbx4)).isChecked()) {
                  if (checkboxEntries.contains(det4) != true){
                      checkboxEntries.add(det4);
                      Toast.makeText(this, getString(R.string.ibrahimSetAdded) + getString(R.string.ibrahimDet4String), Toast.LENGTH_LONG).show();
                  }else{
                      Toast.makeText(this, getString(R.string.ibrahimDet4String) + getString(R.string.ibrahimSetAlreadyAdded), Toast.LENGTH_LONG).show();
                  }
              }

              if(checkboxEntries.size() == 0)
              {
                  Toast.makeText(this, R.string.ibrahimSetHouseInterest, Toast.LENGTH_LONG).show();
              }

              break;

          case R.id.ibrahimTownAddBtn:

              if (((CheckBox) findViewById(R.id.ibrahimTownVChbx1)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimTownPChbx1)).isChecked()) {
                  if (checkboxEntries.contains(town1) != true){
                      checkboxEntries.add(town1);
                      Toast.makeText(this, getString(R.string.ibrahimSetAdded) + getString(R.string.ibrahimTown1String), Toast.LENGTH_LONG).show();
                  }else{
                      Toast.makeText(this, getString(R.string.ibrahimTown1String) + getString(R.string.ibrahimSetAlreadyAdded), Toast.LENGTH_LONG).show();
                  }
              }

              if (((CheckBox) findViewById(R.id.ibrahimTownVChbx2)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimTownPChbx2)).isChecked()) {
                  if (checkboxEntries.contains(town2) != true){
                      checkboxEntries.add(town2);
                      Toast.makeText(this, getString(R.string.ibrahimSetAdded) + getString(R.string.ibrahimTown2String), Toast.LENGTH_LONG).show();
                  }else{
                      Toast.makeText(this,  getString(R.string.ibrahimTown2String) + getString(R.string.ibrahimSetAlreadyAdded), Toast.LENGTH_LONG).show();
                  }
              }

              if (((CheckBox) findViewById(R.id.ibrahimTownVChbx3)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimTownPChbx3)).isChecked()) {
                  if (checkboxEntries.contains(town3) != true){
                      checkboxEntries.add(town3);
                      Toast.makeText(this, getString(R.string.ibrahimSetAdded) + getString(R.string.ibrahimTown3String), Toast.LENGTH_LONG).show();
                  }else{
                      Toast.makeText(this, getString(R.string.ibrahimTown3String) + getString(R.string.ibrahimSetAlreadyAdded), Toast.LENGTH_LONG).show();
                  }
              }

              if (((CheckBox) findViewById(R.id.ibrahimTownVChbx4)).isChecked() || ((CheckBox) findViewById(R.id.ibrahimTownPChbx4)).isChecked()) {
                  if (checkboxEntries.contains(town4) != true){
                      checkboxEntries.add(town4);
                      Toast.makeText(this, getString(R.string.ibrahimSetAdded) + getString(R.string.ibrahimTown4String), Toast.LENGTH_LONG).show();
                  }else{
                      Toast.makeText(this, getString(R.string.ibrahimTown4String) + getString(R.string.ibrahimSetAlreadyAdded), Toast.LENGTH_LONG).show();
                  }
              }

              if(checkboxEntries.size() == 0)
              {
                  Toast.makeText(this, R.string.ibrahimSetHouseInterest, Toast.LENGTH_LONG).show();
              }

              break;

        case R.id.ibrahimAptNextBtn:
        case R.id.ibrahimCondoNextBtn:
        case R.id.ibrahimTownNextBtn:
        case R.id.ibrahimSemiDNextBtn:
        case R.id.ibrahimDetNextBtn:

            if(checkboxEntries.size() == 0)
            {
                Toast.makeText(this, R.string.ibrahimSetHouseInterest, Toast.LENGTH_LONG).show();
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