package com.ajandroid.navigationarchcompdemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ajandroid.navigationarchcompdemo.databinding.FragmentGreenBinding;

public class GreenFragment extends Fragment {

    private FragmentGreenBinding binding;

    public GreenFragment() {
        // Required empty public constructor
    }

    public static GreenFragment newInstance() {
        return new GreenFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentGreenBinding.inflate(inflater, container, false);

        View view = binding.getRoot();

        initListener();

        return view;

    }

    private void initListener() {

        NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

        binding.greenFragBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_greenFragment_to_blueFragment);
            }
        });

    }

}