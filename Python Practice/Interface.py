# 31. Define an interface Playable with a method play. Create classes Game and Movie that implement this interface, providing their own definitions of the play method.


from abc import ABC, abstractmethod

class Playable(ABC):
    @abstractmethod
    def play(self):
        """Method to be implemented by all classes that implement this interface."""
        pass

class Game(Playable):
    def play(self):
        print("Starting the game. Enjoy your adventure!")

class Movie(Playable):
    def play(self):
        print("Playing the movie. Sit back and enjoy the show!")

# Example usage
game = Game()
game.play()

movie = Movie()
movie.play()
