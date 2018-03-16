package PokeType;

public class PokemonName {

    private String pokename;

    public PokemonName(String pokename) {
        this.pokename = pokename;
        formatName();
    }

    public String getPokename() {
        return pokename;
    }

    public void setPokename(String pokename) {
        this.pokename = pokename;
    }

    /* Formats Pokemon Name To Have Only The First Letter Capitalized */
    public void formatName() {
        pokename = pokename.toLowerCase();
        String[] splitpokemane = pokename.split(" ");
        StringBuilder nPokename = new StringBuilder();
        for(String name : splitpokemane) {
            nPokename.append(name.substring(0,1).toUpperCase() + name.substring(1) + " ").toString().trim();
        }
        String newPokename = nPokename.toString().trim();
        setPokename(newPokename);
    }

    /* Unused At The Moment */
    /* Displays Formatted Pokemon Name */
    public String displayFormattedName() {
        String output="Turns into "+pokename;
        System.out.println(output);
        return output;
    }

}
