package com.example.lab4_ph35325.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.lab4_ph35325.R;

public class Fragment2_2 extends Fragment {

    EditText edtContext2;
    Button btnSend;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment2_2, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        edtContext2 = view.findViewById(R.id.edt_content2_1);
        btnSend = view.findViewById(R.id.btn_send2);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getText = edtContext2.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("key", getText);

                requireActivity().getSupportFragmentManager().setFragmentResult("key_value", bundle);


//                Fragment2_1 fragment2_2 = (Fragment2_1) requireActivity().getSupportFragmentManager().findFragmentById(R.id.fragment_2_1);
//              if (fragment2_2 != null){
//                  fragment2_2.edtconten1.setText(getText);
//              }

            }
        });
    }
}