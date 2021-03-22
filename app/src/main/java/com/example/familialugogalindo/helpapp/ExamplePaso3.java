package com.example.familialugogalindo.helpapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ExamplePaso3 extends AppCompatDialogFragment {

    private TextView n,a;
    private ImageView c;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_paso3, null);

        builder.setView(view)
                .setTitle("Paso 3!!")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        n = view.findViewById(R.id.textView22);
        a = view.findViewById(R.id.textView20);
        c = view.findViewById(R.id.imageView8);
        return builder.create();
    }
}
