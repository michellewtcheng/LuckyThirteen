package lucky.players;

import lucky.CardsDealer;

public class PlayerFactory {
    private static PlayerFactory instance = null;

    public static synchronized PlayerFactory getInstance() {
        if (instance == null){
            instance = new PlayerFactory();
        }
        return instance;
    }

    public Player getPlayer(String type, int position, CardsDealer cardsDealer){
        Player player = null;

        if (type.equals("human")){
            player = new HumanPlayer(position, cardsDealer);
        } else if (type.equals("random")){
            player = new RandomPlayer(position, cardsDealer);
        } else if (type.equals("basic")){
            player = new BasicPlayer(position, cardsDealer);
        } else if (type.equals("clever")){
            player = new CleverPlayer(position, cardsDealer);
        }
        return player;
    }
}
