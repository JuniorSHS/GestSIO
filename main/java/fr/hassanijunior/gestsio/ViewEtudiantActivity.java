package fr.hassanijunior.gestsio;

import android.widget.TextView;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ViewEtudiantActivity extends AppCompatActivity {

    private TextView txtnomEtudiant;
    private TextView txtprenomEtudiant;
    private TextView txtanniversaireEtudiant;
    private TextView txtadresseEtudiant;
    private TextView txtadresseEtudiant2;
    private TextView txtadresseEtudiant3;
    private TextView txttelEtudiant;
    private TextView txtemailEtudiant;
    private TextView txtobservationEtudiant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_etudiant);
        txtnomEtudiant = (TextView) findViewById(R.id.nomEtudiant);
        txtprenomEtudiant = (TextView) findViewById(R.id.prenomEtudiant);
        txtanniversaireEtudiant = (TextView) findViewById(R.id.anniversaireEtudiant);
        txtadresseEtudiant = (TextView) findViewById(R.id.adresseEtudiant);
        txtadresseEtudiant2 = (TextView) findViewById(R.id.adresseEtudiant2);
        txtadresseEtudiant3 = (TextView) findViewById(R.id.adresseEtudiant3);
        txttelEtudiant = (TextView) findViewById(R.id.telEtudiant);
        txtemailEtudiant = (TextView) findViewById(R.id.emailEtudiant);
        txtobservationEtudiant = (TextView) findViewById(R.id.observationEtudiant);

    }

    @Override
    protected void onResume() {
        super.onResume();

        txtnomEtudiant.setText("SAID HASSANI");
        txtprenomEtudiant.setText("SAID JUNIOR");
        txtanniversaireEtudiant.setText("19/12/1995");
        txtadresseEtudiant.setText("12 aller coco");
        txtadresseEtudiant2.setText("97400");
        txtadresseEtudiant3.setText("Saint Denis");
        txttelEtudiant.setText("0693123456");
        txtemailEtudiant.setText("JuniorTheBoss@gmail.com");
        txtobservationEtudiant.setText("Bon élève.");

    }
}
