package PokeType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;

public class TypeMain {

    private PokemonName pokename;
    private String typelist;

    public TypeMain(PokemonName pokename) {
        this.pokename = pokename;
        generateTypes();
    }

    public String getTypelist() {
        return typelist;
    }

    public void setTypelist(String typelist) {
        this.typelist = typelist;
    }

    /* Create The Type HashMap */
    private HashMap<String,ArrayList<String>> types=new HashMap<>();

    /* Populate The Types HashMap */
    public void generateTypes() {
        types.put("BULBASAUR", new ArrayList<>(Arrays.asList("Grass", "Poison")));
        types.put("IVYSAUR", new ArrayList<>(Arrays.asList("Grass", "Poison")));
        types.put("VENUSAUR", new ArrayList<>(Arrays.asList("Grass", "Poison")));
        types.put("CHARMANDER", new ArrayList<>(Arrays.asList("Fire")));
        types.put("CHARMELEON", new ArrayList<>(Arrays.asList("Fire")));
        types.put("CHARIZARD", new ArrayList<>(Arrays.asList("Fire","Flying")));
        types.put("SQUIRTLE", new ArrayList<>(Arrays.asList("Water")));
        types.put("WARTORTLE", new ArrayList<>(Arrays.asList("Water")));
        types.put("BLASTOISE", new ArrayList<>(Arrays.asList("Water")));
        types.put("CATERPIE", new ArrayList<>(Arrays.asList("Bug")));
        types.put("METAPOD", new ArrayList<>(Arrays.asList("Bug")));
        types.put("BUTTERFREE", new ArrayList<>(Arrays.asList("Bug","Flying")));
        types.put("WEEDLE", new ArrayList<>(Arrays.asList("Bug", "Poison")));
        types.put("KAKUNA", new ArrayList<>(Arrays.asList("Bug", "Poison")));
        types.put("BEEDRILL", new ArrayList<>(Arrays.asList("Bug", "Poison")));
        types.put("PIDGEY", new ArrayList<>(Arrays.asList("Normal","Flying")));
        types.put("PIDGEOTTO", new ArrayList<>(Arrays.asList("Normal","Flying")));
        types.put("PIDGEOT", new ArrayList<>(Arrays.asList("Normal","Flying")));
        types.put("RATTATA", new ArrayList<>(Arrays.asList("Normal")));
        types.put("RATICATE", new ArrayList<>(Arrays.asList("Normal")));
        types.put("SPEAROW", new ArrayList<>(Arrays.asList("Normal","Flying")));
        types.put("FEAROW", new ArrayList<>(Arrays.asList("Normal","Flying")));
        types.put("EKANS", new ArrayList<>(Arrays.asList("Poison")));
        types.put("ARBOK", new ArrayList<>(Arrays.asList("Poison")));
        types.put("PIKACHU", new ArrayList<>(Arrays.asList("Electric")));
        types.put("SANDSHREW", new ArrayList<>(Arrays.asList("Ground")));
        types.put("SANDSLASH", new ArrayList<>(Arrays.asList("Ground")));
        types.put("NIDORAN F", new ArrayList<>(Arrays.asList("Poison")));
        types.put("NIDORINA", new ArrayList<>(Arrays.asList("Poison")));
        types.put("NIDOQUEEN", new ArrayList<>(Arrays.asList("Poison","Ground")));
        types.put("NIDORAN M", new ArrayList<>(Arrays.asList("Poison")));
        types.put("NIDORINO", new ArrayList<>(Arrays.asList("Poison")));
        types.put("NIDOKING", new ArrayList<>(Arrays.asList("Poison","Ground")));
        types.put("CLEFAIRY", new ArrayList<>(Arrays.asList("Normal")));
        types.put("CLEFABLE", new ArrayList<>(Arrays.asList("Normal")));
        types.put("VULPIX", new ArrayList<>(Arrays.asList("Fire")));
        types.put("NINETALES", new ArrayList<>(Arrays.asList("Fire")));
        types.put("JIGGLYPUFF", new ArrayList<>(Arrays.asList("Normal")));
        types.put("WIGGLYTUFF", new ArrayList<>(Arrays.asList("Normal")));
        types.put("ZUBAT", new ArrayList<>(Arrays.asList("Poison","Flying")));
        types.put("GOLBAT", new ArrayList<>(Arrays.asList("Poison","Flying")));
        types.put("ODDISH", new ArrayList<>(Arrays.asList("Grass", "Poison")));
        types.put("GLOOM", new ArrayList<>(Arrays.asList("Grass", "Poison")));
        types.put("VILEPLUME", new ArrayList<>(Arrays.asList("Grass", "Poison")));
        types.put("PARAS", new ArrayList<>(Arrays.asList("Bug","Grass")));
        types.put("PARASECT", new ArrayList<>(Arrays.asList("Bug","Grass")));
        types.put("VENONAT", new ArrayList<>(Arrays.asList("Bug", "Poison")));
        types.put("VENOMOTH", new ArrayList<>(Arrays.asList("Bug", "Poison")));
        types.put("DIGLETT", new ArrayList<>(Arrays.asList("Ground")));
        types.put("DUGTRIO", new ArrayList<>(Arrays.asList("Ground")));
        types.put("MEOWTH", new ArrayList<>(Arrays.asList("Normal")));
        types.put("PERSIAN", new ArrayList<>(Arrays.asList("Normal")));
        types.put("PSYDUCK", new ArrayList<>(Arrays.asList("Water")));
        types.put("GOLDUCK", new ArrayList<>(Arrays.asList("Water")));
        types.put("MANKEY", new ArrayList<>(Arrays.asList("Fight")));
        types.put("PRIMEAPE", new ArrayList<>(Arrays.asList("Fight")));
        types.put("GROWLITHE", new ArrayList<>(Arrays.asList("Fire")));
        types.put("ARCANINE", new ArrayList<>(Arrays.asList("Fire")));
        types.put("POLIWAG", new ArrayList<>(Arrays.asList("Water")));
        types.put("POLIWHIRL", new ArrayList<>(Arrays.asList("Water")));
        types.put("POLIWRATH", new ArrayList<>(Arrays.asList("Water","Fight")));
        types.put("ABRA", new ArrayList<>(Arrays.asList("Psychic")));
        types.put("KADABRA", new ArrayList<>(Arrays.asList("Psychic")));
        types.put("ALAKAZAM", new ArrayList<>(Arrays.asList("Psychic")));
        types.put("MACHOP", new ArrayList<>(Arrays.asList("Fight")));
        types.put("MACHOKE", new ArrayList<>(Arrays.asList("Fight")));
        types.put("MACHAMP", new ArrayList<>(Arrays.asList("Fight")));
        types.put("BELLSPROUT", new ArrayList<>(Arrays.asList("Grass", "Poison")));
        types.put("WEEPINBELL", new ArrayList<>(Arrays.asList("Grass", "Poison")));
        types.put("VICTREEBEL", new ArrayList<>(Arrays.asList("Grass", "Poison")));
        types.put("TENTACOOL", new ArrayList<>(Arrays.asList("Water", "Poison")));
        types.put("TENTACRUEL", new ArrayList<>(Arrays.asList("Water", "Poison")));
        types.put("GEODUDE", new ArrayList<>(Arrays.asList("Rock","Ground")));
        types.put("GRAVELER", new ArrayList<>(Arrays.asList("Rock","Ground")));
        types.put("GOLEM", new ArrayList<>(Arrays.asList("Rock","Ground")));
        types.put("PONYTA", new ArrayList<>(Arrays.asList("Fire")));
        types.put("RAPIDASH", new ArrayList<>(Arrays.asList("Fire")));
        types.put("SLOWPOKE", new ArrayList<>(Arrays.asList("Water","Psychic")));
        types.put("SLOWBRO", new ArrayList<>(Arrays.asList("Water","Psychic")));
        types.put("MAGNEMITE", new ArrayList<>(Arrays.asList("Electric","Steel")));
        types.put("MAGNETON", new ArrayList<>(Arrays.asList("Electric","Steel")));
        types.put("FARFETCH'D", new ArrayList<>(Arrays.asList("Normal","Flying")));
        types.put("DODUO", new ArrayList<>(Arrays.asList("Normal","Flying")));
        types.put("DODRIO", new ArrayList<>(Arrays.asList("Normal","Flying")));
        types.put("SEEL", new ArrayList<>(Arrays.asList("Water")));
        types.put("DEWGONG", new ArrayList<>(Arrays.asList("Water","Ice")));
        types.put("GRIMER", new ArrayList<>(Arrays.asList("Poison")));
        types.put("MUK", new ArrayList<>(Arrays.asList("Poison")));
        types.put("SHELLDER", new ArrayList<>(Arrays.asList("Water")));
        types.put("CLOYSTER", new ArrayList<>(Arrays.asList("Water")));
        types.put("GASTLY", new ArrayList<>(Arrays.asList("Ghost", "Poison")));
        types.put("HAUNTER", new ArrayList<>(Arrays.asList("Ghost", "Poison")));
        types.put("GENGAR", new ArrayList<>(Arrays.asList("Ghost", "Poison")));
        types.put("ONIX", new ArrayList<>(Arrays.asList("Rock","Ground")));
        types.put("DROWZEE", new ArrayList<>(Arrays.asList("Psychic")));
        types.put("HYPNO", new ArrayList<>(Arrays.asList("Psychic")));
        types.put("KRABBY", new ArrayList<>(Arrays.asList("Water")));
        types.put("KINGLER", new ArrayList<>(Arrays.asList("Water")));
        types.put("VOLTORB", new ArrayList<>(Arrays.asList("Electric")));
        types.put("ELECTRODE", new ArrayList<>(Arrays.asList("Electric")));
        types.put("EXEGGCUTE", new ArrayList<>(Arrays.asList("Grass","Psychic")));
        types.put("EXEGGUTOR", new ArrayList<>(Arrays.asList("Grass","Psychic")));
        types.put("CUBONE", new ArrayList<>(Arrays.asList("Ground")));
        types.put("MAROWAK", new ArrayList<>(Arrays.asList("Ground")));
        types.put("HITMONLEE", new ArrayList<>(Arrays.asList("Fight")));
        types.put("HITMONCHAN", new ArrayList<>(Arrays.asList("Fight")));
        types.put("LICKITUNG", new ArrayList<>(Arrays.asList("Normal")));
        types.put("KOFFING", new ArrayList<>(Arrays.asList("Poison")));
        types.put("WEEZING", new ArrayList<>(Arrays.asList("Poison")));
        types.put("RHYHORN", new ArrayList<>(Arrays.asList("Ground","Rock")));
        types.put("RHYDON", new ArrayList<>(Arrays.asList("Ground","Rock")));
        types.put("CHANSEY", new ArrayList<>(Arrays.asList("Normal")));
        types.put("TANGELA", new ArrayList<>(Arrays.asList("Grass")));
        types.put("KANGASKHAN", new ArrayList<>(Arrays.asList("Normal")));
        types.put("HORSEA", new ArrayList<>(Arrays.asList("Water")));
        types.put("SEADRA", new ArrayList<>(Arrays.asList("Water")));
        types.put("GOLDEEN", new ArrayList<>(Arrays.asList("Water")));
        types.put("SEAKING", new ArrayList<>(Arrays.asList("Water")));
        types.put("STARYU", new ArrayList<>(Arrays.asList("Water")));
        types.put("STARMIE", new ArrayList<>(Arrays.asList("Water","Psychic")));
        types.put("MR. MIME", new ArrayList<>(Arrays.asList("Psychic")));
        types.put("SCYTHER", new ArrayList<>(Arrays.asList("Bug","Flying")));
        types.put("JYNX", new ArrayList<>(Arrays.asList("Ice","Psychic")));
        types.put("ELECTABUZZ", new ArrayList<>(Arrays.asList("Electric")));
        types.put("MAGMAR", new ArrayList<>(Arrays.asList("Fire")));
        types.put("PINSIR", new ArrayList<>(Arrays.asList("Bug")));
        types.put("TAUROS", new ArrayList<>(Arrays.asList("Normal")));
        types.put("MAGIKARP", new ArrayList<>(Arrays.asList("Water")));
        types.put("GYARADOS", new ArrayList<>(Arrays.asList("Water","Flying")));
        types.put("LAPRAS", new ArrayList<>(Arrays.asList("Water","Ice")));
        types.put("DITTO", new ArrayList<>(Arrays.asList("Normal")));
        types.put("EEVEE", new ArrayList<>(Arrays.asList("Normal")));
        types.put("VAPOREON", new ArrayList<>(Arrays.asList("Water")));
        types.put("JOLTEON", new ArrayList<>(Arrays.asList("Electric")));
        types.put("FLAREON", new ArrayList<>(Arrays.asList("Fire")));
        types.put("PORYGON", new ArrayList<>(Arrays.asList("Normal")));
        types.put("OMANYTE", new ArrayList<>(Arrays.asList("Rock","Water")));
        types.put("OMASTAR", new ArrayList<>(Arrays.asList("Rock","Water")));
        types.put("KABUTO", new ArrayList<>(Arrays.asList("Rock","Water")));
        types.put("KABUTOPS", new ArrayList<>(Arrays.asList("Rock","Water")));
        types.put("AERODACTYL", new ArrayList<>(Arrays.asList("Rock","Flying")));
        types.put("SNORLAX", new ArrayList<>(Arrays.asList("Normal")));
        types.put("ARTICUNO", new ArrayList<>(Arrays.asList("Ice","Flying")));
        types.put("ZAPDOS", new ArrayList<>(Arrays.asList("Electric","Flying")));
        types.put("MOLTRES", new ArrayList<>(Arrays.asList("Fire","Flying")));
        types.put("DRATINI", new ArrayList<>(Arrays.asList("Dragon")));
        types.put("DRAGONAIR", new ArrayList<>(Arrays.asList("Dragon")));
        types.put("DRAGONITE", new ArrayList<>(Arrays.asList("Dragon","Flying")));
        types.put("MEWTWO", new ArrayList<>(Arrays.asList("Psychic")));
        types.put("MEW", new ArrayList<>(Arrays.asList("Psychic")));
    }

    /* Searches The Type HashMap And Gets The Type If The Name Matches */
    public void findTypes() {
        String pokemonname = pokename.getPokename();
        pokemonname = pokemonname.toUpperCase();
        for(Map.Entry<String,ArrayList<String>> entry:types.entrySet()) {
            if(pokemonname.equals(entry.getKey())) {
                String typelist = String.join(", ", entry.getValue());
                setTypelist(typelist);
            }
        }
    }

}