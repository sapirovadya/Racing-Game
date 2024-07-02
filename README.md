# Racing-Game

## Overview

This project is a race simulation game developed in Java, where different types of racers compete in various arenas. The racers can be of types such as land, air, and naval, each with specific characteristics and behaviors. The game demonstrates advanced object-oriented programming concepts including inheritance, polymorphism, abstract classes, and interfaces.

## Features

- **Multiple Arena Types**: Land, Air, and Naval arenas, each with unique properties and constraints.
- **Diverse Racers**: Includes different racer types such as cars, bicycles, horses, airplanes, helicopters, rowboats, and speedboats.
- **Dynamic Race Management**: Allows building arenas and racers dynamically using reflection.
- **Race Mechanics**: Handles racer movements, mishaps, and race progressions.
- **Extensible Design**: Easily add new racer types or arenas.

## Project Structure

- **game.arenas**: Contains classes for different arena types.
  - `Arena`, `AerialArena`, `LandArena`, `NavalArena`
- **game.racers**: Contains classes for different racer types.
  - `Racer`, `Wheeled`, `AerialRacer`, `Airplane`, `Helicopter`, `LandRacer`, `Car`, `Bicycle`, `Horse`, `NavalRacer`, `RowBoat`, `SpeedBoat`
- **utilities**: Utility classes for building races and handling game mechanics.
  - `RaceBuilder`, `RacerCache`, `Fate`, `Mishap`, `Point`, `Program`


