package com.example.andreza.fragmentsexerccio1;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentsExercicioMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments_exercicio_main);


        final Button botaoAzul = findViewById(R.id.btnAzul_id);
        botaoAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_Fundo_Azul fragmentAzul = new Fragment_Fundo_Azul();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.add(R.id.Frame_Layout_id, fragmentAzul);
                ft.commit();
            }
        });


        Button botaoVermelho = findViewById(R.id.btnVermelho_id);
        botaoVermelho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment_Fundo_Vermelho fragmentVermelho = new Fragment_Fundo_Vermelho();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.add(R.id.Frame_Layout_id, fragmentVermelho);
                ft.commit();
            }
        });









    }
}
