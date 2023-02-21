package com.example.notifications;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        b = findViewById(R.id.b);
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast t;
//                t= Toast.makeText (getApplicationContext(), "Bonjour ", Toast.LENGTH_LONG);
//                t.show();
//            }
//        } );
    }

    public void afficher(View view){
        Toast t= Toast.makeText (getApplicationContext(), "Toast leger ", Toast.LENGTH_SHORT);
        t.show();
    }

    public void afficher2(View view){
        Toast t= Toast.makeText (getApplicationContext(), "Toast long ", Toast.LENGTH_LONG);
        t.show();
    }
    public void afficher3(View view) {
        AlertDialog.Builder boite = new AlertDialog.Builder(MainActivity.this);
        boite.setMessage("3e bouton")
                .setTitle("boite de dialogue")
                .setPositiveButton("texte bouton", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast t= Toast.makeText (getApplicationContext(), "bouton 3! ", Toast.LENGTH_SHORT);
                        t.show();
                    }
                })
        ;
        AlertDialog dialog = boite.create();
        dialog.show();
    }


    public void afficher4(View view) {
        AlertDialog.Builder boite = new AlertDialog.Builder(MainActivity.this);
        boite.setMessage("4e bouton")
                .setTitle("boite de dialogue")
                .setPositiveButton("texte bouton 2", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast t= Toast.makeText (getApplicationContext(), "bouton 4 first! ", Toast.LENGTH_SHORT);
                        t.show();
                    }
                })
                .setNegativeButton("texte bouton 1", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast t= Toast.makeText (getApplicationContext(), "bouton 4 second! ", Toast.LENGTH_SHORT);
                        t.show();
                    }
                })
        ;
        AlertDialog dialog = boite.create();
        dialog.show();
    }


    public void afficher5(View view) {
        AlertDialog.Builder boite = new AlertDialog.Builder(MainActivity.this);
        boite.setMessage("5e bouton")
                .setTitle("boite de dialogue")
                .setPositiveButton("texte bouton 1", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast t= Toast.makeText (getApplicationContext(), " 5 positive button! ", Toast.LENGTH_SHORT);
                        t.show();
                    }
                })
                .setNeutralButton("texte bouton 3", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast t= Toast.makeText (getApplicationContext(), " 5 neutral button! ", Toast.LENGTH_SHORT);
                        t.show();
                    }
                })
                .setNegativeButton("texte bouton 2", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast t= Toast.makeText (getApplicationContext(), "5 negative button! ", Toast.LENGTH_SHORT);
                        t.show();
                    }
                })

        ;
        AlertDialog dialog = boite.create();
        dialog.show();
    }
}
