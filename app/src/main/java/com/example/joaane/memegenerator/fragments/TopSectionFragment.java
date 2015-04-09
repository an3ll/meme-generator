package com.example.joaane.memegenerator.fragments;



import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

import com.example.joaane.memegenerator.R;
import com.example.joaane.memegenerator.fragments.listeners.TopSectionFragmentListener;

/**
 * Created by joaane on 15-04-09.
 */
public class TopSectionFragment extends Fragment {

    private EditText topText;
    private EditText bottomText;
    private Button button;

    private TopSectionFragmentListener activityCommander;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activityCommander = (TopSectionFragmentListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.top_section_fragment, container, false);
        initiateWidgets(view);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClicked(view);
            }
        });

        return view;
    }

    private void buttonClicked(View view) {

        activityCommander.createMeme(topText.getText().toString(), bottomText.getText().toString());
    }

    private void initiateWidgets(View view) {

        topText = (EditText) view.findViewById(R.id.topInput);
        bottomText = (EditText) view.findViewById(R.id.bottomInput);
        button = (Button) view.findViewById(R.id.mememButton);
    }
}
