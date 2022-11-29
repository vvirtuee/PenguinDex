package com.example.penguindexapp.RecyclerView;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.penguindexapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CalculateAnswers#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CalculateAnswers extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CalculateAnswers() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CalculateAnswers.
     */
    // TODO: Rename and change types and number of parameters
    public static CalculateAnswers newInstance(String param1, String param2) {
        CalculateAnswers fragment = new CalculateAnswers();
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
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_calculate_answers, container, false);

        //motivation: lazy --> hardworking
        //societal: follower --> leader
        int motivation = 0;
        int societal = 0;
        int i = 0;
        for(Question question : QuestionBank.getInstance().getQuestions()){
            i++;
            System.out.println("question: " + question.getQuestion());
            System.out.println("a1?: " + question.isA1());
            System.out.println("a2?: " + question.isA2());
            System.out.println("a3?: " + question.isA3());
            if(i == 1 || i == 2 || i == 6 || i == 8 || i == 9){
                if(question.isA1()){motivation--;}
                if(question.isA3()){motivation++;}
            }
            if (i == 3 || i == 4 || i == 6 || i == 8 || i == 10) {
                if (question.isA1()) {societal--;}
                if (question.isA3()) {societal++;}
            }
        }

        System.out.println("motivation score: " + motivation);
        System.out.println("societal score: " + societal);

        System.out.println("type of penguin: " + calculateScore(motivation,societal));

        String penguinType = calculateScore(motivation,societal);

        TextView penguinName = v.findViewById(R.id.penguinName);
        TextView penguinWeight = v.findViewById(R.id.penguinWeight);
        TextView penguinHeight = v.findViewById(R.id.penguinHeight);
        ImageView penguinDisplay = v.findViewById(R.id.penguinDisplay);
        TextView penguinDescription = v.findViewById(R.id.penguinDescription);

        penguinName.setText(penguinType);
        switch(penguinType){
            case "African Penguin":
                penguinWeight.setText(R.string.africanWeight);
                penguinHeight.setText(R.string.africanHeight);
                penguinDisplay.setImageResource(R.drawable.african);
                penguinDescription.setText(R.string.africanDescription);
                break;
            case "Chinstrap Penguin":
                penguinWeight.setText(R.string.chinstrapWeight);
                penguinHeight.setText(R.string.chinstrapHeight);
                penguinDisplay.setImageResource(R.drawable.chinstrap);
                penguinDescription.setText(R.string.chinstrapDescription);
                break;
            case "Rockhopper Penguin":
                penguinWeight.setText(R.string.rockhopperWeight);
                penguinHeight.setText(R.string.rockhopperHeight);
                penguinDisplay.setImageResource(R.drawable.rockhopper);
                penguinDescription.setText(R.string.rockhopperDescription);
                break;
            case "Magellanic Penguin":
                penguinWeight.setText(R.string.magellanicWeight);
                penguinHeight.setText(R.string.magellanicHeight);
                penguinDisplay.setImageResource(R.drawable.magellanic);
                penguinDescription.setText(R.string.magellanicDescription);
                break;
            case "Adelie Penguin":
                penguinWeight.setText(R.string.adelieWeight);
                penguinHeight.setText(R.string.adelieHeight);
                penguinDisplay.setImageResource(R.drawable.adelie);
                penguinDescription.setText(R.string.adelieDescription);
                break;
            case "Gentoo Penguin":
                penguinWeight.setText(R.string.gentooWeight);
                penguinHeight.setText(R.string.gentooHeight);
                penguinDisplay.setImageResource(R.drawable.gentoo);
                penguinDescription.setText(R.string.gentooDescription);
                break;
            case "Macaroni Penguin":
                penguinWeight.setText(R.string.macaroniWeight);
                penguinHeight.setText(R.string.macaroniHeight);
                penguinDisplay.setImageResource(R.drawable.macaroni);
                penguinDescription.setText(R.string.macaroniDescription);
                break;
            case "King Penguin":
                penguinWeight.setText(R.string.kingWeight);
                penguinHeight.setText(R.string.kingHeight);
                penguinDisplay.setImageResource(R.drawable.king);
                penguinDescription.setText(R.string.kingDescription);
                break;
            case "Emperor Penguin":
                penguinWeight.setText(R.string.emperorWeight);
                penguinHeight.setText(R.string.emperorHeight);
                penguinDisplay.setImageResource(R.drawable.emperor);
                penguinDescription.setText(R.string.emperorDescription);
                break;
        }


        return v;
    }
    public String calculateScore(int motivation, int societal){
        int convertedMotivation = 0;
        int convertedSocietal = 0;
        if(motivation < -2){
            convertedMotivation = -1;
        }
        if(motivation >= -2 && motivation <= 2){
            convertedMotivation = 0;
        }
        if(motivation > 2){
            convertedMotivation = 1;
        }

        if(societal < -2){
            convertedSocietal = -1;
        }
        if(societal >= -2 && societal <= 2){
            convertedSocietal = 0;
        }
        if(societal > 2){
            convertedSocietal = 1;
        }

        System.out.println("motivation score: " + convertedMotivation);
        System.out.println("societal score: " + convertedSocietal);


        switch(convertedMotivation) {
            case -1:
                switch (convertedSocietal) {
                    case -1:
                        return "African Penguin";
                    case 0:
                        return "Magellanic Penguin";
                    case 1:
                        return "Macaroni Penguin";
                }
            case 0:
                switch (convertedSocietal) {
                    case -1:
                        return "Chinstrap Penguin";
                    case 0:
                        return "Adelie Penguin";
                    case 1:
                        return "King Penguin";
                }
            case 1:
                switch (convertedSocietal) {
                    case -1:
                        return "Rockhopper Penguin";
                    case 0:
                        return "Gentoo Penguin";
                    case 1:
                        return "Emperor Penguin";
                }
        }
        return "";
    }
}

/** Personality Grid
 *                     Motivation
 *                 -1          0           +1
 *              ____________|___________|____________
 *          -1 | African    | Chinstrap | Rockhopper
 * Societal  0 | Magellanic | Adelie    | Gentoo
 *          +1 | Macaroni   | King      | Emperor
 */