package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // khai bao mot mang
        ArrayList<Word> words = new ArrayList<Word>();
        //words.add("One");
        // Word w = new Word("One", "Lutti");
        words.add(new Word("Where are you going?", "minto wuksus"));  // thay vi phai viet Word w = new Word("One", "Lutti");
        words.add(new Word("What is your name?", "tinnә oyaase'nә"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michәksәs?"));
        words.add(new Word("I'm feeling good!", "kuchi achit !"));
        words.add((new Word("Are you comming", "әәnәs'aa?")));
        words.add(new Word("Yes, I'm comming", "hәә’ әәnәm"));
        words.add(new Word("I'm comming", "әәnәm"));
        words.add(new Word("Let's go", "yoowutis"));
        words.add(new Word("Come here", "әnni'nem"));


        // tạo một adapter
        // Xuong day cap nhat tiep <String> thanh <Word>
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        // tao mot doi tuong kieu listView
        ListView listView = (ListView) findViewById(R.id.list);
        // gan các danh sach vao listview
        listView.setAdapter(adapter);

    }
}
