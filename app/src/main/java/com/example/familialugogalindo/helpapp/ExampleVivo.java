package com.example.familialugogalindo.helpapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Familia Lugo Galindo on 04/12/2018.
 */

public class ExampleVivo extends AppCompatDialogFragment {

    private TextView Nor;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder buildr = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.vivo, null);

        buildr.setView(view)
                .setTitle("Alerta!!")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        Nor = view.findViewById(R.id.textView8);
        return buildr.create();
    }
}
