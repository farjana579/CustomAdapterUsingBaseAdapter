package com.example.customadapterusingbaseadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    Integer[] imageId = {R.drawable.img,R.drawable.img_1,R.drawable.img_2,R.drawable.img_3};
    String[] favAnimal = {"Cute Bunny", "Baby Koala", "kitty katty","baby kung fu"};
    String[] description = {"hey","hi","meow","heyyyyyyyyyy"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.listMain);
        CustomAdapter adapter = new CustomAdapter(MainActivity.this,favAnimal,imageId,description);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int imageView = imageId[position];
                String text = description[position];
                Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                i.putExtra("key1", text);
                i.putExtra("image", imageView);

                startActivity(i);

            }
        });
    }
}