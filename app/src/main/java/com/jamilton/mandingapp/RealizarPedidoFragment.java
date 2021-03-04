package com.jamilton.mandingapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Console;


public class RealizarPedidoFragment extends Fragment {

    TextView textView;
    ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_realizar_pedido, container, false);

        textView = view.findViewById(R.id.nombrePapasPedido);
        imageView = view.findViewById(R.id.imgPedidoPapa);

        String nombre = requireArguments().getString("nombre");
        int img = requireArguments().getInt("img");


        Log.i("TAGG", ""+ img);

        textView.setText(nombre);
        imageView.setImageResource(img);

        return view ;
    }
}