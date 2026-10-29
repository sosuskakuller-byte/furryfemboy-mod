# Furry Femboy Mod (Forge 1.20.1)

A complete starter implementation of a tameable fox-like furry companion and the **Godzilla's Camolёт** milk blaster. The project targets Forge 47.x, Java 17 and GeckoLib 4.4.9.

## Features

* `furry_femboy` tameable `TamableAnimal`, natural spawning, owner persistence and teleport-to-owner.
* 35% milk-bucket taming chance, hearts, healing with milk, name tags, health bar and four modes: Follow, Sit, Guard and Passive. Shift-right-click cycles modes; regular right-click toggles sitting.
* `godzilla_weapon` fires server-authoritative milk projectiles with a 12-tick cooldown, 6 damage, splash particles and configurable durability.
* Spawn egg, Russian/English translations, GeckoLib geo/animation assets, Forge common config (`health`, `milk_damage`, `speed`, `tame_chance`).

## Build

Use a Java 17 JDK and run `./gradlew build` (or import the project into IntelliJ/ForgeGradle). The environment used to generate this project currently has Java 21 but no Gradle wrapper distribution and cannot reach the Forge/GeckoLib Maven hosts, so the final JAR must be built on a machine with dependency access. The expected artifact is `build/libs/furryfemboy-1.0.0.jar`.

## Blockbench

`src/main/resources/assets/furryfemboy/geo/furry_femboy.geo.json`, `animations/furry_femboy.animation.json` and the two PNG textures are valid GeckoLib assets and can be opened or refined in Blockbench. Replace the PNGs and edit the geo/animation files without changing their resource paths.

Give the weapon with `/give @p furryfemboy:godzilla_weapon`.
