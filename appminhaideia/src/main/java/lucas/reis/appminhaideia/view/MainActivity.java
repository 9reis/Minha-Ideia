package lucas.reis.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import lucas.reis.appminhaideia.R;
import lucas.reis.appminhaideia.model.Cliente;

public class MainActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";

    TextView txtNome ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Tela PRINCIPAL Carregada");

        Bundle bundle = getIntent().getExtras();

        Log.d(TAG, "onCreate: NOME: "+ bundle.getString("nome") );
        Log.d(TAG, "onCreate: EMAIL: "+ bundle.getString("email") );

        txtNome = findViewById(R.id.txtNome);
        txtNome.setText("Bem vindo : " + bundle.getString("nome"));
    }
}