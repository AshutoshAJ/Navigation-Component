package com.ajandroid.navigationarchcompdemo.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ajandroid.navigationarchcompdemo.R;
import com.ajandroid.navigationarchcompdemo.databinding.FragmentRedBinding;

public class RedFragment extends Fragment {

    private FragmentRedBinding binding;

    public RedFragment() {
        // Required empty public constructor
    }

    public static RedFragment newInstance() {
        return new RedFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentRedBinding.inflate(inflater, container, false);

        View view = binding.getRoot();

        initListener();

        return view;

    }

    private void initListener() {

        NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

        binding.redFragBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //navController.navigate(R.id.action_redFragment_to_greenFragment);
                RedFragmentDirections.ActionRedFragmentToGreenFragment action = RedFragmentDirections.actionRedFragmentToGreenFragment("");
                action.setFrag("Green");
                navController.navigate(action);
            }
        });

    }

}