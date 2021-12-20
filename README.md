# Animal-Scramble-Simlation
## Descrption 
Write a set of classes that define the behavior of certain animals. They can be used in a simulation of a world with many animals moving around in it. Different kinds of animals will move in different ways (you are defining those differences). As the simulation runs, animals can “die” when two or more of them end up in the same location, in which case the simulator randomly selects one animal to survive the collision. See your course web site or www.buildingjavaprograms.com for supporting files to run such a simulation.

The following is an example set of animals and their respective behavior:
Class	| toString | getMove
--------------|--------------|--------------
Bird	| B	| Moves randomly 1 step in one of the four directions each time
Frog | F | Moves randomly 3 steps in one of the four directions
Mouse	| M |	Moves west 1 step, north 1 step (zig-zag to the northwest)
Rabbit | V | Move north 2 steps, east 2 steps, south 2 steps (“hops” to the right)
Snake	| S |	Moves south 1 step, east 1 step, south 1 step, west 2 steps, south 1 step, east 3 steps, south 1 step, west 4 steps, ... (“slithers” left and right in increasing length)
Turtle | T	| Moves south 5 steps, west 5 steps, north 5 steps, east 5 steps (clockwise box)
Wolf | W | Has custom behavior that you define

Your classes should be stored in files called Bird.java, Frog.java, Mouse.java, Rabbit.java, Snake.java, Turtle.java, and Wolf.java.
