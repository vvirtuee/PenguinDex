package com.example.penguindexapp.ListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.penguindexapp.R;

import java.util.ArrayList;

public class CustomListViewAdapter extends ArrayAdapter<DataType> {
    public CustomListViewAdapter(Context context, ArrayList<DataType> items){
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        DataType item = getItem(position);
        if (convertView == null){
            convertView =
                    LayoutInflater
                            .from(getContext())
                            .inflate(R.layout.item_view, parent, false);
            TextView name = convertView.findViewById(R.id.name);
            name.setText(item.getName());
            TextView definition = convertView.findViewById(R.id.definition);
            definition.setText(item.getDescription());
        }
        return convertView;
    }

}
