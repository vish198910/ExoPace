package vishnulovespacesharma.spacephysicsfunvishnusharma.space.vishnulovespace.exopace;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Inclination extends AppCompatActivity {

    Button graphical;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inclination);
        graphical = findViewById(R.id.Graphical);
        graphical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inclination.this,IncliGraph.class);
                startActivity(intent);


            }
        });
    }
}
