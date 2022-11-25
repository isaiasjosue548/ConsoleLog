import React from 'react';
import { useEffect, useState, useRef } from 'react';
import './search.css';

const allProducts = [
  'Sopa de pollo',
  'Leche',
  'Cereales',
  'Sopa de verduras',
  'Sopa de zanahoria'
]

function Search({ setCount }) {
  const inputSearch = useRef(null);
  const [pokemonsFiltered, setPokemonsFiltered] = useState([]);
  const [result, setResult] = useState('');
  const [showPokemons, setShowPokemons] = useState(false);
  const [allPokemons, setAllPokemons] = useState([]);

  // let allPokemons = []

/*   const url = 'https://pokeapi.co/api/v2/pokemon/?limit=1000';

  const fetchPokemon = async () => {
    try {
        const pokemon = await Axios.get(url);
        const allPokemonsName = pokemon.data.results.map((pokemon) => {
          return(
            pokemon.name
          )
        })
        return allPokemonsName;
    } catch (error) {
    console.error('error', error);
    }
  }

  useEffect(() => {
    const getPokemons = async () => {
      setAllPokemons(await fetchPokemon());
    }
    getPokemons();
  },[]); */
  
  const inputPokemon = (event) => {
    const pokemonNames = event.target.value;
    let pokemonsFilted = allProducts.filter((pokemon) => {
      if (pokemonNames.length > 2 && pokemon.includes(pokemonNames)) {
        return true;
      }
      return false;
    }).sort((a,b) => {
      const firstLetterA = a.startsWith(pokemonNames);
      const firstLetterB = b.startsWith(pokemonNames);

      if (firstLetterA && firstLetterB) {
        return 0;
      }
      if (firstLetterA) {
        return -1;
      }
      if (firstLetterB) {
        return 1;
      }
      return 0;
    });

    if (pokemonsFilted.length > 10) {
      pokemonsFilted = pokemonsFilted.slice(0,10);
    }

    setPokemonsFiltered(pokemonsFilted);
    (pokemonNames.length > 2) ? setShowPokemons(true) : setShowPokemons(false); 
  }

  const usedOnClick = () => {
    return pokemon ? pokemon : null
  }
  
  return (
    <div className='search'>
      <div className='search__wrapper-input'>
        <input ref={inputSearch} className='search__input form-control' type="text" placeholder="Añade 3 letras o más" onChange={inputPokemon}/>
      </div>
      {showPokemons && <div className="search__results">
      {
        pokemonsFiltered.map( pokemon => {
          return(
            <div key = {pokemon} className='search__item' onClick={() =>{setCount(pokemon)}} >
              {pokemon}
            </div>
          )
        })
      }
      </div> }
    </div>
  )
}

export default Search