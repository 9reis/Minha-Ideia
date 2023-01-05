package lucas.reis.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import lucas.reis.appminhaideia.R;
import lucas.reis.appminhaideia.model.Cliente;

public class MainActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";

    Cliente objCliente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Tela PRINCIPAL Carregada");

        objCliente = new Cliente("Lucas","teste@teste.com","9199999222",28,true);
    }
}