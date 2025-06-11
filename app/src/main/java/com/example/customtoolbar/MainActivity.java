package com.example.customtoolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Toolbar toolBar = findViewById(R.id.my_menu_toolbar);
        setSupportActionBar(toolBar);
        if(getSupportActionBar() != null)
        {
            getSupportActionBar().setTitle("My Menu Area");
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.opt_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.opt_new)
        {
            Toast.makeText(this, "New File", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.opt_open)
        {
            Toast.makeText(this, "Open File", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.opt_create)
        {
            Toast.makeText(this, "Create File", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.opt_delete)
        {
            Toast.makeText(this, "Delete File", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.opt_save)
        {
            Toast.makeText(this, "Sava File", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.opt_update)
        {
            Toast.makeText(this, "Update File", Toast.LENGTH_SHORT).show();
        }
        
        return super.onOptionsItemSelected(item);
    }
}