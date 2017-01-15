package co.com.formulariocontacto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {


    private TextView nombre;
    private TextView fecha;
    private TextView telefono;
    private TextView email;
    private TextView descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);


        TextView nombre = (TextView) findViewById(R.id.tconfDatosNombre);
        TextView fecha = (TextView)findViewById(R.id.tconfDatosFecha);
        TextView telefono = (TextView) findViewById(R.id.tconfDatosTelefono);
        TextView email = (TextView) findViewById(R.id.tconfDatosEmail);
        TextView descripcion = (TextView) findViewById(R.id.tconfDatosDescripcion);

        String tvnombre = getIntent().getStringExtra(getResources().getString(R.string.nombre));
        String tvfecha = getIntent().getStringExtra(getResources().getString(R.string.fecha));
        String tvtelefono = getIntent().getStringExtra(getResources().getString(R.string.telefono));
        String tvemail = getIntent().getStringExtra(getResources().getString(R.string.email));
        String tvdescripcion = getIntent().getStringExtra(getResources().getString(R.string.descripcion));

        nombre.setText(tvnombre);
        fecha.setText(tvfecha);
        telefono.setText(tvtelefono);
        email.setText(tvemail);
        descripcion.setText(tvdescripcion);

        Button editar = (Button) findViewById(R.id.btnEditar);
        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
