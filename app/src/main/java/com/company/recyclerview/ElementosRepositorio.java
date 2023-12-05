package com.company.recyclerview;

import java.util.ArrayList;
import java.util.List;

public class ElementosRepositorio {

    List<Elemento> elementos = new ArrayList<>();

    interface Callback {
        void cuandoFinalice(List<Elemento> elementos);
    }

    ElementosRepositorio() {
        elementos.add(new Elemento("Pikachu", "Este Pokémon eléctrico es conocido por sus mejillas cargadas de electricidad, las cuales libera en ataques poderosos. Es muy ágil y puede liberar descargas eléctricas intensas."));
        elementos.add(new Elemento("Bulbasaur", "Un Pokémon tipo planta/veneno. Este Pokémon crece una planta en su espalda desde el nacimiento, la cual se desarrolla a medida que crece y se fortalece con la luz solar."));
        elementos.add(new Elemento("Mewtwo", "Un Pokémon psíquico creado genéticamente. Mewtwo es conocido por su inteligencia excepcional y sus poderosas habilidades psíquicas, lo que lo hace uno de los Pokémon más poderosos."));
        elementos.add(new Elemento("Alakazam", "Un Pokémon psíquico con un IQ de más de 5000. Sus habilidades mentales le permiten recordar todo y usar increíbles poderes psíquicos."));
        elementos.add(new Elemento("Charizard", "Este Pokémon tipo fuego/volador es la evolución final de Charmander. Es conocido por su poderosa llama que puede derretir cualquier cosa y su habilidad para volar."));
        elementos.add(new Elemento("Gengar", "Un Pokémon tipo fantasma/veneno. Gengar es conocido por su naturaleza traviesa y su habilidad para ocultarse en las sombras y asustar a las personas."));
        elementos.add(new Elemento("Squirtle", "Un pequeño Pokémon tipo agua, conocido por su caparazón duro y su habilidad para disparar chorros de agua a alta presión."));
        elementos.add(new Elemento("Eevee", "Este Pokémon es conocido por su capacidad única para evolucionar en diversas formas dependiendo del entorno y otros factores."));
        elementos.add(new Elemento("Magikarp", "Aunque a menudo considerado débil y sin habilidades especiales, este Pokémon tipo agua puede evolucionar al poderoso Gyarados."));
        elementos.add(new Elemento("Snorlax", "Conocido por su tamaño y peso masivos, este Pokémon tipo normal es famoso por dormir profundamente y tener un apetito enorme."));
        elementos.add(new Elemento("Jigglypuff", "Este Pokémon tipo normal/hada es conocido por su capacidad de cantar una canción de cuna que duerme a cualquiera que la escuche."));
        elementos.add(new Elemento("Psyduck", "Un Pokémon tipo agua conocido por sus frecuentes dolores de cabeza, que a veces resultan en poderosas habilidades psíquicas."));
        elementos.add(new Elemento("Lapras", "Este Pokémon tipo agua/hielo es conocido por su inteligencia y su capacidad para comprender el lenguaje humano, a menudo utilizado para transportar personas sobre el agua."));
        elementos.add(new Elemento("Dragonite", "Un Pokémon tipo dragón/volador, conocido por su naturaleza amable y su habilidad para volar a velocidades supersónicas."));
        elementos.add(new Elemento("Vaporeon", "Una de las evoluciones de Eevee, este Pokémon tipo agua puede fundirse con el agua y tiene habilidades de hidromanipulación."));
        elementos.add(new Elemento("Arcanine", "Un Pokémon tipo fuego conocido por su velocidad y majestuosidad, a menudo descrito como magnífico y valiente."));
        elementos.add(new Elemento("Machamp", "Este Pokémon tipo lucha es conocido por sus cuatro brazos, que le permiten lanzar una ráfaga de puñetazos a una velocidad increíble."));
        elementos.add(new Elemento("Gyarados", "Evolución de Magikarp, este intimidante Pokémon tipo agua/volador es conocido por su temperamento feroz y sus poderosos ataques."));
        elementos.add(new Elemento("Ditto", "Un Pokémon único por su habilidad para transformarse en cualquier otro Pokémon, copiando su apariencia y habilidades exactamente."));
        elementos.add(new Elemento("Charmander", "Un pequeño Pokémon tipo fuego, conocido por la llama que arde en la punta de su cola, que refleja su salud y emociones."));
        elementos.add(new Elemento("Mew", "Un Pokémon legendario tipo psíquico, conocido por su habilidad para aprender cualquier movimiento y su ADN único."));
        elementos.add(new Elemento("Pidgeot", "La evolución final de Pidgey, este Pokémon tipo normal/volador es conocido por su velocidad y su habilidad para volar."));
        elementos.add(new Elemento("Pidgey", "Un pequeño Pokémon tipo normal/volador, conocido por su naturaleza dócil y su habilidad para volar."));
        elementos.add(new Elemento("Rattata", "Un pequeño Pokémon tipo normal, conocido por su naturaleza traviesa y su habilidad para masticar cualquier cosa."));
        elementos.add(new Elemento("Raticate", "La evolución final de Rattata, este Pokémon tipo normal es conocido por su naturaleza agresiva y su habilidad para masticar cualquier cosa."));
        elementos.add(new Elemento("Spearow", "Un pequeño Pokémon tipo normal/volador, conocido por su naturaleza agresiva y su habilidad para volar."));
        elementos.add(new Elemento("Fearow", "La evolución final de Spearow, este Pokémon tipo normal/volador es conocido por su naturaleza agresiva y su habilidad para volar."));

    }


    List<Elemento> obtener() {
        return elementos;
    }

    void insertar(Elemento elemento, Callback callback){
        elementos.add(elemento);
        callback.cuandoFinalice(elementos);
    }

    void eliminar(Elemento elemento, Callback callback) {
        elementos.remove(elemento);
        callback.cuandoFinalice(elementos);
    }

    void actualizar(Elemento elemento, float valoracion, Callback callback) {
        elemento.valoracion = valoracion;
        callback.cuandoFinalice(elementos);
    }
}
