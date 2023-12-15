public class Funciones {

    /**
     * Metodo darPistas que genera una pista según el número propuesto sea más bajo o más alto que el número generado aleatoriamente
     * y reduce en uno los intentosMax
     * @param numeroAleatorio
     * @param numeroPropuesto
     * @param intentosMax
     */
    public void darPistas(int numeroAleatorio, int intentosMax, int numeroPropuesto) {

    }

    /**
     * Metodo validarIntentos que comprueba si los intentos han llegado a 0
     * @param intentosMax
     * @return  si es true, llama al metodo validarNumero().
     * si es false, retorna a adivinar()
     */
    public boolean validarIntentos(int intentosMax){

    }

    /**
     * Metodo validarNumero que comprueba si el numeroPropuesto coincide con el numeroAleatorio
     * Si es true, llama al metodo guardarDatos()
     * @param numeroPropuesto
     * @param numeroAleatorio
     * @return si es false saca por pantalla un mensaje de que no has acertado el juego, y comienza otra ronda. Si es
     * true saca por pantalla un mensaje de felicitaciones, llama al metodo guardarDatos() y comienza otra ronda
     */
    public boolean validarNumero(int numeroPropuesto, int numeroAleatorio){

    }

    /**
     * Metodo que guarda los aciertos en una partida y el alias del jugador
     * @param puntuacion
     * @param alias
     */
    public void guardarDatos(int puntuacion, String alias){

    }

    /**
     * Metodo que genera el numero aleatorio que se tiene que acertar
     * @param numeroAleatorio
     */
    public void generarAleatorio(int numeroAleatorio){

    }

    /**
     * metodo que valida si el numeroPropuesto coincide con el numeroAleatorio y si los intentosMaximos son mayores que 0
     * @param numeroAleatorio
     * @param numeroPropuesto
     * @param intentosMax
     * @return si es false llama a validarIntentos() y si es verdadero llama a darPistas()
     */
    public boolean adivinar(int numeroAleatorio, int numeroPropuesto, int intentosMax){

    }

    /**
     * metodo que valida que el numero de rondas no supere 10
     * @param contadorRondas
     * @param rondasPartida
     * @return
     */
    public boolean validarRondas(int contadorRondas, int rondasPartida){

    }
}

