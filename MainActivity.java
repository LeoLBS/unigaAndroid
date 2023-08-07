package intra.uninga.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//Inicando a lista com o ListActivity no android
public class ListActivity extends AppCompatActivity {
//Sobrescrevendo o metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }
}