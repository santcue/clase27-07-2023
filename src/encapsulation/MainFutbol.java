package encapsulation;

public class MainFutbol {
    public static void main(String[] args) {
        SoccerPlayer soccerPlayer = new SoccerPlayer();
        soccerPlayer.setName("ardila");
        soccerPlayer.setGolesanotados(20);
        soccerPlayer.setNumeroCamiestea(10);
        System.out.println(soccerPlayer.getName());
        System.out.println(soccerPlayer.getNumeroCamiestea());
        System.out.println(soccerPlayer.getGolesanotados());
    }
}
