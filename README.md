# Lucky Thirteen

## Players
There are 4 different types of players that can play the game. These are set up in the property file.
- Human: Interactive player type who selects the card to discard through a double left-click
- Random: Computer player that discards a card at random
- Basic: Computer player that discards the card with the lowest value
- Clever: Computer player that will keep track of all cards played and plays by trying to maximise its score
## Rules:
1. A shuffled deck of cards deals two cards face up to the centre of the playing area (visible to all players)
2. Two cards are dealt to each player (not visible to other players)
3. Starting with Player 1 (P[0]), they are dealt 1 card from the pile and chooses a card to discard from their hand
4. Play continues clockwise until the end of the 4th round
5. Each player sums their cards to achieve a total of 13 (see Summing)*
6. Scores are assigned according to the outcomes (see Scoring)*

### Summing
There are 3 ways to sum a player's cards to 13:
1. Two private cards
2. One private and one public card
3. Two private and two public cards

### Scoring
Scoring for each player depends on how many people were able to achieve a sum of 13. Those outcomes are as follows:
1. One player achieves a sum of 13   
   - Player wins (+100 points)
2. No players achieve a sum of 13
   - Players will receive a score based on the sum of their private cards according to the following calculation
     - Each suit corresponds to a multiplication factor: Spade (x4), Heart (x3), Diamond (x2), Club (x1)
     - Number cards are valued as is.
     - Picture cards are valued as follows: Jack (11), Queen (12), King (13)
3. More than one player achieves a sum of 13
   - Only players that achieved a sum of 13 will receive a score
   - Players receive a score based on the sum of the cards that sum to 13 according to the same calculation used in Scoring Case 2
     - Public cards will have a multiplication factor of x2 regardless of suit
   - If a player has more than one way to sum to 13, the calculation should maximise the score

(* All the summing and scoring calculations are completed by the computer)