package strategies;

import models.Kingdom;

public interface CypherStrategy {
    String decrypt(String encrypted, Kingdom kingdom);
}
