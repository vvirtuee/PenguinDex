package com.example.penguindexapp.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.penguindexapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FactFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FactFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";
    private static final String ARG_PARAM4 = "param4";
    private static final String ARG_PARAM5 = "param5";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private String mParam3;
    private String mParam4;
    private int mParam5;

    public FactFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @param param3 Parameter 3.
     * @return A new instance of fragment FactFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FactFragment newInstance(String param1, String param2, String param3, String param4, int param5) {
        FactFragment fragment = new FactFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        args.putString(ARG_PARAM3, param3);
        args.putString(ARG_PARAM4, param4);
        args.putInt(ARG_PARAM5, param5);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            mParam3 = getArguments().getString(ARG_PARAM3);
            mParam4 = getArguments().getString(ARG_PARAM4);
            mParam5 = getArguments().getInt(ARG_PARAM5);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fact, container, false);
        if(mParam1 != null){
          TextView textView = view.findViewById(R.id.factTitle);
          textView.setText(mParam1);
        }
        if(mParam2 != null){
            TextView textView = view.findViewById(R.id.factHeight);
            textView.setText(mParam2);
        }
        if(mParam3 != null){
            TextView textView = view.findViewById(R.id.factWeight);
            textView.setText(mParam3);
        }
        if(mParam4 != null){
            TextView textView = view.findViewById(R.id.factDescription);
            textView.setText(mParam4);
        }
        if(mParam5 != -1){
            ImageView imageView = view.findViewById(R.id.factImg);
            imageView.setImageResource(mParam5);
        }
        return view;
    }


}