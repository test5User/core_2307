package lesson31._07_repeatable;

@Game(gameName = "MineCraft", dayOfWeek = "Sunday")
@Game(dayOfWeek = "TuesDay")
@Game(gameName = "Golf", dayOfWeek = "FriDay")
public class Main {
    public static void main(String[] args) {
        var games = Main.class.getAnnotation(Games.class);
        for (Game game : games.value()) {
            System.out.println(game.gameName() + " on " + game.dayOfWeek());
        }
    }
}
