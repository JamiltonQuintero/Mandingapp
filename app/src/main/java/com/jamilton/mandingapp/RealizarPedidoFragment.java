package com.jamilton.mandingapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Console;


public class RealizarPedidoFragment extends Fragment {

    TextView textView;
    ImageView imageView;
    Button btnPedir;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_realizar_pedido, container, false);

        textView = view.findViewById(R.id.nombrePapasPedido);
        imageView = view.findViewById(R.id.imgPedidoPapa);
        btnPedir = view.findViewById(R.id.btnPedir);

        String nombre = requireArguments().getString("nombre");
        int img = requireArguments().getInt("img");


        Log.i("TAGG", ""+ img);

        textView.setText(nombre);
        imageView.setImageResource(img);


        btnPedir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Tu pedido se registro exitosamente", Toast.LENGTH_SHORT).show();
                Navigation.findNavController(v).navigate(R.id.action_realizarPedidoFragment_to_mainFragment);
            }
        });

        return view ;
    }
}