package com.polamr.lifecyclemethods;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends Activity {

    ViewStub stub;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        stub = (ViewStub) findViewById(R.id.viewStub1);
        View inflated = stub.inflate();

        b = (Button) inflated.findViewById(R.id.button1);

        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "View Stub Content Created !!!",
                        Toast.LENGTH_LONG).show();
            }
        });
    }

}
