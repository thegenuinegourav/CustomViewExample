package com.example.sourabh.customviewexample;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {

    private Integer[] ImageResources={R.drawable.sample_0,R.drawable.sample_1,R.drawable.sample_2,R.drawable.sample_3,
                                      R.drawable.sample_4,R.drawable.sample_5,R.drawable.sample_6,R.drawable.sample_7};
    //private String[] HeadingNames={"Dog1","Dog2","Dog3","Dog4","Dog5","Dog6","Dog7","Dog8"};
    private String[] Description={"Active","Not Active","Active","Active","Active","Not Active","Not Active","Not Active"};
    CustomAdapter(Context context,String[] Head)
    {
        super(context,R.layout.custom_list,Head);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view=inflater.inflate(R.layout.custom_list, parent, false);
        ImageView image;
        TextView text1;
        TextView text2;
        image = (ImageView)view.findViewById(R.id.image);
        text1 = (TextView)view.findViewById(R.id.text1);
        text2 = (TextView)view.findViewById(R.id.text2);
        image.setImageResource(ImageResources[position]);
        text1.setTypeface(Typeface.DEFAULT_BOLD);
        text1.setText(getItem(position));
        text2.setText(Description[position]);

        return view;
    }
}
