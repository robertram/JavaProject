
package projectcinema.Logica;

public class LogicaInformacionTablaButacas {

private int numCols;

private static Object [][] tabla;  
private static Object [][] tablaAux; 

private Object [] recib_registro;
private Object [] dar_registro;

public LogicaInformacionTablaButacas(int numColumnas){

numCols = numColumnas;
tabla = new Object[0][numCols];
}

public void add(Object [] datos){

recib_registro = new Object [datos.length];

for(int i=0; i<datos.length; i++){
    recib_registro[i] = datos[i];
}

this.proceso();
}

private void proceso(){

tablaAux = new Object [tabla.length + 1][numCols];

for(int n=0; n<numCols; n++){
    for(int i=0; i<tabla.length; i++){
        tablaAux[i][n] = tabla[i][n];
    }
}

for(int n=0; n<numCols; n++){
    tablaAux[tabla.length][n] = recib_registro[n];
}

tabla = new Object [tablaAux.length][numCols];

for(int n=0; n<numCols; n++){
    for(int i=0; i<tabla.length; i++){

        tabla[i][n] = tablaAux[i][n];
    }
}
}

public boolean buscar(Object dato, int columna){

boolean estado = false;
dar_registro = new Object [numCols];

for(int f=0; f<tabla.length; f++){

    Object datoTabla = tabla[f][columna];
    if(datoTabla.equals(dato)){
        for(int n=0; n<numCols; n++){
            dar_registro[n] = tabla[f][n];
        }}}
return estado;
}
public Object [] datosColumna(int col){
Object [] colmn = new Object[tabla.length];
for(int i=0; i<numCols; i++){
        for(int j=0; j<tabla.length; j++){
            colmn[j] = tabla[j][col];
        }
}
return colmn;
}

public void recorrerTabla(){
for(int i=0; i<tabla.length; i++){
    for(int n=0; n<tabla[0].length; n++){
        System.out.print(tabla[i][n] + " ");
    }
    System.out.println();
}
}
public Object darDato(int posicion){
return dar_registro[posicion];
}
}
