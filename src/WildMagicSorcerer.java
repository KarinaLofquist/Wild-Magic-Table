public class WildMagicSorcerer {
    String name;
    int age;
    int height;
    char size;
    String gender;
    int armorClass;
    int sorcPoints;
    int sorcPointsUsed;
    int lowestLevelSlotExpended;
    String nearestCreature;
    int numCreaturesWithin30Feet;
    String[] creaturesWithin30Feet;
    String[] creaturesWithin60Feet;
    int invisibleCreatures;
    String favoritePlant;

    public WildMagicSorcerer(String name, int age, int height, char size, String gender, int armorClass, int sorcPoints, int sorcPointsUsed, int lowestLevelSlotExpended, String nearestCreature, int numCreaturesWithin30Feet, String[] creaturesWithin30Feet, String[] creaturesWithin60Feet, int invisibleCreatures, String favoritePlant) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.size = size;
        this.gender = gender;
        this.armorClass = armorClass;
        this.sorcPoints = sorcPoints;
        this.sorcPointsUsed = sorcPointsUsed;
        this.lowestLevelSlotExpended = lowestLevelSlotExpended;
        this.nearestCreature = nearestCreature;
        this.numCreaturesWithin30Feet = numCreaturesWithin30Feet;
        this.creaturesWithin30Feet = creaturesWithin30Feet;
        this.creaturesWithin60Feet = creaturesWithin60Feet;
        this.invisibleCreatures = invisibleCreatures;
        this.favoritePlant = favoritePlant;
    }
}
