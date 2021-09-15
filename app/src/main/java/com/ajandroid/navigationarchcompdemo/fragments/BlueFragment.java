package com.ajandroid.navigationarchcompdemo.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.ajandroid.navigationarchcompdemo.databinding.FragmentBlueBinding;

public class BlueFragment extends Fragment {

    private FragmentBlueBinding binding;

    public BlueFragment() {
        // Required empty public constructor
    }

    public static BlueFragment newInstance() {
        return new BlueFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentBlueBinding.inflate(inflater, container, false);

        View view = binding.getRoot();

        init();

        return view;

    }

    private void init() {

        String frag = GreenFragmentArgs.fromBundle(getArguments()).getFrag();
        Toast.makeText(getActivity(), "Frag: " + frag, Toast.LENGTH_SHORT).show();

    }
}