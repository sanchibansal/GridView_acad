package com.example.sakshi.gridview_acad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    GridView mGridview;         //declaring gridview

    int imageid[]=new int[]{R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.icecreamsandwich,R.drawable.jellybean,R.drawable.kitkat,R.drawable.lollipop};
    //creating an integer array for the image ids present in the drawable folder
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGridview = (GridView)findViewById(R.id.grid);  //associating gridview
        
        ImageClass imgclass = new ImageClass(this,imageid);     //Calling constructor of the ImageClass
        mGridview.setAdapter(imgclass);     //setting gridview to the object of the ImageClass

    }
}
