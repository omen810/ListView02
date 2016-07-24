package com.omen.www.listview02;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lsx on 2016/7/24.
 */
/*继承ArrayAdapter的时候，要记得在后面加上泛型<Fruit>*/
public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;
    private int mCountOfInflater = 0;

    public FruitAdapter(Context context, int resource, List<Fruit> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit = getItem(position);
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
            Log.d("FRUIT", "新造箱子: " + ++mCountOfInflater);
        } else {
            view = convertView;
        }
        ImageView fruitImage=(ImageView)view.findViewById(R.id.fruit_image);
        TextView fruitText = (TextView) view.findViewById(R.id.fruit_name);
        fruitImage.setImageResource(fruit.getImageId());
        fruitText.setText(fruit.getName());
        return view;
    }

    @Override
    public int getCount() {
        Log.d("FRUIT", "getCount: " + super.getCount());
        return super.getCount();
    }
}
