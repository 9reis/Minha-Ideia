package lucas.reis.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import lucas.reis.appminhaideia.R;
import lucas.reis.appminhaideia.core.AppUtil;
import lucas.reis.appminhaideia.model.Cliente;

public class MainActivity extends AppCompatActivity {

    TextView txtNome ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppUtil.TAG, "onCreate: Tela PRINCIPAL Carregada");

        Bundle bundle = getIntent().getExtras();

        Log.d(AppUtil.TAG, "onCreate: NOME: "+ bundle.getString("nome") );
        Log.d(AppUtil.TAG, "onCreate: EMAIL: "+ bundle.getString("email") );

        txtNome = findViewById(R.id.txtNome);
        txtNome.setText("Bem vindo : " + bundle.getString("nome"));
    }
}