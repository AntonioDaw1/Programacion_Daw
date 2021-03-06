package U8_T6;

import U8_T5.Futbolista;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class FutbolistaMain {
    public static void main(String[] args) {
        //Creamos el array de desmarcaciones.
        String[] posicionCasillas = {"Portero"};
        String[] posicionSergioRamos = {"Lateral derecho", "Medio centro"};
        String[] posicionPique = {"Central"};
        String[] posicionPuyol = {"Central"};
        String[] posicionCapdevila = {"Lateral izquierdo"};
        String[] posicionXabiAlonso = {"Defensa mediocampo", "Mediocampo"};
        String[] posicionBusquets = {"Defensa mediocampo"};
        String[] posicionXaviHernandez = {"Mediocampo"};
        String[] posicionPedrito = {"Extremo izquierdo", "Falso extremo"};
        String[] posicionIniesta = {"Extremo derecho", "Mediocampo"};
        String[] posicionVilla = {"Delantero centro"};


        //Creamos el objeto futbolista.
        ArrayList<U8_T5.Futbolista> futbolistas = new ArrayList<>();
        futbolistas.add(new U8_T5.Futbolista(1, "Casillas",posicionCasillas,"Real Madrid"));
        futbolistas.add(new U8_T5.Futbolista(15, "Sergio Ramos",posicionSergioRamos,"Real Madrid"));
        futbolistas.add(new U8_T5.Futbolista(3, "Pique",posicionPique,"Barcelona"));
        futbolistas.add(new U8_T5.Futbolista(5, "Puyol",posicionPuyol,"Barcelona"));
        futbolistas.add(new U8_T5.Futbolista(11, "Capdevila",posicionCapdevila,"Villareal"));
        futbolistas.add(new U8_T5.Futbolista(14, "Xavi Alonso",posicionXabiAlonso,"Real Madrid"));
        futbolistas.add(new U8_T5.Futbolista(16, "Busquets",posicionBusquets,"Barcelona"));
        futbolistas.add(new U8_T5.Futbolista(8, "Xavi Hernandez",posicionXaviHernandez,"Barcelona"));
        futbolistas.add(new U8_T5.Futbolista(18, "Pedrito",posicionPedrito,"Barcelona"));
        futbolistas.add(new U8_T5.Futbolista(6, "Iniesta",posicionIniesta,"Barcelona"));
        futbolistas.add(new U8_T5.Futbolista(7, "Villa",posicionVilla,"Barcelona"));

        //Crear objeto Gson que se encargará de las conversiones.
        Gson gson = new Gson();

        //Convertimos un objeto sencillo a Json.
        String jsonFutbolistas = gson.toJson(futbolistas);

        Type listType = new TypeToken<ArrayList<U8_T5.Futbolista>>(){}.getType();
        ArrayList<U8_T5.Futbolista> arrayJson = gson.fromJson(jsonFutbolistas, listType);

        //Desmarcaciones de Sergio Ramos.
        ArrayList<String> desmarcaciones = new ArrayList<>();

        for (Futbolista futbolista: futbolistas) {
            if (futbolista.getNombre().equals("Sergio Ramos")){
                for (int i = 0; i < futbolista.getDesmarcaciones().length; i++) {
                    desmarcaciones.add(futbolista.getDesmarcaciones()[i]);
                }
            }
        }
        System.out.println(desmarcaciones);
    }
}