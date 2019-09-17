package br.eteczl.pam1recycleview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class AlunoViewHolder extends RecyclerView.ViewHolder {

    TextView nometextView;
    TextView idadetextView;

    public AlunoViewHolder (@NonNull View itemView) {

        super(itemView);

        nometextView = (TextView)
                itemView.findViewById(R.id.textViewNome);

        idadetextView = (TextView)
                itemView.findViewById(R.id.textViewIdade);
       }
    }




