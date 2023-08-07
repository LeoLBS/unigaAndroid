package intra.uninga.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//Ativando o aplicativo android, seu ponto inicial é o FormActivity
public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
    }
} 