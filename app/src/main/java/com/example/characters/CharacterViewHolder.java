package com.example.characters;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CharacterViewHolder extends RecyclerView.ViewHolder {
    private TextView tvCharacter;

    public CharacterViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCharacter = itemView.findViewById(R.id.tv_character);
    }
    public void bind(String character){
        tvCharacter.setText(character);
        }


}
