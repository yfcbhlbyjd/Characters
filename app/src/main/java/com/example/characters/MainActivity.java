package com.example.characters;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> characters;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        CharacterAdapter adapter = new CharacterAdapter(characters);
        recyclerView.setAdapter(adapter);
        loadDate();
        }

    private void loadDate(){
        characters=new ArrayList<>();
        characters.add("Падучий Джими");
        characters.add("Джек");
        characters.add("Тайлер Дерден");
        characters.add("Хайземберг");
        characters.add("Майкл");
        characters.add("Убермаргинал");
        characters.add("Большой Лебовски");
        characters.add("Декстер");
        characters.add("Боджек");
        characters.add("Чендлер");
        characters.add("Обито");
        characters.add("Мартин Иден");
        characters.add("Георгий Замза");
        characters.add("Сквидвард");
        characters.add("Марк Спектер");
        characters.add("Тони Сопрано");
        characters.add("Бараш");
    }

}