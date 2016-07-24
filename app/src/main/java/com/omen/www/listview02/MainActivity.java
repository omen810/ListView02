package com.omen.www.listview02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        FruitAdapter adapter=new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private void initFruits() {
        String[] fruitNames={"apple", "banana", "orange", "watermelon", "pear", "grape",
                "Pineapple", "strawberry", "cherry", "apple", "banana", "orange", "watermelon", "pear"};
        int[] fruitImages={R.drawable.apple_pic, R.drawable.banana_pic, R.drawable.orange_pic,
                R.drawable.watermelon_pic, R.drawable.pear_pic, R.drawable.grape_pic,
                R.drawable.pineapple_pic, R.drawable.strawberry_pic, R.drawable.cherry_pic,
                R.drawable.apple_pic, R.drawable.banana_pic, R.drawable.orange_pic,
                R.drawable.watermelon_pic, R.drawable.pear_pic};
        fruitList= new ArrayList<Fruit>();
        for(int i=0;i<fruitNames.length;i++){
            fruitList.add(new Fruit(fruitNames[i], fruitImages[i]));
        }
    }
}
