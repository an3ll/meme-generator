package com.example.joaane.memegenerator.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.joaane.memegenerator.R;

/**
 * Created by joaane on 15-04-09.
 */
public class BottomSectionFragment extends Fragment{

    private TextView topMemeText;
    private TextView bottomMemeText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.bottom_section_fragment,container, false);

        initializeWidgets(view);
        return view;
    }

    private void initializeWidgets(View view) {

        topMemeText = (TextView) view.findViewById(R.id.topMemeText);
        bottomMemeText = (TextView) view.findViewById(R.id.bottomMemeText);
    }

    public void setMemeText(String top, String bottom) {
        topMemeText.setText(top);
        bottomMemeText.setText(bottom);
    }
}
