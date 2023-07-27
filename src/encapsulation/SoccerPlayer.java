package encapsulation;

public class SoccerPlayer {
    private String name;
    private int numeroCamiestea;
    private int golesanotados;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumeroCamiestea() {
        return numeroCamiestea;
    }

    public void setNumeroCamiestea(int numeroCamiestea) {
        this.numeroCamiestea = numeroCamiestea;
    }

    public int getGolesanotados() {
        return golesanotados;
    }

    public void setGolesanotados(int golesanotados) {
        this.golesanotados = golesanotados;
    }
}
