package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // khai bao mot mang
        ArrayList<Word> words = new ArrayList<Word>();
        //words.add("One");
        // Word w = new Word("One", "Lutti");
        words.add(new Word("Father", "әpә", R.drawable.family_father));  // thay vi phai viet Word w = new Word("One", "Lutti");
        words.add(new Word("Mother", "әṭa", R.drawable.family_mother));
        words.add(new Word("Son", "angsi", R.drawable.family_son));
        words.add(new Word("Daughter", "tune", R.drawable.family_daughter));
        words.add(new Word("older brother", "taachi", R.drawable.family_older_brother));
        words.add((new Word("Youger Brother", "chalitti", R.drawable.family_younger_brother)));
        words.add(new Word("Older Sister", "teṭe", R.drawable.family_older_sister));
        words.add(new Word("Younger Sister", "kolliti", R.drawable.family_younger_sister));
        words.add(new Word("Grandmother", "ama", R.drawable.family_grandmother));
        words.add(new Word("Granfather", "paapa", R.drawable.family_grandfather));


        // tạo một adapter
        // Xuong day cap nhat tiep <String> thanh <Word>
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);
        // tao mot doi tuong kieu listView
        ListView listView = (ListView) findViewById(R.id.list);
        // gan các danh sach vao listview
        listView.setAdapter(adapter);

    }
}
