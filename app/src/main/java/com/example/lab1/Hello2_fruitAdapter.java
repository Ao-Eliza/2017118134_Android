package com.example.lab1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Hello2_fruitAdapter extends ArrayAdapter<Hello2_fruit> {
    private int resourceId;

    public Hello2_fruitAdapter(Context context, int textViewResourceId, List<Hello2_fruit> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Hello2_fruit fruit = getItem(position);//获取当前项的fruit实例
        View view;
        ViewHolder viewHolder;
        //convertView用于将之前加载好的布局重新加载一遍，以便之后可以进行重用
        if (convertView == null) {//当convertView为null，则使用LayoutInFlater去加载布局
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
            viewHolder.fruitName = (TextView) view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);// 将ViewHolder存储在View中
        } else {//不为空时则直接对convertView进行重用
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();//重新获取ViewHolder
        }
        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getName());
        return view;
    }

    //ViewHolder 就是一个持有者的类，他里面一般没有方法，只有属性，作用就是一个临时的储存器，
    // 把你getView方法中每次返回的View存起来，可以下次再用。
    // 这样做的好处就是不必每次都到布局文件中去拿到你的View，提高了效率。
    class ViewHolder {
        ImageView fruitImage;
        TextView fruitName;
    }
}
