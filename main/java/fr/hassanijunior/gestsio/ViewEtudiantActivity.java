package fr.hassanijunior.gestsio;

import android.widget.TextView;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ViewEtudiantActivity extends AppCompatActivity {

    private TextView txtnomEtudiant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_etudiant);
        txtnomEtudiant = (TextView) findViewById(R.id.nomEtudiant);
    }

    @Override
    protected void onResume() {
        super.onResume();

        txtnomEtudiant.setText("DURAND");

    }
}