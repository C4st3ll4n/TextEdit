package castellan.com.textedit;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private AppCompatEditText email,senha;
    private TextInputLayout txSenha, txEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.editEmail);
        senha = findViewById(R.id.editSenha);
        txEmail = findViewById(R.id.inputEmail);
        txSenha = findViewById(R.id.inputPass);
    }

    public void validarCampo(View view){
        if (email.getText().toString().isEmpty()){
            txEmail.setErrorEnabled(true);
            txEmail.setError("Preencha com o seu email !");
        }else{
            txEmail.setErrorEnabled(false);
        }
        if (senha.getText().toString().isEmpty()){
            txSenha.setErrorEnabled(true);
            txSenha.setError("Preencha com sua senha !");
        }else{
            txSenha.setErrorEnabled(false);
        }
    }
}
