package com.example.sakshi.gridview_acad;

import android.content.ContentValues;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by sakshi on 04-07-2017.
 */
//extending BaseAdapter

public class ImageClass extends BaseAdapter {
    private int imageid[];
    private Context context;
    private LayoutInflater mInflator;

    //parameterized constructor
    public ImageClass(Context context, int imageid[]){
        this.context=context;
        this.imageid=imageid;
        mInflator=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);        //inflating
    }


    @Override
    public int getCount() {
        return imageid.length;      //returning count of the imageid array
    }

    @Override
    public Object getItem(int position) {
        return imageid[position];       //returning position of any id in the array
    }

    @Override
    public long getItemId(int position) {
        return position;                //returning position
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = mInflator.inflate(R.layout.image_layout,null);        //inflating the view with inflator
        ImageView image = (ImageView)convertView.findViewById(R.id.img);       //Associating ImageView in the image_layout layout
        image.setImageResource(imageid[position]);      //setting image in the imageView
        return convertView;         //returning view
    }
}
