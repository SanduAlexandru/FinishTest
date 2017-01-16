package com.example.sandualexandru.test;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by sandualexandru on 16/01/2017.
 */

public class DummyFragment extends Fragment implements View.OnClickListener {


    private View login;
    private View register;

    public static DummyFragment newInstance() {
        Bundle args = new Bundle();
        DummyFragment fragment = new DummyFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_intro, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getViewReference(view);
        //TODO daca comentezi setControls si lasi activity.finish va disparea din recent apps
//        getActivity().finish();
        setControls();
    }


    private void setControls() {
        login.setOnClickListener(this);
        register.setOnClickListener(this);
    }

    private void getViewReference(View view) {
        login = view.findViewById(R.id.login);
        register = view.findViewById(R.id.register);
    }

    @Override
    public void onClick(View view) {
        getActivity().finish();
    }
}
