package datalogic.com.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class CreateUserActivity extends AppCompatActivity {

    EditText addendo1;
    EditText addendo2;
    EditText risultato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);
    }

    public void getValues(){
        addendo1 = findViewById(R.id.addendo1);
        int addendo1Value = Integer.parseInt(addendo1.getText().toString());
        addendo2 = findViewById(R.id.addendo2);
        int addendo2Value = Integer.parseInt(addendo2.getText().toString());
        risultato = findViewById(R.id.risultato);
    }

    public int getAddendo1() {
        addendo1 = findViewById(R.id.addendo1);
        int addendo1Value = Integer.parseInt(addendo1.getText().toString());
        return addendo1Value;
    }

    public int getAddendo2() {
        addendo2 = findViewById(R.id.addendo2);
        int addendo2Value = Integer.parseInt(addendo2.getText().toString());
        return addendo2Value;
    }

    public void sommaMethod(View view){
        int risultatoValue = somma(getAddendo1(), getAddendo2());
        risultato = findViewById(R.id.risultato);
        risultato.setText(String.valueOf(risultatoValue));
    }

    public void multiplicaMethod(View view){
        int risultatoValue = moltiplica(getAddendo1(), getAddendo2());
        risultato = findViewById(R.id.risultato);
        risultato.setText(String.valueOf(risultatoValue));
    }

    /*
    public void sommaMethod(View view){
        EditText addendo1 = findViewById(R.id.addendo1);
        int addendo1Value = Integer.parseInt(addendo1.getText().toString());
        EditText addendo2 = findViewById(R.id.addendo2);
        int addendo2Value = Integer.parseInt(addendo2.getText().toString());
        EditText risultato = findViewById(R.id.risultato);
        int risultatoValue = somma(addendo1Value, addendo2Value;

        risultato.setText(String.valueOf(multiply(addendo1Value,addendo2Value)));
    }
    */

    public static int moltiplica(int numero1, int numero2){
        return numero1*numero2;
    }

    public static int somma(int numero1, int numero2){
        return numero1+numero2;
    }
}
