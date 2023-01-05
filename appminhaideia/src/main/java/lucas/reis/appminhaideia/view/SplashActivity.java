package lucas.reis.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import lucas.reis.appminhaideia.R;
import lucas.reis.appminhaideia.model.Cliente;

public class SplashActivity extends AppCompatActivity {
    
    String TAG = "APP_MINHA_IDEIA";

    Cliente objCliente;

    int tempoDeEspera = 1000 * 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Log.d(TAG, "onCreate: Tela Splash Carregada");

        trocarTela();

    }

    private void trocarTela() {

        Log.d(TAG, "trocarTela: Mudando de tela ");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                objCliente = new Cliente("Lucas","teste@teste.com","99009191",28,true);

                Log.d(TAG, "trocarTela: Esperando um tempo ");

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