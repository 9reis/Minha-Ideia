package lucas.reis.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import lucas.reis.appminhaideia.R;
import lucas.reis.appminhaideia.controller.ClienteController;
import lucas.reis.appminhaideia.core.AppUtil;
import lucas.reis.appminhaideia.model.Cliente;

public class SplashActivity extends AppCompatActivity {

    TextView txtAppVersion;

    Cliente objCliente;
    ClienteController clienteController;

    int tempoDeEspera = 1000 * 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Log.d(AppUtil.TAG, "onCreate: Tela Splash Carregada");

        clienteController = new ClienteController();

        txtAppVersion = findViewById(R.id.txtAppVersion);
        txtAppVersion.setText(AppUtil.versaoDoApp());

        trocarTela();

    }

    private void trocarTela() {

        Log.d(AppUtil.TAG, "trocarTela: Mudando de tela ");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                objCliente = new Cliente("Lucas","teste@teste.com","99009191",28,true);

                Log.d(AppUtil.TAG, "trocarTela: Esperando um tempo ");

                Intent trocarDeTela = new Intent(SplashActivity.this, MainActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("nome",objCliente.getNome());
                bundle.putString("email",objCliente.getEmail());

                trocarDeTela.putExtras(bundle);
                startActivity(trocarDeTela);
                finish();

            }
        },tempoDeEspera);


    }

}