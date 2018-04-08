package PokeType;

import java.util.Scanner;

public class PokeMain {

    /* For Nidoran♀, use Nidoran F, and for Nidoran♂, use Nidoran M */

    public static void main(String[] args) {
        System.out.println("Enter a Pokemon Name: ");
        Scanner sc=new Scanner(System.in);
        String pokemonName=sc.nextLine();
        System.out.println();

        PokemonName pokemon=new PokemonName(pokemonName);
        PokeDex dex=new PokeDex(pokemon);
        TypeMain type=new TypeMain(pokemon);

        dex.setPokedexNum();
        if(1<=dex.getDexnumber() && dex.getDexnumber()<=151 ) {
            type.findTypes();

            System.out.println("Pokemon Name:\t" + pokemon.getPokename());
            System.out.println("PokeDex Entry:\t" + dex.getDexnumber());
            System.out.println("Pokemon Type: \t" + type.getTypelist());
        }
        else {
            System.out.println("Sorry the Pokemon chosen is not in the original 151.");
        }

    }


}
