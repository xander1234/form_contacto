package co.com.formulariocontacto;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editNombre;
    private DatePicker datePFecha;
    private EditText editTelefono;
    private EditText editEmail;
    private EditText editDescripcion;
    private Button btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNombre = (EditText) findViewById(R.id.editNombre);
        datePFecha = (DatePicker) findViewById(R.id.datePFecha);
        editTelefono = (EditText) findViewById(R.id.editTelefono);
        editEmail = (EditText) findViewById(R.id.editEmail);
        editDescripcion = (EditText) findViewById(R.id.editDescripcion);

        btnSiguiente = (Button) findViewById(R.id.btnSiguiente);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int dia =  datePFecha.getDayOfMonth();
                int mes =  datePFecha.getMonth() + 1;
                int anio =  datePFecha.getYear();

                String fechaNacimiento  = dia + "/" + mes + "/" + anio;

                Intent intent = new Intent(MainActivity.this,ConfirmarDatos.class );
                intent.putExtra(getResources().getString(R.string.nombre),editNombre.getText().toString() );
                intent.putExtra(getResources().getString(R.string.fecha), fechaNacimiento.toString() );
                intent.putExtra(getResources().getString(R.string.telefono),editTelefono.getText().toString());
                intent.putExtra(getResources().getString(R.string.email),editEmail.getText().toString());
                intent.putExtra(getResources().getString(R.string.descripcion),editDescripcion.getText().toString());
                startActivity(intent);
            }
        });

    }
}
