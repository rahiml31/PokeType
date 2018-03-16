package PokeType;

import java.util.LinkedHashMap;
import java.util.Map;

public class PokeDex {

    private PokemonName pokename;
    private int dexnumber;

    public PokeDex(PokemonName pokename) {
        this.pokename = pokename;
        generatePokeDex();
    }

    public int getDexnumber() {
        return dexnumber;
    }

    public void setDexnumber(int dexnumber) {
        this.dexnumber = dexnumber;
    }

    /* Create the PokeDex */
    private LinkedHashMap<String,Integer> pokedex=new LinkedHashMap<>();

    /* Populate the PokeDex */
    public void generatePokeDex() {
        pokedex.put("BULBASAUR", 1);
        pokedex.put("IVYSAUR", 2);
        pokedex.put("VENUSAUR", 3);
        pokedex.put("CHARMANDER", 4);
        pokedex.put("CHARMELEON", 5);
        pokedex.put("CHARIZARD", 6);
        pokedex.put("SQUIRTLE", 7);
        pokedex.put("WARTORTLE", 8);
        pokedex.put("BLASTOISE", 9);
        pokedex.put("CATERPIE", 10);
        pokedex.put("METAPOD", 11);
        pokedex.put("BUTTERFREE", 12);
        pokedex.put("WEEDLE", 13);
        pokedex.put("KAKUNA", 14);
        pokedex.put("BEEDRILL", 15);
        pokedex.put("PIDGEY", 16);
        pokedex.put("PIDGEOTTO", 17);
        pokedex.put("PIDGEOT", 18);
        pokedex.put("RATTATA", 19);
        pokedex.put("RATICATE", 20);
        pokedex.put("SPEAROW", 21);
        pokedex.put("FEAROW", 22);
        pokedex.put("EKANS", 23);
        pokedex.put("ARBOK", 24);
        pokedex.put("PIKACHU", 25);
        pokedex.put("RAICHU", 26);
        pokedex.put("SANDSHREW", 27);
        pokedex.put("SANDSLASH", 28);
        pokedex.put("NIDORAN F", 29);
        pokedex.put("NIDORINA", 30);
        pokedex.put("NIDOQUEEN", 31);
        pokedex.put("NIDORAN M", 32);
        pokedex.put("NIDORINO", 33);
        pokedex.put("NIDOKING", 34);
        pokedex.put("CLEFAIRY", 35);
        pokedex.put("CLEFABLE", 36);
        pokedex.put("VULPIX", 37);
        pokedex.put("NINETALES", 38);
        pokedex.put("JIGGLYPUFF", 39);
        pokedex.put("WIGGLYTUFF", 40);
        pokedex.put("ZUBAT", 41);
        pokedex.put("GOLBAT", 42);
        pokedex.put("ODDISH", 43);
        pokedex.put("GLOOM", 44);
        pokedex.put("VILEPLUME", 45);
        pokedex.put("PARAS", 46);
        pokedex.put("PARASECT", 47);
        pokedex.put("VENONAT", 48);
        pokedex.put("VENOMOTH", 49);
        pokedex.put("DIGLETT", 50);
        pokedex.put("DUGTRIO", 51);
        pokedex.put("MEOWTH", 52);
        pokedex.put("PERSIAN", 53);
        pokedex.put("PSYDUCK", 54);
        pokedex.put("GOLDUCK", 55);
        pokedex.put("MANKEY", 56);
        pokedex.put("PRIMEAPE", 57);
        pokedex.put("GROWLITHE", 58);
        pokedex.put("ARCANINE", 59);
        pokedex.put("POLIWAG", 60);
        pokedex.put("POLIWHIRL", 61);
        pokedex.put("POLIWRATH", 62);
        pokedex.put("ABRA", 63);
        pokedex.put("KADABRA", 64);
        pokedex.put("ALAKAZAM", 65);
        pokedex.put("MACHOP", 66);
        pokedex.put("MACHOKE", 67);
        pokedex.put("MACHAMP", 68);
        pokedex.put("BELLSPROUT", 69);
        pokedex.put("WEEPINBELL", 70);
        pokedex.put("VICTREEBEL", 71);
        pokedex.put("TENTACOOL", 72);
        pokedex.put("TENTACRUEL", 73);
        pokedex.put("GEODUDE", 74);
        pokedex.put("GRAVELER", 75);
        pokedex.put("GOLEM", 76);
        pokedex.put("PONYTA", 77);
        pokedex.put("RAPIDASH", 78);
        pokedex.put("SLOWPOKE", 79);
        pokedex.put("SLOWBRO", 80);
        pokedex.put("MAGNEMITE", 81);
        pokedex.put("MAGNETON", 82);
        pokedex.put("FARFETCH'D", 83);
        pokedex.put("DODUO", 84);
        pokedex.put("DODRIO", 85);
        pokedex.put("SEEL", 86);
        pokedex.put("DEWGONG", 87);
        pokedex.put("GRIMER", 88);
        pokedex.put("MUK", 89);
        pokedex.put("SHELLDER", 90);
        pokedex.put("CLOYSTER", 91);
        pokedex.put("GASTLY", 92);
        pokedex.put("HAUNTER", 93);
        pokedex.put("GENGAR", 94);
        pokedex.put("ONIX", 95);
        pokedex.put("DROWZEE", 96);
        pokedex.put("HYPNO", 97);
        pokedex.put("KRABBY", 98);
        pokedex.put("KINGLER", 99);
        pokedex.put("VOLTORB", 100);
        pokedex.put("ELECTRODE", 101);
        pokedex.put("EXEGGCUTE", 102);
        pokedex.put("EXEGGUTOR", 103);
        pokedex.put("CUBONE", 104);
        pokedex.put("MAROWAK", 105);
        pokedex.put("HITMONLEE", 106);
        pokedex.put("HITMONCHAN", 107);
        pokedex.put("LICKITUNG", 108);
        pokedex.put("KOFFING", 109);
        pokedex.put("WEEZING", 110);
        pokedex.put("RHYHORN", 111);
        pokedex.put("RHYDON", 112);
        pokedex.put("CHANSEY", 113);
        pokedex.put("TANGELA", 114);
        pokedex.put("KANGASKHAN", 115);
        pokedex.put("HORSEA", 116);
        pokedex.put("SEADRA", 117);
        pokedex.put("GOLDEEN", 118);
        pokedex.put("SEAKING", 119);
        pokedex.put("STARYU", 120);
        pokedex.put("STARMIE", 121);
        pokedex.put("MR. MIME", 122);
        pokedex.put("SCYTHER", 123);
        pokedex.put("JYNX", 124);
        pokedex.put("ELECTABUZZ", 125);
        pokedex.put("MAGMAR", 126);
        pokedex.put("PINSIR", 127);
        pokedex.put("TAUROS", 128);
        pokedex.put("MAGIKARP", 129);
        pokedex.put("GYARADOS", 130);
        pokedex.put("LAPRAS", 131);
        pokedex.put("DITTO", 132);
        pokedex.put("EEVEE", 133);
        pokedex.put("VAPOREON", 134);
        pokedex.put("JOLTEON", 135);
        pokedex.put("FLAREON", 136);
        pokedex.put("PORYGON", 137);
        pokedex.put("OMANYTE", 138);
        pokedex.put("OMASTAR", 139);
        pokedex.put("KABUTO", 140);
        pokedex.put("KABUTOPS", 141);
        pokedex.put("AERODACTYL", 142);
        pokedex.put("SNORLAX", 143);
        pokedex.put("ARTICUNO", 144);
        pokedex.put("ZAPDOS", 145);
        pokedex.put("MOLTRES", 146);
        pokedex.put("DRATINI", 147);
        pokedex.put("DRAGONAIR", 148);
        pokedex.put("DRAGONITE", 149);
        pokedex.put("MEWTWO", 150);
        pokedex.put("MEW", 151);
    }

    /* Display Whole PokeDex */
    public void displayWholePokedex() {
        for(Map.Entry<String,Integer> entry:pokedex.entrySet()) {
            //System.out.println(entry.getKey()+":\t"+entry.getValue());
            System.out.println(String.format("%-13s:%s",entry.getKey(),entry.getValue()));
        }
    }

    /* Sets PokeDex Number Of Typed Pokemon */
    public void setPokedexNum() {
        String newpokename = pokename.getPokename();
        newpokename = newpokename.toUpperCase();
        for(Map.Entry<String,Integer> entry:pokedex.entrySet()) {
            if(newpokename.equals(entry.getKey())) {
                setDexnumber(entry.getValue());
            }
        }
    }

}
