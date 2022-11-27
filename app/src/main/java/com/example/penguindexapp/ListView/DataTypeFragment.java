package com.example.penguindexapp.ListView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.penguindexapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DataTypeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DataTypeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    TextView creditsSource;
    ImageView dataTypeDefinition;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DataTypeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DataTypeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DataTypeFragment newInstance(String param1, String param2) {
        DataTypeFragment fragment = new DataTypeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_data_type, container, false);
        creditsSource = view.findViewById(R.id.creditsSource);
        ListView listView = view.findViewById(R.id.dataTypeListView);
        ArrayList<DataType> dataTypes = new ArrayList<>();
        dataTypes.add(new DataType("Blinky", "Red Ghost, aggressively chases Pacman", 0));
        dataTypes.add(new DataType("Pinky", "Pink Ghost, tries to ambush Pacman", 0));
        dataTypes.add(new DataType("Inky", "Cyan Ghost, takes on behaviour of other 3 ghosts at any point.", 0));
        dataTypes.add(new DataType("Blinky", "Orange Ghost, will chase Pacman until it gets close.", 0));

        //Method 1) use the existing adapter
//        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(),
//                android.R.layout.simple_list_item_1, dataTypes);
        CustomListViewAdapter arrayAdapter1 = new CustomListViewAdapter(getContext(), dataTypes);
        listView.setAdapter(arrayAdapter1);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                creditsSource.setText(((DataType)listView.getItemAtPosition(position)).getCreditsSource());
                //dataTypeDefinition.setImageResource(((DataType)listView
                        //.getItemAtPosition(position)).getImage());
            }
        });

        return view;
    }
}