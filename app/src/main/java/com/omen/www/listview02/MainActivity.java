package com.omen.www.listview02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fruit apple = new Fruit("apple", R.mipmap.ic_launcher);
        fruitList.add(apple);
        Fruit banana = new Fruit("banana", R.mipmap.ic_launcher);
        fruitList.add(banana);
        Fruit orange = new Fruit("orange", R.mipmap.ic_launcher);
        fruitList.add(orange);
        FruitAdapter adapter=new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
