package com.example.myrecycleview;

import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder>  {
    private List<Fruit> mFruitList;

    //ViewHolder是一个内部类，在它的构造函数中需加入View，view用来获取布局中的ImageView和TextView
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView fruitImage;
        TextView fruitName;

        public ViewHolder(View view){
            super(view);
            fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
            fruitName = (TextView) view.findViewById(R.id.fruit_name);
        }
    }

    //FruitAdapter的构造函数
    public FruitAdapter(List<Fruit> fruitList){
        mFruitList = fruitList;
    }

    //继承RecycleView.Adapter必须重写的方法
    //将fruit_item布局加载进来，创建ViewHolder实例
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item, parent, false);
    final ViewHolder holder = new ViewHolder(view);
    holder.fruitImage.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            int position = holder.getAdapterPosition();
            Fruit fruit = mFruitList.get(position);
            Toast.makeText(v.getContext(), "The image you clicked is "+fruit.getName(), Toast.LENGTH_SHORT).show();
        }
    });
    holder.fruitName.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int position = holder.getAdapterPosition();
            Fruit fruit = mFruitList.get(position);
            Toast.makeText(v.getContext(), "The text you clicked is "+fruit.getName(), Toast.LENGTH_SHORT).show();
        }
    });
    return holder;
    }

    //通过position得到当前项的Fruit实例，然后将数据设置到ViewHolder里的ImageView和TextView
    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        Fruit fruit = mFruitList.get(position);
        holder.fruitImage.setImageResource(fruit.getImageId());
        holder.fruitName.setText(fruit.getName());
    }

    //对象的子项，返回的是数据源
    @Override
    public int getItemCount(){
        return mFruitList.size();
    }

}
