package com.example.claseabril5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;

public class SpinnerFragment extends Fragment {

    Spinner spnTest;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_spinner, container, false);
        spnTest = view.findViewById(R.id.spnTest);

        ArrayAdapter spnAdapter = ArrayAdapter.createFromResource(
                this.getContext(),
                R.array.spinner_items,
                android.R.layout.simple_spinner_item
        );

        spnAdapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);

        spnTest.setAdapter(spnAdapter);

        return view;
    }
}