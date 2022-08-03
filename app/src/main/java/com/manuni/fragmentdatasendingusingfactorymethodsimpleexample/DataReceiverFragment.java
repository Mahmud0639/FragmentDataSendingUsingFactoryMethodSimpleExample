package com.manuni.fragmentdatasendingusingfactorymethodsimpleexample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DataReceiverFragment extends Fragment {


    public DataReceiverFragment() {
        // Required empty public constructor
    }

    public static DataReceiverFragment newInstance(String messages) {

        Bundle args = new Bundle();
        args.putString("key",messages);

        DataReceiverFragment fragment = new DataReceiverFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_data_receiver, container, false);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String data = bundle.getString("key");

            TextView resultTxt = view.findViewById(R.id.messageTxt);
            resultTxt.setText(data);
        }

        return view;
    }

}