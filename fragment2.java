package com.example.dietapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class fragment2 extends Fragment {

    public interface OnSubmitClickListener {
        void onCreate(Bundle savedInstanceState2);

        void onSubmitClicked2(int calorie);
    }

    private OnSubmitClickListener callback;
    private EditText RiceQuantity;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        try {
            callback = (OnSubmitClickListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement OnSubmitClickListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment2, container, false);

        RiceQuantity = view.findViewById(R.id.RiceQuantity);
        Button btn = view.findViewById(R.id.btnGoBack2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                calculateAndSubmit2();
            }
        });

        return view;
    }

    private void calculateAndSubmit2() {
        String quantityString = RiceQuantity.getText().toString();

        if (!quantityString.isEmpty()) {
            float quantity = Float.parseFloat(quantityString);
            int calorie = (int) (quantity * 353.7/100);

            callback.onSubmitClicked2(calorie);
        }

        if (getFragmentManager() != null) {
            getFragmentManager().popBackStack();
        }
    }
}
