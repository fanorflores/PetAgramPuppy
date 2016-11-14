package ni.edu.unan.te.socialmascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar action_bar = (Toolbar) findViewById(R.id.action_bar);
        setSupportActionBar(action_bar);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager linearLayoutManager =  new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(linearLayoutManager);

        inicializarMascotas();
        inicializarAdaptador();

    }

    public void inicializarAdaptador()
    {
        MascotaAdaptador mascotaAdaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(mascotaAdaptador);
    }

    public void inicializarMascotas()
    {
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.pluto,"Puppy 1", 5));
        mascotas.add(new Mascota(R.drawable.pluto2,"Puppy 2", 7));
        mascotas.add(new Mascota(R.drawable.pluto3,"Puppy 3", 4));
        mascotas.add(new Mascota(R.drawable.pluto4,"Puppy 4", 8));
        mascotas.add(new Mascota(R.drawable.pluto5,"Puppy 5", 6));
        mascotas.add(new Mascota(R.drawable.pluto6,"Puppy 6", 5));
        mascotas.add(new Mascota(R.drawable.pluto7,"Puppy 7", 6));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        startActivity( new Intent(this,Main2Activity.class));
        return super.onOptionsItemSelected(item);
    }
}
