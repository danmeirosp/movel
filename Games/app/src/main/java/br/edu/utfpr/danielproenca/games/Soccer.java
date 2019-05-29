package br.edu.utfpr.danielproenca.games;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Soccer extends AppCompatActivity {

    private ArrayList<RegisterSoccer> registerSoccers = new ArrayList<>();
    private EditText editTextTeam;
    private EditText editTextGoals;
    private EditText editTextRoundsS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soccer);

        editTextTeam = findViewById(R.id.editTextTeam);
        editTextGoals = findViewById(R.id.editTextGoals);
        editTextRoundsS = findViewById(R.id.editTextRoundsS);
    }

    public void clearFieldsS(View view){
        editTextTeam.setText(null);
        editTextGoals.setText(null);
        editTextRoundsS.setText(null);

        editTextTeam.requestFocus();
        Toast.makeText(this,
                R.string.message_clear,
                Toast.LENGTH_LONG).show();
    }

    public void showRegisterSoccer(View view) {
        Intent intent = new Intent(this,
                ShowDataSoccer.class);
        intent.putExtra("Registers", registerSoccers);
        startActivity(intent);
    }

    public void sendFieldsS(View view){
        String team = editTextTeam.getText().toString();
        String goals = editTextGoals.getText().toString();
        String rounds = editTextRoundsS.getText().toString();

        if(team == null || team.trim().isEmpty()){
            Toast.makeText(this,
                    getString(R.string.error_nickname),
                    Toast.LENGTH_LONG).show();

            editTextTeam.requestFocus();
            return;
        }
        registerSoccers.add(new RegisterSoccer(team,Integer.parseInt(goals),Integer.parseInt(rounds)));

        editTextTeam.setText(null);
        editTextGoals.setText(null);
        editTextRoundsS.setText(null);

        editTextTeam.requestFocus();

        Toast.makeText(this,
                team + "\n" + goals + "\n" + rounds,
                Toast.LENGTH_LONG).show();

    }
}
