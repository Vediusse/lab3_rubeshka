import models.*;
import models.Character;


public class Main {
    public static void main(String[] args) {
        Character louis = new Character("Louis", true);
        Character invalid = new Character("Инвалид");
        Character human = new Character("человек", false, "страдающий бессоницей");
        Character someone = new Character("кто-нибудь");
        Item grid = new Item("решетку");
        Item peak = new Item("пиками");
        Item grass = new Item("траве", "проклятой");
        Item treeСrowns = new Item("кроны деревьев");
        Item shovel = new Item("лопата");
        Item shovels = new Item("лопату");
        Item leaf = new Item("листвы");
        Item knife = new Item("ножом");
        Item strips = new Item("полоски", "брезентовые");
        Item pick = new Item("кирку");
        Item picks = new Item("кирки");
        Item tools = new Item("инструменты");
        Item tree  = new Item("деревьям");
        Item lightInWindow = new Item("огонек в окне");
        Item sole = new Item("подошвами");
        Item asphalt = new Item("асфальт");
        Item cars = new Item("машины", "подъезжающей");
        Item noise = new Item("шум");
        Item sound = new Item("звука");
        Item steps = new Item("шагов", "чужих");
        Item creak = new Item("скрипа");
        Item window = new Item("окна", "открываемого");
        Item car = new Item("машине", "'Сивик'");
        Item keys = new Item("ключи");
        Item pocket = new Item("карманах");
        Item change = new Item("Мелочь");
        Item mistake = new Item("неудача");
        Flashlight flashlight = new Flashlight("фонарь");
        Flashlight beam = new Flashlight("луч", "Короткий");
        Flashlight shadow = new Flashlight("тень", "небольшую черную");
        Light light = new Light("освящении", "тусклом уличном");
        Light newlight = new Light("освещение", "уличное");
        Button button = new Button();
        grid.give(peak);
        louis.firstAction(grid);
        louis.secondAction();
        louis.thirdAction(grass);
        louis.fourthAction(shovel, treeСrowns, light);
        louis.fifthAction(flashlight, grass);
        louis.sixthAction();
        louis.seventhAction(flashlight, shadow);
        louis.eighthAction(flashlight, button);
        louis.ninthAction(leaf, flashlight, beam);
        louis.tenthAction(button);
        louis.eleventhAction();
        louis.twelvethAction(knife, strips, picks, tools);
        louis.thirteenthAction(tree);
        louis.fourteenthAction();
        louis.fifteenthAction(lightInWindow);
        louis.sixteenthAction(invalid, human);
        louis.seventeenthAction();
        louis.eighteenthAction(newlight);
        louis.nineteenthAction(pick, shovels, flashlight);
        louis.twentiethAction(someone);
        louis.twentyFirstAction(sole, asphalt);
        louis.twentySecondAction(car);
        louis.twentyThirdAction(car);
        louis.twentyFourthAction(noise, cars, sound, steps, creak, window);
        louis.twentyFifthAction(car, pick, shovels, keys);
        louis.twentySixthAction(keys, pocket);
        louis.twentySeventhAction();
        louis.twentyEighthAction();
        louis.twentyNinth(keys);
        louis.thirtieth(keys, grass, flashlight);
        louis.thirtyFirstAction();
        louis.thirtySecondAction(mistake);

       // louis.findByNameItem(louis.items, "фонарь"); вот так находишь фонарь у персонажа
    }
}