package lucas.reis.appminhaideia.controller;

import android.util.Log;

import lucas.reis.appminhaideia.core.AppUtil;

public class ClienteController {

    String versaoApp;

    public ClienteController(){
        this.versaoApp = AppUtil.versaoDoApp();

        Log.i(AppUtil.TAG, "ClienteController: Versão : " + versaoApp);
    }

}
