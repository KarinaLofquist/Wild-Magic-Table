import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class WildMagicTable {
    public static void main(String[] args) {
        WildMagicSorcerer[] sorcerers = new WildMagicSorcerer[3];

        sorcerers[0] = new WildMagicSorcerer("Elaine", 21, 68, 'M', "her", 23 , 9, 4, 1, "Willaker", 3, new String[]{"Elaine", "Willaker", "Bandit 1", "Bandit 2"}, new String[]{"Elaine", "Willaker", "Bandit 1", "Bandit 2", "Mage 1", "Mage 2"}, 2, "purple pot of star flowers");
        wildMagicTable(sorcerers[0]);
    }


    public static void wildMagicTable(WildMagicSorcerer sorcerer) {
            Random randomGenerator = new Random();

            int dieRoll = randomGenerator.nextInt(100) + 1;
            int dieRollTen = randomGenerator.nextInt(10) + 1;
            int dieRollSix = randomGenerator.nextInt(6) + 1;
            int dieRollFour = randomGenerator.nextInt(4) + 1;

            switch (dieRoll) {
                case 1:
                case 2:
                    System.out.println("" + dieRoll + ": Roll on this table at the start of each of your turns for the next minute, ignoring this result on subsequent rolls.");
                    for (int i = 0; i < 10; i++) {
                        wildMagicTable(sorcerer);
                }
                    break;
                case 3:
                case 4:
                    System.out.println("" + dieRoll + ": For the next minute, you can see any invisible creature if you have line of sight to it.");
                    if (sorcerer.invisibleCreatures != 0) {
                        System.out.println("" + sorcerer.name + " can now see " + sorcerer.invisibleCreatures + " invisible creatures!");
                    } else {
                        System.out.println("There are no invisible creatures in " + sorcerer.name + "'s line of sight!");
                    }
                    break;
                case 5:
                case 6:
                    System.out.println("" + dieRoll + ": A modron chosen and controlled by the DM appears in an unoccupied space within 5 feet of you, then disappears I minute later.");
                    break;
                case 7:
                case 8:
                    System.out.println("" + dieRoll + ": You cast Fireball as a 3rd-level spell centered on yourself.");
                    int fireball = 0;
                    for (int i = 0; i < 8; i++) {
                        fireball += randomGenerator.nextInt(6) + 1;
                    }
                    System.out.println("Fireball damage: " + fireball + ".");
                    break;
                case 9:
                case 10:
                    System.out.println("" + dieRoll + ": You cast Magic Missile as a 5th-level spell.");
                    break;
                case 11:
                case 12:
                    System.out.println("" + dieRoll + ": Roll a d10. Your height changes by a number of inches equal to the roll. If the roll is odd, you shrink. If the roll is even, you grow.");
                    if (dieRollTen % 2 == 0) {
                        System.out.println("Add " + Integer.toString(dieRollTen) + " inches to " + sorcerer.name + "'s height!");
                        System.out.println("" + sorcerer.name + " is now " + (sorcerer.height + dieRollTen) + " inches tall!");
                    } else {
                        System.out.println("Remove " + Integer.toString(dieRollTen)  + " inches from " + sorcerer.name + "'s height!");
                        System.out.println("" + sorcerer.name + " is now " + (sorcerer.height - dieRollTen) + " inches tall!");
                    }
                    break;
                case 13:
                case 14:
                    System.out.println("" + dieRoll + ": You cast Confusion centered on yourself.");
                    if (sorcerer.name == "Elaine") {
                        System.out.println("" + sorcerer.name + " became more confused than usual.");
                    } else {
                        System.out.println("" + sorcerer.name + " cast confusion!");
                    }
                    break;
                case 15:
                case 16:
                    System.out.println("" + dieRoll + ": For the next minute, you regain 5 hit points at the start of each of your turns.");
                    System.out.println("" + sorcerer.name + " gains 5 hp per turn for 10 turns!");
                    break;
                case 17:
                case 18:
                    System.out.println("" + dieRoll + ": You grow a long beard made of feathers that remains until you sneeze, at which point the feathers explode out from your face.");
                    System.out.println("" + sorcerer.name + " now has a feather beard!");
                    break;
                case 19:
                case 20:
                    System.out.println("" + dieRoll + ": You cast Grease centered on yourself.");
                    System.out.println("" + sorcerer.name + " is surrounded by grease!");
                    break;
                case 21:
                case 22:
                    System.out.println("" + dieRoll + ": Creatures have disadvantage on saving throws against the next spell you cast in the next minute that involves a saving throw.");
                    break;
                case 23:
                case 24:
                    System.out.println("" + dieRoll + ": Your skin turns a vibrant shade of blue. A Remove Curse spell can end this effect.");
                    System.out.println("" + sorcerer.name + "'s skin is now blue!");
                    break;
                case 25:
                case 26:
                    System.out.println("" + dieRoll + ": An eye appears on your forehead for the next minute. During that time, you have advantage on Wisdom (Perception) checks that rely on sight.");
                    System.out.println("" + sorcerer.name + " now has an eye on " + sorcerer.gender + " forehead!") ;
                    break;
                case 27:
                case 28:
                    System.out.println("" + dieRoll + ": For the next minute, all your spells with a casting time of 1 action have a casting time of 1 bonus action.");
                    break;
                case 29:
                case 30:
                    System.out.println("" + dieRoll + ": You teleport up to 60 feet to an unoccupied space of your choice that you can see.");
                    System.out.println("" + sorcerer.name + " can now teleport!");
                    break;
                case 31:
                case 32:
                    System.out.println("" + dieRoll + ": You are transported to the Astral Plane until the end of your next turn, after which time you return to the space you previously occupied or the nearest unoccupied space if that space is occupied.");
                    System.out.println("Poof! " + sorcerer.name + " disappeared to the Astral Plane!");
                    break;
                case 33:
                case 34:
                    System.out.println("" + dieRoll + ": Maximize the damage of the next damaging spell you cast within the next minute.");
                    break;
                case 35:
                case 36:
                    System.out.println("" + dieRoll + ": Roll a d10. Your age changes by a number of years equal to the roll. If the roll is odd, you get younger (minimum 1 year old). If the roll is even, you get older.");
                    if (dieRollTen % 2 == 0) {
                        System.out.println("Add " + dieRollTen + " years to " + sorcerer.name + "'s age!");
                        System.out.println("" + sorcerer.name + " is now " + (sorcerer.age + dieRollTen) + " years old!");
                    } else {
                        System.out.println("Remove " + dieRollTen + " from " + sorcerer.name + "'s age!");
                        System.out.println("" + sorcerer.name + " is now " + (sorcerer.age - dieRollTen) + " years old!");
                    }
                    break;
                case 37:
                case 38:
                    System.out.println("" + dieRoll + ": 1d6 flumphs controlled by the DM appear in unoccupied spaces within 60 feet of you and are frightened of you. They vanish after 1 minute.");
                    System.out.println("" + dieRollSix + " flumphs appear!");
                    break;
                case 39:
                case 40:
                    System.out.println("" + dieRoll + ": You regain 2d10 hit points.");
                    dieRollTen += randomGenerator.nextInt(10) + 1;
                    System.out.println("You regain " + dieRollTen + " hitpoints!");
                    break;
                case 41:
                case 42:
                    System.out.println("" + dieRoll + ": You turn into a potted plant until the start of your next turn. While a plant, you are incapacitated and have vulnerability to all damage. If you drop to 0 hit points, your pot breaks, and your form reverts.");
                    System.out.println("" + sorcerer.name + " turned into a " + sorcerer.favoritePlant + "!");
                    break;
                case 43:
                case 44:
                    System.out.println("" + dieRoll + ": For the next minute, you can teleport up to 20 feet as a bonus action on each of your turns.");
                    System.out.println("" + sorcerer.name + " can teleport up to 20 feet!");
                    break;
                case 45:
                case 46:
                    System.out.println("" + dieRoll + ": You cast Levitate on yourself.");
                    System.out.println("" + sorcerer.name + " cast fly on " + sorcerer.gender + "self!");
                    break;
                case 47:
                case 48:
                    System.out.println("" + dieRoll + ": A unicorn controlled by the DM appears in a space within 5 feet of you, then disappears 1 minute later.");
                    System.out.println("A unicorn suddenly appears next to " + sorcerer.name + "!");
                    break;
                case 49:
                case 50:
                    System.out.println("" + dieRoll + ": You can't speak for the next minute. Whenever you try, pink bubbles float out of your mouth.");
                    System.out.println("Pink bubbles float out of " + sorcerer.name + "'s mouth!");
                    break;
                case 51:
                case 52:
                    System.out.println("" + dieRoll + ": A spectral shield hovers near you for the next minute, granting you a +2 bonus to AC and immunity to Magic Missile.");
                    System.out.println("" + sorcerer.name + "'s armor class is now " + (sorcerer.armorClass + 2) + "!");
                    break;
                case 53:
                case 54:
                    System.out.println("" + dieRoll + ": You are immune to being intoxicated by alcohol for the next 5d6 days.");
                    int dieRollAlcoholImmunity = 0;
                    for (int i = 0; i < 5; i++) {
                        dieRollAlcoholImmunity += randomGenerator.nextInt(6) + 1;
                    }
                    System.out.println("" + sorcerer.name + " is immune to being intoxicated for " + dieRollAlcoholImmunity + " days!");
                    break;
                case 55:
                case 56:
                    System.out.println("" + dieRoll + ": Your hair falls out but grows back within 24 hours.");
                    System.out.println("All of " + sorcerer.name + "'s hair fell out!");
                    break;
                case 57:
                case 58:
                    System.out.println("" + dieRoll + ": For the next minute, any flammable object you touch that isn't being worn or carried by another creature bursts into flame.");
                    if (sorcerer.name == "Elaine") {
                        System.out.println("As if " + sorcerer.name + " wasn't enough of a pyromaniac to begin with.");
                    } else {
                        System.out.println("Be careful of what you touch, " + sorcerer.name + "!");
                    }
                    break;
                case 59:
                case 60:
                    System.out.println("" + dieRoll + ": You regain your lowest-level expended spell slot.");
                    System.out.println("" + sorcerer.lowestLevelSlotExpended + ". level spell regained for " + sorcerer.name + "!");
                    break;
                case 61:
                case 62:
                    System.out.println("" + dieRoll + ": For the next minute, you must shout when you speak.");
                    System.out.println("" + sorcerer.name + " suddenly starts shouting!");
                    break;
                case 63:
                case 64:
                    System.out.println("" + dieRoll + ": You cast Fog Cloud centered on yourself.");
                    System.out.println("Oh no, this makes it hard for " + sorcerer.name + " to see!");
                    break;
                case 65:
                case 66:
                    System.out.println("" + dieRoll + ": Up to three creatures you choose within 30 feet of you take 4d10 lightning damage.");
                    int dieRollLightning = 0;
                    for (int i = 0; i < 4; i++) {
                        dieRollLightning += randomGenerator.nextInt(10) + 1;
                    }
                    System.out.println("You deal " + dieRollLightning + " lighting damage to up to 3 creatures!");
                    System.out.println("Creatures to choose from:");
                    for (String vwv : Arrays.asList(sorcerer.creaturesWithin30Feet).subList(1, sorcerer.creaturesWithin30Feet.length)) {
                        System.out.println(vwv);
                    }
                    break;
                case 67:
                case 68:
                    System.out.println("" + dieRoll + ": You are frightened by the nearest creature until the end of your next turn.");
                    System.out.println("" + sorcerer.name + " is frightened of " + sorcerer.nearestCreature + "!");
                    break;
                case 69:
                case 70:
                    System.out.println("" + dieRoll + ": Each creature within 30 feet of you becomes invisible for the next minute. The invisibility ends on a creature when it attacks or casts a spell.");
                    System.out.println("Creatures affected:");
                    for (String uwu : sorcerer.creaturesWithin30Feet) {
                        System.out.println(uwu);
                    }
                    break;
                case 71:
                case 72:
                    System.out.println("" + dieRoll + ": You gain resistance to all damage for the next minute.");
                    System.out.println("" + sorcerer.name + " gains all damage resistance!");
                    break;
                case 73:
                case 74:
                    System.out.println("" + dieRoll + ": A random creature within 60 feet of you becomes poisoned for 1d4 hours.");
                    String poisonedCreature = (sorcerer.creaturesWithin60Feet[randomGenerator.nextInt(sorcerer.creaturesWithin60Feet.length)]);
                    System.out.println("" + poisonedCreature + " is poisoned for " + dieRollFour + " hour(s)!");
                    break;
                case 75:
                case 76:
                    System.out.println("" + dieRoll + ": You glow with bright light in a 30-foot radius for the next minute. Any creature that ends its turn within 5 feet of you is blinded until the end of its next turn.");
                    System.out.println("" + sorcerer.name + " is glowing!");
                    break;
                case 77:
                case 78:
                    System.out.println("" + dieRoll + ": You cast Polymorph on yourself. If you fail the saving throw, you turn into a sheep for the spell's duration.");
                    System.out.println("" + sorcerer.name + " turned into a sheep! Baaaaaah~");
                    break;
                case 79:
                case 80:
                    System.out.println("" + dieRoll + ": Illusory butterflies and flower petals flutter in the air within 10 feet of you for the next minute.");
                    System.out.println("Butterflies and flower petals flutter around " + sorcerer.name + "!");
                    break;
                case 81:
                case 82:
                    System.out.println("" + dieRoll + ": You can take one additional action immediately.");
                    System.out.println("What will " + sorcerer.name + " use " + sorcerer.gender + " new action for?");
                    break;
                case 83:
                case 84:
                    System.out.println("" + dieRoll + ": Each creature within 30 feet of you takes 1d10 necrotic damage. You regain hit points equal to the sum of the necrotic damage dealt.");
                    System.out.println("You deal " + dieRollTen + " damage to all creatures within 30 feet!");
                    System.out.println("" + sorcerer.name + " regains a total of " + (dieRollTen * sorcerer.numCreaturesWithin30Feet) + " hp!");
                    break;
                case 85:
                case 86:
                    System.out.println("" + dieRoll + ": You cast Mirror Image.");
                    System.out.println("There are now 4 of " + sorcerer.name + "!");
                    break;
                case 87:
                case 88:
                    System.out.println("" + dieRoll + ": You cast Fly on a random creature within 60 feet of you.");
                    String flyCreature = (sorcerer.creaturesWithin60Feet[randomGenerator.nextInt(sorcerer.creaturesWithin60Feet.length)]);
                    System.out.println("" + sorcerer.name + " cast fly on " + flyCreature + "!");
                    break;
                case 89:
                case 90:
                    System.out.println("" + dieRoll + ": You become invisible for the next minute. During that time, other creatures can't hear you. The invisibility ends if you attack or cast a spell.");
                    System.out.println("" + sorcerer.name + " is now invisible!");
                    break;
                case 91:
                case 92:
                    System.out.println("" + dieRoll + ": If you die within the next minute, you immediately come back to life as if by the Reincarnate spell.");
                    break;
                case 93:
                case 94:
                    System.out.println("" + dieRoll + ": Your size increases by one size category for the next minute.");
                    break;
                case 95:
                case 96:
                    System.out.println("" + dieRoll + ": You and all creatures within 30 feet gain vulnerability to piercing damage for the next minute.");
                    System.out.println("Creatures affected:");
                    for (String owo : sorcerer.creaturesWithin60Feet) {
                        System.out.println(owo);
                    }
                    break;
                case 97:
                case 98:
                    System.out.println("" + dieRoll + ": You are surrounded by faint, ethereal music for the next minute.");
                    System.out.println("" + sorcerer.name + " is surrounded by faint, ethereal music!");
                    break;
                case 99:
                case 100:
                    System.out.println("" + dieRoll + ": You regain all expended sorcery points.");
                    System.out.println("" + sorcerer.name + " regains " + sorcerer.sorcPointsUsed + " sorcery points!");
                    break;
            }
    }
}
