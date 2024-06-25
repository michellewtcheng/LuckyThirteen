package lucky.scoring;

import ch.aplu.jcardgame.*;
import lucky.Rank;
import lucky.Suit;
import lucky.scoring.ScoringSystemStrategy;

public abstract class PrivateScoreSumming extends ScoringSystemStrategy {
     public int getScorePrivateCard(Card card) {
        Rank rank = (Rank) card.getRank();
        Suit suit = (Suit) card.getSuit();
        return rank.getScoreCardValue() * suit.getMultiplicationFactor();
    }
}

