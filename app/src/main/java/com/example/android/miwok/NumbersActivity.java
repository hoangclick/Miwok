package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // khai bao mot mang
        ArrayList<Word> words = new ArrayList<Word>();
        //words.add("One");
       // Word w = new Word("One", "Lutti");
        words.add(new Word("One", "Lutti", R.drawable.number_one));  // thay vi phai viet Word w = new Word("One", "Lutti");
        words.add(new Word("Two", "likio", R.drawable.number_two));
        words.add(new Word("Three", "tolookosu", R.drawable.number_three));
        words.add(new Word("Four", "oyyiza", R.drawable.number_four));
        words.add(new Word("Five", "Nam", R.drawable.number_five));
        words.add((new Word("Six", "Sau", R.drawable.number_six)));
        words.add(new Word("Seven", "Bay", R.drawable.number_seven));
        words.add(new Word("Eight", "Tam", R.drawable.number_eight));
        words.add(new Word("Nine", "Chin", R.drawable.number_nine));
        words.add(new Word("Ten", "Muoi", R.drawable.number_ten));


        // tạo một adapter
        // Xuong day cap nhat tiep <String> thanh <Word>
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers); // tao bien mau nen o day
        // tao mot doi tuong kieu listView
        ListView listView = (ListView) findViewById(R.id.list);
        // gan các danh sach vao listview
        listView.setAdapter(adapter);

    }
}
