package com.example.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Camera2Fragment extends Fragment {
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *

     * @return A new instance of fragment Camera2Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Camera2Fragment newInstance() {
        return new Camera2Fragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_camera2, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}