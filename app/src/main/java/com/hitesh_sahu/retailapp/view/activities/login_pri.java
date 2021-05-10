/*
 * App Mov e-commerce 2022, desarrollo para el módulo Aplicaciones Moviles.
 */

package com.hitesh_sahu.retailapp.view.activities;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.hitesh_sahu.retailapp.R;
import com.hitesh_sahu.retailapp.domain.helper.Connectivity;
import com.hitesh_sahu.retailapp.domain.mining.AprioriFrequentItemsetGenerator;
import com.hitesh_sahu.retailapp.domain.mining.FrequentItemsetData;
import com.hitesh_sahu.retailapp.model.CenterRepository;
import com.hitesh_sahu.retailapp.model.entities.Money;
import com.hitesh_sahu.retailapp.model.entities.Product;
import com.hitesh_sahu.retailapp.util.PreferenceHelper;
import com.hitesh_sahu.retailapp.util.TinyDB;
import com.hitesh_sahu.retailapp.util.Utils;
import com.hitesh_sahu.retailapp.util.Utils.AnimationType;
import com.hitesh_sahu.retailapp.view.adapter.ProductListAdapter;
import com.hitesh_sahu.retailapp.view.fragment.HomeFragment;
import com.hitesh_sahu.retailapp.view.fragment.WhatsNewDialog;
import com.wang.avi.AVLoadingIndicatorView;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class login_pri extends AppCompatActivity implements View.OnClickListener{

    EditText user, pass;
    Button btnEntrar, btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        user=(EditText)findViewById(R.id.User);
        pass=(EditText)findViewById(R.id.Pass);
        btnEntrar=(Button)findViewById(R.id.btnEntrar);
        btnRegistrar=(Button)findViewById(R.id.btnRegistrar);

        btnEntrar.setOnClickListener(this);
        btnRegistrar.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnEntrar:
                break;
            case R.id.btnRegistrar:
                Intent i= new Intent(login_pri.this, registrar.class);
                startActivity(i);
                break;
        }
    }
}
