package strategies.cypher;

import models.Kingdom;
import strategies.CypherStrategy;
import utils.Util;

public class SeasarCypherStrategy implements CypherStrategy {
    @Override
    public String decrypt(String encrypted, Kingdom kingdom) {
        int encryptKey = kingdom.getEmblem().length();

        String decrypted = Util.characterAntiClockShift(encrypted, encryptKey);

        return decrypted;
    }
}
