package intra.uninga.mobile;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    private Button formButton;
    private Button listButton;
    
     @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Aqui temos um botão com o R para mapear
        formButton = findViewById(R.id.formButton);
        listButton = findViewById(R.id.listButton);
        //Qual o local que o botão ira levar com o clique
        formButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFormActivity();
            }
        });
        //Botão resposnsavel para reconhecer o clique o usuario e executando o metodo
        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListActivity();
            }
        });
    }
    
    private void openFormActivity() {
        Intent intent = new Intent(this, FormActivity.class);
        startActivity(intent);
    }
    
    private void openListActivity() {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }
}