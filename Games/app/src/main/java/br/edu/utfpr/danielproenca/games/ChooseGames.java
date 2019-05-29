package br.edu.utfpr.danielproenca.games;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ChooseGames extends AppCompatActivity {

    private RadioGroup radioGroupChooseGames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_games);

        radioGroupChooseGames = findViewById(R.id.radioGroupChooseGames);

    }

    public void chooseGames(View view){
        switch (radioGroupChooseGames.getCheckedRadioButtonId()){
            case R.id.radioButtonSoccer:
                Intent intent = new Intent(this,
                        Soccer.class);
                startActivity(intent);
                break;

            case R.id.radioButtonPubg:
                Intent intent2 = new Intent(this,
                        Pubg.class);
                startActivity(intent2);
                break;

            default:
                Toast.makeText(this,
                        getString(R.string.error_choosegame),
                        Toast.LENGTH_LONG).show();

        }
    }
}
