package br.eteczl.pam1recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Layout;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

//https://developer.andori.com/guide/topics/ui/layout/recyclerview

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.nossoRecycleView);

        List<Aluno> listAlunos = new ArrayList<>();

        Aluno Huguinho = new Aluno();
        Huguinho.setNome("Huguinho");
        Huguinho.setIdade(10);

        Aluno Zezinho = new Aluno();
        Zezinho.setNome("Zezinho");
        Zezinho.setIdade(9);

        Aluno Luizinho = new Aluno();
        Luizinho.setNome("Luizinho");
        Luizinho.setIdade(8);

        recyclerView.setAdapter(new NossoRecicleViewListDeAlunosAdapter(listAlunos, this));

        RecyclerView.LayoutManager layoutManager;
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager. VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);
    }
}
