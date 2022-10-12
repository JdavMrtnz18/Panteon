package com.example.panteon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class DatosPagante extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_datos_pagante, container, false);
    }
    public void onViewCreated(View view, Bundle SavedInstanceState){

        Button BotonContPago = view.findViewById(R.id.btnContinuar);
        BotonContPago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_datosPagante_to_datosPago);
            }
        });
        Button BotonReg = view.findViewById(R.id.btnRegresar4);
        BotonReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_datosPagante_to_inicio);
            }
        });
    }
}