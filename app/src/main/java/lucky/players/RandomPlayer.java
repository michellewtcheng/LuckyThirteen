package lucky.players;

import ch.aplu.jcardgame.Card;
import ch.aplu.jcardgame.Hand;
import lucky.CardsDealer;
import java.util.*;

public class RandomPlayer extends Player {
    public RandomPlayer(int position, CardsDealer cardsDealer) {
        super(position, cardsDealer);
    }

    @Override
    public Card selectCardToDiscard(int delayTime, Hand playingArea, HashMap<Integer, Integer> map) {
        return getRandomCard(getHand(), delayTime);
    }

    private Card getRandomCard(Hand hand, int thinkingTime) {

        getCardsDealer().dealACardToHand(hand, getCardsDealer().getPack());
        delay(thinkingTime);

        int x = CardsDealer.getRandomInt(hand.getCardList().size());
        return hand.getCardList().get(x);
    }
}