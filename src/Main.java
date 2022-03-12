import models.*;
import strategies.AllianceStrategy;
import strategies.CypherStrategy;
import strategies.alliance.EmblemCharacterAllianceStrategy;
import strategies.cypher.SeasarCypherStrategy;

public class Main {
    public static void main(String[] args) {
        AllianceStrategy allianceStrategy = new EmblemCharacterAllianceStrategy();
        CypherStrategy cypherStrategy = new SeasarCypherStrategy();
        Air air = new Air();
        Land land = new Land();
        Ice ice = new Ice();
        Water water = new Water();
        Fire fire = new Fire();
        boolean isInput1 = allianceStrategy.checkAlliance(cypherStrategy.decrypt("FDIXXSOKKOFBBMU", land ), land);
        boolean isInput2 = allianceStrategy.checkAlliance(cypherStrategy.decrypt("MOMAMVTMTMHTM", ice ), ice);
        boolean isInput3 = allianceStrategy.checkAlliance(cypherStrategy.decrypt("SUMMER IS COMING", water ), water);
        boolean isInput4 = allianceStrategy.checkAlliance(cypherStrategy.decrypt("OWLAOWLBOWLC", air ), air);
        boolean isInput5 = allianceStrategy.checkAlliance(cypherStrategy.decrypt("AJXGAMUTA", fire ), fire);
        System.out.println(isInput1 + " " + isInput2 + " " + isInput3 + " "+ isInput4 + " "+ isInput5);
    }

}
