# RPG Battle System

A console-based RPG battle system built in Java, demonstrating core Object-Oriented Programming (OOP) principles through a turn-based combat game.

## How to Build & Run

```bash
# From the rpg-battle-system/ directory:
mvn package
java -jar target/rpg-battle-system.jar

# Or run directly via Maven:
mvn compile exec:java -Dexec.mainClass="com.rpg.game.GameManager"
```

---

## Class Reference

| Class | Package | OOP Concept(s) Demonstrated |
|---|---|---|
| `Character` | `com.rpg.core` | **Abstraction**, **Encapsulation** — Abstract base class with private fields and an abstract `performAttack()` method. All state is hidden behind getters/setters. |
| `Hero` | `com.rpg.core` | **Inheritance**, **Abstraction** — Extends `Character`; adds level/experience mechanics and declares the abstract `useSpecialAbility()`. Owns an `Inventory` via **Composition**. |
| `Enemy` | `com.rpg.core` | **Inheritance**, **Abstraction** — Extends `Character`; adds reward fields and re-declares `performAttack()` as abstract to force enemy-specific behaviour. |
| `Warrior` | `com.rpg.heroes` | **Inheritance**, **Polymorphism** — Extends `Hero`; overrides `performAttack()` and implements `useSpecialAbility()` with a stun (Shield Bash). |
| `Mage` | `com.rpg.heroes` | **Inheritance**, **Polymorphism** — Extends `Hero`; implements Fireball (1.5× damage) as the special ability. |
| `Archer` | `com.rpg.heroes` | **Inheritance**, **Polymorphism** — Extends `Hero`; implements Double Shot (two hits at 0.75× each). |
| `Goblin` | `com.rpg.enemies` | **Inheritance**, **Polymorphism** — Extends `Enemy`; attacks twice per turn at 0.6× each. |
| `Dragon` | `com.rpg.enemies` | **Inheritance**, **Polymorphism** — Extends `Enemy`; attacks at 2× damage. |
| `Skeleton` | `com.rpg.enemies` | **Inheritance**, **Polymorphism** — Extends `Enemy`; attacks normally then calls `regenerate()` to heal 5 HP. |
| `Item` | `com.rpg.items` | **Abstraction**, **Encapsulation** — Abstract base for all items with private name/description and abstract `use()`. |
| `Weapon` | `com.rpg.items` | **Inheritance**, **Polymorphism** — Extends `Item`; `use()` permanently raises the target's attack stat. |
| `Potion` | `com.rpg.items` | **Inheritance**, **Polymorphism** — Extends `Item`; `use()` restores HP without exceeding `maxHp`. |
| `Inventory` | `com.rpg.items` | **Encapsulation**, **Composition** — Manages an `ArrayList<Item>` with add/remove/use/display operations. |
| `BattleArena` | `com.rpg.game` | **Encapsulation**, **Composition** — Owns a `Hero` and `Enemy` reference; runs the interactive turn loop and enforces stun logic. |
| `GameManager` | `com.rpg.game` | **Entry Point** — Contains `main()`; handles hero selection via `Scanner` and launches the battle. |

---

## Project Structure

```
rpg-battle-system/
├── pom.xml
├── README.md
└── src/
    └── main/
        └── java/
            └── com/
                └── rpg/
                    ├── core/
                    │   ├── Character.java
                    │   ├── Hero.java
                    │   └── Enemy.java
                    ├── heroes/
                    │   ├── Warrior.java
                    │   ├── Mage.java
                    │   └── Archer.java
                    ├── enemies/
                    │   ├── Goblin.java
                    │   ├── Dragon.java
                    │   └── Skeleton.java
                    ├── items/
                    │   ├── Item.java
                    │   ├── Weapon.java
                    │   ├── Potion.java
                    │   └── Inventory.java
                    └── game/
                        ├── BattleArena.java
                        └── GameManager.java
```
