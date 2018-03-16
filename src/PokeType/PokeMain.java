package PokeType;

public class PokeMain {

    /* For Nidoran♀, use Nidoran F, and for Nidoran♂, use Nidoran M */

    public static void main(String[] args) {
       PokemonName pokemon=new PokemonName("Zapdos");
       PokeDex dex=new PokeDex(pokemon);
       TypeMain type=new TypeMain(pokemon);
       dex.setPokedexNum();
       type.findTypes();
       System.out.println("Pokemon Name:\t"+pokemon.getPokename());
       System.out.println("PokeDex Entry:\t"+dex.getDexnumber());
       System.out.println("Pokemon Type: \t"+type.getTypelist());
    }


}
