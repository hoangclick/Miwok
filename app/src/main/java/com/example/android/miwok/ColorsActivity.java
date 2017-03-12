package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // khai bao mot mang
        ArrayList<Word> words = new ArrayList<Word>(); // code nay co the giu nguyen
        //words.add("One");
        // Word w = new Word("One", "Lutti");
        words.add(new Word("Red", "weṭeṭṭi", R.drawable.color_red));  // thay vi phai viet Word w = new Word("One", "Lutti");
        words.add(new Word("Green", "chokokki", R.drawable.color_green));
        words.add(new Word("Brown", "ṭakaakki", R.drawable.color_brown));
        words.add(new Word("Gray", "ṭopoppi", R.drawable.color_gray));
        words.add(new Word("Black", "Den", R.drawable.color_black));
        words.add((new Word("White", "Trang", R.drawable.color_white)));
        words.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        words.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));

        // tạo một adapter
        // Xuong day cap nhat tiep <String> thanh <Word>
        WordAdapter adapterColor = new WordAdapter(this, words, R.color.category_colors); // code nay cung
        // tao mot doi tuong kieu listView
        ListView listView = (ListView) findViewById(R.id.list);
        // gan các danh sach vao listview
        listView.setAdapter(adapterColor);

    }
}