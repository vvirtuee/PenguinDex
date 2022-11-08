package com.example.penguindexapp.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.penguindexapp.R;
import java.util.ArrayList;

public class QuestionsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public QuestionsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OOPTermsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static QuestionsFragment newInstance(String param1, String param2) {
        QuestionsFragment fragment = new QuestionsFragment();
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
        View view = inflater.inflate(R.layout.fragment_question, container, false);
        ArrayList<Question> terms = new ArrayList<>();
        terms.add(new Question("Inheritance","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam consequat aliquet neque, a pellentesque diam tristique in. Nulla suscipit orci vel dui pharetra, eu ullamcorper leo faucibus. Phasellus faucibus lacus et lacinia mattis. Vestibulum vulputate, dui ac rhoncus pellentesque, sem ligula mattis felis, fermentum convallis quam nisi quis metus. Sed venenatis augue nulla, eu commodo dolor facilisis a. Nunc faucibus, eros eget commodo pharetra, lacus justo euismod libero, ut dictum enim ligula a justo. Cras vel tincidunt erat. Vivamus fermentum risus eu laoreet elementum."));
        terms.add(new Question("Constructor","Lorem ipsonsequat aliquet neque, a pellentesque diam tristique in. Nulla suscipit orci vel dui pharetra, eu ullamcorper leo faucibus. Phasellus faucibus lacus et lacinia mattis. Vestibulum vulputate, dui ac rhoncus pellentesque, sem ligula mattis felis, fermentum convallis quam nisi quis metus. Sed venenatis augue nulla, eu commodo dolor facilisis a. Nunc faucibus, eros eget commodo pharetra, lacus justo euismod libero, ut dictum enim ligula a justo. Cras vel tincidunt erat. Vivamus fermentum risus eu laoreet elementum."));
        terms.add(new Question("Polymorphism","Lorem ipsum dolor ng elit. Nam consequat aliquet neque, a pellentesque diam tristique in. Nulla suscipit orci vel dui pharetra, eu ullamcorper leo faucibus. Phasellus faucibus lacus et lacinia mattis. Vestibulum vulputate, dui ac rhoncus pellentesque, sem ligula mattis felis, fermentum convallis quam nisi quis metus. Sed venenatis augue nulla, eu commodo dolor facilisis a. Nunc faucibus, eros eget commodo pharetra, lacus justo euismod libero, ut dictum enim ligula a justo. Cras vel tincidunt erat. Vivamus fermentum risus eu laoreet elementum."));
        terms.add(new Question("Methods","Lorem ipsum dolor sit amet, aliquet neque, a pellentesque diam tristique in. Nulla suscipit orci vel dui pharetra, eu ullamcorper leo faucibus. Phasellus faucibus lacus et lacinia mattis. Vestibulum vulputate, dui ac rhoncus pellentesque, sem ligula mattis felis, fermentum convallis quam nisi quis metus. Sed venenatis augue nulla, eu commodo dolor facilisis a. Nunc faucibus, eros eget commodo pharetra, lacus justo euismod libero, ut dictum enim ligula a justo. Cras vel tincidunt erat. Vivamus fermentum risus eu laoreet elementum."));
        terms.add(new Question("Member Variables","Lorem ipsum dolor sit amuat aliquet neque, a pellentesque diam tristique in. Nulla suscipit orci vel dui pharetra, eu ullamcorper leo faucibus. Phasellus faucibus lacus et lacinia mattis. Vestibulum vulputate, dui ac rhoncus pellentesque, sem ligula mattis felis, fermentum convallis quam nisi quis metus. Sed venenatis augue nulla, eu commodo dolor facilisis a. Nunc faucibus, eros eget commodo pharetra, lacus justo euismod libero, ut dictum enim ligula a justo. Cras vel tincidunt erat. Vivamus fermentum risus eu laoreet elementum."));
        RecyclerView recyclerView = view.findViewById(R.id.recycle);
        //recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        //recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1 ,LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(new QuestionsRecyclerViewAdapter(terms));
        return view;
    }
}